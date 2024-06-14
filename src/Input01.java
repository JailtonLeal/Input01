
import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
    
        String[] acceptableValues = {"Choice 1","Choice 2","Choice 3",};
        var string = (String)JOptionPane.showInputDialog(null,
                "esta e uma pergunta",
                "Titulo da caixa de dialogo",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        //Parse the input as an int.
        //Print its value +1
        
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}
