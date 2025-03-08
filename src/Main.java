public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Иван", "Фомич");
        Author author2 = new Author("Левитан", "Моисеевич");

        Book book1 = new Book("Смеёмся и плачем", author1, 2000);
        Book book2 = new Book("Создавая области памяти", author2, 2030);

        System.out.println(book1);
        System.out.println(book2);

        book1.setYear(1986);
        book2.setYear(2025);
        System.out.println("Измененный формуляр");
        System.out.println(book1);
        System.out.println(book2);

    }
}