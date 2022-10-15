package display.booklist.java;

import java.util.*;
import javax.swing.JOptionPane;

public class BookList{
    public static void main(String[]args){

        Integer isbn;
        int answer;
        String bookName;

        Scanner scanner = new Scanner(System.in);
        
        List<String>book = new ArrayList<>();

        JOptionPane.showMessageDialog(null, "Welcome to Pards' Library", "Pards' Library",
                JOptionPane.INFORMATION_MESSAGE);

        String user = JOptionPane.showInputDialog(null, "Enter a book name: ",
                "Pards' Library", JOptionPane.QUESTION_MESSAGE);


    }

}
