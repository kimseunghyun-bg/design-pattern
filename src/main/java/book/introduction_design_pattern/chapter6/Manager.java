package book.introduction_design_pattern.chapter6;

import java.util.HashMap;

public class Manager {
    public HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
