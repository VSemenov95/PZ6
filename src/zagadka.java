import java.util.Scanner;
public class zagadka {
    public static void main(String[] args) {
        String otvet="Заархивированный вирус";
        System.out.println("Загадка: «Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает». Что это?");
        System.out.print("Ответ: ");
        Scanner in = new Scanner(System.in);
        String otvet1 = in.nextLine();
        //попытка 1
        //если правильно
        if (otvet.equals(otvet1)) {
            System.out.print("Правильно!");
        }
        //если подсказка
        else if (otvet1.equals("Подсказка")){
            System.out.println("Ваша подсказка: Троян");
            System.out.print("Ответ: ");
            Scanner in1 = new Scanner(System.in);
            String otvet2 = in1.nextLine();
            //угадал после подсказки
            if (otvet2.equals(otvet)) {
                System.out.println("Правильно!");
            }
            //снова ввел подсказку
            else if (otvet2.equals("Подсказка")){
                    System.out.println("Подсказка уже недоступна");
                    System.out.print("Ответ(подсказка недоступна): ");
                    Scanner in5 = new Scanner(System.in);
                    String otvet5 = in5.nextLine();
                    if (otvet5.equals(otvet)) {
                        System.out.println("Правильно!");
                    }
                    else {
                        System.out.println("Обидно, приходи в другой раз");
                    }
                }
                //не угадал
                else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
            //ecли неправильно -> попытка 2
            else {
                System.out.println("Подумай еще");
                System.out.print("Ответ: ");
                Scanner in1 = new Scanner(System.in);
                String otvet2 = in1.nextLine();
                if (otvet2.equals(otvet)){
                    System.out.println("Правильно!");
                }
                else if (otvet2.equals("Подсказка")){
                    System.out.println("Подсказка уже недоступна");
                    System.out.print("Ответ(подсказка недоступна): ");
                    Scanner in6 = new Scanner(System.in);
                    String otvet6 = in6.nextLine();
                    if (otvet6.equals(otvet)) {
                        System.out.println("Правильно!");
                    }
                    else {
                        System.out.println("Обидно, приходи в другой раз");
                    }
                }
                else {
                    System.out.println("Подумай еще");
                    System.out.print("Ответ: ");
                    Scanner in2 = new Scanner(System.in);
                    String otvet3 = in2.nextLine();
                    if (otvet3.equals(otvet)){
                        System.out.println("Правильно!");
                    }
                    else if (otvet3.equals("Подсказка")) {
                        System.out.println("Подсказка уже недоступна");
                        System.out.print("Ответ(подсказка недоступна): ");
                        Scanner in7 = new Scanner(System.in);
                        String otvet7 = in7.nextLine();
                    }
                    else {
                        System.out.println("Обидно, приходи в другой раз");
                    }
                }
            }
        }
    }