package fun.pullock.gof.creational.factory_pattern.abstract_factory.factory;

import fun.pullock.gof.creational.factory_pattern.abstract_factory.encoder.CsvEncoder;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.encoder.Encoder;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.exporter.CsvExporter;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.exporter.Exporter;

public class CsvExportFactory implements ExportFactory{

    @Override
    public Exporter createExporter() {
        return new CsvExporter();
    }

    @Override
    public Encoder createEncoder() {
        return new CsvEncoder();
    }
}
