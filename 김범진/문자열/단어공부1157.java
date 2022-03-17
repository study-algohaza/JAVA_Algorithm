package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mostCount = 0;
        char mostAlpha = '?';
        int[] alphaCountArr = new int[26];
        String inputArr = br.readLine();

        for (int i = 0; i < inputArr.length(); i++) {
            char input = inputArr.charAt(i);
            if ('a' <= input && input <= 'z') {
                alphaCountArr[input - 'a']++;
            } else {
                alphaCountArr[input - 'A']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (mostCount < alphaCountArr[i]) {
                mostCount = alphaCountArr[i];
                mostAlpha = (char) (i + 'A');
            } else if (mostCount == alphaCountArr[i]) {
                mostAlpha = '?';
            }
        }

        System.out.println(mostAlpha);
    }
}
