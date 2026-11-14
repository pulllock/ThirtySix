package fun.pullock.gof.creational.factory_pattern.factory_method.factory;

import fun.pullock.gof.creational.factory_pattern.factory_method.exporter.CsvExporter;
import fun.pullock.gof.creational.factory_pattern.factory_method.exporter.Exporter;

public class CsvExporterFactory implements ExporterFactory {

    @Override
    public Exporter createExporter() {
        return new CsvExporter();
    }
}
