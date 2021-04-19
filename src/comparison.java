import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        double x=12.3, y=-3, z=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int m = in.nextInt();
        if (m>0) {
            double[] myArray = new double[m];
            for (int i = 0; i < m; i++) {
                Scanner in1 = new Scanner(System.in);
                System.out.println("Введите " + (i + 1) + " элемент массива");
                myArray[i] = in1.nextDouble();
            }
            for (int i = 0; i < m; i++) {
                if (myArray[i] == x | myArray[i] == y | myArray[i] == z) {
                    System.out.println("Данное значение имеется в константах: "+myArray[i]);
                }
            }
        }
        else{
            System.out.println("Введены некорретные данные длинны массива");
        }
    }
}
