package ClassWork.Lessons_20_per_29.L_20_Arraylist;

import java.util.HashMap;
import java.util.Map;

public class map_use {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Kfc Run");
        map.put(799, "Zxc ink");
        map.put(121, "Cursed boyNextDoor");
        map.put(212, "Sidorov Ivan");
        map.put(373, "castalvano");

        System.out.println(map);

        map.remove(373);
        System.out.println(map);
    }
}
