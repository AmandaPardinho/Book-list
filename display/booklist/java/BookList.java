package display.booklist.java;

import javax.swing.JOptionPane;

public class BookList{

    private static String book, bookName;

    public static String getBook(String bookName){
        return bookName;
    }

    public static void setBook(String book){
        Integer i = -1;

        book = JOptionPane.showInputDialog(null, "Welcome to Pards' Library!\nPlease enter a book name:\n","Pards' Library",
                JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Is " + book + " correct?", "Pards' Library",
                JOptionPane.YES_NO_CANCEL_OPTION);

        if(i == 0){
            JOptionPane.showMessageDialog(null, book + " was add successfully!","Pards' " +
                    "Library", JOptionPane.INFORMATION_MESSAGE);
        }else{
            while(i == 1){
                JOptionPane.showMessageDialog(null, "Please enter the correct book name.",
                        "Pards' Library", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showInputDialog(null, "Enter the correct book name: ",
                        "Pards' Library", JOptionPane.QUESTION_MESSAGE);
            }
        }

        if(i == 2){
            JOptionPane.showConfirmDialog(null, "Would you like to add another book?",
                    "Pards' Library", JOptionPane.YES_NO_OPTION);
            if(i == 1){
                JOptionPane.showInputDialog(null, "Enter a book name: ","Pards' Library",
                        JOptionPane.QUESTION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Thank you for your effort. Have a nice day!",
                        "Pards' Library", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
    public static void main(String[]args){
       setBook(book);

       getBook(bookName);
    }
}
