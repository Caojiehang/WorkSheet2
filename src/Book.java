/**
* @Author: Jiehang CAO
* @Description: This is a book class including three params:title,year,isbn
* @Date: 5:59 PM 2018/10/13
*/
public class Book {
    private String title;
    private int year;
    private String Isbn;

    /**
     *
     * @param title
     * @param year
     * @param isbn
     */
    public Book(String title, int year, String isbn) {
        this.title = title;
        this.year = year;
        Isbn = isbn;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }
    @Override
    public String toString() {
        return "Book Title: "+getTitle()+"\n"+"Year: "+getYear()+"\n"+"Isbn: "+getIsbn();
    }

}
