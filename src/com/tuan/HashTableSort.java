package com.tuan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashTableSort {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream ip = new FileInputStream("G:\\workspace\\ReadFile\\lib\\TUAN.txt");
		Scanner sc = new Scanner(ip);
		
		HashMap<String, String> hm = new HashMap<>();
		ArrayList<String> data = new ArrayList<>();
		ArrayList<String> dataLastName = new ArrayList<>();
		
		while (sc.hasNextLine()) {
			data.add(sc.nextLine());

		}

		for (int i = 0; i < data.size(); i++) {

			hm.put(getLastName(data.get(i)), data.get(i));
		}

		// assign last name to ArrayList
		for (int i = 0; i < data.size(); i++) {
			dataLastName.add(getLastName(data.get(i)));
		}
		
		//sort LastData
		sortASC(dataLastName);
		
		// Print HashMap
		for (int i = 0; i < dataLastName.size(); i++) {
			
			System.out.println(hm.get(dataLastName.get(i)));
		}

	}

	public static String getLastName(String a) {
		String b[] = a.split(" ");
		return b[b.length - 1];
	}
	


	public static void printData(ArrayList<String> data) {
		for (String w : data) {
			System.out.println(w);
		}
	}

	public static void sortASC(ArrayList<String> arr) {
		String temp = arr.get(0);
		for (int i = 0; i < arr.size() - 1; i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i).compareTo(arr.get(j)) > 0) {
					temp = arr.get(j);
					arr.set(j, arr.get(i));
					arr.set(i, temp);

				}
			}
		}
	}

}
