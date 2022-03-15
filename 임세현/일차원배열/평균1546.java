import java.util.Arrays;
import java.util.Scanner;

public class 평균1546 {
    public static void main(String[] args) {

        // 스캐너로 입력받음
        Scanner scan = new Scanner(System.in);

        // 배열 크기를 입력 받음
        double[] value = new double[scan.nextInt()];

        double sum = 0;

        // 배열 크기만큼 반복문 돌려서 값 넣어줌
        for (int i = 0; i < value.length; i++) {
            value[i] = scan.nextInt();
        }

        // 오름차순으로 정렬 이 부분에서 마지막에 최댓값이 온더,
        Arrays.sort(value);

        for (double v : value) {
            // 오름차운 통해서 마지막이 최댓값이다.
            // for each 사용해서 합계 구해준다.
            sum += v / value[value.length - 1] * 100;
        }

        // 평균 출력
        System.out.println(sum/value.length);
    }
}
