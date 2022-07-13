package codeTest;

    import java.io.*;
    import java.util.*;


    public class boj11650 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];

            StringTokenizer st;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, new Comparator<int[]>(){
                public int compare(int[] o1, int []o2){
                    if(o1[0] == o2[0])
                        return Integer.compare(o1[1], o2[1]);

                        return Integer.compare(o1[0],o2[0]);
                }
            });
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i][0] + " " + arr[i][1]);
            }
        }
    }
