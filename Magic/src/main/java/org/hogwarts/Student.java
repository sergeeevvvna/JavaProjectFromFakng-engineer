package org.hogwarts;

import java.util.Collection;

public class Student implements Comparable<Student> {
    private String name;
    private String facultet;
    private int age;
    public String[] navik = {"Flying", "Potion-making", "Transfiguration"};

    public String getName() {
        return name;
    }

    public String getFacultet() {
        return facultet;
    }

    public int getAge() {
        return age;
    }

    public String[] getNavik() {
        return navik;
    }

    public Student(String name, String facultet, int age, String[] navik) {
        this.name = name;
        this.age = age;
        this.facultet = facultet;
        this.navik = navik;
    }

    public void CastSpell(Spell spell) throws Throwable {
        if (this.age <= 11) {
            if (spell.getPower() == 1) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            }
        }

    }

    @Override
    public int compareTo(Student other) {
        int result = this.age - other.age;
        if(result < 0){
        }
        return result;
    }

}
