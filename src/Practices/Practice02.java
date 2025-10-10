// Каждый раз использовать новый сканер - плохая идея, лучше сделать один сканер в мейн

package Practices;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calc(scan);
        scan.close();
    }

    public static void Calc(Scanner scan){
        while (true) {
            System.out.print("Введите первое число: ");
            int a = getNumber(scan);
            System.out.print("Введите второе число: ");
            int b = getNumber(scan);
            System.out.print("Выберете действие (+, -, *, /): ");
            String op = getOperation(scan);
            calculate(op, a, b);
            System.out.println();
        }
    }

    public static int getNumber(Scanner scan){
        return scan.nextInt();
    }

    public static String getOperation(Scanner scan){
        return scan.next();
    }

    public static void calculate(String t, int a, int b){
        if (t.equals("+")){
            System.out.print("Сумма чисел = " + (a + b));
        } else if (t.equals("-")){
            System.out.print("Сумма чисел = " + (a - b));
        } else if (t.equals("*")){
            System.out.print("Сумма чисел = " + (a * b));
        } else if (t.equals("/")){
            System.out.print("Сумма чисел = " + (a / b));
        }
    }
}
