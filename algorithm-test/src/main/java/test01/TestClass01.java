package test01;

import java.util.ArrayList;
import java.util.List;

public class TestClass01 {

    // 먼저 나오는 문자열이 "l"인지 "r"인지 확인
    // "l"이라면 왼쪽 문자열들을 순서대로 담은 리스트 return
    // "r"이라면 오른쪽 문자열들을 순서대로 담은 리스트 return
    // "l"이나 "r"이 없다면 빈 리스트 return
    public static void main(String[] args) {
        long start = System.nanoTime();
        //String[] str_list = {"u", "u", "l", "r"}; // uu
        //String[] str_list = {"u", "l", "r", "u"};	// u
        String[] str_list = {"u", "u", "d", "r"};    // {}
        //String[] str_list = {"u", "u", "r", "l"};	 // l
        //String[] str_list = {"l", "r", "u", "d"};  // ud
        //String[] str_list = {"u", "u", "d", "l"};    //uud
        //String[] str_list = {"u", "u", "d", "r", "d"};  // d
        //String[] str_list = {"u", "u", "l"}; // uu


        for (String s : solution(str_list)) {
            System.out.println(s);
        }

        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static String[] solution(String[] str_list) {
        String[] answer = {};
        int lIdx = 0;
        boolean lEmpty = true;
        int rIdx = 0;
        boolean rEmpty = true;
        int start = 0;
        int end = str_list.length;

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                lIdx = i;
                lEmpty = false;
                break;
            } else if (str_list[i].equals("r")) {
                rIdx = i;
                rEmpty = false;
                break;
            }
        }

        if (lEmpty && rEmpty) {
            return answer;
        } else {
            if (rEmpty) {
                end = lIdx;
            } else {
                start = rIdx + 1;
            }
        }

        answer = new String[end - start];
        for (int i = start; i < end; i++) {
            answer[i - start] = str_list[i];
        }

        return answer;
    }
}
/**
 * String[] answer = {};
 * List<Integer> lList = new ArrayList<>();
 * List<Integer> rList = new ArrayList<>();
 * int start = 0;
 * int end = str_list.length;
 * <p>
 * for (int i = 0; i < str_list.length; i++) {
 * if (str_list[i].equals("l")) {
 * lList.add(i);
 * } else if (str_list[i].equals("r")) {
 * rList.add(i);
 * }
 * }
 * <p>
 * if (lList.isEmpty() && rList.isEmpty()) {
 * return answer;
 * } else {
 * if (rList.isEmpty() || lList.get(0) < rList.get(0)) {
 * end = lList.get(0);
 * } else {
 * start = rList.get(0) + 1;
 * }
 * }
 * <p>
 * answer = new String[end - start];
 * for (int i = start; i < end; i++) {
 * answer[i - start] = str_list[i];
 * }
 * <p>
 * return answer;
 */
