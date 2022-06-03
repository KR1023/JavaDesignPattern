package ch01.iterator;

import java.util.Iterator;

public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf; //  BookShelfIterator�� �˻��� ����
	private int index;//���� �ָ��ϰ� �ִ� å
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	/**
	 * Iterator �������̽��� ����Ǿ� �ִ� �޼��带 ������ ��.
	 * ���� å�� �ִ��� �����ؼ� ������ true, ������ false�� ��ȯ
	 * ���� å�� �ִ��� �������� index�� ������ �ִ� å�� �Ǽ����� ������ ū���� �Ǵ�.
	 */
	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength())
			return true;
		else
			return false;
	}
	
	/*
	 * ���� ó���ϰ� �ִ� å(Book�� �ν��Ͻ�)�� ��ȯ�ϰ�, �ٽ� '����'���� �����Ű�� ���� �޼���.
	 * Iterator �������̽����� ����Ǿ� �ִ� �޼���.
	 */
	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
