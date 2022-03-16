import java.util.Scanner;

public class 최소최대10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 입력 횟수
        int max = -1000000;
        int min = 1000000;
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt(); // 스캔받음
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println(min + " " + max);
    }
}