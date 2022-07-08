package MiniAssignment;

import java.util.Random;
import java.util.Scanner;
/*
    제로베이스 백엔드스쿨 3기 박해찬 수강생 입니다.
 */


public class number7 {

    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("로또 개수를 입력해 주세요.(숫자 1~10):");
        int num = sc.nextInt();
        int lnum = 0;
        int[][] arr = new int[num][6];
        int[] answer = new int[6];
        for (int i = 0; i < 6; i++) {
            answer[i] = random.nextInt(45)+1;
            for (int j = 0; j < i; j++) {
                if(answer[i] == answer[j]){i--;}        //같은 값 예외처리
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 6; j++) {
                int a = random.nextInt(45)+1;
                arr[i][j] = a;
                for (int k = 0; k < j; k++) {
                    if(arr[i][j] == arr[i][k]){j--;}        //같은 값 예외처리
                }
            }
        }
        for (int i = 0; i < num; i++) {
            lnum = i %5;
            switch(lnum){
                case 0:
                    System.out.print("A  ");
                    break;
                case 1:
                    System.out.print("B  ");
                    break;
                case 2:
                    System.out.print("C  ");
                    break;
                case 3:
                    System.out.print("D  ");
                    break;
                case 4:
                    System.out.print("E  ");
                    break;
            }
            for (int j = 0; j < 6; j++) {
                if(j == 5){
                    System.out.printf("%02d", arr[i][j]);
                }else{
                    System.out.printf("%02d,", arr[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("[로또 발표]");
        for (int i = 0; i < 6; i++) {
            if(i ==5){
                System.out.printf("%02d", answer[i]);
            }else{
                System.out.printf("%02d,", answer[i]);
            }

        }
        System.out.println();
        for (int i = 0; i < num; i++) {
            int col =0;
            lnum = i%5;
            switch (lnum) {
                case 0:
                    System.out.print("A  ");
                    break;
                case 1:
                    System.out.print("B  ");
                    break;
                case 2:
                    System.out.print("C  ");
                    break;
                case 3:
                    System.out.print("D  ");
                    break;
                case 4:
                    System.out.print("E  ");
                    break;
            }
            for (int j = 0; j < 6; j++) {
                if(arr[i][j] == answer[j]){col+=1;}
                if(i ==5){
                    System.out.printf("%02d", arr[i][j]);
                }else{
                    System.out.printf("%02d,", arr[i][j]);
                }
            }
            System.out.println(" =>" + col + "개 일치");
        }
    }
}
