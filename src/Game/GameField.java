package Game;

import Pipes.Pipe;
import Printer.Printer;

public class GameField {

    Printer printer;
    private final int size;
    private final Pipe[] field;


    public GameField(int size, Printer printer) {
        this.size = size;
        this.printer = printer;
        field = new Pipe[size];
    }
}
