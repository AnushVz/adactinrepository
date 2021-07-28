package org.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sample1 {
public static void main(String[] args) {
	List<Integer>l=new ArrayList<>();
	l.add(10);
	l.add(40);
	l.add(20);
	l.add(10);
	l.add(80);
	l.add(70);
	l.add(40);
	l.add(20);
	System.out.println(l);
	int a = l.size();
	System.out.println(a);
	Set <Integer> s=new TreeSet<>();
	s.addAll(l);
	System.out.println(s);
	System.out.println(l.size()-s.size());
}
}
