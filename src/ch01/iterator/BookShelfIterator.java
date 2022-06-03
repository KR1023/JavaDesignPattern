package ch01.iterator;

import java.util.Iterator;

public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf; //  BookShelfIterator가 검색할 서가
	private int index;//현재 주목하고 있는 책
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	/**
	 * Iterator 인터페이스에 선언되어 있는 메서드를 구현한 것.
	 * 다음 책이 있는지 조사해서 있으면 true, 없으면 false를 반환
	 * 다음 책이 있는지 없는지는 index가 서가에 있는 책의 권수보다 작은지 큰지로 판단.
	 */
	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength())
			return true;
		else
			return false;
	}
	
	/*
	 * 현재 처리하고 있는 책(Book의 인스턴스)을 반환하고, 다시 '디음'으로 진행시키기 위한 메서드.
	 * Iterator 인터페이스에서 선언되어 있는 메서드.
	 */
	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
