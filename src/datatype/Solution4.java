package datatype;

import java.util.ArrayList;

public class Solution4 {
    public static void main(String[] args) {
        //Enum : Enumerate()

        //리스트/배열
        ArrayList<String> langList = new ArrayList<String>();
        langList.add("python");
        langList.add("java");
        langList.add("c");
        langList.add("c++");
        langList.add("HTML");
        System.out.println("langList = "+langList);
        // 리스트에서 원치 않는 값이 들어오는 것을 방지할 수 없음
        // enum -> 이미 가짓수가 정해진 묶음 데이터에 대해 처리 가능

        ArrayList<Language> langList2 = new ArrayList<Language>();
        langList2.add(Language.JAVA);
        langList2.add(Language.PYTHON);
        langList2.add(Language.C);
        langList2.add(Language.CPP);
//        langList2.add(Language.LISP); - 오류
        System.out.println("langList2 = "+langList2);
    }
}

enum Language{
   JAVA, PYTHON, C, CPP
} //내가 설정한 고유의 묶음들
