package MiniAssignment;

/*
    제로베이스 백엔드스쿨 3기 박해찬 수강생 입니다.
 */
public class number1 {
    public static void main(String[] args){
        int result = 0;
        System.out.println("[구구단 출력]");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                result = i *j;
                System.out.print(String.format("%02d x %02d = %02d  ", i, j, result));
            }
            System.out.println();
        }
    }
}
