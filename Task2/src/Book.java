public class Book {
    private static int bookCount;
    private String name;
    private String author;
    private int year;
    private Category category;

    // Статический блок инициализации
    static {
        bookCount = 0; // Инициализируем счётчик книг
        System.out.println("Статический блок: загрузка класса Book завершена.");
    }

    // Нестатический блок инициализации
    {
        name = "Книга по умолчанию";
        author = "Автор неизвестен";
        year = 1900;
        category = new Category("Без категории");
        System.out.println("Нестатический блок: объект Book создаётся с параметрами по умолчанию.");
    }

    // Конструктор без параметров
    public Book() {
        bookCount++; // Увеличиваем счётчик книг
    }

    // Конструктор с параметрами
    public Book(String name, String author, int year, Category category) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.category = category;
        bookCount++; // Увеличиваем счётчик книг
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    // Статический метод для получения количества созданных книг
    public static int getBookCount() {
        return bookCount;
    }
}
