public class Category {
    private static int categoryCount;
    private String name;

    // Статический блок инициализации
    static {
        categoryCount = 0;
        System.out.println("Статический блок: загрузка класса Category завершена.");
    }

    // Нестатический блок инициализации
    {
        name = "Общая категория";
        System.out.println("Нестатический блок: объект Category создаётся с параметром по умолчанию.");
    }

    // Конструктор без параметров
    public Category() {
        categoryCount++; // Увеличиваем счётчик категорий
    }

    // Конструктор с параметром
    public Category(String name) {
        this.name = name;
        categoryCount++; // Увеличиваем счётчик категорий
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Статический метод для получения количества категорий
    public static int getCategoryCount() {
        return categoryCount;
    }
}
