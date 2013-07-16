package com.shivaraj.training.FactoryDesignPattern;

import java.util.Scanner;

public class FactoryTester {

	public static void main(String[] args) {
		
		System.out.println("Enter the book name");
		Scanner scanner = new Scanner(System.in);
		String bookName = scanner.next();
		
		Book book = BookFactory.getTheBook(bookName);
		book.getNumberOfPages();
	}
}
