package fun.pullock.gof.creational.factory_pattern.simple_factory.factory;

import fun.pullock.gof.creational.factory_pattern.simple_factory.exporter.CsvExporter;
import fun.pullock.gof.creational.factory_pattern.simple_factory.exporter.ExcelExporter;
import fun.pullock.gof.creational.factory_pattern.simple_factory.exporter.Exporter;
import fun.pullock.gof.creational.factory_pattern.simple_factory.exporter.PdfExporter;

public class ExporterFactory {

    public static Exporter createExporter(String type) {
        switch (type) {
            case "pdf":
                return new PdfExporter();
            case "excel":
                return new ExcelExporter();
            case "csv":
                return new CsvExporter();
            default:
                throw new IllegalArgumentException("Unknown exporter type");
        }
    }
}
