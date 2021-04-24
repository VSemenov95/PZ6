import java.util.Scanner;
import java.text.DecimalFormat;

public class kurs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double d= in.nextDouble();
        Scanner in1 = new Scanner(System.in);
        System.out.print("Количество рублей: ");
        double r= in.nextDouble();
       //Перевод в долларах
        double z = r / d;
        //Задаем формат вывода
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("Итого: " + df.format(z) + " долларов");

    }
}
