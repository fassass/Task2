public class Main {
    public static void main(String[] args) {
        System.out.println("Создано магазинов: " + Bookstore.getBookstoreCount());
        System.out.println("Создано полок: " + Stack.getStackCount());
        System.out.println("Создано категорий: " + Category.getCategoryCount());
        System.out.println("Создано книг: " + Book.getBookCount());

        Bookstore bookstore = new Bookstore();

        // Создание книги
        Book book1 = new Book("Война и мир", "Лев Толстой", 1869, new Category("Классика"));
        bookstore.addBook(book1);

        // Печать статистики
        System.out.println("Создано книг: " + Book.getBookCount());
    }
}
