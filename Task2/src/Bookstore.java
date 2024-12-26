import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private static int bookstoreCount;
    private Stack shelf;

    // Статический блок инициализации
    static {
        bookstoreCount = 0;
        System.out.println("Статический блок: загрузка класса Bookstore завершена.");
    }

    // Нестатический блок инициализации
    {
        shelf = new Stack("Основная полка");
        System.out.println("Нестатический блок: объект Bookstore создаётся с параметрами по умолчанию.");
    }

    // Конструктор без параметров
    public Bookstore() {
        bookstoreCount++; // Увеличиваем счётчик магазинов
    }

    // Метод для добавления книги
    public void addBook(Book book) {
        shelf.addBook(book);
    }

    // Метод для поиска книг
    public List<Book> searchBooksByCategory(String categoryName) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : shelf.getBooks()) {
            if (book.getCategory().getName().equalsIgnoreCase(categoryName)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    // Статический метод для получения количества магазинов
    public static int getBookstoreCount() {
        return bookstoreCount;
    }
}
