//Тернарный оператор для четных нечетных

package Notes;

public class Note05 {
        public static void main(String[] args){
            System.out.println(evenOrOdd(8));
        }
        public static String evenOrOdd(int number) {
            return number % 2 == 0 ? "Even" : "Odd";
        }
    }

