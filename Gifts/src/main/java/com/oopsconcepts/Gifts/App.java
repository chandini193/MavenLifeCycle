package com.oopsconcepts.Gifts;

import java.util.Scanner;
import java.util.TreeMap;



public class App extends Gifts{

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of choclates: ");
		int no_of_choclates = in.nextInt();
		for(int i =0; i < no_of_choclates;i++){
			System.out.println("Enter choclate type 0 / 1:");
			int choclateType = in.nextInt();
			System.out.println("Enter weight of choclate : ");
			int choclateWeight = in.nextInt();
			System.out.println("Enter price of choclate : ");
			int choclatePrice = in.nextInt();
			String candyName = null;
			if(choclateType == 1){
				System.out.println("Enter name of the candy : ");
				candyName = in.next();
				tm.put(choclateWeight, candyName);
				wgt.add(choclateWeight);
			}
		}
		Sweets s1 = new Sweets(50, 80);
		Sweets s2 = new Sweets(20, 60);
		Sweets s3 = new Sweets(40, 50);
		Sweets s4 = new Sweets(30, 40);
        Gifts g = new Gifts();
        System.out.println("Total weight = "+g.getWeight());
        System.out.println("Sorting choclates based on their weight: ");;
        Choclates c = new Choclates();
        c.sortChoclates(tm);
        System.out.println("Enter lowerlimit and upperlimit :");
        int low = in.nextInt();
        int high = in.nextInt();
        c.getChoclatesInRange(low, high, tm);
	}
}
