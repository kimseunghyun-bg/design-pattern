package io.github.kimseunghyun_bg.templateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractWorkOut pushUp = new PushUp();
        pushUp.todayWorkOut();

        AbstractWorkOut running = new Running();
        running.todayWorkOut();
    }
}
