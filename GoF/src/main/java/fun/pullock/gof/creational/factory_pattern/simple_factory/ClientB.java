package fun.pullock.gof.creational.factory_pattern.simple_factory;

import fun.pullock.gof.creational.factory_pattern.simple_factory.exporter.Exporter;
import fun.pullock.gof.creational.factory_pattern.simple_factory.factory.ExporterFactory;

public class ClientB {

    public static void main(String[] args) {
        // Export excel file
        ClientB client = new ClientB();
        client.export("excel");

    }

    public void export(String format) {
        Exporter exporter = ExporterFactory.createExporter(format);
        exporter.export();
    }
}
