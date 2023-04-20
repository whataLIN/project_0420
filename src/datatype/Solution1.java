package datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution1 {
    public static void main(String[] args) {

        // Map : 딕셔너리
        // Hash : 새로운 형태로 변환

        //java map
        //hash map
        HashMap<String, String> map = new HashMap<>();
        // 클래스 이름은 HashMap.
        // <key, value> 타입 지정


        // Map의 CRUD

        // Create - 생성, 추가 : put
        map.put("name", "이");
        map.put("age", "20");
        map.put("address","seoul");
        map.put("phone", "010-1234-5678");
        System.out.println("map = " +map);

        // Read - 읽기 : get
        String name = map.get("name");
        System.out.println("name : "+name);

        //Update - 수정 :

        //Delete - 삭제 : remove.
        map.remove("age");
        System.out.println("map = "+map);

        //복사 : copy
        HashMap<String, String> map2 = new HashMap<>(map);
        System.out.println("map2 = "+map2);

        //clear는 전부 삭제
        map2.clear();
        System.out.println("map2 = "+map2);

        //크기 확인
        System.out.println("map size = "+map.size());

        //키 리스트 받아오기 - key set
        //set은 중복을 허용하지 않는다.
        System.out.println("map keyset : "+map.keySet());

        //value 리스트 받아오기 - values
        System.out.println("map values : "+map.values());

        //키-값의 set 받아오기 - entrySet. 딕셔너리 형태로
        System.out.println("map entrySet : "+map.entrySet());

        //containsKey : 키가 포함되어 있는지 알아보기
        System.out.println("contains address key: "+map.containsKey("address"));

        //containsValue : 값이 포함되어 있는지 알아보기
        System.out.println("contains 이 value: "+map.containsValue("이"));

        //LinkedHashMap

    }
}
