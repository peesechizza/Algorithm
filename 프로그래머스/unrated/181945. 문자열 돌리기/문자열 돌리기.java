import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] arrayStr = str.split("");
        
        for (String answer : arrayStr) {
            System.out.println(answer);
        }
        
    }
}