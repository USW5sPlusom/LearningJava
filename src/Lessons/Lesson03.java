

package Lessons;

public class Lesson03 {
    public static void main(String[] args){
        String veta = "klassnaia";
        if (veta == "ne klasnaia"){
            System.out.println("Veta " + veta);
        }
        else if (veta.equals("klassnaia")){
            System.out.println("Veta " + veta);
        }
        else {
            System.out.println("Ukazite kakaia veta");
        }
        for (double i = 7; i <= 17; i += 0.5){
            System.out.println(i);
        }
        int c = 1;
        while(c < 101){
            System.out.println(c);
            c++;
        }
        int cc = 100;
        do {
            System.out.println("Veta - eto klass");
        } while (cc > 100);
        boolean a = true;
        int aa = 14;
        do {
            System.out.println(aa);
            if (aa == 46) {
                break;
            }
            aa += 16;
        } while (a);

    }
}
