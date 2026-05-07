package fun.pullock.gof.creational.c3_3.factory;

import fun.pullock.gof.creational.c3_3.product.Product;

public abstract class Creator {

    /**
     * 工厂方法
     * 定义一个“创建对象的方法”，但不实现，不写new，把创建延迟到子类
     * @return
     */
    public abstract Product createProduct();

    /**
     * 业务方法（模版方法）
     */
    public void operation() {
        // 用方法代替构造器（虚构造器）
        Product product = createProduct();
        product.use();
    }
}
