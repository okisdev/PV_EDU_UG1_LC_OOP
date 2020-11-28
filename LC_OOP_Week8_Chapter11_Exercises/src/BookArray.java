public class BookArray {

    public static void main(String[] args) {

        Book[] books = new Book[10];

        books[0] = new Fiction("A");
        books[1] = new Fiction("B");
        books[2] = new Fiction("C");
        books[3] = new Fiction("D");
        books[4] = new Fiction("E");
        books[5] = new NonFiction("1");
        books[6] = new NonFiction("2");
        books[7] = new NonFiction("3");
        books[8] = new NonFiction("4");
        books[9] = new NonFiction("5");

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book title is " + books[i].getTitle() + ", and the price is " + books[i].getPrice());
        }

    }
}
