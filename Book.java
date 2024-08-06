import java.util.ArrayList;

public class Book {
    int bookId;
    String bookName;
    String authorName;

    public Book(int bookId , String bookName , String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public static void main(String[] args) {
        Book b = new Book( 101,"Spring Tale" , "PB Shelley");
        Book b2 = new Book(102, "Flamingo" , "Jimmy Wells");
        Book b3 = new Book(103,"Think Again" , "Adam Grant");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(b);
        bookList.add(b2);
        bookList.add(b3);
        for(Book bk : bookList){
            System.out.println("Book ID : "+bk.bookId);
            System.out.println("Book Name : " +bk.bookName);
            System.out.println("Author Name : " +bk.authorName);
            System.out.println("**************************************");
        }

    }
}
