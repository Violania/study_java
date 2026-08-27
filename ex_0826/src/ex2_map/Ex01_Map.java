package ex2_map;

import java.util.Map;
import java.util.HashMap;

public class Ex01_Map {
    public static void main(String[] args) {
        
        Map<Integer,Character>map = new HashMap<>();
        map.put(10, 'A');
        map.put(11, 'B');
        map.put(12, 'A');
        //key값이 중복되면 기존 key 값의 value를 갱신  
        map.put(10, 'D');

        System.out.println("size : "+ map.size());
        System.out.println(map);

        Character res = map.get(11);
        System.out.println(res);

        System.out.println("map : " + map);

        if (map.containsKey(10)) {
            System.out.println("map에 key가 10인 데이터가 있음");          
        }

        if (map.containsValue('A')) {
            System.out.println("map에 A가 저장되어 있음");
        }

    }
}
