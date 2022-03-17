import java.util.Scanner;

public class 단어공부1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] alpaBukkit = new int[26]; //알파벳 수만큼 배열 생성 및 0으로 초기화
        char[] word = in.next().toUpperCase().toCharArray();// 단어를 받을때 대문자로 바꾸고 char 형태로 쪼개서 배열에 저장
        char mostUsedAlpa = 'A';// 가장 많이 사용된 알파벳
        int mostUsedNum = 0; // 가장 많이 사용된 알파벳이 반복된 횟수

        for (char i : word) {
            alpaBukkit[i - 'A']++; //단어에서 알파벳을 하나씩 가져와 알파벳에 해당되는 인덱스에 값을 올려줌 -> 배열은 알파벳이 나온 횟수로 채워지게 됨
        }

        for (int i = 0; i < alpaBukkit.length; i++) {
            if (mostUsedNum == alpaBukkit[i] && i != 0) mostUsedAlpa = '?'; // 첫번째를 제외하고 가장 많이 나온 알파벳의 횟수가 순회하는 인덱스와 값이 같은경우 중복 처리
            else if (mostUsedNum < alpaBukkit[i]) { // 값이 더 클경우 그 값으로 바꾸어줌
                mostUsedAlpa = (char) ('A' + i);
                mostUsedNum = alpaBukkit[i];
            }
        }

        System.out.println(mostUsedAlpa);
    }
}
