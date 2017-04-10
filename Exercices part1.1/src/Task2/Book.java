package Task2;

/**
 * Created by sodobescu on 3/16/2017.
 */
public class Book
{

	private String[] authors;
	private String title;
	private int pubYear;
	private static int count = 0;

	Book(String title, int pubYear, String author) {
		this(title, pubYear, new String[]{author});
	}

	Book(String title, int pubYear, String[] authors) {
		setTitle(title);
		setPubYear(pubYear);
		setAuthors(authors);
		++count;
	}

	String[] getAuthors() {
		return authors;
	}

	void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}

	public static int getCount() {
		return count;
	}
}
