package codeTest;


import java.io.*;
import java.util.*;
class MyClass{
    public Integer value;
    public MyClass(int x){
        value = x;
    }
}
public class boj1598 {
    static void swap(MyClass x, MyClass y){
        int tmp = x.value;
        x.value = y.value;
        y.value = tmp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer  st = new StringTokenizer(input);

        MyClass first = new MyClass(Integer.parseInt(st.nextToken()));
        MyClass last = new MyClass(Integer.parseInt(st.nextToken()));
        if(last.value<first.value){
            swap(first, last);
        }
        int col, row;
        if(last.value% 4 == 0 && first.value%4 == 0){
             row = (last.value/4) - (first.value/4);
             col = 0;
        }else if(last.value% 4 == 0){
             row = (last.value/4) -1 - (first.value/4);
             col = 4 - first.value%4;
        }else if(first.value%4 == 0){
             row = (last.value/4) +1 - (first.value/4);
             col = 4 - last.value%4;
        }else{
             row = (last.value/4) -(first.value/4);
             col = last.value%4 - first.value%4;
        }
        if(col <0){
            col = 0- col;
        }
        if(first.value>0 && last.value>0&& first.value<=10000000 && last.value<=10000000) {
            System.out.println(row + col);
        }
    }
}
