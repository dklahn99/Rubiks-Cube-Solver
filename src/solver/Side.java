package solver;

import java.util.List;

/*
 * Immutable type representing a a 3x3 grid of colors
 */
public class Side {
    
    List<List<Color>> colors;
    
    /*
        Abstraction function:

            AF(colors) = a 3x3 grid of colors where colors.get(x).get(y) is the color at coordinate (x,y)
                         and (0, 0) is the lower left corner of the grid.
    
        Rep invariant:
          - colors.size() == 3
          - colors.get(i).size() == 3 for all valid i
    
        Safety from rep exposure
          - TODO
     */
    
    /**
     * 
     * @param colors
     */
    Side(List<List<Color>> colors) {
        throw new RuntimeException("not yet implemented");
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return
     */
    Color get(int x, int y) {
        throw new RuntimeException("not yet implemented");
    }
    
    /**
     * 
     * @return
     */
    List<List<Color>> grid() {
        throw new RuntimeException("not yet implemented");
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
        throw new RuntimeException("not yet implemented");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("not yet implemented");
    }
    
}
