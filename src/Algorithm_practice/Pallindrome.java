package Algorithm_practice;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Pallindrome {
    public static int solution(int n, int m){
        int answer = 0;
        int reverse = 0;
        int input = n;
        int temp = input;
        while(input <=m) {
            temp = input;
            reverse = 0;
            while (temp != 0) {
                reverse = reverse * 10 + temp % 10;
                temp /= 10;
            }
            if(reverse == input){
                answer++;
            }
            input++;
        }
        return answer++;
    }
    public static int[] solution2(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                list.add(arr[i]);
            }else if(arr[i] == arr[i+1]){
                continue;
            }
        }
        list.add(arr[arr.length-1]);
        int[] answer = new int[list.size()];
        for (int i = 0; i <answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static int solution3(int n){
        int answer = 0;
        String[] sn = Integer.toString(n).split("");
        for (int i = 0; i < sn.length; i++) {
            int num = Integer.parseInt(sn[i]);
            answer += num;
        }
        return answer;
    }
    public static int solution4(String dirs){
        int answer = 0;
        String[] key = dirs.split("");
        int width = 0;
        int height = 0;
        int[] w = new int[key.length];
        int[] h = new int[key.length];
        int cnt = 0;
        for (String a : key) {
            if(a.equals("U")){
                height +=1;
                if(height > 5){
                    height -=1;
                    continue;
                }else{

                    w[cnt] = width;
                    h[cnt] = height;
                    answer++;
                }
            }else if(a.equals("D")){
                height -=1;
                if(height <-5){
                    height +=1;
                    continue;
                }
                else{
                    w[cnt] = width;
                    h[cnt] = height;
                    answer++;
                }
            }else if(a.equals("R")){
                width +=1;
                if(width >5){
                    width -=1;
                    continue;
                }
                else{

                    w[cnt] = width;
                    h[cnt] = height;
                    answer++;
                }
            }else if(a.equals("L")){
                width -=1;
                if(width < -5){
                    width +=1;
                    continue;
                }
                else{
                    w[cnt] = width;
                    h[cnt] = height;
                    answer++;
                }
            }
            cnt++;
        }
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h.length; j++) {
                if(i != j && i<j && w[i] == w[j] && h[i] == h[j] && w[i] != 0 && h[i] !=0 && w[j] != 0 && h[j]!=0){
                    answer--;
                    break;
                }
            }

        }

        return answer;
    }
    public static int solution5(int n, int a, int b){
        int answer = 0;
        if(n<a && n <b){
            return -1;
        }
        int x = (int) (Math.log(n)/Math.log(2));
        while(n %2 ==0){
            if(a<=n/2 && b<=n/2){
                x--;
                n = n/2;
            }else if(a>n/2 && b>n/2){
                a = a - n/2;
                b = b -n/2;
                x--;
                n = n/2;
            }else{
                answer = x;
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args){
//        int n = 1;
//        int m = 100;
//        System.out.println(solution(100,300));
//        int[] arr = {1,1,3,3,0,1,1};
//        System.out.println(Arrays.toString(solution2(arr)));
//        System.out.println(solution3(987));
        System.out.println(solution4("ULURRDLLU"));
        System.out.println(solution4("LULLLLLLU"));
//        System.out.println(solution5(8,1,2));
    }
}
