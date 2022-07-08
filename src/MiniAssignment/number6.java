package MiniAssignment;

/*
    제로베이스 백엔드스쿨 3기 박해찬 수강생 입니다.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class number6 {
    public static void main(String[] args){
        Random random = new Random();
        int max = 10000;
        int result = 0;
        int sum =0;
        int lee =0, yon =0, sim =0, an =0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(sum < max){
            int ran = random.nextInt(4);
            String win = "";
            switch(ran){
                case 0:
                    lee +=1;
                    win += "이재명";
                    break;
                case 1:
                    yon +=1;
                    win += "윤석열";
                    break;
                case 2:
                    sim +=1;
                    win += "심상정";
                    break;
                case 3:
                    an +=1;
                    win += "안철수";
                    break;
            }
            sum = lee + yon + sim + an;
            double ing = (double)sum/max *100;
            double lee1 = (double)lee/max *100;
            double yon1 = (double)yon/max*100;
            double sim1 = (double)sim/max*100;
            double an1 = (double)an/max*100;
            System.out.printf("[투표진행율]: %.2f, %d명의 투표 => %s \n", ing, sum, win);
            System.out.printf("[기호:1] 이재명: %.2f, (투표수: %d) \n",lee1, lee);
            System.out.printf("[기호:2] 윤석열: %.2f, (투표수: %d) \n",yon1, yon);
            System.out.printf("[기호:2] 심상정: %.2f, (투표수: %d) \n",sim1, sim);
            System.out.printf("[기호:2] 안철수: %.2f, (투표수: %d) \n",an1, an);
            if(sum == 10000){
                arr.add(lee);
                arr.add(yon);
                arr.add(sim);
                arr.add(an);
                result = Collections.max(arr);
                System.out.print("[투표결과] 당선인: ");
                if(result == lee){
                    System.out.println("이재명");
                }else if(result == yon){
                    System.out.println("윤석열");
                }else if(result == sim){
                    System.out.println("심상정");
                }else if(result == an){
                    System.out.println("안철수");
                }

            }
        }


    }
}
