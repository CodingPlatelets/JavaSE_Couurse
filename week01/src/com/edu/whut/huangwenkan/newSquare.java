package com.edu.whut.huangwenkan;

import java.util.Scanner;

public class newSquare {
    private Square s;

    public newSquare() {
        //Nothing is here.
    }

    public void draw(){
        s = new Square();
        s.changeColor("black");
        s.moveHorizontal(20);
        s.moveVertical(100);
        s.makeVisible();
    }

    public void changColors(String st){
        s.changeColor(st);
    }

    public static void main(String[] args) {
        newSquare sq = new newSquare();
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        sq.changColors(s);


    }
}
