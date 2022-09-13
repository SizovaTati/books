package objectsAndClass;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Александр", "Дюма");
        Author author1 = new Author("Харпер" , "Ли");
        Author author2 = new Author("Александр", "Дюма");

        Book book = new Book("Граф Монте Кристо", author, 2006);
        Book book1 = new Book("Убить пересмешника", author1, 2014);
        Book book2 = new Book("Граф Монте Кристо", author2, 2012);

        System.out.println(book);
        System.out.println(book1);

        book1.setPublicationYear(2016);

        System.out.println(book1);

        System.out.println(author2.equals(author1));
        System.out.println(author1.hashCode());

        System.out.println(book.equals(book2));
        System.out.println(book2.hashCode());
    }
}
