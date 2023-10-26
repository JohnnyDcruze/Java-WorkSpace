package com.demo;
import java.util.*;

public class BookDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books : ");
        	int Count=sc.nextInt();
        	Book books[]=new Book[Count];
        	
        	for(int i=0;i<Count;i++)
        	{

       
            System.out.println("Enter the book No:");
            int bookNo = sc.nextInt();

            sc.nextLine(); 

            System.out.println("Enter the book Name:");
            String bookName = sc.nextLine();

            System.out.println("Enter the author:");
            String author = sc.nextLine();

            System.out.println("Enter the price:");
            float price = sc.nextFloat();

            Book book = new Book(bookNo, bookName, author, price);

            if (book.isValid()) {
            	books[i]=book;
            	System.out.println(book.getBookCount());
            	System.out.println("Book added successfully!");
            } else {
                System.out.println("Invalid input");
            }
 
        }
        	System.out.println("Enter the bookNO to be searched : ");
        	int search=sc.nextInt();
        	boolean found=false;
        	for(int i=0;i<Count;i++)
        	{
        		if(books[i].getBookNo()==search)
        		{
        			found=true;	
        			System.out.println(books[i].toString());
        		}
        	}
        	if(!found)
        		System.out.println("book does not exist");
        		
      }

    }

class Book {
    private int bookNo;
    private String title;
    private String author;
    private float price;
    private static int bookCount;

    public Book(int bookNo, String title, String author, float price) {
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public boolean isValid() {
        return title.length() >= 4 && (price >= 1 && price <= 5000);
    }

    @Override
    public String toString() {
        return getBookNo() + " : " + title + " : " + author + " : " + price;
    }
    
    public static int getBookCount()
    {
    	return ++bookCount;
    }

	public int getBookNo() {
		return bookNo;
	}
}
