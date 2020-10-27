package com.wenkan.homework;

public class products {
    private int id;
    private String name;
    private int stock;

    @Override
    public String toString(){
//        System.out.println(id + " :"+name+" -- " + stock);
        return (id + ": "+name+" -- " + stock);
    }

    public products(int id, String name, int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    public products() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public boolean increaseQuantity() {
        stock++;
        return true;
    }

    public void SellOne(){
        if(this.getStock() <= 0){
            System.out.println("不能售出");
        }else {
            stock --;
        }
    }
}
