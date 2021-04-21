public class random {
    public static void main(String[] args){
        double[] myArray = new double[15];
        for (int i=0; i< myArray.length; i++){
            //math.random генерирует от 0 до 1, нужно от -20 до 20
            myArray[i] = Math.random()*40-20;
            //System.out.println(myArray[i]);
        }
        double max=myArray[0];
        double min=myArray[0];
        for (int i=1; i<myArray.length; i++) {
            if (max<myArray[i]){
                max=myArray[i];
            }
        }
        for (int i=1;i<myArray.length; i++) {
            if (min>myArray[i]) {
                min=myArray[i];
            }
        }
        System.out.println("Максимальный элемент массива = " +max);
        System.out.println("Минимальный элемент массива = " +min);
        if (Math.abs(max)>Math.abs(min)){
            System.out.println("Максимальное по модулю число(max, min)="+max);
        }
        else if (Math.abs(max)<Math.abs(min)) {
            System.out.println("Максимальное по модулю число(max, min)="+min);
        }
        else {
            System.out.println("min и max по модулю равны");
        }
    }
}
