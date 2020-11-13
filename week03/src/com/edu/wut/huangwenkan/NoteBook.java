package com.edu.wut.huangwenkan;

import java.util.ArrayList;

//能基本存储记录
/*不限制存储记录的数量
显示每一条记录
显示存储数量
能够删除
* */
public class NoteBook {
    private ArrayList<String> book = new ArrayList<>();

    public ArrayList<String> getBook() {
        if (!book.isEmpty()) {
            System.out.println(book);
            return book;
        } else {
            System.out.println("This list has nothing");
            return null;
        }
    }

    public void add(String s) {
        book.add(s);
    }

    public void delete(String s) {
        if (book.contains(s)) {
            book.remove(s);
        } else {
            System.out.println("Can't be deleted!");
        }
    }

    public String search(int a) {
        int size = book.size();
        if (a - 1 >= size || a - 1 < 0) {
            System.out.println("ERROR");
            return "ERROR";
        } else {
            System.out.println(book.get(a-1));
            return book.get(a - 1);
        }
    }

    public int search(String s) {
        if (book.contains(s)) {
            System.out.println(book.indexOf(s) + 1);
            return book.indexOf(s) + 1;
        } else {
            System.out.println("Doesn't have this one!");
            return -1;
        }
    }

    public static void main(String[] args) {
//        NoteBook notebook = new NoteBook();
//        notebook.add("abc");
//        notebook.add("def");
//        notebook.add("ghi");
////        notebook.delete("abc");
//        notebook.getBook();
//        notebook.search(0);
        String s = "1 2 3 4 ";
        String []ss = s.split(" ");
        for (String m:ss) {
            Double i = Double.valueOf(m);
            System.out.print(i);
        }
    }
}
