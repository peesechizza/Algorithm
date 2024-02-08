import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T > 0) {
            String ps = scanner.next();
//            scanner.nextLine();

            int count = 0;

            for (int i = 0; i < ps.length(); i++) {
                char p = ps.charAt(i);

                if (p == '(') {
                    count++;
                } else if (count == 0) {
                    count = 1;
                    break;
                } else {
                    count--;
                }

            }

            if (count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            T--;
        }

    }

}