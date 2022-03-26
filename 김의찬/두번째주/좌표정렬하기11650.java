import java.util.Arrays;
import java.util.Scanner;

public class 좌표정렬하기11650 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = in.nextInt();
        int[][] arrayNum = new int[num][2];

        for (int i = 0; i < num; i++) {
            arrayNum[i][0] = in.nextInt();
            arrayNum[i][1] = in.nextInt();
        }

        Arrays.sort(arrayNum, (i, j) -> {
            if (i[0] == j[0]) {
                return i[1] - j[1];
            } else {
                return i[0] - j[0];
            }
        });

        for (int i = 0; i < num; i++) {
            sb.append(arrayNum[i][0]).append(" ").append(arrayNum[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
