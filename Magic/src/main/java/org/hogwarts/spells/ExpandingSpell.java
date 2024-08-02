package org.hogwarts.spells;

public class ExpandingSpell extends Spell {
    public ExpandingSpell(Boolean reducing, Boolean expanding) {
        super(reducing, expanding);
        if (expanding == true){
            doMagic();
        }else {
            System.out.println("Звклинание не выполнено");
        }
    }

    @Override
    public void doMagic() {
        System.out.println("Выполнено заклинание увеличения");
    }
}
