package be.techfix.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        AbstractParserFactory<Map<String,String>, FileInputStream> factory = new XmlParserFactoryImpl<>();
        Parser<Map<String, String>, FileInputStream> xmlParser = factory.create();
        xmlParser.parse(null);

        factory = new CsvParserFactoryImpl<>();

        Parser<Map<String, String>, FileInputStream> csvParser = factory.create();
        csvParser.parse(null);
    }
}
