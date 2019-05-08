package book.introduction_design_pattern.chapter2.ex2;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner(new Banner("Hello"));
        p.printWeak();
        p.printStrong();
    }
}
