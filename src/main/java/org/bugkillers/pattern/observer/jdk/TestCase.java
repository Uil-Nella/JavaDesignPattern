package org.bugkillers.pattern.observer.jdk;

public class TestCase {


    public static void main(String[] args) {

        Reader reader = new Reader();

        Publisher publisher = new Publisher();
        publisher.addObserver(reader);

        TVStation tvStation = new TVStation();
        tvStation.addObserver(reader);

        publisher.publish("Allen的博客");
        tvStation.play("冰与火之歌");

    }

}
