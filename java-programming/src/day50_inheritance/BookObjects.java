package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.0;
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audiobook = new AudioBook();
        audiobook.author = "Unmesh";
        audiobook.length = 60;
        audiobook.narrator = "Irina";
        audiobook.price = 44.99;
        audiobook.title = "Selenium CookBook";
        audiobook.type = "programming";
        audiobook.listen();

        EBook eBook = new EBook();
        eBook.title = "Java data structures";
        eBook.author = "Savitch";
        eBook.type = "programming";
        eBook.price = 85.0;
        eBook.size = 2;
        eBook.pages = 1000;
        eBook.readBook();

    }
}
