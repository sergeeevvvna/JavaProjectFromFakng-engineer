package org.hogwarts.spells;

public abstract class Spell {
    Boolean Reducing;
    Boolean Expanding;

    public Spell(Boolean reducing, Boolean expanding) {
        Reducing = reducing;
        Expanding = expanding;
    }

    public abstract void doMagic();

}
