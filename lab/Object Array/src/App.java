public class App {
    public static void main(String[] args) throws Exception {
       book[] books = new book[3];
       books[0] = new book("Java basics","Game Gosling");
        books[1] = new book("Effective java","Joshua Blouch");
         books[2] = new book("Clean Code","Robert Martin");
          for (book b: books){
            b.display();
          }
    }
}
