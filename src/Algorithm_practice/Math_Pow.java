package Algorithm_practice;

// 제곱
public class Math_Pow {
    static double pow(int a, double b){
        double result = 1;
        boolean isMinus = false;
        if(b == 0){
            return 1;
        }
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return isMinus ? 1/ result : result;
    }
    public static void main(String[] args){
        System.out.println("== Pow == ");
        System.out.println(pow(2,3));
        System.out.println(pow(2,-3));
    }
}
