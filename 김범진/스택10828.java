import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class 스택10828 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder(); // string을 조합하기 위해 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼를 이용해 입력

        final int num = parseInt(br.readLine()); // 명령의 개수 입력
        int[] stack = new int[num]; // 스택 초기화
        int res, size = 0;

        for (int i = 0; i < num; i++) {
            String input = br.readLine();

            switch (input) {
                case "pop": { // 가장 마지막에 들어온 요소 제거
                    if (size == 0) { // 빈 스택이면 -1 출력
                        res =  -1;
                    } else { // 마지막 요소 출력
                        res = stack[size - 1];
                        size--;
                    }

                    sb.append(res).append("\n");
                    break;
                }
                case "size": { // 스택의 크기 출력
                    sb.append(size).append("\n");
                    break;
                }
                case "empty": { // 빈 스택인지 체크
                    if (size == 0) { // 비어있으면 1 출력
                        res = 1;
                    } else { // 비어있지 않으면 0 출력
                        res = 0;
                    }

                    sb.append(res).append("\n");
                    break;
                }
                case "top": { // 가장 마지막에 들어온 요소 출력
                    if (size == 0) { // 비어있으면 -1 출력
                        res = -1;
                    } else { // 비어있지 않으면 마지막 요소 출력
                        res =  stack[size - 1];
                    }

                    sb.append(res).append("\n");
                    break;
                }
                default: { // 스택에 새로운 요소 추가
                    stack[size] = parseInt(input.substring(5));
                    size++;
                }
            }
        }

        System.out.println(sb);
    }
}
