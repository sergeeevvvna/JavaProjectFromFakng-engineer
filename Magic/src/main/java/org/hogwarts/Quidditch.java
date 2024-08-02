package org.hogwarts;

import java.util.Random;

public class Quidditch {

    public void getBalls() {

    for(int i = 1; i < 4; i++){
        System.out.print("Запущен мяч под названием ");
        if(i == 1){
            System.out.println("Quaffle");
        }
        if(i == 2){
            System.out.println("Bludger");
        }
        if (i == 3){
            System.out.println("Golden Snitch");
        }
    }
    }

    public void playGame(){
        while(true){
            int control = new Random().nextInt(0,100);
            if(control == 77){
                System.out.println("Снитч пойман");
                break;
            }else{
                System.out.println("!");
            }
            }
        }

    }
