public class Book {
    private String name;
    private String author;
    private int yearOfPublication;
    public Book(String a, String b,int c){
        name = a;
        author =b;
        yearOfPublication=c;
    }
    public Book(){
        this("","",0);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String toString(){
        return String.format("%s-%s-%d",name,author,yearOfPublication);
    }
}
