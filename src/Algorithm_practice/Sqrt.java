package Algorithm_practice;


public class Sqrt {
    static double sqrt(int a){
        double result = 1;
        for (int i = 0; i < 10; i++) {
            result = (result + (a/result))/2;
        }

        return result;
    }
    public static void main(String[] args){
        System.out.println(sqrt(15));
    }
}
