import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1;
        int r2 = scanner.nextInt();
        int s = scanner.nextInt();

        r1 = s * 2 - r2;

        System.out.println(r1);
    }
}