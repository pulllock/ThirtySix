package fun.pullock.gof.creational.factory_pattern.abstract_factory.exporter;

public class CsvExporter implements Exporter {

    @Override
    public void export() {
        System.out.println("Export csv file...");
    }
}
