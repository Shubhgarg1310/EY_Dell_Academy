package com.class10;

import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatAPI {
	public static void main(String[] args) {
		
		long number = 5000L;
		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("Number Format using Default Local is " + nf.format(number));
		
		NumberFormat italyNF = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("Number Format using in ITALY is " + italyNF.format(number));
		
		NumberFormat defaultCurrency = NumberFormat.getCurrencyInstance(); 
		System.out.println("Currency  using Default Local is " + defaultCurrency.format(number));
		
		NumberFormat ItalyCurrency = NumberFormat.getCurrencyInstance(Locale.ITALIAN); 
		System.out.println("Currency  using Default Local is " + ItalyCurrency.format(number));

        Currency usd = Currency.getInstance("USD");
        NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Number Format using Italy Locale is " + usCurrency.format(1234));
        
//        Date currencyDate = new Date();
//        DateFormat germanDF = DateFormat.getDateInstance(DateFormat.FULL ,Locale.GERMANY);
//        System.out.println("Date Format using Germany is :"+ germanDF.format(currencyDate));
	}
}
