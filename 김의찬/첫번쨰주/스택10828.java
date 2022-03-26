import java.util.Scanner;

public class 스택10828 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = in.nextInt();
        int[] stack = new int[num];
        int size = 0;
        for (int i = 0; i < num; i++) {
            String command = in.next();
            switch (command) {
                case "push":
                    int pushNum = in.nextInt();
                    stack[size] = pushNum;
                    size++;
                    break;
                case "pop":
                    if (size != 0) {
                        sb.append(stack[size - 1]);
                        stack[size - 1] = 0;
                        size--;
                    } else {
                        sb.append("-1");
                    }
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(size);
                    sb.append("\n");
                    break;
                case "empty":
                    if (size == 0) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");

                    break;
                case "top":
                    if (size != 0) {
                        sb.append(stack[size - 1]);
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
            }

        }
        System.out.println(sb);
    }
}
