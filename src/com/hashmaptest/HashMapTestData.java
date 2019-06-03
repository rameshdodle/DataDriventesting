package com.hashmaptest;

import java.util.HashMap;

public class HashMapTestData {
	/*public static void main(String[] args) {
		
	}*/
	public static HashMap<String, String> multipleUsers(){
		HashMap<String,String> insertdata=new HashMap<String,String>();
		insertdata.put("customer", "naveenautomation_test@123");
		insertdata.put("admin","admin_test@123");
		return insertdata;
		
		
	}
	public static HashMap<Integer, String> userMonthData(){
		HashMap<Integer,String> inserMonth=new HashMap<Integer,String>();
		inserMonth.put(1, "january");
		inserMonth.put(2, "February");
		inserMonth.put(3, "March");
		inserMonth.put(4, "April");
		inserMonth.put(5, "May");
		inserMonth.put(6, "June");
		inserMonth.put(7, "July");
		inserMonth.put(8, "August");
		inserMonth.put(9, "September");
		inserMonth.put(10, "October");
		inserMonth.put(11, "November");
		inserMonth.put(12, "December");
		
		return inserMonth;
		
		
	}

}
