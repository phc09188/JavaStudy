package Algorithm_practice;

import java.io.*;
import java.util.*;
public class firstcodetest {
    public static int solution1(int n){
        int answer = 0;
        if(n>2){
            answer++;
        }
        n = n+1;
        while(n -->2){
            for (int i = 2; i < n; i++) {
                if(n%i == 0){
                    break;
                }else if(i == n-1){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static int pactorial(int n ){
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *=i;
        }
        return sum;
    }
    public static int Combination(int n, int r){
        return pactorial(n)/(pactorial(n-r) * pactorial(r));
    }
    public static int solution2(String[] names){
        if(names.length <=4 && names.length>100){
            return -1;
        }
            ArrayList<String> arr = new ArrayList();
        for (int i = 0; i < names.length; i++) {
            if(!arr.contains(names[i])){
                arr.add(names[i]);
            }
        }
        int n = arr.size();
        int r = 4;

        return Combination(n,r);
    }
    public static int solution3(int n ){
        int answer = 0;
        int cnt = 0;
        if(n ==1){
            answer = 1;
        }else if(n==2){
            answer = 2;
        }else if(n==3){
            answer =3;
        }else if(n>3){
            for (int i = 1; i <= n/2; i++) {
                answer += solution3(i)*solution3(n-i);
                if(i != 1){
                    answer -=solution3(n-i);
                }
            }
        }
        return answer;
    }
    public static int solution4(int n, int i, int j) {
        int answer = 0;
        int[][] arr= new int[n][n];
        int a = 0;
        int b = 0;
        int num =1;
        int cnt =1;
        int cnt2 = 1;
        int c = 0;
        int d = 0;
        int w = n/2;
        while(c<n/2 && d<n/2) {
            while (a < 2 && b < 2) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        if (k == 0 && l == 0) {
                            arr[w*c + 2 * a + k][w*d+2 * b + l] = num;
                            num++;
                        } else if (k == 0 && l == 1) {
                            arr[w*c + 2 * a + k][w*d+2 * b + l] = num;
                            num++;
                        } else if (k == 1 && l == 0) {
                            arr[w*c + 2 * a + k][w*d+2 * b + l] = num + 1;
                            num++;
                        } else if (k == 1 && l == 1) {
                            arr[w*c + 2 * a + k][w*d+2 * b + l] = num - 1;
                            num++;
                        }
                    }
                }
                if(a ==1 && b == 1 && cnt ==1){
                    a = 1;
                    b =0;
                    cnt =3;
                }else if(a ==1 && b ==0 && cnt ==3){
                    a =3;
                    cnt =1;
                }
                else if (cnt < 2) {
                    b++;
                    cnt++;
                } else if (cnt == 2) {
                    b = 1;
                    a++;
                    cnt = 1;
                }

            }
            if(cnt2 == n/4){
                d = 0;
                c++;
                cnt2 =1;

            }
            else if(cnt2<n/4){
                d++;
                cnt2++;
            }
            if(c<n/4 && d<n/4){
                a = 0;
                b = 0;
            }

        }
        System.out.println(Arrays.deepToString(arr));
        return arr[i][n-j-1];
    }
    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] names = {"제로", "베이스","자바","스쿨","자바","베이스","베이스","백엔드","화이팅"};
//        String[] names2 = {"박민수", "김진영", "마봉춘", "김민주", "김진영", "박만수", "김진영", "김진영", "마봉춘", "김기수", "정진형", "김민주", "만수르", "백수르", "천수르", "만수르", "만수르", "만수르"};
//        System.out.println(solution1(n));
//        System.out.println(solution2(names));
//        System.out.println(solution3(5));
        System.out.println(solution4(8,3,6));
    }
}
