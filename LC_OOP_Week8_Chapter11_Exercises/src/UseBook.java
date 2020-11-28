public class UseBook {

    public static void main(String[] args) {

        Fiction fiction = new Fiction("FICTION BOOKNAME");
        NonFiction nonfiction = new NonFiction("NONFICTION BOOKNAME");

        System.out.println("Fiction's book title is " + fiction.getTitle() + ", and price is " + fiction.getPrice());
        System.out.println("Non-Fiction's book title is " + nonfiction.getTitle() + ", and price is " + nonfiction.getPrice());

    }

}
