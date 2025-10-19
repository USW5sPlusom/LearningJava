package Notes;

//Набрососк задачи Литкод на палиндром
public class Note06 {
    public static void main(String[] args) {
        String s = "д овод";
        boolean rez = true;
        char[] ss = s.toCharArray();
        int left = 0;
        int right = ss.length - 1;


        while (left < right) {
            while (!Character.isLetter(ss[left]) && left < right) {
            left++;
            }
            while (!Character.isLetter(ss[right]) && right > left) {
                right--;
            }
            if (Character.toLowerCase(ss[left]) != Character.toLowerCase(ss[right])) {
                rez = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(rez);
    }
}
