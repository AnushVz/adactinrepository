package org.sample;

import java.util.Set;
import java.util.TreeSet;

public class SampleSet {
public static void main(String[] args) {
	Set <Integer> s=new TreeSet<>();
	s.add(10);
	s.add(40);
	s.add(10);
	s.add(70);
	s.add(40);
	s.add(30);
	System.out.println(s);
	int a = s.size();
	System.out.println(a);
	s.remove(70);
	System.out.println(s);
	for (int x:s) {
		System.out.println(x);
	}
}
}
