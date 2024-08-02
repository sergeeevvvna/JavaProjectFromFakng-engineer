package org.hogwarts;

public class Spell {

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    private int title;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    private int power;
    public Spell(int title, int power) {
        this.title = title;
        if( power >= 1 && power <=7 ){
            this.power = power;
        }
    }


}
