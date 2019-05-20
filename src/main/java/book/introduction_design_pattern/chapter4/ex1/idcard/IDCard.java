package book.introduction_design_pattern.chapter4.ex1.idcard;

import book.introduction_design_pattern.chapter4.ex1.framework.Product;

public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");
    }

    public String getOwner() {
        return owner;
    }
}
