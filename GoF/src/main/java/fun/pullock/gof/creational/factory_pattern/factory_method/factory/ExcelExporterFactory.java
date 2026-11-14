package fun.pullock.gof.creational.factory_pattern.factory_method.factory;

import fun.pullock.gof.creational.factory_pattern.factory_method.exporter.ExcelExporter;
import fun.pullock.gof.creational.factory_pattern.factory_method.exporter.Exporter;

public class ExcelExporterFactory implements ExporterFactory {

    @Override
    public Exporter createExporter() {
        return new ExcelExporter();
    }
}
