import java.util.ArrayList;
import java.util.List;

public class Stack {
    private static int stackCount;
    private List<Book> books;
    private String address;

    // Статический блок инициализации
    static {
        stackCount = 0;
        System.out.println("Статический блок: загрузка класса Stack завершена.");
    }

    // Нестатический блок инициализации
    {
        books = new ArrayList<>();
        address = "Полка по умолчанию";
        System.out.println("Нестатический блок: объект Stack создаётся с параметрами по умолчанию.");
    }

    // Конструктор без параметров
    public Stack() {
        stackCount++;
    }

    // Конструктор с параметром
    public Stack(String address) {
        this.address = address;
        stackCount++;
    }

    // Геттеры и сеттеры
    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Статический метод для получения количества полок
    public static int getStackCount() {
        return stackCount;
    }
}
