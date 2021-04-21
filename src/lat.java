import java.util.Scanner;

public class lat {
    public static void main(String[] args) {
        int kol=0; //количество слов на латинице
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение, разделяя слова и числа пробелом: ");
        String str = in.nextLine(); //ввод строки
        char sym = str.charAt(0); //переменная для первого элемента строки
        boolean first = Character.isLetter(sym);
        //выводим первый символ(нулевой элемент строки), если он принадлежит латинице
        //использовал для избежания ошибки сравнения нулевого элемента с предыдущим(несуществующим)
        if (first==true && (sym >= 'a' && sym <= 'z') | (sym >= 'A' && sym <= 'Z')){
            System.out.print(sym);
        }
        //запускаем цикл со второго символа (первого элемента строки)
        for (int i=1; i<str.length(); i++) {
            char sym1 = str.charAt(i);//вытаскиваем текущий(i) символ из строки
            char sym2 = str.charAt(i-1); //вытаскивает предыдущий(i-1) символ
            boolean result1 = Character.isWhitespace(sym1);//проверка на пустое пространство текущего символа

            //условие для символа, принадлежащего кириллице. Если true, то выводим
            if ((sym1 >= 'a' && sym1 <= 'z') | (sym1 >= 'A' && sym1 <= 'Z')){
                System.out.print(sym1);
            }
            //если текущий элемент строки "_" и предыдущий символ относится к латинице выводим пробел
            else if(result1==true && (sym2 >= 'a' && sym2 <= 'z') | (sym2 >= 'A' && sym2 <= 'Z')) //отбасываем кириллицу
            {
                System.out.print(" ");
                //пробел выводится в случае, если слово на латинице заканчивается и после него ставится "_", следовательно наращиваем kol
                kol=kol+1;
            }
            //ветка, если текущий(i) символ = цифра/буква не из латиницы
            else {
                System.out.print("");
            }
        }
        //переход на следующую строку
        System.out.println("");
        //часть кода для избежания ситуаций, если слово на латинице - единственное или последнее, после которого не ставится пробел
        //в таком случае подсчет количества слов на латинице был бы некорректен
        char last = str.charAt(str.length()-1);
        boolean res =Character.isLetter(last);
        if (first==true | res==true && (last >= 'a' && last <= 'z') | (last >= 'A' && last <= 'Z')){
            System.out.println("Количество слов на латинице:" +(kol+1));
        }
        else {
            System.out.println("Количество слов на латинице:" +(kol));
        }
    }
}
