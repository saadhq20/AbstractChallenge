package com.company;

public class LinkedList extends ListItem{

    public LinkedList(Object value){
        super(value);
    }

    @Override
    ListItem Next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem Prev() {
        return this.leftLink;
    }

    @Override
    ListItem setPrev(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int CompareTo(ListItem item) {
        if(item!=null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        else return -1;
    }
}
