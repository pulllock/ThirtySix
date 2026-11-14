package fun.pullock.gof.creational.factory_pattern.abstract_factory;

import fun.pullock.gof.creational.factory_pattern.abstract_factory.encoder.Encoder;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.exporter.Exporter;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.factory.CsvExportFactory;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.factory.ExcelExportFactory;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.factory.ExportFactory;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.factory.PdfExportFactory;

public class ClientA {

    public static void main(String[] args) {
        // Export excel file
        ClientA client = new ClientA();
        client.export("excel");

        // Export pdf file
        client = new ClientA();
        client.export("pdf");
    }

    public void export(String format) {
        if (format.equals("pdf")) {
            ExportFactory factory = new PdfExportFactory();
            Exporter exporter = factory.createExporter();
            exporter.export();

            Encoder encoder = factory.createEncoder();
            encoder.encode();
        } else if (format.equals("excel")) {
            ExportFactory factory = new ExcelExportFactory();
            Exporter exporter = factory.createExporter();
            exporter.export();

            Encoder encoder = factory.createEncoder();
            encoder.encode();
        } else if (format.equals("csv")) {
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
