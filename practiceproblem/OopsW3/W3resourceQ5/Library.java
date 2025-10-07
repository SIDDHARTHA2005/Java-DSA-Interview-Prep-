package practiceproblem.OopsW3.W3resourceQ5;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection = new ArrayList<>();

    public void addBook(Book book){
        collection.add(book);
        System.out.println("Book added: " + book.getTitle());  // Book added
    }

    public void removeBook(String title){
        for(Book book : collection){
            if(book.getTitle().equalsIgnoreCase(title)){
                collection.remove(title);
                System.out.println("Book removed: " + title);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void displayBooks(){
        for(Book book : collection){
            book.displayInfo();
        }
    }
}