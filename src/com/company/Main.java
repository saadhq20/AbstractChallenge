package com.company;

import sun.awt.image.ImageWatched;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "1 2 3 4 6 5 9 8 7 1 2";
        String[] data = stringData.split(" ");
        for(String s : data){
            //System.out.println(s);
            list.addItem(new LinkedList(s));

        }
        //System.out.println("Post add: \n");
        list.traverse(list.getRoot());

        list.removeItem(new LinkedList("9"));
        list.traverse(list.getRoot());

    }
}
