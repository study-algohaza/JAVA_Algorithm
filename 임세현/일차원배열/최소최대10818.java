import java.util.Scanner;

public class 최소최대10818 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        StringBuilder sb = new StringBuilder();

        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            int value = scan.nextInt();

            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
        }

        sb.append(min);
        sb.append(" ");
        sb.append(max);

        System.out.println(sb);
    }
}
