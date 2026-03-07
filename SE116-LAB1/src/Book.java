public class Book {


    private String isbn;
    private String title;
    private int pageCount;
    private double price;


    public Book(String isbn, String title, int pageCount, double price) {
        this.isbn = isbn;
        this.title = title;
        this.pageCount = pageCount;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public double getPrice() {
        return price;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void displayAllBooks(){
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Price: " + price);
    }
}



 