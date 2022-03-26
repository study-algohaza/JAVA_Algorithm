package 두번째주;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class 단어정렬1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼를 이용해 입력
        StringBuilder sb = new StringBuilder(); // string을 조합하기 위해 사용

        int num = parseInt(br.readLine()); // 단어의 개수 입력
        String[] inputArr = new String[num]; // 단어를 다룰 String 배열 초기화

        for (int i = 0; i < num; i++) {
            inputArr[i] = br.readLine(); // 단어의 개수만큼 단어를 입력받아서 배열에 저장
        }

        inputArr = Arrays.stream(inputArr).distinct().toArray(String[]::new); // 단어의 중복 제거

        /**
         * inputArr를 오름차순으로 정렬
         * Comparator의 compare 메서드 재정의를 람다식으로 간추림
         */
        Arrays.sort(inputArr, (i, j) -> {
            if (i.length() == j.length()) { // 단어의 길이가 같은지 비교
                return i.compareTo(j); // compareTo 메소드는 두 단어를 사전순으로 비교해 양수가 나오면 변경, 음수가 나오면 변경 x
            } else { // 단어의 길이가 다르면 사전순 비교 x
                return i.length() - j.length(); // 양수가 나오면 변경, 음수가 나오면 변경 x
            }
        });

        for (String i : inputArr) {
            sb.append(i).append("\n"); // String Builder에 단어 추가
        }

        System.out.println(sb);
    }
}
