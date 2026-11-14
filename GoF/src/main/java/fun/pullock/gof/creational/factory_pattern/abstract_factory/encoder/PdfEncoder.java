package fun.pullock.gof.creational.factory_pattern.abstract_factory.encoder;

public class PdfEncoder implements Encoder {

    @Override
    public void encode() {
        System.out.println("Encode pdf file...");
    }
}
