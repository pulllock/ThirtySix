package fun.pullock.gof.creational.factory_pattern.abstract_factory;

import fun.pullock.gof.creational.factory_pattern.abstract_factory.encoder.Encoder;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.exporter.Exporter;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.factory.CsvExportFactory;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.factory.ExportFactory;

public class ClientB {

    public static void main(String[] args) {
        // Export csv file
        ClientB client = new ClientB();
        client.export("csv");

        // Export pdf file
        client = new ClientB();
        client.export("pdf");
    }

    public void export(String format) {
        if (format.equals("csv")) {
            ExportFactory factory = new CsvExportFactory();
            Exporter exporter = factory.createExporter();
            exporter.export();

            Encoder encoder = factory.createEncoder();
            encoder.encode();
        } else {
            throw new IllegalArgumentException("Unknown format: " + format);
        }
    }
}
