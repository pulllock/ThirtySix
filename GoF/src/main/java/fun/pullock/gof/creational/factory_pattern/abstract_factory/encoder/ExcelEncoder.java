package fun.pullock.gof.creational.factory_pattern.abstract_factory.encoder;

public class ExcelEncoder implements Encoder {

    @Override
    public void encode() {
        System.out.println("Encode excel file...");
    }
}
