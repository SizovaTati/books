package objectsAndClass;

public class Book {
    private final String name;
    private final Author author;
    private Integer publicationYear;

    public Book(String name, Author author, Integer publicationYear){
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public Integer getPublicationYear(){
        return publicationYear;
    }
    public void setPublicationYear(Integer publicationYear){
        this.publicationYear = publicationYear;
    }
    public String toString(){
        return "Книга \"" + name + "\" была опубликована в " + publicationYear +
                " году. Автор " + author;
    }
}
