package display.booklist.java;

import javax.swing.JOptionPane;

public class BookList{

    private static String book, bookName;

    public static String getBook(String bookName){
        return bookName;
    }

    public static void setBook(String book){
        Integer i = -1;
        String newBook;

        book = JOptionPane.showInputDialog(null, "Welcome to Pards' Library!\nPlease enter a book name:\n","Pards' Library",
                JOptionPane.QUESTION_MESSAGE);

        i = JOptionPane.showConfirmDialog(null, "Is " + book + " correct?", "Pards' Library",
                JOptionPane.YES_NO_OPTION);

        //for(i = 0; i < 2; i++){
            switch(i){
                case 0:
                    JOptionPane.showMessageDialog(null, book + " was add successfully!",
                            "Pards' Library", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Please enter the correct book name.",
                                "Pards' Library", JOptionPane.INFORMATION_MESSAGE);
                    newBook = JOptionPane.showInputDialog(null, "Enter the correct book name: ",
                                "Pards' Library", JOptionPane.QUESTION_MESSAGE);
                    JOptionPane.showConfirmDialog(null, "Is " + newBook + " correct?",
                                "Pards' Library", JOptionPane.YES_NO_OPTION);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Option not allowed.", "Pards' " +
                            "Library", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    //}
    public static void main(String[]args){
       setBook(book);

       getBook(bookName);
    }
}
