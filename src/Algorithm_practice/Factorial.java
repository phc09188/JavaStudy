package Algorithm_practice;
//팩토리얼
public class Factorial {
    static int factorial (int n ){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args){
        System.out.println(factorial(3));
    }
}
