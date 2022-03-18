import java.io.*;

public class 평균은넘곘지4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int testNum = Integer.parseInt(bf.readLine());

        for (int i = 0; i < testNum; i++) {

            String[] pointArr = bf.readLine().split(" ");
            double average = 0;
            int overCount = 0;
            int studentNum = Integer.parseInt(pointArr[0]);

            for (int j = 1; j <= studentNum; j++) {
                average += Integer.parseInt(pointArr[j]);
            }

            average = average / studentNum;

            for (int j = 1; j <= studentNum; j++) {
                if (Integer.parseInt(pointArr[j]) > average) {
                    overCount++;
                }
            }

            double avgPc = (double) overCount / studentNum * 100;
            System.out.println(String.format("%.3f", avgPc) + "%");
        }
    }
}
