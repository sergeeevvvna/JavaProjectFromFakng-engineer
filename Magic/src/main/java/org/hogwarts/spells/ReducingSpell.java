package org.hogwarts.spells;

public class ReducingSpell extends Spell{
    public ReducingSpell(Boolean reducing, Boolean expanding) {
        super(reducing, expanding);
        if(reducing == true){
            doMagic();
        }else {
        System.out.println("Звклинание не выполнено");
        }
    }

    @Override
    public void doMagic() {
        System.out.println("Выполнено заклинание уменьшения");
    }
}
