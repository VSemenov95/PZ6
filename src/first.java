import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int i,j;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите количество столбцов: ");
        int m = in1.nextInt();
        double[][] myArray = new double[n][m];
        if (n > 0 && m > 0) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Введите [" + (i + 1) + "," + (j + 1) + "] элемент массива: ");
                    myArray[i][j] = in2.nextDouble();
                }
            }
        }
                //System.out.print(myArray[i][1]*3 + " ");
        else {
            System.out.println("Введены некорректные данные");
        }
        j=0;
        while (j<=m-1){
            System.out.print(myArray[0][j]*3 + " ");
            j++;
        }
    }
}

