package datatype;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {
        //set : 중복되지 않는 값들의 묶음

        //빈 HashSet 생성
        Set<String> set = new HashSet<>();
        //Set<...> set = new Hashet<>(길이);
        //길이 생략 가능 (list속성)
        System.out.println("set : " +set);

        //5개 길이의 HashSet 생성
        HashSet<String> set2 = new HashSet<>(5);
        System.out.println("set2 : " +set2);

        //HashSet 생성과 동시에 초기화
        HashSet<String> set3 = new HashSet<>(
                Set.of("java","python","C++")
        );
        System.out.println("set3 : " +set3);

        //add
        set.add("JAVA");
        System.out.println("set : " +set);

        //remove
        System.out.println(set.remove("python"));

        //isEmpty
        System.out.println(set.isEmpty());

        //size
        System.out.println(set.size());

        //contains
        System.out.println(set.contains("python"));
        System.out.println(set.contains("JAVA"));
    }
}
