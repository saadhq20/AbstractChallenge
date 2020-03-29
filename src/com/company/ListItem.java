package com.company;
import java.util.List;
public abstract class ListItem {
    ListItem rightLink = null;
    ListItem leftLink = null;
    Object Value;
    public ListItem(Object value){
        this.Value = value;
    }
    abstract ListItem Next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem Prev();
    abstract ListItem setPrev(ListItem item);

    abstract int CompareTo(ListItem item);

    public Object getValue(){
        return Value;
    }

    public void setValue(Object value){
        this.Value   = value;
    }




}
