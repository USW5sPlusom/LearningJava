//Игра угадай число
package Practices;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args){
        playGame();
    }

    public static void playGame(){
        //Файл с логикой игры
        int a = 5;
        int nn = getNumber();
        while (a != nn) {
            int n = getNumber();
            nn = n;
            if (a > n){
                System.out.println("Число больше!");
            } else if (a < n){
                System.out.println("Число меньше!");
            } else {
                System.out.println("Угадал!");
            }
        };
    }

    public static int getNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scan.nextInt();
        return n;
    }
}
