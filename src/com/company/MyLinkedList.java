package com.company;



public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem!=null){
            int comparison = (currentItem.CompareTo(newItem));
            if(comparison<0){
                if(currentItem.Next() != null){
                    currentItem = currentItem.Next();
                }
                else{
                currentItem.setNext(newItem);
                newItem.setPrev(currentItem);
                return true;
                }

            }

            else if(comparison >0){
                if(currentItem.Prev() !=null){
                    currentItem.Prev().setNext(newItem);
                    newItem.setPrev(currentItem.Prev());
                    newItem.setNext(currentItem);
                    currentItem.setPrev(newItem);
                }
                else{
                    newItem.setNext(this.root);
                    this.root.setPrev(newItem);
                    this.root = newItem;
                }
                return true;
            }
            else {
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = this.root;
        if(item != null) {
            System.out.println("Deleting item..." + item.getValue());
        }


        while(currentItem !=null){
           int comparison =  currentItem.CompareTo(item);
            if(comparison==0) {
                if (currentItem == this.root) {
                    this.root = currentItem.Next();
                } else {
                    currentItem.Prev().setNext(currentItem.Next());
                    if (currentItem.Next() != null) {
                        currentItem.Next().setPrev(currentItem.Prev());
                    } ;
                }
                return true;
            }

            else if(comparison<0){
                currentItem = currentItem.Next();
                }
            else {
                return false;
            }

        }


        System.out.println("Item does not exist in the linkedlist");
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root ==null){
            System.out.println("The list is empty");
        }
        else{
        while(root!=null){
            System.out.println(root.getValue());
            root = root.Next();
        }
        }

    }
}
