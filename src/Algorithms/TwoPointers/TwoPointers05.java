package Algorithms.TwoPointers;

//Проверка на палиндром литкод
public class TwoPointers05 {
        public static void main(String[] args) {
            String s = "д овод";
            System.out.println(isPalindrome(s));
        }

        public static boolean isPalindrome(String s) {
            char arr [] = s.toCharArray();
            int left = 0;
            int right = arr.length - 1;
            boolean rez = true;

            while (left<right){

                while (!Character.isLetterOrDigit(arr[left])  && left < right){
                    left++;
                } //пропуск небуквенных символов слева

                while (!Character.isLetterOrDigit(arr[right]) && left < right){
                    right--;
                } //пропуск небуквенных символов справа


                if (Character.toLowerCase(arr[left]) != Character.toLowerCase(arr[right])){
                    rez = false;
                    break;
                }
                left++;
                right--;
            }

            return rez;
        }
}
