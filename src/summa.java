import java.util.Scanner;

public class summa {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int n = in.nextInt();
        if (n>0) {
            while (i <= n) {
                sum = sum + i;
                i = i + 2;
            }
            System.out.println(sum);
        }
        else{
            System.out.println("Введеное число несоответствует условиям");
        }

    }
}
