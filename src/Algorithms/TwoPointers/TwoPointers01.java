package Algorithms.TwoPointers;

//напрашивается два цикла - это оно

//Нахождение пары элементов с таргетной суммой
public class TwoPointers01 {
    public static void main(String[] args){
        int [] mass = {1,2,3,4,100,200};
        int target = 300;
        int [] rez = targetSumm(mass, target);
        System.out.println(rez[0] + " " +rez[1]);
    }

    public static int[] targetSumm(int[] arr, int n) {
        int[] m = new int[2];
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == n) {
                m[0] = left;
                m[1] = right;
                return m;
            } else if (arr[left] + arr[right] < n) {
                left++;
            } else if (arr[left] + arr[right] > n) {
                right--;
            }
        }
        return m;
    }
}
