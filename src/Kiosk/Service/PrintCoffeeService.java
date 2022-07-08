package Kiosk.Service;

import Kiosk.Domain.Coffee;

import java.util.List;

public class PrintCoffeeService {
    public void Custommer() {
        System.out.println("xxx카페에 오신 것을 환영합니다.");
        System.out.println("===================================");
    }

    public void printPrice(Coffee cf){
        System.out.println("============ [결제 안내] ============");
        String price = String.valueOf(cf.getPrice());
        System.out.println("가격은 " + price + "원 입니다.");
    }
    public void printPMethod(){
        System.out.println("============ [결제 수단] ============");
        System.out.print("결제 수단을 입력해 주세요.(현금 or 카드) : ");
    }
    public void paying(){
        System.out.println("결제가 완료 되었습니다.");
    }
    public void printSelectMenu(List<Coffee> coffees1){
        System.out.println("===================================");
        System.out.println("메뉴를 선택해 주세요.");
        for(int i =0; i<coffees1.size(); i++) {
            System.out.print(i+1 + " ");
            System.out.println(coffees1.get(i));
        }
    }
}
