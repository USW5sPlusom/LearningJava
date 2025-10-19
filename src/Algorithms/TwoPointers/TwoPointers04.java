package Algorithms.TwoPointers;

//Проверка на палиндром
import java.util.List;
import java.util.ArrayList;
public class TwoPointers04 {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>(List.of("a", "b", "a"));
        int left = 0;
        int right = arr.size() - 1;
        boolean rez = true;
        while (left < right){
            if (!arr.get(left).equals(arr.get(right))){
                rez = false;
                break;
            }
            left++;
            right--;
            }

        System.out.println(rez);
    }

}
