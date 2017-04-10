package Task2;

/**
 * Created by sodobescu on 3/16/2017.
 */
public class Author {

	private String FirstName;
	private String LastName;
	private String[] Books;
	private static int count = 0;

	public Author(String firstName, String lastName, String[] books) {
		setFirstName(firstName);
		setLastName(lastName);
		setBooks(books);
		++count;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getCount() {
		return count;
	}

	public String[] getBooks() {
		return Books;
	}

	public void setBooks(String[] books) {
		Books = books;
	}
}
