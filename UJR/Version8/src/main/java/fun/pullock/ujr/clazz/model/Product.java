package fun.pullock.ujr.clazz.model;

import javax.annotation.Resource;
import java.io.Serializable;
import java.math.BigDecimal;

@Resource
public class Product extends Base implements Serializable {

    private String name;

    private BigDecimal price;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    private Product(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", count=" + count +
                ", name='" + name + '\'' +
                '}';
    }
}
