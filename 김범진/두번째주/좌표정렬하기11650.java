package 두번째주;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class 좌표정렬하기11650 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼를 이용해 입력
        StringBuilder sb = new StringBuilder(); // string을 조합하기 위해 사용

        int num = parseInt(br.readLine()); // 좌표의 개수 입력
        int[][] inputArr = new int[num][2]; // 좌표를 다룰 2차원 배열 초기화

        for (int i = 0; i < num; i++) {
            String[] coordinate = br.readLine().split(" ");
            inputArr[i][0] = parseInt(coordinate[0]); // 첫번째 좌표
            inputArr[i][1] = parseInt(coordinate[1]); // 두번째 좌표
        }

        /**
         * inputArr를 오름차순으로 정렬
         * Comparator 재정의를 람다식으로 간추림
         */
        Arrays.sort(inputArr, (i, j) -> {
            if (i[0] == j[0]) { // x좌표가 같으면 y좌표로 정렬
                return i[1] - j[1]; // 양수가 나오면 변경, 음수가 나오면 변경 x
            } else { // x좌표가 같지 않으면 x좌표로 정렬
                return i[0] - j[0]; // 양수가 나오면 변경, 음수가 나오면 변경 x
            }
        });

        for (int i = 0; i < num; i++) {
            sb.append(inputArr[i][0]) // 첫번째 좌표 추가
                    .append(" ")
                    .append(inputArr[i][1]) // 두번째 좌표 추가
                    .append("\n");
        }

        System.out.println(sb); // 정렬된 좌표 출력
    }
}
