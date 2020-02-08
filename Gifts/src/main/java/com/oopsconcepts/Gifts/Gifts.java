package com.oopsconcepts.Gifts;

import java.util.ArrayList;

public class Gifts {
	public int getWeight(){
		int totalWeight = 0;
		for(int i = 0; i < wgt.size(); i++){
			totalWeight += wgt.get(i);
		}
		return totalWeight;
	}
	public static ArrayList<Integer> wgt = new ArrayList<Integer>();
}
