
/*
 * @(#)DialogueHistory.java
 *
 * Generated by <a href="http://lci.cs.ubbcluj.ro/ocle/>OCLE 2.0</a>
 * using <a href="http://jakarta.apache.org/velocity/">
 * Velocity Template Engine 1.3rc1</a>
 */
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author unascribed
 */
public class DialogueHistory {

    
    public Move getPreviousMove() {

        return null;

    }
    
    public int getSize() {

        return 0;

    }
    
    public final Set getTurn() {

        if (turn == null) {
            return java.util.Collections.EMPTY_SET;
        }
        return java.util.Collections.unmodifiableSet(turn);
    }
    
    public final void addTurn(Turn arg) {

        if (arg != null) {
            if (turn == null) {
                turn = new LinkedHashSet();
            }
            turn.add(arg);
        }

    }
    
    public final void removeTurn(Turn arg) {

        if (turn != null && arg != null) {
            turn.remove(arg);
        }

    }
    
    public DialogueHistory() {

    }
    
    public Set turn;
    
    protected int size;

}
