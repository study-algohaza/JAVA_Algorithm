import java.io.*;
import java.util.StringTokenizer;

public class 스택10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] stackArr = new int[Integer.parseInt(br.readLine())];
        int size = 0;

        for(int i = 0; i < stackArr.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push": {
                    stackArr[size++] = Integer.parseInt(st.nextToken());
                    break;
                }
                case "pop": {
                    if(size == 0) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stackArr[--size]).append("\n");
                    }
                    break;
                }
                case "size": {
                    sb.append(size).append("\n");
                    break;
                }
                case "empty": {
                    if(size == 0) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                }
                case "top": {
                    if(size == 0) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stackArr[size - 1]).append("\n");
                    }
                }
            }
        }
        bw.write(String.valueOf(sb));
        bw.close();
    }
}
