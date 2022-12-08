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

public class Linije {
    private static int xPos = 0;   // pozicija v ravnini
    private static int yPos = 0;
        
    public static void gor(int koliko, char kaj, Terminal terminal) throws IOException{ 
        terminal.setCursorPosition(terminal.getCursorPosition().withRelativeColumn(0).withRelativeRow(0));
        for(int i = 0; i < koliko; i++) {
            terminal.putCharacter(kaj);
            terminal.setCursorPosition(terminal.getCursorPosition().withRelativeColumn(0).withRelativeRow(0));
        }
    }
    
    public static void dol(int koliko, char kaj, Terminal terminal)  throws IOException {
        terminal.setCursorPosition(terminal.getCursorPosition().withRelativeColumn(0).withRelativeRow(0));
        for(int i = 0; i < koliko; i++) {
            terminal.putCharacter(kaj);
            terminal.putCharacter('\n');
            terminal.setCursorPosition(terminal.getCursorPosition().withRelativeColumn(koliko).withRelativeRow(koliko));
        }
    }
    
    public static void levo(int koliko, char kaj, Terminal terminal)  throws IOException {
        terminal.setCursorPosition(terminal.getCursorPosition().withRelativeColumn(0).withRelativeRow(1));
        for(int i = 0; i < koliko; i++) {
            terminal.putCharacter(kaj); 
        }
    }
    
    public static void desno(int koliko, char kaj, Terminal terminal)  throws IOException {
        terminal.setCursorPosition(terminal.getCursorPosition().withRelativeColumn(0).withRelativeRow(1));
        for(int i = 0; i < koliko; i++) {
            terminal.putCharacter(kaj); 
        }
    }
    
    public static void main(String[] args) throws IOException {
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        TerminalPosition startPosition = terminal.getCursorPosition();
        terminal.enterPrivateMode();
        
        desno(10, 'a', terminal);
        dol(15, 'b', terminal);
        desno(10, 'c', terminal);
        terminal.flush();
    }
}
