package solver;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/*
 * Immutable type representing a a 3x3 grid of colors
 */
public class Side {
    
    private final List<List<Color>> colors;
    private static final int GRID_SIZE = 3;
    private static final Map<Color, String> COLOR_KEYS = Collections.unmodifiableMap(Map.of(
                Color.RED, "R",
                Color.GREEN, "G",
                Color.BLUE, "B",
                Color.ORANGE, "O",
                Color.WHITE, "W",
                Color.YELLOW, "Y"
            ));
    
    /*
        Abstraction function:

            AF(colors) = a 3x3 grid of colors where colors.get(x).get(y) is the color at coordinate (x,y)
                         and (0, 0) is the lower left corner of the grid. x corresponds to the column and
                         y corresponds to the row.
    
        Rep invariant:
          - colors.size() == 3
          - colors.get(i).size() == 3 for all valid i
    
        Safety from rep exposure
          - TODO
     */
    
    /**
     * Creates an immutable Side object where where colors.get(x).get(y) is the color at coordinate (x,y)
     * and (0, 0) is the lower left corner of the grid. x corresponds to the column and
     * y corresponds to the row.
     * @param colors the 3x3 list of lists of colors
     */
    Side(List<List<Color>> colors) {
        this.colors = new ArrayList<>();
        for(List<Color> subList: colors) {
            // Defensive copy of the input to avoid rep exposure
            List<Color> copy = new ArrayList<>();
            for(Color color: subList) {
                copy.add(color);
            }
            
            this.colors.add(copy);
        }
        
        checkRep();
    }
    
    /**
     * Asserts the rep invarients of the data type
     */
    private void checkRep() {
        assert colors.size() == GRID_SIZE;

        for(List<Color> subList: colors) {
            assert subList.size() == GRID_SIZE;
        }
    }
    
    /**
     * @param x the column. Must be 0 <= x < 3
     * @param y the row. Must be 0 <= y < 3
     * @return the color at (x,y) on the side
     */
    Color get(int x, int y) {
        checkRep();
        
        return colors.get(x).get(y);
    }
    
    /**
     * @return a 3x3 list of lists of colors, output, where output.get(x).get(y) is the color at coordinate (x,y)
               and (0, 0) is the lower left corner of the side.
     */
    List<List<Color>> grid() {
        checkRep();
        
        List<List<Color>> output = new ArrayList<>();
        for(List<Color> subList: colors) {
            // Defensive copy of the rep to avoid rep exposure
            List<Color> copy = new ArrayList<>();
            for(Color color: subList) {
                copy.add(color);
            }
            
            output.add(copy);
        }
        
        return output;
    }
    
    /**
     * Returns a 3x3 grid of letters representing the colors on the side:
     * 
     * E.g. "RBW\nBGY\nOWR"
     * 
     * R = red
     * B = blue
     * G = green
     * Y = yellow
     * O = orange
     * W = white
     * 
     */
    @Override
    public String toString() {
        checkRep();
        
        List<String> rowStrings = new ArrayList<>();
        for(List<Color> row: colors) {
            String rowString = "";
            for(Color color: row) {
                rowString += COLOR_KEYS.get(color);
            }
            rowStrings.add(rowString);
        }
        
        Collections.reverse(rowStrings);
        return String.join("\n", rowStrings);
    }
    
    @Override
    public int hashCode() {
        checkRep();
        return colors.hashCode();
    }
    
}
