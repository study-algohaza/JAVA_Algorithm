package 두번째주;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Integer.parseInt;

public class DFS와BFS1260 {

    static int N, M, V;
    static int[][] GRAPH;
    static boolean[] VISITED;
    static StringBuilder SB = new StringBuilder();
    static Queue<Integer> QUEUE = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼를 통해 입력

        String[] inputArr = br.readLine().split(" "); // 첫번째 줄 입력받기

        N = parseInt(inputArr[0]); // 정점 개수
        M = parseInt(inputArr[1]); // 간선 개수
        V = parseInt(inputArr[2]); // 탐색 시작 정점

        GRAPH = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            inputArr = br.readLine().split(" ");

            int node1 = parseInt(inputArr[0]); // 연결 시작점
            int node2 = parseInt(inputArr[1]); // 연결 끝점

            // 입력으로 주어지는 간선은 양방향
            GRAPH[node1][node2] = 1;
            GRAPH[node2][node1] = 1;
        }

        VISITED = new boolean[N + 1]; // 방문배열 초기화 false로 초기화
        dfs(V); // dfs 호출
        SB.append("\n");

        VISITED = new boolean[N + 1]; // 방문배열 초기화 false로 초기화
        bfs(); // bfs 호출

        System.out.println(SB);
    }

    private static void dfs(int v) {
        if (VISITED[v]) { // 이미 방문했으면 반환
            return;
        }

        VISITED[v] = true; // 들어오면 방문함
        SB.append(v).append(" ");

        for (int i = 0; i <= N; i++) {
            if (GRAPH[v][i] == 1 && !VISITED[i]) { // 관계가 맺어져 있고, 방문을 하지 않았으면
                dfs(i); // 반복
            }
        }
    }

    private static void bfs() {
        QUEUE.add(V); // 시작하면 큐에 탐색 시작 정점 추가
        VISITED[V] = true; // 들어오면 방문함

        while (!QUEUE.isEmpty()) { // 큐가 비어있을 때까지 반복
            V = QUEUE.poll(); // 큐에서 가장 앞에 있는 요소 제거 및 반환
            SB.append(V).append(" ");

            for (int i = 0; i <= N; i++) {
                if (GRAPH[V][i] == 1 && !VISITED[i]) { // 관계가 맺어져 있고, 방문을 하지 않았으면
                    QUEUE.add(i); // 큐에 요소 추가
                    VISITED[i] = true; // 방문함
                }
            }
        }
    }
}
