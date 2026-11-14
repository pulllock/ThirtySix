package fun.pullock.gof.creational.factory_pattern.without_pattern.exporter;

public class CsvExporter implements Exporter {

    @Override
    public void export() {
        System.out.println("Export csv file...");
    }
}
