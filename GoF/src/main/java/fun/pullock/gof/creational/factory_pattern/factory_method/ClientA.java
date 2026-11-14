package fun.pullock.gof.creational.factory_pattern.factory_method;

import fun.pullock.gof.creational.factory_pattern.factory_method.exporter.Exporter;
import fun.pullock.gof.creational.factory_pattern.factory_method.factory.CsvExporterFactory;
import fun.pullock.gof.creational.factory_pattern.factory_method.factory.ExcelExporterFactory;
import fun.pullock.gof.creational.factory_pattern.factory_method.factory.ExporterFactory;
import fun.pullock.gof.creational.factory_pattern.factory_method.factory.PdfExporterFactory;

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
            ExporterFactory factory = new PdfExporterFactory();
            Exporter exporter = factory.createExporter();
            exporter.export();
        } else if (format.equals("excel")) {
            ExporterFactory factory = new ExcelExporterFactory();
            Exporter exporter = factory.createExporter();
            exporter.export();
        } else if (format.equals("csv")) {
            ExporterFactory factory = new CsvExporterFactory();
            Exporter exporter = factory.createExporter();
            exporter.export();
        } else {
            throw new IllegalArgumentException("Unknown format: " + format);
        }
    }
}
