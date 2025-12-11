public class Book {

    public String title;
    public int releaseYear;
    public String author;
    public int pages;


    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig(){
        if (pages > 500){
            return true;
        }else {
            return false;
        }
    }

    public boolean matches(String word){
        if (word.equals(title)){
            return true;
        } else if (word.equals(author)) {
            return true;
        } else {
            return false;
        }
    }

    public int estimatePrice(){
        if (pages*3<=250){
            return 250;
        }else {
            return pages*3;
        }
    }

}
