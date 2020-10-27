package com.wenkan.homework;

import java.util.ArrayList;

public class StockManagerTest {
    public static void main(String[] args) {
        StockManager st = new StockManager();
        products p1 = new products(1,"First",10);
        products p2 = new products(2,"Second",20);
        products p3 = new products(3,"Third",30);
        products p4 = new products(4,"Fourth",10);
        products p5 = new products(5,"Fifth",50);
        products p6 = new products(6,"Sixth",12);
        products p7 = new products(7,"Seventh",30);
        products p8 = new products(8,"Eighth",90);

        st.addProduct(p1);
        st.addProduct(p2);
        st.addProduct(p3);
        st.addProduct(p4);
        st.addProduct(p5);
        st.addProduct(new products(1,"123124",11));
        st.printProductDetails();
        System.out.println("====================");
        st.findProduct(2);
        st.numberInStock(3);
        st.delivery(1);
        products fourth = st.findProductByName("Fourth");
        System.out.println(fourth);
        ArrayList<String> strings = st.printLowStockProducts(30);
        System.out.println(strings);
    }
}
