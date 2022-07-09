package Algorithm_practice;
//최대 공약열
public class Gcd {
    static int gcd(int a, int b){
        if(a%b == 0){
            return b;
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args){
        System.out.println(gcd(3,5));
    }
}
