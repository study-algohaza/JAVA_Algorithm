package 세번째주;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class 큐10845 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder(); // string을 조합하기 위해 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼를 이용해 입력

        final int num = parseInt(br.readLine()); // 명령의 개수 입력
        int[] queue = new int[num]; // 큐 초기화
        int front = 0, rear = 0; // 큐의 머리부분과 꼬리부분 초기화
        int res, size = 0;

        for (int i = 0; i < num; i++) {
            String input = br.readLine();

            switch (input) {
                case "pop": { // 가장 처음에 들어온 요소 제거
                    if (front == rear) { // 머리부분과 꼬리부분이 같다면 비어있는 상태
                        res = -1;
                    } else { // 비어있지 않으면 첫번째 요소 출력
                        res = queue[front++];
                        size--;
                    }

                    sb.append(res).append("\n");
                    break;
                }
                case "size": { // 큐의 크기 출력
                    sb.append(size).append("\n");
                    break;
                }
                case "empty": { // 큐가 비어있는지 체크
                    sb.append(front == rear ? 1 : 0).append("\n");
                    break;
                }
                case "front": { // 가장 처음에 들어온 요소 출력
                    if (front == rear) { // 비어있으면 -1 출력
                        res = -1;
                    } else { // 비어있지 않으면 첫번째 요소 출력
                        res = queue[front];
                    }

                    sb.append(res).append("\n");
                    break;
                }
                case "back": { // 가장 마지막에 들어온 요소 출력
                    if (front == rear) { // 비어있으면 -1 출력
                        res = -1;
                    } else  { // 비어있지 않으면 마지막 요소 출력
                        res = queue[rear - 1];
                    }

                    sb.append(res).append("\n");
                    break;
                }
                default: { // 배열 마지막에 새로운 요소 추가
                    queue[rear++] = parseInt(input.substring(5));
                    size++;
                }
            }
        }

        System.out.println(sb);
    }
}
