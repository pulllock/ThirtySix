package fun.pullock.gof.creational.factory_pattern.without_pattern;

import fun.pullock.gof.creational.factory_pattern.without_pattern.exporter.CsvExporter;
import fun.pullock.gof.creational.factory_pattern.without_pattern.exporter.ExcelExporter;
import fun.pullock.gof.creational.factory_pattern.without_pattern.exporter.Exporter;
import fun.pullock.gof.creational.factory_pattern.without_pattern.exporter.PdfExporter;

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
            Exporter exporter = new CsvExporter();
            exporter.export();
        } else {
            throw new IllegalArgumentException("Unknown format: " + format);
        }
    }
}
