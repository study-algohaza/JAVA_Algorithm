package 첫번째주;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class 평균1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 내부적으로 배열을 통해 한 번에 한 문장씩 읽기

        final int num = parseInt(br.readLine()); // 정수의 개수 입력
        final String[] str = br.readLine().split(" "); // N개의 정수 입력

        double max = 0, sum = 0;
        double[] scoreArr = new double[num];

        for (int i = 0; i < num; i++) {
            scoreArr[i] = parseDouble(str[i]); // 요소 하나씩 scoreArr 배열에 담기
            if (scoreArr[i] > max) { // 최댓값 설정
                max = scoreArr[i];
            }
            sum += scoreArr[i]; // 평균을 구하기 위한 총합
        }

        System.out.println(sum * 100.0 / max / (double) num); // 총합(점수로 생각) * 100.0(double형) / 최댓값 / 점수 개수
    }
}
