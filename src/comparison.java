import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        String x = "h", y = "12,3", z = "0";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int m = in.nextInt();
        //Заполнение массива
        if (m > 0) {
            //Смотри, попробуй адаптировать программу не только для чисел, но и для строк
            String[] myArray = new String[m];
            for (int i = 0; i < m; i++) {
                Scanner in1 = new Scanner(System.in);
                System.out.print("Введите " + (i + 1) + " элемент массива:");
                myArray[i] = in1.nextLine();
                if (x.equals(myArray[i]) | y.equals(myArray[i]) | z.equals(myArray[i])) {
                    System.out.println("Данное значение имеется в константах");
                }
            }
        }
    }
    {
        System.out.println("Некорректная длинна массива");
    }
}
