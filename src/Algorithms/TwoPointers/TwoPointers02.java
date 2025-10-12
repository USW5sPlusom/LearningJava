//нахождение пары элементов с минимальной разницей

//сортировка и два одновременных

//единственное что - возвращаются индексы уже нового, отсортированного массива
package Algorithms.TwoPointers;

import java.util.Arrays;
public class TwoPointers02 {
    public static void main(String[] args){
        int[] x = {12,4,14,5,6,2,7,1};
        System.out.println(twoPointers(x)[0] + " " + twoPointers(x)[1]);
    }

    public static int [] twoPointers(int [] arr){
        int rez[] = new int[2];
        int left = 0;
        int right = 1;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        while (right < arr.length){
            if (arr[right] - arr[left] < min){
                rez[0] = left;
                rez[1] = right;
                min = arr[right] - arr[left];
            }
            left++;
            right++;
        }
        return rez;
    }
}
