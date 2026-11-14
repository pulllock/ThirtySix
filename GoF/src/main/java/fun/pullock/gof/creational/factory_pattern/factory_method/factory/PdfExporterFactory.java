package fun.pullock.gof.creational.factory_pattern.factory_method.factory;

import fun.pullock.gof.creational.factory_pattern.factory_method.exporter.Exporter;
import fun.pullock.gof.creational.factory_pattern.factory_method.exporter.PdfExporter;

public class PdfExporterFactory implements ExporterFactory {

    @Override
    public Exporter createExporter() {
        return new PdfExporter();
    }
}
