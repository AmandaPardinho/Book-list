package display.booklist.java;

import javax.swing.JOptionPane;

public class BookList{
    public static void setBook(){
        String book1 = null;
        String book2 = null;
        String book3 = null;
        Integer answer1 = -1;
        Integer answer2 = -1;
        Integer answer3 = -1;
        Integer answer4 = -1;

        book1 = JOptionPane.showInputDialog(null, "Welcome to Pards' Library!\nPlease enter a " +
            "book name:","Pards' Library", JOptionPane.QUESTION_MESSAGE);
        answer1 = JOptionPane.showConfirmDialog(null, "Is " + book1 + " correct?", "Pards' " +
            "Library", JOptionPane.YES_NO_OPTION);

        switch(answer1){
            case 0:
                JOptionPane.showMessageDialog(null, book1 + " was add successfully!",
                    "Pards' Library", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Please enter the correct book name.",
                   "Pards' Library", JOptionPane.INFORMATION_MESSAGE);
                book2 = JOptionPane.showInputDialog(null, "Enter the correct book name: ",
                   "Pards' Library", JOptionPane.QUESTION_MESSAGE);
                answer2 = JOptionPane.showConfirmDialog(null, "Is " + book2 + " correct?",
                   "Pards' Library", JOptionPane.YES_NO_OPTION);
                switch(answer2){
                    case 0:
                        JOptionPane.showMessageDialog(null, book2 + " was add " +
                            "successfully!","Pards' Library", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1:
                        answer3 = JOptionPane.showConfirmDialog(null, "Do you want to " +
                            "enter another book name?","Pards' Library", JOptionPane.YES_NO_OPTION);
                        switch(answer3){
                            case 0:
                                while(true){
                                    book3 = JOptionPane.showInputDialog(null, "Welcome to " +
                                        "Pards' Library!\nPlease enter another book name:","Pards' Library",
                                        JOptionPane.QUESTION_MESSAGE);
                                    answer4 = JOptionPane.showConfirmDialog(null, "Is "
                                        + book3 + " correct?", "Pards' Library", JOptionPane.YES_NO_OPTION);
                                    if(answer4 == 0){
                                        JOptionPane.showMessageDialog(null, book3 + " was add " +
                                            "successfully!","Pards' Library", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                break;
                        }
                        break;
                }
        }
    }

    public static void main(String[]args){
        setBook();
        JOptionPane.showMessageDialog(null, "Thank you for your help!\nHave a nice day!",
            "Pards' Library", JOptionPane.INFORMATION_MESSAGE);
    }
}
