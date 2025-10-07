package practiceproblem.OopsW3.W3resourceQ5;
import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    ArrayList<Book> bookCollection = new ArrayList<>();

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void setTitle(String title){
        this.title = title;  
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void displayInfo(){
        System.out.println("Title: " + title + ", Author: " + author + "& ISBN: " + ISBN);
    }
}
