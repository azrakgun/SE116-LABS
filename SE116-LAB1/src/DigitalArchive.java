public class DigitalArchive {

        public static void main(String[] args) {

            Librarian myLibrary = new Librarian("X", 20);


            Book b1 = new Book("123","Java",5,57);
            Book b2 = new Book("456","Python",40,78);
            Book b3 =new Book("789","Kotlin",356,250);



            myLibrary.addBook(b1);
            myLibrary.addBook(b2);
            myLibrary.addBook(b3);


            myLibrary.displayAllBooks();


            myLibrary.findBookAndApplyDiscount("123", 20);


           myLibrary.removeBook("456");


           myLibrary.displayAllBooks();
        }
}



