package book.introduction_design_pattern.chapter6;

public interface Product extends Cloneable {
    public abstract void use(String s);

    public abstract Product createClone();
}
