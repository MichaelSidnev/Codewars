package codewars;

public class Sum{
    public static int getSum(int a, int b) {
        int result = 0;
        if(a == b){
            return b;
        }
        if(a < b){
            result = a;
            while(a != b){

                a++;
                result = result + a;
            }
        }
        if(a > b){
            result = b;
            while(a != b){
                b++;
                result = result + b;
            }
        }
        //Good luck!
        return result;
    }
}
