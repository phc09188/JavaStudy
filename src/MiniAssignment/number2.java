package MiniAssignment;

import java.util.Scanner;

/*
    제로베이스 백엔드스쿨 3기 박해찬 수강생 입니다.
 */
public class number2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cashback = 0;
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요. (금액): ");
        int a = sc.nextInt();
        cashback = a/10;
        if(cashback >300){
            cashback = 300;
        }
        else if(cashback %100 !=0){
            cashback = cashback - (cashback%100);
        }
        System.out.println("결제 금액은 " + a + "이고, 캐시백은 " + cashback + "원 입니다.");
    }
}
