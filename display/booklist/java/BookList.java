package display.booklist.java;

import javax.swing.JOptionPane;

public class BookList{

    private static String book, bookName;

    public static String getBook(String bookName){
        return bookName;
    }

    public static void setBook(String book){
        JOptionPane.showMessageDialog(null, "Welcome to Pards' Library", "Pards' Library",
                JOptionPane.INFORMATION_MESSAGE);

        book = JOptionPane.showInputDialog(null, "Enter a book name: ","Pards' Library",
                JOptionPane.QUESTION_MESSAGE);
        if(!book = null){
            JOptionPane.showMessageDialog(null, "Book " + user + " was add successfully!",
                    "Pards' Library", JOptionPane.INFORMATION_MESSAGE);
        }else{
            while(user.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please enter a book name.",
                        "Pards' Library", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showInputDialog(null, "Enter a book name: ",
                        "Pards' Library", JOptionPane.QUESTION_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Is " + book + " correct?",
                "Pards' Library", JOptionPane.QUESTION_MESSAGE);
    }
    public static void main(String[]args){
       setBook(book);

       getBook(bookName);
    }
}
