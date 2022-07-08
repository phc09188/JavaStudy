package Kiosk.Service;

import Kiosk.Domain.Coffee;
import Kiosk.Domain.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScanCoffeeService {
    PrintCoffeeService pc = new PrintCoffeeService();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public String Select_IO() throws IOException {
        String input;
        do{
            System.out.print("매장 또는 포장 여부를 입력해 주세요. : ");
            input= br.readLine();
        }while(!input.equals("포장") && !input.equals("매장"));
        System.out.println(input + "를 선택하셨습니다.");

        return input;
    }
    public int SelectMenu() throws IOException {
        int result;
        do{
            result = Integer.parseInt(br.readLine());
        }while(result < 1 && result > 3);
        return result;
    }
    public String SelectPMethod() throws IOException {
        String result;
        do{
            pc.printPMethod();
            result = br.readLine();
        }while(!result.equals("현금") && !result.equals("카드"));
        return result;
    }
    //폰넘버랑 이름 입력 받기
    public Customer join(){
        String phonenumber=" 1111";
        String name= "111";
        return new Customer(phonenumber,name);
    }
}
