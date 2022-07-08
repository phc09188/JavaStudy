package codeTest;

import java.util.Scanner;

public class number1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c>=65 && c<=90){
                 output += (char)(c + 32);
            }else if((c>=97 && c<=122))
            {
                output += (char)(c-32);
            }else{
                output += (char)c;
            }
        }
        System.out.println(output);
    }
}
