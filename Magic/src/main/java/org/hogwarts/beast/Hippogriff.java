package org.hogwarts.beast;

import org.hogwarts.Student;

import java.util.Random;

public class Hippogriff {
    private String name;
    private int age;
    private String color;
    private Boolean jump;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public Boolean getJump() {
        return jump;
    }


    public Hippogriff(String name, int age, String color, Boolean jump) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.jump = jump;
    }

    public Hippogriff(String name) {
        this.name = name;
    }

    public Hippogriff(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Hippogriff(){}

    public void eat(String food){
        if(food == "apple"){
            System.out.println("Am-Am-Am");
        }else{
            System.out.println("Beeeee");
        }
    }

    public String fly() {
        if (age > 2) {
            System.out.println("Hippogriff" + this.name + " flying");
        } else {
            System.out.println("Hippogriff small");
        }
        return (this.name + "Попробуйте снова");
    }

    public String giveRide(Student student){
        int isGivingRide = new Random().nextInt(1,10);
        if(isGivingRide <= 3 && isGivingRide >= 0){
            return (student.getName() + "летит на гиппогрифе!");
        }
        if( isGivingRide >= 4 && isGivingRide <= 8){
            return (student.getName() + "Hippogrif отвернулся");
        }
        if (isGivingRide >= 9 && isGivingRide <= 10){
            return (student.getName() + "Повторите попытку");
        }

        return ("Число не от 1 до 10");
    }
}
