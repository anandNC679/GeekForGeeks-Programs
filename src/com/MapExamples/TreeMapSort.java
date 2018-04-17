package com.MapExamples;

/**
 * author anand.
 * since on 23/3/18.
 */
        import java.util.Comparator;
        import java.util.TreeMap;

public class TreeMapSort {

    static class DescOrder implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
//            if (o1.length() > o2.length())
//                return -1;
//            return o1.compareTo(o2);
        }
    }

    public static void main(String[] args) {
        System.out.println("TreeMap Desc Order Example");
        System.out.println();

        TreeMap<String, Integer> map1 = new TreeMap<String, Integer>(new DescOrder());
        map1.put("XX", 1);
        map1.put("Z", 4);
        map1.put("C", 2);
        map1.put("P", 10);
        map1.put("EE", 30);

        System.out.println(map1);
    }
}

//class DescOrder implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        if (o1.length() > o2.length())
//            return -1;
//        return o2.compareTo(o1);
//    }
//}