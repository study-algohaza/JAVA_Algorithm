import java.util.Scanner;

public class 최소최대10818 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Scanner를 통해 입력 받는다.
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        StringBuilder sb = new StringBuilder(); // String보다 빠른 처리

        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            int value = scan.nextInt();

            // 입력 받은 값이 max보다 클 경우 max 변경
            if (max < value) {
                max = value;
            }
            
            // 입력 받은 값이 min보다 작을 경우 min 변경
            if (min > value) {
                min = value;
            }
        }
        
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        // min + " " + max와 동일
        
        System.out.println(sb);
    }
}
