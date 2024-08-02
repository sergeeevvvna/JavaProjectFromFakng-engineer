package org.hogwarts.items;

public class Cloak implements Invisible {
    int capacity;
    int weight;

    @Override
    public void becomeInvisible() {
        System.out.println(capacity + "столько людей под плащем и их не видно");
    }

    @Override
    public void becomeVisible() {
        System.out.println(capacity + "столько людей не под плащем и их видно");
    }
}
