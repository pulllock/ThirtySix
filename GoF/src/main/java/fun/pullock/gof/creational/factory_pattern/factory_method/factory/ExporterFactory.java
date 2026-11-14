package fun.pullock.gof.creational.factory_pattern.factory_method.factory;

import fun.pullock.gof.creational.factory_pattern.factory_method.exporter.Exporter;

public interface ExporterFactory {

    public Exporter createExporter();
}
