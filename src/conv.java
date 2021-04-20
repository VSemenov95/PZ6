import java.util.Scanner;

public class conv {
    public static void main(String[] args) {
        //В данном случае число типа double записывается через ".", т.к. записывается в переменную типа String
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String n = in.nextLine();

        double n1=Double.parseDouble(n);
        //тут число типа double записывается через ",", т.к. записывается в переменную типа Double
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        double m = in1.nextDouble();
        //т.к. второе введенное число по условию задачи нужно записать в целочисленную переменную, дробная часть обнулится
        int m1= (int) m;
        //если первое число, например:4 , а второе число: 4.9, сравнение чисел будет не совсем корректным, т.к. число 4.9 при конвертации в int станет 4
        // не нашел решения на данную проблему
        if (m1>n1){
            System.out.println("Большее число: " +m1);
            System.out.println("Меньшее число: "+(double) n1);
        }
        else if (m1<n1){
            System.out.println("Большее число: " +n1);
            System.out.println("Меньшее число: "+(double) m1);
        }
        else{
            System.out.println("Числа равны");
        }
    }
}
