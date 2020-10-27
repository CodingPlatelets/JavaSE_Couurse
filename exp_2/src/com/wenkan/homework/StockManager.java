package com.wenkan.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

//@Test
public class StockManager {
    ArrayList<products> list = new ArrayList<>();

    public void addProduct(products p) {
        for (int i = 0; i < list.toArray().length; i++) {
            if (p.getId() == list.get(i).getId()) {
                System.out.println("不能添加");
                return;
            }
        }
        list.add(p);
    }

    public void printProductDetails() {
        for (products products : list) {
            System.out.println(products);
        }
    }

    public products findProduct(int id) {
        for (int i = 0; i < list.toArray().length; i++) {
            if (id == list.get(i).getId()) {
                System.out.println(list.get(i));
                return list.get(i);
            }
        }
        return null;
    }

    public int numberInStock(int id) {
        for (int i = 0; i < list.toArray().length; i++) {
            if (id == list.get(i).getId()) {
                System.out.println(list.get(i));
                return list.get(i).getStock();
            }
        }
        return 0;
    }

    public int delivery(int id) {
        for (int i = 0; i < list.toArray().length; i++) {
            if (id == list.get(i).getId()) {
                list.get(i).increaseQuantity();
                System.out.println(list.get(i));
                return list.get(i).getStock();
            }
        }
        return 0;
    }

    public ArrayList<String> printLowStockProducts(int stock) {
        ArrayList<String> l = new ArrayList<>();
        for (int i = 0; i < list.toArray().length; i++) {
            if (stock > list.get(i).getStock()) {
                l.add(list.get(i).toString());
            }
        }
//        System.out.println(l);
        return l;
    }

    public products findProductByName(String s) {
        for (int i = 0; i < list.toArray().length; i++) {
            if (s.equals(list.get(i).getName())) {
                return list.get(i);
            }
        }
        return null;
    }

}
