package fun.pullock.gof.creational.factory_pattern.factory_method;

import fun.pullock.gof.creational.factory_pattern.factory_method.exporter.Exporter;
import fun.pullock.gof.creational.factory_pattern.factory_method.factory.CsvExporterFactory;
import fun.pullock.gof.creational.factory_pattern.factory_method.factory.ExcelExporterFactory;
import fun.pullock.gof.creational.factory_pattern.factory_method.factory.ExporterFactory;
import fun.pullock.gof.creational.factory_pattern.factory_method.factory.PdfExporterFactory;

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
            ExporterFactory factory = new CsvExporterFactory();
            Exporter exporter = factory.createExporter();
            exporter.export();
        } else {
            throw new IllegalArgumentException("Unknown format: " + format);
        }
    }
}
