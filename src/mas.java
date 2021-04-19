import java.util.Scanner;

public class mas {
    public static void main(String[] args) {
        double sum=0;
        int i=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        if(n>0) {
            double[] myArray = new double[n];
            while (i<= (n-1)) {
                Scanner in1 = new Scanner(System.in);
                System.out.print("Введите " + (i+1) + " элемент массива: ");
                myArray[i] = in1.nextDouble();
                sum = sum + myArray[i];
                i++;
            }
           double avg=sum/n;
            i=0;
            while (i<= (n-1)){
               double rez=myArray[i]*avg;
                System.out.print(rez + " ");
                i++;
            }
        }
        else
        {
            System.out.print("Введены некорректные данные");

        }
    }
}
