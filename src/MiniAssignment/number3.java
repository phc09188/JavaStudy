package MiniAssignment;

/*
    제로베이스 백엔드스쿨 3기 박해찬 수강생 입니다.
 */

import java.util.Scanner;

public class number3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자): ");
        int age = sc.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력): ");
        int time = sc.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n): ");
        String national_merit = sc.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n): ");
        String welface_card = sc.next();
        if(age < 3){
            System.out.println("입장료: 0");
        } else if (age<13 || time >=17){
            System.out.println("입장료: 4000");
        }else if(national_merit.equals("y")  || welface_card.equals(("y"))){
            System.out.println("입장료: 8000");
        }
        else{
            System.out.println("입장료: 10000");
        }
    }
}
