package ch01.iterator;

import java.util.Iterator;

public class BookShelf implements Aggregate{
	private Book[] books;
	private int last = 0;
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	/*
	 * BookShelf 클래스에 대응하는 Iterator.
	 * BookShelfIterator라는 클래스의 인스턴스를 생성해서 그것을 반환함.
	 * 이 서가의 책을 하나씩 나열하고 싶을 때는 iterator 메서드를 호출한다.
	 */
	public Iterator iterator() { 
		return new BookShelfIterator(this);
	}
}
