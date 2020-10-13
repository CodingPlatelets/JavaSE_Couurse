package com.edu.whut.huangwenkan;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketMachine {
    ArrayList<Integer> price = new ArrayList<>();
    private double balance;
    private double amount;
    private int tag;
    //    private double ran;
    Scanner sc = new Scanner(System.in);

    public TicketMachine(int a, int b, int c) {
        price.add(a);
        price.add(b);
        price.add(c);
    }


    public void setPrice(ArrayList<Integer> price) {
        this.price = price;
    }

    public int getTag() {
        return tag;
    }

    public Boolean setTag(int tag) {
        if (tag != 1 && tag != 2 && tag != 3) {
            System.out.println("ERROR");
            return false;
        } else {
            this.tag = tag;
            System.out.println("Here is your price: " + getPrice());
            return true;
        }
    }

    public ArrayList<Integer> getAll() {
        return price;
    }

    public Integer getPrice() {
        if (tag == 1) {
            return price.get(0);
        } else if (tag == 2) {
            return price.get(1);
        } else if (tag == 3) {
            return price.get(2);
        } else {
            return -1;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Boolean printTicket() {
        System.out.println("Here are the prices:");
        System.out.println(getAll());
        System.out.println("Please choose one:");
        int ta = 1;
        ta = sc.nextInt();
        if (!setTag(ta)) {
            return false;
        }
        ;
        getPrice();
        return true;
    }

    public void insertMoney(double money) {
        if (money <= 0) {
            System.out.println("Error");
            return;
        } else if (money < price.get(tag - 1)) {
            amount = Math.abs(money - price.get(tag - 1));
            System.out.println("Still left " + amount + " yuan");
            System.out.println("Please continue inserting:");
            double left = 0.0;
            left = sc.nextDouble();
            left += money;
            insertMoney(left);
        } else if (money >= price.get(tag - 1)) {
            refund(money);
        }

    }

    private void refund(double money) {
        if (money == price.get(tag - 1)) {
            System.out.println("Thank you. Here is your ticket.");
        } else {
            amount = Math.abs(money - price.get(tag - 1));
            System.out.println("Here is your refund: " + amount + " yuan");
        }
    }

    public static void main(String[] args) {
        TicketMachine t = new TicketMachine(100, 200, 300);
        Scanner in = new Scanner(System.in);
        if (!t.printTicket()) {
            System.exit(1);
        }
        double money = 0.0;
        money = in.nextDouble();
        t.insertMoney(money);
    }
}
