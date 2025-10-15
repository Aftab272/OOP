public class student{
    private String name;
    private LibraryCard libraryCard;

    public student(String name,LibraryCard libraryCard){
       this.name=name;
       this.libraryCard=libraryCard;
    }
     public void displayInfo() { 
        System.out.println("Student: " + name); 
        System.out.println("Library Card Number: " + libraryCard.getCardNumber()); 
    } 
} 
