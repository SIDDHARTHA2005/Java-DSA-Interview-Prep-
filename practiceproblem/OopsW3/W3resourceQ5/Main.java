package practiceproblem.OopsW3.W3resourceQ5;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book b1 = new Book("Java Crash Course", "Sid Marley", "458184E85550");
        Book b2 = new Book("C++ & Data Structures","Ben Garg","4585J9645214");

        library.addBook(b1);
        library.addBook(b2);

        library.displayBooks();

        library.removeBook("Java crash course");

        library.displayBooks();

    }
}
