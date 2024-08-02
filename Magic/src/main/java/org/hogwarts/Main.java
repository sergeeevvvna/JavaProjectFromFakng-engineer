package org.hogwarts;

import org.hogwarts.beast.Hippogriff;
import org.hogwarts.items.Car;

public class Main {
    public static void main(String[] args) {
     /*   Car car = new Car();
        String[] navik = {"Flying", "Potion-making", "Transfiguration"};
        Student student = new Student("Alena", "Is", 19, navik);
        if(car.isFlying()){
            car.becomeInvisible();
        }else{
            car.becomeVisible();
        }*/
        String[] navik = {"Flying", "Potion-making", "Transfiguration"};
        Student student = new Student("Alena", "Is", 19, navik);
        Student student2 = new Student("Alena", "Is", 20, navik);
        Student student3 = new Student("Alena", "Is", 26, navik);
      student.compareTo(student2);
        System.out.println(student.compareTo(student2));
    }
}