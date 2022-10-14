package display.booklist.java;

import java.util.*;
import javax.swing.JOptionPane;

public class BookList{
    public static void main(String[]args){

        Integer isbn;
        //String user;
        String bookName;

        Scanner scanner = new Scanner(System.in);

        List<String>book = new ArrayList<>();

        JOptionPane.showMessageDialog(null, "Welcome to Pards' Library", "Pards' Library",
                JOptionPane.INFORMATION_MESSAGE);

        String user = JOptionPane.showInputDialog(null, "Enter a book name: ",
                "Pards' Library", JOptionPane.QUESTION_MESSAGE);

        if(user == null){
            JOptionPane.showMessageDialog(null, "Please try again", "Pards' Library",
                    JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showInputDialog(null, "Enter a book name: ", "Pards' Library",
                    JOptionPane.QUESTION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Book added successfully",
                    "Pards' Library", JOptionPane.INFORMATION_MESSAGE);
        }
        //bookName = JOptionPane.getText(user);


        /*JOptionPane.showMessageDialog(null, "Bem vindo ao Explorer",
                "Explorer", JOptionPane.WARNING_MESSAGE);
        String caminho = JOptionPane.showInputDialog(null,"Digite algum endereço.");

        //while(!navega(caminho))
          //  caminho = JOptionPane.showInputDialog(null,">>"+caminho+"\nDigite algum endereço.");*/
    }

}
