import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine()); // n번째

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            num1 = num2;
            num2 = sum;
            sum = num1 + num2;
        }

        System.out.println(sum);

    }

}