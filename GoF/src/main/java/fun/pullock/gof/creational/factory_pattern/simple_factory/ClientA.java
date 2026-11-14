package fun.pullock.gof.creational.factory_pattern.simple_factory;

import fun.pullock.gof.creational.factory_pattern.simple_factory.exporter.Exporter;
import fun.pullock.gof.creational.factory_pattern.simple_factory.factory.ExporterFactory;

public class ClientA {

    public static void main(String[] args) {
        // Export excel file
        ClientA client = new ClientA();
        client.export("excel");

        // Export csv file
        client = new ClientA();
        client.export("csv");
    }

    public void export(String format) {
        Exporter exporter = ExporterFactory.createExporter(format);
        exporter.export();
    }
}
