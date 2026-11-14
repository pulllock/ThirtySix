package fun.pullock.gof.creational.factory_pattern.factory_method.exporter;

public class ExcelExporter implements Exporter {

    @Override
    public void export() {
        System.out.println("Export excel file...");
    }
}
