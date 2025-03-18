public class PaperBook extends Book {
    private String isbn;
    private String publisher;
    public PaperBook(String a, String b, int c, String d, String e) {
        super(a, b, c);
        publisher = d;
        isbn = e;
    }
    public String toString(){
        return String.format("%s%nBook publisher: %s%nISBN:%s%n",super.toString(),publisher,isbn);
    }
}