package be.techfix.sse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

@RestController
public class SseEmitter {
    private static final Logger LOGGER = LoggerFactory.getLogger(SseEmitter.class);

    private final List<Consumer<Stock>> listeners = new CopyOnWriteArrayList<>();

    @GetMapping(path = "/getStock", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ServerSentEvent<Object>> consumer() {
        return Flux.create(sink -> this.subscribeForStockUpdate(sink::next)).map(
                stock -> ServerSentEvent.builder().data(stock).event("update").build());
    }

    @PostMapping(path = "/updateStock")
    public Mono<Stock> update(@RequestBody Stock stock) {
        LOGGER.info("Received '{}'", stock);
        this.publishStockUpdate(stock);
        return Mono.just(stock);
    }

    public void subscribeForStockUpdate(Consumer<Stock> listener) {
        listeners.add(listener);
        LOGGER.info("consumer subscribed, consumers={}", listeners.size());
    }
    public void publishStockUpdate(Stock stock) {
        LOGGER.info("publish stock update: {}", stock);
        listeners.forEach(listener -> listener.accept(stock));
    }
}
