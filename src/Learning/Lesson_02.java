package Learning;

import java.util.Scanner; //Для ввода ин-ии

public class Lesson_02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt(); //считать число
        scanner.nextLine(); //очищаем буфер чтоб некст некстлайн сработал
        String stroka = scanner.nextLine();//считать строку

        System.out.println(age + stroka + "\n");

        System.out.print("Введите ваш возраст: ");
        short your_age = scanner.nextShort();
        if (your_age >= 18){
            System.out.println("Урааа! Ты совершеннолетний!");
        } else {
            System.out.println("Проебали.. Ты несовершеннолетний..");
        }
    }
}
