package org.hogwarts.items;

import org.hogwarts.Student;

public class Car implements Invisible {
    Student driver;
    int speed;


    public boolean isFlying() {
        return isFlying;
    }

    boolean isFlying = true;

    @Override
    public void becomeInvisible() {
        System.out.println("Машина сейчас невидима");
    }

    @Override
    public void becomeVisible() {
    System.out.println("Машина видима");
    }
}
