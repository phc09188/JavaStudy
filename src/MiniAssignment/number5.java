package MiniAssignment;


/*
    제로베이스 백엔드스쿨 3기 박해찬 수강생 입니다.
 */

import java.util.Calendar;
import java.util.Scanner;

public class number5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = sc.nextInt();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        System.out.println();
        System.out.printf("[%d년 %02d월]\n", year, month);
        System.out.println("  일  월   화  수   목  금   토");
        cal.set(year,month-1, 1);
        int end = cal.getActualMaximum(Calendar.DATE);
        int week = cal.get(Calendar.DAY_OF_WEEK) -1;
        for (int i = 0; i <= end; i++) {
            if(i==1){
                for (int j = 1; j < week; j++) {
                    System.out.print("    ");
                }
            }
            if(i != 0)System.out.printf(" %02d ", i);
            if(week%7 == 0){
                System.out.println();
            }
            week++;
        }
    }
}
