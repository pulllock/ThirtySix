package fun.pullock.gof.creational.factory_pattern.abstract_factory.factory;

import fun.pullock.gof.creational.factory_pattern.abstract_factory.encoder.Encoder;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.encoder.ExcelEncoder;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.exporter.ExcelExporter;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.exporter.Exporter;

public class ExcelExportFactory implements ExportFactory{

    @Override
    public Exporter createExporter() {
        return new ExcelExporter();
    }

    @Override
    public Encoder createEncoder() {
        return new ExcelEncoder();
    }
}
