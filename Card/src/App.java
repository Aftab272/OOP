public class App {
    public static void main(String[] args) throws Exception {
        LibraryCard card = new LibraryCard("67894");
        student student1 = new student("Aftab", card);
        student1.displayInfo(); 
    }

}
