package book.introduction_design_pattern.chapter3;

public abstract class AbstractDisplay {
    abstract void open();

    abstract void print();

    abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
