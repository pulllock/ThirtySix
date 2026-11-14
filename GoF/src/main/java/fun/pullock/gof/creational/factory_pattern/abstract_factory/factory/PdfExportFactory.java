package fun.pullock.gof.creational.factory_pattern.abstract_factory.factory;

import fun.pullock.gof.creational.factory_pattern.abstract_factory.encoder.Encoder;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.encoder.PdfEncoder;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.exporter.Exporter;
import fun.pullock.gof.creational.factory_pattern.abstract_factory.exporter.PdfExporter;

public class PdfExportFactory implements ExportFactory{

    @Override
    public Exporter createExporter() {
        return new PdfExporter();
    }

    @Override
    public Encoder createEncoder() {
        return new PdfEncoder();
    }
}
