package org.sample;

import java.util.ArrayList;
import java.util.List;


public class Sample {
public static void main(String[] args) {
	List <Integer>l=new ArrayList<>();
	l.add(10);
	l.add(40);
	l.add(20);
	l.add(10);
	l.add(80);
	l.add(70);
	System.out.println(l);
	List <Integer>li=new ArrayList<>();
	li.addAll(l);
	li.add(500);
	li.add(600);
	li.add(3, 700);
	System.out.println(li);
	li.removeAll(l);
	System.out.println(li);
}
}
