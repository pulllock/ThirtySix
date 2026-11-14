package fun.pullock.gof.creational.factory_pattern.abstract_factory.exporter;

public class PdfExporter implements Exporter {

    @Override
    public void export() {
        System.out.println("Export pdf file...");
    }
}
