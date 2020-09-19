package com.edu.whut.huangwenkan;

import java.util.Scanner;

public class newCircle {
    private Circle c;

    public newCircle() {
        //Nothing is here
    }

    public void draw(String color, int Hor,int Ver, int size){
        c = new Circle();
        c.changeColor(color);
        c.moveHorizontal(Hor);
        c.moveVertical(Ver);
        c.changeSize(size);
        c.makeVisible();
//        c.moveDown();
//        c.moveDown();
//        c.changeColor("blue");//normal
//        c.changeColor("b");//turn black
//        c.slowMoveVertical(500);//move down in speed 1
//        c.makeInvisible();//disappear
//        c.makeInvisible();//disappear

    }

    public static void main(String[] args) {
        newCircle ne = new newCircle();
        Scanner sc = new Scanner(System.in);
        String color = "blue";
        int Hor = 0;
        int Ver = 0;
        int size = 0;
        System.out.println("Please enter your circle's info: ");
        color = sc.next();
        Hor = sc.nextInt();
        Ver = sc.nextInt();
        size = sc.nextInt();
        ne.draw(color,Hor,Ver,size);
        newCircle nc = new newCircle();

        Circle c = new Circle();
        c.changeColor("red");
        c.makeVisible();


    }
}
