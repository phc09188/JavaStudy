package codeTest;


import java.util.ArrayList;
import java.util.Scanner;

public class number2 {
    public static void main(String[] args){
        ArrayList arr = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int a =1, b = 1;
        while(a!=0 && b!=0){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a>b && a!=0 && b!=0){
                arr.add("Yes");
            }else if(a<=b && a!=0 && b!=0){
                arr.add("No");
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
