package com.wenkan.homework;

import java.util.ArrayList;

public class StockManagerTest {
    public static void main(String[] args) {
        StockManager st = new StockManager();
        product p1 = new product(1,"First",10);
        product p2 = new product(2,"Second",20);
        product p3 = new product(3,"Third",30);
        product p4 = new product(4,"Fourth",10);
        product p5 = new product(5,"Fifth",50);
        product p6 = new product(6,"Sixth",12);
        product p7 = new product(7,"Seventh",30);
        product p8 = new product(8,"Eighth",90);

        st.addProduct(p1);
        st.addProduct(p2);
        st.addProduct(p3);
        st.addProduct(p4);
        st.addProduct(p5);
        st.addProduct(new product(1,"123124",11));
        st.printProductDetails();
        System.out.println("====================");
        st.findProduct(2);
        st.numberInStock(3);
        st.delivery(1);
        product fourth = st.findProductByName("Fourth");
        System.out.println(fourth);
        ArrayList<String> products = st.printLowStockProducts(30);
        System.out.println(products);

//        int[] a = new int [10];
//        a[0] = 1;
//        for (int i : a) {
//            System.out.println(a[i]);
//        }
    }
}
