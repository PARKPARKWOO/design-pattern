import builder.Director;
import builder.HTMLBuilder;
import builder.TextBuilder;
import factorymethod.framework.Factory;
import factorymethod.framework.Product;
import factorymethod.idcard.IdCardFactory;
import iterator.Book;
import iterator.BookShelf;
import iterator.Iterator;
import singleton.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MemberImp imp = new MemberImp(10);
        System.out.println(imp.toString());

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
//        System.out.println("Singleton");
//        Singleton singleton1 = Singleton.getSingleton();
//        Singleton singleton2 = Singleton.getSingleton();
//        if (singleton1.equals(singleton2)) {
//            System.out.println("같은 인스턴스 입니다.");
//        } else {
//            System.out.println("같은 인스턴스가 아닙니다.");
//        }

//        /**
//         * Builder 패턴
//         */
//        if (args.length != 1) {
//            usage();
//            System.exit(0);
//        }
//        if (args[0].equals("text")) {
//            TextBuilder textBuilder = new TextBuilder();
//            Director director = new Director(textBuilder);
//            director.construct();
//            String result = textBuilder.getTextResult();
//            System.out.println(result);
//        } else if (args[0].equals("html")) {
//            HTMLBuilder htmlBuilder = new HTMLBuilder();
//            Director director = new Director(htmlBuilder);
//            director.construct();
//            String filename = htmlBuilder.getHTMLResult();
//            System.out.println("HTML 파일 " + filename + "이 작성되었습니다");
//        } else {
//            usage();
//            System.exit(0);
//        }
        /**
         * Factory Method
         */

//        Factory factory = new IdCardFactory();
//        Product card1 = factory.create("1번");
//        Product card2 = factory.create("2번");
//        Product card3 = factory.create("3번");
//        card1.use();
//        card2.use();
//        card3.use();

//        mainDto.stream().filter(md -> filterDto.stream().noneMatch(
//                fd -> md.getSubject().equals(fd.getSubject()) &&
//                        md.getCreateDate().equals(fd.getCreateDate()) &&
//                        md.getDeadLine().equals(fd.getDeadLine()) &&
//                        md.getCompany().equals(fd.getCompany()) &&
//                        md.getCareer() == fd.getCareer())).toList();

    }
/**
 * builder 패턴
 */
//    public static void usage() {
//        System.out.println("Usage: java Main text     텍스트 로 문서 작성");
//        System.out.println("Usage: java Main html     HTML 로 문서 작성");
//    }
}
