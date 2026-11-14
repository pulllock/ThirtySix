package fun.pullock.gof.creational.factory_pattern.abstract_factory.factory;

import fun.pullock.gof.creational.factory_pattern.abstract_factory.encoder.Encoder;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.exporter.Exporter;

public interface ExportFactory {

    public Exporter createExporter();

    public Encoder createEncoder();
}
