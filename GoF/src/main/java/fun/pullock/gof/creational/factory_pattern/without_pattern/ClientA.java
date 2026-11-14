package fun.pullock.gof.creational.factory_pattern.without_pattern;

import fun.pullock.gof.creational.factory_pattern.without_pattern.exporter.CsvExporter;
import fun.pullock.gof.creational.factory_pattern.without_pattern.exporter.ExcelExporter;
import fun.pullock.gof.creational.factory_pattern.without_pattern.exporter.Exporter;
import fun.pullock.gof.creational.factory_pattern.without_pattern.exporter.PdfExporter;

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
            Exporter exporter = new PdfExporter();
            exporter.export();
        } else if (format.equals("excel")) {
            Exporter exporter = new ExcelExporter();
            exporter.export();
        } else if (format.equals("csv")) {
            Exporter exporter = new CsvExporter();
            exporter.export();
        } else {
            throw new IllegalArgumentException("Unknown format: " + format);
        }
    }
}
