import iterator.Book;
import iterator.BookShelf;
import iterator.Iterator;
import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        /**
         * 옵저버 패턴
         */
//        observer.NumberGenerator numberGenerator = new observer.RandomNumberGenerator();
//        observer.Observer observer1 = new observer.DigitObserver();
//        observer.Observer observer2 = new observer.GraphObserver();
//        numberGenerator.addObserver(observer1);
//        numberGenerator.addObserver(observer2);
//        numberGenerator.execute();

        /**
         * iterator
         */
//        BookShelf bookShelf = new BookShelf(4);
//        bookShelf.appendBook(new Book("Around the World in 80 Days"));
//        bookShelf.appendBook(new Book("Bible"));
//        bookShelf.appendBook(new Book("Cinderella"));
//        bookShelf.appendBook(new Book("Daddy"));
//
//        Iterator<Book> it = bookShelf.iterator();
//        while (it.hasNext()) {
//            Book book = it.next();
//            System.out.println(book.getName());
//        }
//        System.out.println();
//
//        for (Book b :
//                bookShelf.getBooks()) {
//            System.out.println(b.getName());
//        }

        /**
         * Singleton 패턴
         */
        System.out.println("Singleton");
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        if (singleton1.equals(singleton2)) {
            System.out.println("같은 인스턴스 입니다.");
        } else {
            System.out.println("같은 인스턴스가 아닙니다.");
        }
    }
}
