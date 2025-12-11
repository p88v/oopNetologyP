
public class Main {
    public static void main(String[] args) {

        Author author = new Author("Alexander", "Pushkin", 100);
        System.out.println(author.name);
        System.out.println(author.surname);
        System.out.println(author.rating);

        Book book = new Book("Eugene Onegin", 1820, "Alexander Pushkin", 252);

        System.out.println("Цена книги: " + book.estimatePrice());
        System.out.println("Большая ли книга: " + book.isBig());
        System.out.println("Совпадения по запрошенному слову: " + book.matches("Alexander Pushkin"));
        System.out.println("Название книги: " + book.title);
        System.out.println("Год опубликования: " + book.releaseYear);
        System.out.println("Автор: " + book.author);
        System.out.println("Кол-во страниц: " + book.pages);



    }
}