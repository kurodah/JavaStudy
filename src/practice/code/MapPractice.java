
package practice.code;

import java.util.HashMap;

public class MapPractice {
    // ハッシュマップを試しに使ってみる
    public String hashmapTest() {
        HashMap<String, String> map = new HashMap<String, String>();
        
        map.put("1", "Ichiro");
        map.put("2", "Jiro");
        map.put("3", "Saburo");
        
        String result1 = map.get("1");
        
        return result1;
    }
}
