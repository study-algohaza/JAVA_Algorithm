import java.util.Scanner;

public class 평균은넘겠지4344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bigFrameInput = in.nextInt();// 큰 들 반복 횟수
        for (int i = 0; i < bigFrameInput; i++) {
            int smallFrameInput = in.nextInt();// 작은 틀 반복 횟수
            int[] inputArray = new int[smallFrameInput];
            double average = 0;
            for (int j = 0; j < smallFrameInput; j++) {
                inputArray[j] = in.nextInt();
                average += inputArray[j];
            }
            average /= smallFrameInput;
            double passNum = 0;
            for (int j = 0; j < smallFrameInput; j++) {
                if (inputArray[j] > average) passNum++;
            }
            System.out.printf("%.3f%%\n", passNum / smallFrameInput * 100);
        }
    }
}
