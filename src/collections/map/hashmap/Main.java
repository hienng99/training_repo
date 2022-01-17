package collections.map.hashmap;

import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> studentsMap = new HashMap<>();
        studentsMap.put("Bob", 9);
        studentsMap.put("Andrew", 7);
        studentsMap.put("Mark", 10);
        studentsMap.put("Fred", 3);
        studentsMap.put(null, null);
        studentsMap.put("Jane", null);
        studentsMap.put("Jane", 1);
        studentsMap.put(null, 1);
        studentsMap.put("1", null);

        out.println(studentsMap);
        out.println(studentsMap.containsKey("Mark"));
        out.println(studentsMap.containsValue(6));
        out.println(studentsMap.get("Fred"));
        out.println(studentsMap.isEmpty());
        studentsMap.remove("Bob");
        out.println(studentsMap);
        out.println("Size: " + studentsMap.size());
        out.println(studentsMap.values());
        out.println(studentsMap.entrySet());
        studentsMap.put("Fred", 4);

        out.println();

        //Traversing with for loop
        Set<String> keySet = studentsMap.keySet();
        for(String key : keySet) {
            out.println("Name: " + key + ", grade: " + studentsMap.get(key));
        }

        out.println();

        //Traversing with Iterator
        Iterator<String> itr = studentsMap.keySet().iterator();
        while(itr.hasNext()) {
            String currentKey = itr.next();
            out.println("Name: " + currentKey + ", grade: " + studentsMap.get(currentKey));
        }

        out.println();

        //Traversing with Map.Entry
        for(Map.Entry<String, Integer> entry : studentsMap.entrySet()) {
            out.println("Name: " + entry.getKey() + ", grade: " + entry.getValue());
        }
    }
}
