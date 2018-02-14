import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> Hashmap1 = new HashMap<>();
        Map<String, Integer> Hashmap2 = new HashMap<>();
        Hashmap1.put("Janet", 87);
        Hashmap1.put("Logan", 62);
        Hashmap1.put("Whitaker", 46);
        Hashmap1.put("Alyssa", 100);
        Hashmap1.put("Stefanie", 80);
        Hashmap1.put("Jeff", 88);
        Hashmap1.put("Kim", 52);
        Hashmap1.put("Sylvia", 95);
        Hashmap2.put("Logan", 62);
        Hashmap2.put("Kim", 52);
        Hashmap2.put("Whitaker", 52);
        Hashmap2.put("Jeff", 88);
        Hashmap2.put("Stefanie", 80);
        Hashmap2.put("Brian", 60);
        Hashmap2.put("Lisa", 83);
        Hashmap2.put("Sylvia", 87);

        System.out.println(Hashmap1);
        System.out.println(Hashmap2);
        System.out.println(intersect(Hashmap1,Hashmap2));

    }
    public static Map<String, Integer> intersect (Map<String, Integer> map1, Map<String,Integer> map2){
        Map<String, Integer> sectMap = new HashMap<>();

        for (Map.Entry<String, Integer> m : map1.entrySet()) {
            if (map2.containsKey(m.getKey()) && map2.containsValue(m.getValue())){
                sectMap.put(m.getKey(),m.getValue());
            }
        }


        return sectMap;
    }
}
