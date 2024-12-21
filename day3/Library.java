package week1.day3;

public class Library {
public String addBook(String bookTitle) {
	System.out.println("Book Added Successfully");
	return bookTitle;
}
	public void issueBook() {
		System.out.println("Book Issued Successfully");
	}
	public static void main(String[] args) {
		Library l = new Library();
		String bookTitle;
		bookTitle = l.addBook("Comic");
		System.out.println(bookTitle + " Opened Successfully");
		l.issueBook();

	}

}
