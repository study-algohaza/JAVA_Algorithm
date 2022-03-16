package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.String.format;

public class 평균은넘겠지4344 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder(); // string보다 빠르게 연산 가능
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼를 통한 입력

        int num = parseInt(br.readLine()); // 테스트 케이스의 개수 입력

        for (int i = 0; i < num; i++) {
            double avg = 0; // 평균 점수 초기화
            double count = 0; // 평균 점수가 이상인 경우의 횟수 초기화
            String[] str = br.readLine().split(" "); // 한 줄 입력

            int scoreCount = parseInt(str[0]); // 첫 숫자는 해당 줄의 요소의 개수
            int[] scoreArr = new int[scoreCount + 1]; // int형 배열 선언

            for (int j = 1; j < str.length; j++) {
                scoreArr[j] = parseInt(str[j]); // int형으로 변환해서 scoreArr에 저장
                avg += scoreArr[j]; // 하나씩 더하기
            }

            avg /= scoreCount; // 점수의 합을 개수로 나눔

            for (int score : scoreArr) {
                if (score > avg) { // 점수가 평균 이상일 경우 count 증가
                    count++;
                }
            }

            sb.append(format("%.3f", (count / scoreCount) * 100)) // count를 퍼센트로 계산하여 소수점 아래 3자리까지 반올림하여 출력
                    .append("%")
                    .append("\n");
        }

        System.out.print(sb);
    }
}
