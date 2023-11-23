// BufferedReader 사용
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String str1 = st.nextToken();
        String str2 = st.nextToken();
        
        System.out.printf("%s%s", str1, str2);
        
    }
}

// Scanner 사용
// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.next();
//         String b = sc.next();
        
//         System.out.printf("%s%s", a, b);
//     }
// }
