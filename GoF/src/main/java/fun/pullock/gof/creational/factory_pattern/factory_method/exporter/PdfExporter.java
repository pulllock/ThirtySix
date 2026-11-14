package fun.pullock.gof.creational.factory_pattern.factory_method.exporter;

public class PdfExporter implements Exporter {

    @Override
    public void export() {
        System.out.println("Export pdf file...");
    }
}
