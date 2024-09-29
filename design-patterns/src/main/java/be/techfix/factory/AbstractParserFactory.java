package be.techfix.factory;

public abstract class AbstractParserFactory<T,R> {

    Parser<T,R> create() {
        return createParser();
    }

    abstract Parser<T,R>createParser();
}
