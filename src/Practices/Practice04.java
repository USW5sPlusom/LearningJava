//Консольная система управления складом, закрепление тем предыдущих тем, включая ООП и коллекции List
package Practices;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Product product = new Product(scan);
        scan.close();
    }

    public static class Product{
        private int id;
        private String name;
        private String category;
        private double price;
        private int quantity;
        private String dateAdded;

        public Product(Scanner scan){
            System.out.println("Введите id товара: ");
            this.id = Integer.valueOf(getter(scan));
            System.out.println("Введите наименование товара: ");
            this.name = getter(scan);
            System.out.println("Введите категорию товара: ");
            this.category = getter(scan);
            System.out.println("Введите цену товара: ");
            this.price = Double.valueOf(getter(scan));
            System.out.println("Введите колличество товара: ");
            this.quantity = Integer.valueOf(getter(scan));
            System.out.println("Введите дату добавления товара: ");
            this.dateAdded = getter(scan);
        }

        public static String getter(Scanner scan){
            return scan.nextLine();
        }

        public void displayInfo(){
            System.out.println(id);
        }
    }
}
