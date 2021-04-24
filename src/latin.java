import java.util.Scanner;

public class latin {
    public static void main(String[] args) {
        int lat=0;
        int kol = 0; //количество слов на латинице
        String str;
        //ввод строки
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение, разделяя слова и числа пробелом: ");
        str = in.nextLine();
        //разбиваем строку на элементы
        String[] result = str.split(" ");
        //Проверяем каждый элемент
        for (int i=0;i<result.length; i++) {
            for (int j=0;j<result[i].length();j++) {
                char sym1 = result[i].charAt(j);
                boolean res = Character.isLetter(sym1);//проверка на букву
                if (res==true && (sym1 >= 'a' && sym1 <= 'z') | (sym1 >= 'A' && sym1 <= 'Z')) {
                    //счётчик букв латиницы
                    lat++;
                }
                else {
                    lat=0;
                }
                //сравниваем наш счётчик с длинной подстроки
                if (lat == result[i].length()) {
                    //если true, то в подстроке только буквы латиницы, выводим слово целиком
                    System.out.print(result[i]+" ");
                    //обнуляем счетчик
                    lat=0;
                    //наращиваем счётчик слов на латинице
                    kol++;
                }
            }
        }
        System.out.println("");
        System.out.println("Количество слов на латинице:"+kol);
    }
}
