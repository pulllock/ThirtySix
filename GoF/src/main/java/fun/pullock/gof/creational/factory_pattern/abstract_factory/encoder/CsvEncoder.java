package fun.pullock.gof.creational.factory_pattern.abstract_factory.encoder;

public class CsvEncoder implements Encoder {

    @Override
    public void encode() {
        System.out.println("Encode csv file...");
    }
}
