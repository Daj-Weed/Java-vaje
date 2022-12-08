import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.Random;


public class LantDemo01 {
    public static void main(String[] args) {
        try {
            //Terminal terminal = new DefaultTerminalFactory(System.out,
            // System.in, Charset.forName("UTF8")).createTerminal();
            Terminal terminal = new DefaultTerminalFactory().createTerminal();
            
            terminal.enterPrivateMode();

            terminal.setCursorPosition(10, 5);
            terminal.putCharacter('H');
            terminal.putCharacter('e'); 
            terminal.setCursorPosition(0, 0);
           
            terminal.flush();
            //terminal.exitPrivateMode();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }       
    }
}
