package com.edu.whut.huangwenkan;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SunSetAndSunRise {

    private Circle sun;
//    private Square wall;
//    private Square window;
//    private Triangle roof;
    private Picture p;

    public SunSetAndSunRise() {

    }

    public void drawCircle(){
        sun = new Circle();
        sun.changeColor("red");
        sun.moveVertical(150);
        sun.makeVisible();
    }

    public void drawHouse(){
//        wall = new Square();
//        wall.moveVertical(80);
//        wall.changeSize(100);
//        wall.makeVisible();
//
//        window = new Square();
//        window.changeColor("black");
//        window.moveHorizontal(20);
//        window.moveVertical(100);
//        window.makeVisible();
//
//        roof = new Triangle();
//        roof.changeSize(50, 140);
//        roof.moveHorizontal(60);
//        roof.moveVertical(70);
//        roof.makeVisible();
        p = new Picture();
        p.draw();
    }

    public void sunRise(){
        sun.slowMoveVertical(-175);
        sun.slowMoveHorizontal(125);
    }

    public void sunSet() {
        sun.slowMoveHorizontal(125);
        sun.slowMoveVertical(175);
    }

    public static void main(String[] args) throws InterruptedException {
        SunSetAndSunRise s = new SunSetAndSunRise();
        s.drawCircle();
        s.drawHouse();
        String judge = "F";
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you want to rise the sun? (Y/F)");
        judge = sc.next();
        if(judge.equals("Y")) {
            s.sunRise();
        }else{
            System.out.println("Well!");
        }
        judge = "F";
        System.out.println("Would you want to set the sun? (Y/F)");
        judge = sc.next();
        if(judge.equals("Y")) {
            s.sunSet();
        }else{
            System.out.println("Well!");
        }

        TimeUnit.SECONDS.sleep(1);//等待1s后强制关闭程序
        System.exit(1);

    }


}
