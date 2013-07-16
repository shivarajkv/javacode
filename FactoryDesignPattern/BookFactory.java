package com.shivaraj.training.FactoryDesignPattern;

public class BookFactory {

	public static Book getTheBook(String bookName){
		Book book = null;
		
		if(bookName.equalsIgnoreCase("java")){
			book = new JavaBook();
		}else if(bookName.equalsIgnoreCase("csharp")){
			book = new CsharpBook();
		}
		
		return book;
	}
}
