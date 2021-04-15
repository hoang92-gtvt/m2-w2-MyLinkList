package myLinkList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList list1 =new LinkedList();
//        LinkedList <String> list2 =new LinkedList();
//        list1.addFirst("1");
//        list1.addFirst("2");
//        list1.addLast("3");
//        list1.remove(1);
//        System.out.println(list1);


        MyLinkList list3 =new MyLinkList();
        list3.addFirst(1);
        list3.addLast(2);
        list3.addLast(3);
        list3.addLast(4);
        list3.addLast(5);
        list3.add(2,6);
        list3.remove(2);

        System.out.println(list3);



    }





}
