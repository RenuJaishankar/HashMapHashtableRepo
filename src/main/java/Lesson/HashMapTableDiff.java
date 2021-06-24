package Lesson;
import java.util.*;
import java.io.*;
import java.lang.*;
// A sample java program to demonstrate HashMap and Hashtable.
public class HashMapTableDiff {
    public static void main(String[] args) {
        //----------------HashTable----------------------
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(101, "Amelia");
        ht.put(101, "Avery");
        ht.put(102, "Hannah");
        ht.put(103, "Grace");
        System.out.println("--------------------HashTable--------------------");
        for (Map.Entry m : ht.entrySet()) {
            System.out.println(m.getKey() + "    " + m.getValue());

        }
        //----------------HashMap------------------------
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Rita");
        hm.put(104, "Sandra");
        hm.put(101, "Mary");
        hm.put(102, "Olivia");
        System.out.println("--------------------HashMap--------------------");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + "   " + m.getValue());

        }


    }
}
