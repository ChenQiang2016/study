package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String getCurrentDate(){
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
	
	public static String getCurrentDate(String pattern){
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
}