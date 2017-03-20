/**
 * Created by sodobescu on 3/17/2017.
 */
public class Publisher {

	private String FirstName;
	private String LastName;
	private String CompanyName;
	private String Book;

	public Publisher(String firstName, String lastName, String book, String companyName) {
		setFirstName(firstName);
		setLastName(lastName);
		setBook(book);
		setCompanyName(companyName);
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

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getBook() {
		return Book;
	}

	public void setBook(String book) {
		Book = book;
	}
}
