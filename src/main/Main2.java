package main;

import myList.MyList;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        MyList<String> list1 = new MyList();
        System.out.println(list1);
        list1.add("10");
        System.out.println(list1);
//        list1.ensureCapa();
//        System.out.println(list1);
//        ArrayList a =new ArrayList(34);
    }
}
