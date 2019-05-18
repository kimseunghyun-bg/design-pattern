package book.introduction_design_pattern.chapter4.ex1idcard;

import book.introduction_design_pattern.chapter4.ex1.framework.Factory;
import book.introduction_design_pattern.chapter4.ex1.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
