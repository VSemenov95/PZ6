import java.util.Scanner;

public class uni {
    public static void main(String[] args) {
        int maxun=0; //переменная для сравнения
        int max=0; //в переменной max хранится индекс максимальной строки
        System.out.print("Количество строк: ");
        Scanner in = new Scanner(System.in);
        int kol = in.nextInt();
        String[][] myArray = new String[1][kol];
        //заполненяем по строкам
        for (int i=0;i<kol;i++){
            System.out.print("Строка " +(i+1)+": ");
            Scanner in1 = new Scanner(System.in);
            myArray[0][i] = in1.nextLine();
        }
        //Подсчет уникальных символов
        for (int j=0;j<kol;j++){
            //в массив un будем записывать количество уникальных символов каждой строки
            //массив будет на 1 элемент больше, массива строк для избежания ошибок сравнения с полсденим элементов
            int[] un = new int[kol];
            //u - переменная счетчик уникальных символов
            int u=0;
            int a=myArray[0][j].length();
            for (int k=0;k<a;k++){
                //вытаскиваем символ поочередно в рамках строки
                char sym1 = myArray[0][j].charAt(k);
                //сравниваем его с другими символами в строке
                    for (int n=0;n<a;n++){
                        char sym2=myArray[0][j].charAt(n);
                        if (sym1!=sym2){
                            //если текущий символ равен символу для сравнения, наращиваем счетчик и обновляем его в массиве
                            //Привет! Смотри, у тебя сравнивается символ с предыдущими, но у тебя символ 'a' и если
                            //до этого идет 100 символов b, то у тебя переменная u будет равна 100, но по факту у тебя
                            //два символа
                            //Как вариант решения, можешь переделать этого код или использовать HashSet
                            //Тестовые данные:
                            /*Количество строк: 3
                            Строка 1: rtrtrtrtrtrtrtrtrtrtrtrtrtrtrtrtrtrtrtrtfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgf
                            Строка 2: qwertyuiop
                            Строка 3: rtrtrtrtrtrtrtrtrtrtrtrtrtrtrtrtfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgioioioioioioioioioioioioioioioioioioioioio
                            Ответ: rtrtrtrtrtrtrtrtrtrtrtrtrtrtrtrtfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgioioioioioioioioioioioioioioioioioioioioio*/
                            //Ответ должна быть вторая строка, так как там больше всего уникальных символов
                            u++;
                            un[j]=u;
                        }
                    }
            }
            //ищем индекс строки с максимальным количеством уникальных символов
            if (un[j]>maxun) {
                maxun=un[j];
                max = j;
            }
        }
        System.out.println("Ответ: "+myArray[0][max]);
    }
}
