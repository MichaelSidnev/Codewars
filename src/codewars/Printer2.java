package codewars;

public class Printer2 {

    public static String printerError(String s) {
        String result =  s.replaceAll("[a-m]", "").length() + "/" + s.length();
        System.out.println(result);
        return  result;
    }

    public static void main(String[] args){
        String a = "aaaxbbbbyyhwawiwjjjwwm";
        System.out.println(a);
        String b = printerError(a);
        System.out.println(a);
        System.out.println(printerError(a));
    }
}
