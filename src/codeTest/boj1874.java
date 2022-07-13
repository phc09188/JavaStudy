package codeTest;
import java.io.*;
import java.util.Stack;

public class boj1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int start = 0;
        boolean isTrue = true;
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < n; i++) {
            if(input[i] > start){
                for (int j = start+1; j <= input[i]; j++) {
                    stack.push(j);
                    sb.append("+" + "\n");
                }
                start = input[i];
            }else if(stack.peek() != input[i]){
                System.out.println("NO");
                isTrue = false;
                break;
            }
            stack.pop();
            sb.append("-" + "\n");
        }
        if(isTrue) {
            System.out.println(sb);
        }
    }
}
