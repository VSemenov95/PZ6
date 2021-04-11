import java.util.Scanner;

public class converter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите, что переводить:1-масса, 2-расстояние: ");
        int x= in.nextInt();

        //ветка для массы
        if (x==1){
            Scanner in1 = new Scanner(System.in);
            System.out.println("Выберите единицы измерения:1-килограммы, 2-унции, 3-стон, 4-фунты: ");
            int mas=in1.nextInt(); // в маs кладем единицу измерения массы
            if (mas>=1 && mas<=4 ) {
            Scanner in2 = new Scanner(System.in);
            System.out.println("Введите число: ");
            int kol=in2.nextInt(); // в kol кладем число - количество, выбранной единицы измерения
            if(kol>=0) { //Проверка на валидность kol
                System.out.println("Результат:");
                switch (mas) {
                    case 1:
                        //для Килограмма
                        System.out.println("Килограммы: " + kol);
                        System.out.println("Унции: " + (kol * 35.274));
                        System.out.println("Стон: " + (kol * 0.157473));
                        System.out.println("Фунты: " + (kol * 2.20462));
                        break;
                    case 2:
                        //для Унции
                        System.out.println("Унции: " + kol);
                        System.out.println("Килограммы: " + (kol * 0.0283495));
                        System.out.println("Стон: " + (kol * 0.00446429));
                        System.out.println("Фунты: " + (kol * 0.0625));
                        break;
                    case 3:
                        //Для Стон
                        System.out.println("Стон: " + kol);
                        System.out.println("Килограммы: " + (kol * 6.35029));
                        System.out.println("Унции: " + (kol * 224));
                        System.out.println("Фунты: " + (kol * 14));
                        break;
                    case 4:
                        //Для Фунта
                        System.out.println("Фунты: " + kol);
                        System.out.println("Килограммы: " + (kol * 0.453592));
                        System.out.println("Унции: " + (kol * 16));
                        System.out.println("Стон: " + (kol * 0.0714286));
                        break;
                }
            }
            else {
                System.out.println("Физическая величина может принимать только положительное значение или ноль");
            }
            }
            else {
                System.out.println("Выбор единиц измерения некорректен"); //невалидный ввод единиц измерения
            }
        }

        //ветка для расстояния
        else if (x==2) {
            Scanner in1 = new Scanner(System.in);
            System.out.println("Выберите единицы измерения:1-метр, 2-миля, 3-ярд, 4-фут: ");
            int ras = in1.nextInt(); // в ras кладем единицу измерения расстояния
            if (ras >= 1 && ras <= 4) {
                Scanner in2 = new Scanner(System.in);
                System.out.println("Введите число: ");
                int kol = in2.nextInt(); // в kol кладем число - количество, выбранной единицы измерения
                if (kol >= 0) { //Проверка на валидность kol
                    System.out.println("Результат:");
                    switch (ras) {
                        case 1:
                            //Для Метра
                            System.out.println("Метры: " + kol);
                            System.out.println("Мили: " + (kol * 0.000621371));
                            System.out.println("Ярды: " + (kol * 1.09361));
                            System.out.println("Футы: " + (kol * 3.28084));
                            break;
                        case 2:
                            //Для Мили
                            System.out.println("Мили: " + kol);
                            System.out.println("Метры: " + (kol * 1609.34));
                            System.out.println("Ярды: " + (kol * 1760));
                            System.out.println("Футы: " + (kol * 5280));
                            break;
                        case 3:
                            //Для Ярда
                            System.out.println("Ярды: " + kol);
                            System.out.println("Метры: " + (kol * 0.9144));
                            System.out.println("Мили: " + (kol * 0.000568182));
                            System.out.println("Футы: " + (kol * 3));
                            break;
                        case 4:
                            //Для Фута
                            System.out.println("Футы: " + kol);
                            System.out.println("Метры: " + (kol * 0.3048));
                            System.out.println("Мили: " + (kol * 0.000189394));
                            System.out.println("Ярды: " + (kol * 0.333333));

                    }
                } else {
                    System.out.println("Физическая величина может принимать только положительное значение или ноль");
                }
            }
            else{
                System.out.println("Выбор единиц измерения некорректен"); //невалидный ввод единиц измерения
            }
        }
        else {
                System.out.println("В списке нет выбранной физической величины по указанному Вами номеру");

        }
    }
}
