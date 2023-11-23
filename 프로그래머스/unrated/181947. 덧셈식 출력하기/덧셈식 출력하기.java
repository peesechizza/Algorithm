// BufferedReader 사용
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int answer = a + b;
        
        System.out.printf("%d + %d = %d", a, b, answer);
        

    }
}


// Scanner 사용
// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int answer = a + b;
        
//         System.out.printf("%d + %d = %d", a, b, answer);
//     }
// }
