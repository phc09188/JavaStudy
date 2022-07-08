package Kiosk.Domain;

public class Baristar {
    public void makeCoffee(int menu){
        switch(menu){
            case 1:
                System.out.println("아메리카노 만드는 중");
                break;
            case 2:
                System.out.println("카페라떼 만드는 중");
                break;
            case 3:
                System.out.println("바닐라라떼 만드는 중");
                break;
        }
    }
}
