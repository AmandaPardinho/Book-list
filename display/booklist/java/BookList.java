package display.booklist.java;

import javax.swing.JOptionPane;
public class BookList{
    public static void setBook(){
        String book;
        String newBook;
        Integer answer1 = -1;
        Integer answer2 = -1;
        Integer answer3 = -1;
        Integer answer4 = -1;

        book = JOptionPane.showInputDialog(null, "Welcome to Pards' Library!\nPlease enter a " +
            "book name:","Pards' Library", JOptionPane.QUESTION_MESSAGE);
        answer1 = JOptionPane.showConfirmDialog(null, "Is " + book + " correct?", "Pards' " +
            "Library", JOptionPane.YES_NO_OPTION);

        switch(answer1){
            case 0:
                JOptionPane.showMessageDialog(null, book + " was add successfully!",
                    "Pards' Library", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Please enter the correct book name.",
                   "Pards' Library", JOptionPane.INFORMATION_MESSAGE);
                newBook = JOptionPane.showInputDialog(null, "Enter the correct book name: ",
                   "Pards' Library", JOptionPane.QUESTION_MESSAGE);
                answer2 = JOptionPane.showConfirmDialog(null, "Is " + newBook + " correct?",
                   "Pards' Library", JOptionPane.YES_NO_OPTION);
                switch(answer2){
                    case 0:
                        JOptionPane.showMessageDialog(null, newBook + " was add " +
                            "successfully!","Pards' Library", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1:
                        answer3 = JOptionPane.showConfirmDialog(null, "Do you want to " +
                            "enter another book name?","Pards' Library", JOptionPane.YES_NO_OPTION);
                        switch(answer3){
                            case 0:
                                while(true){
                                    book = JOptionPane.showInputDialog(null, "Welcome to " +
                                        "Pards' Library!\nPlease enter a book name:","Pards' Library", JOptionPane.
                                        QUESTION_MESSAGE);
                                    answer4 = JOptionPane.showConfirmDialog(null, "Is "
                                        + book + "correct?", "Pards' Library", JOptionPane.YES_NO_OPTION);
                                    if(answer4 == 0){
                                        JOptionPane.showMessageDialog(null, book + " was add " +
                                            "successfully!","Pards' Library", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                JOptionPane.showMessageDialog(null, "Thank you for your " +
                                    "help!\nHave a nice day!","Pards' Library", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                        break;
                }
        }
    }

    public static void main(String[]args){
        setBook();
    }
}
