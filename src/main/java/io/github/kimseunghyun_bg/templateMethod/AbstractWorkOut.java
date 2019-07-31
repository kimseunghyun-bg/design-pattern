package io.github.kimseunghyun_bg.templateMethod;

public abstract class AbstractWorkOut {

    public void todayWorkOut(){
        preparing();
        workout();
        shower();
    }

    private void preparing(){
        System.out.println("Preparatory movement");
    }

    abstract void workout();

    private void shower(){
        System.out.println("Taking a shower after workout");
    }

}
