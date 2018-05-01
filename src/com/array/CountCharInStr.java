package com.array;

/**
 * author anand.
 * since on 22/3/18.
 */

import com.MapExamples.SortMapByValue;

import java.util.*;


public class CountCharInStr {

        public static void main(String[] args) {

        String str = "aabcd";
        SortMapByValue sortByValue=new SortMapByValue();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter key:");
        int key=scanner.nextInt();

        Map<String, Integer> map = new HashMap<>();
          for(int i=0;i<str.length();i++){
                String ch = String.valueOf(str.charAt(i));
                if(map.containsKey(ch)){
                    int temp=map.get(ch);

                    map.put(ch,temp+1);
                }
                else {

                    map.put(ch,1);
                }
            }



            TreeSet<Integer> treeSet = new TreeSet<Integer>(new Comparator<Integer>()
            {
                public int compare(Integer i1,Integer i2)
                {
                    return i2.compareTo(i1);
                }
            });
            treeSet.addAll(map.values());


          for(Integer kk:treeSet){
              if(kk==key){
                  //printKeyOfKK(kk);
              }
              System.out.println(kk);
          }

          boolean flag=false;
          int count=1;
          for(Map.Entry<String, Integer> value:map.entrySet()) {
//              if (count == key) {
                  System.out.println(value.getKey() + " " + value.getValue());
                 flag = true;
                //  break;
           //   }
              count++;
          }

          if(!flag){
              System.out.println("-1");
          }


        }
}
