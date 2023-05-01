import org.apache.commons.collections4.*;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import java.util.Map;


public class MultiValuedMaps {

    public static void main(String[] args) {
        MultiValuedMap<String, String> multiValuedMap = new ArrayListValuedHashMap<String, String>();
    multiValuedMap.put("Str 1", "v 1");
    multiValuedMap.put("Str 2", "v 1");
    multiValuedMap.put("Str 1", "v 2");
    multiValuedMap.put("Str 2", "v 3");

    for (Map.Entry entry: multiValuedMap.entries()){
        System.out.println(entry.getKey()+" : "+entry.getValue());

    }


    }



}
