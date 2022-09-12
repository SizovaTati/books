package objectsAndClass;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Александр", "Дюма");
        Author author1 = new Author("Харпер" , "Ли");
        Book book = new Book("Граф Монте Кристо", author, 2006);
        Book book1 = new Book("Убить пересмешника", author1, 2014);

        System.out.println(book);
        System.out.println(book1);

        book1.setPublicationYear(2016);

        System.out.println(book1);
    }
}
