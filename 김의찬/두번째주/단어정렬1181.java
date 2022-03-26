import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 단어정렬1181 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = in.nextInt();
        ArrayList<String> stringList = new ArrayList<>();

        for(int i = 0; i< num; i++){
            String input = in.next();
            if(!stringList.contains(input))
                stringList.add(input); // list 로 받으며 중복 체크
        }
        int size = stringList.size();
        String[] newStringArray = stringList.toArray(new String[size]);// list 를 배열로 변환


        Arrays.sort(newStringArray,(i,j)->{
            if(i.length() == j.length()){
                return i.compareTo(j);// 단어 길이가 같을 경우 세부적으로 비교
            }
            else{
                return i.length() - j.length(); // 기본적으로 단어 길이로 비교
            }
        });
        for(String i : newStringArray){
            sb.append(i).append("\n");
        }
        System.out.println(sb);

    }
}
