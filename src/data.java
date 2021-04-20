import java.util.Locale;

public class data {
    public static void main(String[] args) {
        String str="I like Java!!!";
        boolean a=str.contains("Java");
        boolean b=str.startsWith("I like");
        boolean c=str.endsWith("!!!");
        if (a==true && b==true && c==true) {
          String str2=str.toUpperCase();
            System.out.println(str2);
        }
        String res=str.replace('a','o');
        String result=res.substring(7,11);
        System.out.println(result);
    }

}
