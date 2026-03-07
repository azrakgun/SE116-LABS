public class Librarian{
    private String name;
    private String employeeID;
    private int age;
    private int bookCount;

    private Book[] books;


        public Librarian(String name, int capacity) {
            this.name = name;
            this.books = new Book[5];
            this.bookCount = 0;
        }


        public void addBook(Book book) {
            if (bookCount <5) {
                books[bookCount] = book;
                bookCount++;

            } else {
                System.out.println("Library is full!");
            }
        }

    public void removeBook(String isbn) {

        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {

                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null;
                bookCount--;
                return;
            }
        }
        System.out.println("Didn't find");
    }


    public Book findBook(String isbn) {

        for (int i = 0; i < bookCount; i++) {

            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }


    public void updatePrice(Book book, double newPrice) {
        if (book != null) {
            book.setPrice(newPrice);
        }
    }


    public void findBookAndApplyDiscount(String isbn, double discountPercentage) {
        Book foundBook = findBook(isbn);
        if (foundBook != null) {
            double oldPrice = foundBook.getPrice();
            double newPrice = oldPrice - (oldPrice * discountPercentage / 100);
            updatePrice(foundBook, newPrice);
            System.out.println("New price: " + newPrice);
        } else {
            System.out.println("Didn't find");
        }
    }

    public void displayAllBooks() {
        System.out.println("Librarian: " + name + " (ID: " + employeeID + ") is managing:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayAllBooks();
          }
      }

}

