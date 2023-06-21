import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> tre = new TreeSet<>();
        tre.add(new Book("SEFILLER",100,"DOSTOYEVSKI",1900));
        tre.add(new Book("SON ADA",150,"ZULFU LIVANELI",2000));
        tre.add(new Book("TUTUNAMAYANLAR",230,"OGUZ ATAY",2005));
        tre.add(new Book("BIR ADAM BIR KEDI",300,"ZULFU LIVANELI",1999));
        tre.add(new Book("FARELER VE INSANLAR",170,"JOHN STANBECK",1950));

        for(Book b:tre){
            System.out.println(b.getAuthorName());
        }
    }
}