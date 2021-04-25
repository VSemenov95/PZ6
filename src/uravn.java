import java.util.Scanner;

public class uravn {
    public static void main(String[] args) {
        System.out.print("Введите уравнение: ");
        Scanner in = new Scanner(System.in);
        String src = in.nextLine();
        if (src.length()==5) {
            char sym3 = src.charAt(3);
            //четвертый введенный символ должен быть "="
            if (sym3=='='){
                char sym0=src.charAt(0);
                char sym1=src.charAt(1);
                char sym2=src.charAt(2);
                char sym4=src.charAt(4);
                boolean res0=Character.isDigit(sym0);
                boolean res2=Character.isDigit(sym2);
                boolean res4=Character.isDigit(sym4);
                //Если введен +
                if(sym1=='+'){
                    if (sym0=='x' && (res2 & res4)){
                        int a=Character.getNumericValue(sym2);
                        int b=Character.getNumericValue(sym4);
                    int x=b-a;
                    System.out.println(x);
                    }
                    else if (sym2=='x' && (res0 & res4)) {
                        int a=Character.getNumericValue(sym0);
                        int b=Character.getNumericValue(sym4);
                        int x=b-a;
                        System.out.println(x);
                    }
                    else if (sym4=='x' && (res0 & res2)){
                        int a=Character.getNumericValue(sym0);
                        int b=Character.getNumericValue(sym2);
                        int x=a+b;
                        System.out.println(x);
                    }
                    else {
                        System.out.println("Уравнение введенно некорректно");
                    }
                }
                //Если введен -
                else if(sym1=='-'){
                    if (sym0=='x' && (res2 & res4)){
                        int a=Character.getNumericValue(sym2);
                        int b=Character.getNumericValue(sym4);
                        int x=b+a;
                        System.out.println(x);
                    }
                    else if (sym2=='x' && (res0 & res4)) {
                        int a=Character.getNumericValue(sym0);
                        int b=Character.getNumericValue(sym4);
                        int x=a-b;
                        System.out.println(x);
                    }
                    else if (sym4=='x' && (res0 & res2)){
                        int a=Character.getNumericValue(sym0);
                        int b=Character.getNumericValue(sym2);
                        int x=a-b;
                        System.out.println(x);
                    }
                    else{
                        System.out.println("Уравнение введенно некорректно");
                    }
                }
                else {
                    System.out.println("Уравнение введенно некорректно");
                }

            }
            else {
                System.out.println("Уравнение введенно некорректно");
            }
        }
        else {
            System.out.println("Уравнение введенно некорректно");
        }
    }
}
