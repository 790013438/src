package snippets;

import java.util.HashMap;
import java.util.Map;

public class HashMapGetOrder {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1-1", "东风快递");
        hashMap.put("1-2", "关岛快递");

        hashMap.get("1-1");
        hashMap.get("1-2");
    }
}
