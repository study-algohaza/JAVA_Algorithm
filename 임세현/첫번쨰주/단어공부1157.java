import java.io.*;

public class 단어공부1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];
        String s = br.readLine();
        int max = 0;
        char maxChar = '?';

        for(int i = 0; i < s.length(); i++) {
            if('A' <= s.charAt(i) && 'Z' >= s.charAt(i)) {
                arr[s.charAt(i) - 'A']++;
            } else {
                arr[s.charAt(i) - 'a']++;
            }
        }

        for(int i = 0; i < 26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                maxChar = (char) (i + 65);
            } else if (arr[i] == max) {
                maxChar = '?';
            }
        }

        bw.write(maxChar);
        bw.close();
    }
}
