package be.techfix.factory;

public class XmlParserFactoryImpl<T ,R> extends AbstractParserFactory<T, R> {
    @Override
    Parser<T, R> createParser() {
        return new XmlParser<>();
    }
}
