package MiniAssignment;

/*
    제로베이스 백엔드스쿨 3기 박해찬 수강생 입니다.
 */

import java.util.Random;
import java.util.Scanner;

public class number4 {
    public static String lastline(int year, String gender){
        StringBuffer result = new StringBuffer();
        Random random = new Random();
        if(gender.equals("m")){
            if(year<2020){
                result.append(1);
            }else{
                result.append(3);
            }
        }else if(gender.equals("f")){
            if(year<2020){
                result.append(2);
            }else{
                result.append(4);
            }
        }

        for (int i = 0; i < 6; i++) {
            result.append(random.nextInt(10));
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        String year = sc.nextLine();
        System.out.print("출생월을 입력해 주세요.(mm):");
        String month = sc.nextLine();
        System.out.print("출생일을 입력해 주세요,(dd)");
        String day = sc.nextLine();
        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = sc.nextLine();
        int age = Integer.parseInt(year);

        String firstline = year.substring(2) + month + day;
        String lastline = lastline(age, gender);
        System.out.println(firstline + "-" + lastline);

    }
}
