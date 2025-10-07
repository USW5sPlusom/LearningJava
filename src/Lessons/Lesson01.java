package Lessons;
public class Lesson01 {
    public static void main(String[] args){
        System.out.println("Hello, world!");

        short age = 25;
        short girlfriends_age = 23;
        System.out.print("Ваш общий возраст " + (age + girlfriends_age));
        System.out.println("!");

        int counter = 0;
        counter += 5;
        counter ++;
        counter --;
        System.out.println("Счетчик " + counter);

        double double_counter = counter;
        int BackToInt_counter = (int) counter;
    }
}
/*
//Создание классов и методов
//Переменные, их типы (пока только примтивы)
//Арифметические операции + инкремент\декремент
//Преобразование типов
//Вывод в консоль
//Комментарий (cntrl + слеш  айдеешке)
*/