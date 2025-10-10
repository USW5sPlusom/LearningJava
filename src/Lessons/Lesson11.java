//Коллекции List(ArrayList и LinkedList) упорядоченная коллекция (как улучшенный массив)
//есть еще Set - без дубликатов и Map - пары ключ-значение
package Lessons;

import java.util.ArrayList;
import java.util.List;
public class Lesson11 {
    public static void main(){
        ArrayList <String> mass = new ArrayList<>(); //Используем интерфейс List

        //Добавим парочку элементов
        mass.add("Учить джава кор");
        mass.add("Учить внешние технологии");
        mass.add("Делать ненужности");
        mass.add("Бездельничать");

        //Вставим элемент на 1ую позицию
        mass.add(0, "Практиковаться");

        //Получаем и выводим 1ый элемент
        String first = mass.get(0);
        System.out.println(first);

        //Поменяем 2ой элемент
        mass.set(2, "Учить современные внешние технологии");

        //Выводим
        System.out.println(mass);

        //Удаляем элемент по значению
        mass.remove("Делать ненужности");
        //Удаляем элемент по индексу
        mass.remove(3);

        //Выводим
        System.out.println(mass);

        //Выводим информацию о списке
        System.out.println(mass.size());
        System.out.println(mass.contains("Бездельничать")); //проверяем наличие элемента

        //Перебор коллекции
        for (String element : mass){
            System.out.println(element);
        }

        //Полная очистка коллекции
        mass.clear();
    }
}
