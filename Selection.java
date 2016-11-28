package com.sd.ch8;
import java.util.*;
public class Selection {
    ArrayList<Rectangle> sArr = new ArrayList<Rectangle>();
    Selection(){}
    public void select(Rectangle r) {
        r.setSelected(true);
        sArr.add(r);
        System.out.println("You select "+r.isSelected);
    }
    public void print(){
        for(Rectangle r:sArr){
            System.out.print(r.toString());
        }
    }
    public static void main(String[] args){
    	Selection s = new Selection();
    	Rectangle r = new Rectangle(20,40);
        Cube c = new Cube(20,30,40);
		s.select(r);
        s.select(c);
        s.print();
    }
}