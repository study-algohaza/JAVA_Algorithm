import java.util.Scanner;

public class 평균1546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 횟수 입력받음
        int[] subjectArray = new int[n];// subject array 동적 생성
        double max = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            subjectArray[i] = in.nextInt();
            if (max < subjectArray[i]) max = subjectArray[i]; // max 찾기
        }
        for (int i = 0; i < n; i++) {
            sum += subjectArray[i] / max * 100; // sum 에 더해서 넣기
        }
        System.out.println(sum / n);
    }
}
