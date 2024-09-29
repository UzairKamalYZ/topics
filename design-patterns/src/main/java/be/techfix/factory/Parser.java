package be.techfix.factory;

public interface Parser<T,R> {

    T parse( R input);
}
