import java.util.Scanner;
import java.text.DecimalFormat;

public class kurs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double d = in.nextDouble();
        if (d<=0) {
            System.out.println("Некорректный ввод");
        }
        else {
            Scanner in1 = new Scanner(System.in);
            System.out.print("Количество рублей: ");
            double r = in.nextDouble();
            if (r >= 0) {
                //Перевод в доллары
                double z = r / d;
                //Задаем формат вывода
                DecimalFormat df = new DecimalFormat("#0.00");
                System.out.println("Итого: " + df.format(z) + " долларов");
            } else {
                System.out.print("Некорректный ввод");
            }
        }
    }
}
