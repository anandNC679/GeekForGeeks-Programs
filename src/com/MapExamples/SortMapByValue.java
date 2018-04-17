package com.MapExamples;

/**
 * author anand.
 * since on 23/3/18.
 */
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByValue {


    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("a", 10);
//        map.put("b", 30);
//        map.put("c", 50);
//        map.put("d", 40);
//        map.put("e", 20);
//        System.out.println(map);
//
//        TreeMap<String, Integer> sortedMap = sortMapByValue(map);
//        System.out.println(sortedMap);
    }

    public static TreeMap<String, Integer> sortMapByValue(Map<String, Integer> map){
        Comparator<String> comparator = new ValueComparator((HashMap<String, Integer>) map);

        TreeMap<String, Integer> result = new TreeMap<>(comparator);
        result.putAll(map);
        return result;
    }

    public static class ValueComparator implements Comparator<String>{

        HashMap<String, Integer> map = new HashMap<>();

        public ValueComparator(HashMap<String, Integer> map){
            this.map.putAll(map);
        }

        @Override
        public int compare(String s1, String s2) {
            if(map.get(s1)>= map.get(s2)){
                return -1;
            }else{
                return 1;
            }
        }
    }

}