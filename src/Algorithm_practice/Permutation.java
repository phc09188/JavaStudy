package Algorithm_practice;

import java.util.Arrays;
//순열
public class Permutation {
    void permutation(int[]arr, int depth, int n, int r){
        if(depth == r){
            for (int i = 0; i < r; i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < depth; i++) {
            swap(arr, depth, i);
            permutation(arr, depth+1, n,r);
            swap(arr, depth, i);
        }
    }
    void permutation2(int[]arr, int depth, int n, int r, boolean[] visited, int out[]){
        if(depth == r){
            System.out.println(Arrays.toString(out));
            return;
        }
        for (int i = 0; i < n; i++) {
            if(visited[i] != true){
                visited[i] = true;
                out[depth] = arr[i];
                permutation2(arr, depth+1, n, r, visited, out);
                visited[i] = false;
            }
        }
    }
    void swap(int[]arr, int depth, int i){
        int tmp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = tmp;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int n = 4;
        int r = 3;
        boolean[] visited = new boolean[n];
        int[] out = new int[r];
        Permutation p = new Permutation();
        p.permutation(arr, 0, 4, 3);
        p.permutation2(arr,0,n,r,visited,out);
    }
}
