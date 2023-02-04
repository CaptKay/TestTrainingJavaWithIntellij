package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       Map<Integer,String> map = new HashMap();

       map.put(101, "kanu");
       map.put(102, "suge");
       map.put(103, "king");
       map.put(104, "phine");
       map.put(105, "izzie");


        System.out.println(map);

        System.out.println(map.get(105));

        map.remove(102);

        System.out.println(map);

        System.out.println(map.containsKey(101));
        System.out.println(map.containsKey(102));
        System.out.println(map.containsValue("king"));
        System.out.println(map.containsValue("Oke"));

        System.out.println(map.isEmpty());

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.entrySet());

        for(Object k : map.keySet()){
            System.out.println(k);
        }

        for(Object v : map.values()){
            System.out.println(v);
        }

        for(Object a : map.keySet()){
            System.out.println(a+ " "+map.get(a));
        }

        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+ "     "+entry.getValue());
        }

        Set s = map.entrySet();

        Iterator itr = s.iterator();

        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }



    }
}