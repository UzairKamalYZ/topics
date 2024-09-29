package be.techfix.factory;

public class CsvParserFactoryImpl<T, R> extends AbstractParserFactory<T, R> {

    @Override
    Parser<T, R> createParser() {
        return new CSvParser<>();
    }
}
