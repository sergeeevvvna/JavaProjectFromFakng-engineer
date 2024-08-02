package org.hogwarts;

import java.util.Arrays;
import java.util.Scanner;

public class Potion {
    public void prepare() {
        Scanner scanner = new Scanner(System.in);
        String[] ingredients = {"Драконий коготь ", "Лист мандрагоры ", "Корень шершавой астрелии"};
        System.out.println("Добро пожаловать в лабораторию зелий! ");
        System.out.println("Введите ингредиенты, которые у вас есть (через запятую): ");
        String input = scanner.nextLine();
        String[] userIngredients = input.split(", ");
        for(int i = 0; i < ingredients.length; i++){
            for(int j = 0; j < userIngredients.length; j++){
                if(ingredients.length == userIngredients.length){
                    System.out.println("У вас есть все необходимые ингредиенты для зелья! Можете начинать создание.");
                }else{
                    System.out.println("У вас не хватает некоторых ингредиентов. Нельзя приступать к созданию зелья.");
                }
            }
        }
        System.out.println(Arrays.toString(userIngredients));

    }
}
