package fun.pullock.gof.creational.c3_2.product;

public class Product {

    private String partA;
    private String partB;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void show() {
        System.out.println("PartA: " + partA);
        System.out.println("PartB: " + partB);
    }
}
