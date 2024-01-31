package test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class TestClass01 {
    public static void main(String[] args) {
        long start = System.nanoTime();

        String[][] clothes =
                {
                        {"yellow_hat", "headgear"},
                        {"blue_sunglasses", "eyewear"},
                        {"green_turban", "headgear"}
                };
        System.out.println(solution(clothes));

        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    public static int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> clothesMap = new HashMap<>();
        for(String[] s : clothes){
            clothesMap.put(s[1], clothesMap.getOrDefault(s[1],0)+1);
        }
        System.out.println(clothesMap);
        for(String s : clothesMap.keySet()){
            
        }
        return answer;
    }
}