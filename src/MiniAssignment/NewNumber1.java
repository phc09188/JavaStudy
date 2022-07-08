package MiniAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewNumber1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        printMenu();
        int input = Integer.parseInt(br.readLine());
        print(input);
    }
    public static void printMenu(){
        System.out.println("<<<<<[메뉴선택]>>>>>");
        System.out.println("1. 회원 관리");
        System.out.println("2. 과목 관리");
        System.out.println("3. 수강 관리");
        System.out.println("4. 결제 관리");
        System.out.println("5. 종료");
    }
    public static void print(int input){
        if(input>=1 && input<=5) {
            switch (input) {
                case 1:
                    System.out.println("회원 관리 메뉴를 선택했습니다.");
                    break;
                case 2:
                    System.out.println("과목 관리 메뉴를 선택했습니다.");
                    break;
                case 3:
                    System.out.println("수강 관리 메뉴를 선택했습니다.");
                    break;
                case 4:
                    System.out.println("결제 관리 메뉴를 선택했습니다.");
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
        }else{
            System.out.println("입력값이 정확하지 않습니다.");
        }
    }
}
