package 첫번째주;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 최소최대10818 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder(); // string끼리 +로 만드는 것보다 string builder를 사용해서 하는 것이 더 빠르다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 내부적으로 배열을 통해 한 번에 한 문장씩 읽기
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 내부적으로 배열을 통해 한 번에 한 문장씩 출력

        int input, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int num = Integer.parseInt(br.readLine()); // 정수의 개수 입력

        // N개의 정수 입력
        // 결과값이 문자열로 반환되어서 요소 하나씩 다루기에 적합하다고 판단
        // 속도면에서 split보다 string tokenizer가 더 이득
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < num; i++) {
            input = Integer.parseInt(st.nextToken()); // 요소 하나씩 가져오기

            if (input > max) {
                max = input;
            }
            if (input < min) {
                min = input;
            }
        }

        sb.append(min); // string builder에 추가
        sb.append(' ');
        sb.append(max);

        bw.write(sb.toString()); // 버퍼에 출력할 내용 담기
        bw.flush(); // 버퍼를 비움과 동시에 모두 출력
        bw.close(); // 스트림 닫기
    }
}
