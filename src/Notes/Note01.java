package Notes;

public class Note01 {
    public static void main(String[] args){
        //Для приведения примитивов к строке предпочтителен String.valueOf(приводимая переменная) - выдает обьект, перегружен

        //Для приведения строки к примитиву XXXX.parseXXX(переменная) вернет примитив
        //Для приведения строки к примитиву XXXX.valueOf(переменная) вернет обьект
    }

    //метод поиска наименьшего в массиве
    public class SmallestIntegerFinder {
        public static int findSmallestInt(int[] args) {
            int[] j = args;
            int min_j = j[0];
            for (int i = 1; i < j.length; i++){
                if (min_j > j[i]){
                    min_j = j[i];
                }
            }
            return min_j;
        }
    }

}
