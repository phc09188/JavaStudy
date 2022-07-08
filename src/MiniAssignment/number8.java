package MiniAssignment;

import java.util.Scanner;
/*
    제로베이스 백엔드스쿨 3기 박해찬 수강생 입니다.
 */
public class number8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum =0;
        int n =0;
        while(sum ==0){
            System.out.println("[과세금액 계산 프로그램]");
            System.out.print("연소득을 입력해 주세요.:");
            int m = sc.nextInt();
            int man = m/10000;
            if(man>100000){
                n = man - 100000;
                System.out.println("12000000 *  6% =       720000");
                System.out.println("34000000 * 15% =      5100000");
                System.out.println("42000000 * 24% =     10080000");
                System.out.println("62000000 * 35% =     21700000");
                System.out.println("150000000 * 38% =    57000000");
                System.out.println("200000000 * 40% =    80000000");
                System.out.println("500000000 * 42% =   210000000");
                System.out.println(n*10000 + " * 45% = " + (n*100)*45);
                sum = (m/100 *45) - 65400000;
            }else if(man>50000){
                n = man - 50000;
                System.out.println("12000000 *  6% =       720000");
                System.out.println("34000000 * 15% =      5100000");
                System.out.println("42000000 * 24% =     10080000");
                System.out.println("62000000 * 35% =     21700000");
                System.out.println("150000000 * 38% =    57000000");
                System.out.println("200000000 * 40% =    80000000");
                System.out.println(n*10000 + " * 42% = " + (n*100)*42);
                sum = (m/100 *42) - 35400000;
            }else if(man>30000){
                n = man - 30000;
                System.out.println("12000000 *  6% =       720000");
                System.out.println("34000000 * 15% =      5100000");
                System.out.println("42000000 * 24% =     10080000");
                System.out.println("62000000 * 35% =     21700000");
                System.out.println("150000000 * 38% =    57000000");
                System.out.println(n*10000 + " * 40% = " + (n*100)*40);
                sum = (m/100 *40) - 25400000;
            }else if(man>15000){
                n = man - 15000;
                System.out.println("12000000 *  6% =       720000");
                System.out.println("34000000 * 15% =      5100000");
                System.out.println("42000000 * 24% =     10080000");
                System.out.println("62000000 * 35% =     21700000");
                System.out.println(n*10000 + " * 38% = " + (n*100)*38);
                sum = (m/100 *38) - 19400000;
            }else if(man>8800){
                n = man - 8800;
                System.out.println("12000000 *  6% =       720000");
                System.out.println("34000000 * 15% =      5100000");
                System.out.println("42000000 * 24% =     10080000");
                System.out.println(n*10000 + " * 35% = " + (n*100)*35);
                sum = (m/100 *35) - 14900000;
            }else if(man>4600){
                n = man - 4600;
                System.out.println("12000000 *  6% =       720000");
                System.out.println("34000000 * 15% =      5100000");
                System.out.println(n*10000 + " * 24% = " + (n*100)*24);
                sum = (m/100 *24) - 5220000;
            }else if(man>1200){
                n = man - 1200;
                System.out.println("12000000 *  6% =       720000");
                System.out.println(n*10000 + " * 15% = " + (n*100)*15);
                sum = (m/100 *15) - 1080000;

            }else{
                System.out.println(m + "* 6% = "+ (m/100)*6);
                sum = (m/100 *6);

            }
        }
        System.out.println();
        System.out.println("[세율에 의한 세금]:         " + sum );
        System.out.println("[누진공제 계산에 의한 세금]:  " + sum);
    }
}
