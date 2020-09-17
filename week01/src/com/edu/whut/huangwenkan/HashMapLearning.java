package com.edu.whut.huangwenkan;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapLearning {

    private HashMap<Integer, String> h = new HashMap<>();

    public HashMapLearning() {
        h.put(1, "penny");
        h.put(10, "dime");
        h.put(50, "half-dollar");
        h.put(25, "quarter");
    }

    public String getName(int i) {
        if (h.containsKey(i)) {
            return h.get(i);
        }else{
            return "There is no result";
        }
    }

    public static void main(String[] args) {
        HashMapLearning m = new HashMapLearning();
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
//        while (m.getName(amount) != null) {
            System.out.println(m.getName(amount));
//            amount = in.nextInt();
//        }

    }
}
