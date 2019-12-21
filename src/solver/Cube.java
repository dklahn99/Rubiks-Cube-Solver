package solver;

import java.util.List;

/*
 * Immutable type representing a 3x3 rubik's cube
 */
public class Cube {

    private final List<Side> sides;
    
    /*
        Abstraction function:
    
            AF(sides) = a 3x3 rubik's cube where:
                        sides.get(0) is the front face where (0,0) is the bottom left front corner of the cube when viewed from the front face,
                        sides.get(1) is the top face where (0,0) is the top left front corner of the cube when viewed from the front face,
                        sides.get(2) is the back face where (0,0) is the top left back corner of the cube when viewed from the front face,
                        sides.get(3) is the bottom face where (0,0) is the bottom left back corner of the cube when viewed from the front face,
                        sides.get(4) is the left face where (0,0) is the bottom left back corner of the cube when viewed from the front face,
                        sides.get(5) is the right face where (0,0) is the bottom right front corner of the cube when viewed from the front face
    
        Rep invariant:
            - sides.size() == 6
    
        Safety from rep exposure
            - All fields are private and final
            - TODO
     */
    
    /**
     * Creates a Cube object from a file.
     * Expects the file to define 6 sides where each side is a 3x3 grid of colors:
     * 
     * R = red
     * B = blue
     * G = green
     * Y = yellow
     * O = orange
     * W = white
     * 
     * E.g. one possible side definition is "OWB\nGWY\nRGB". The color at (0,0) for this definition is red.
     * 
     * The sides are defined as follows in the following order:
     *  - The front face where (0,0) is the bottom left front corner of the cube when viewed from the front face,
     *  - The top face where (0,0) is the top left front corner of the cube when viewed from the front face,
     *  - The back face where (0,0) is the top left back corner of the cube when viewed from the front face,
     *  - The bottom face where (0,0) is the bottom left back corner of the cube when viewed from the front face,
     *  - The left face where (0,0) is the bottom left back corner of the cube when viewed from the front face,
     *  - The right face where (0,0) is the bottom right front corner of the cube when viewed from the front face,
     * 
     * Whitespace in the file (tabs, newlines, and spaces) are ignored
     * 
     * @return the Cube object constructed from the file
     */
    public static Cube parseFromFile() {
        throw new RuntimeException("not yet implemented");
    }
    
    /**
     * @param sides a list of size 6 where:
     *      sides.get(0) is the front face where (0,0) is the bottom left front corner of the cube when viewed from the front face,
     *      sides.get(1) is the top face where (0,0) is the top left front corner of the cube when viewed from the front face,
     *      sides.get(2) is the back face where (0,0) is the top left back corner of the cube when viewed from the front face,
     *      sides.get(3) is the bottom face where (0,0) is the bottom left back corner of the cube when viewed from the front face,
     *      sides.get(4) is the left face where (0,0) is the bottom left back corner of the cube when viewed from the front face,
     *      sides.get(5) is the right face where (0,0) is the bottom right front corner of the cube when viewed from the front face,
     */
    Cube(List<Side> sides) {
        throw new RuntimeException("not yet implemented");
    }
    
    /**
     * Asserts the representation invarients of the data types
     */
    private void checkRep() {
    }
    
    /**
     * Returns a new Cube representing this Cube after the plane `plane` has been rotated clockwise from
     * the front/left/top perspective by 90 * `rotations` degrees.
     * @param plane the plane to rotate
     * @param rotations the number of turns to rotate
     * @return
     */
    public Cube transform(Plane plane, int rotations) {
        throw new RuntimeException("not yet implemented");
    }
    
    /**
     * Returns a string representation of each of the faces of the cube in the following order:
     * front, top, back, bottom, left, right
     * 
     * Example output for just the front and top sides:
     * "Front:\nWWW\nYYY\nOOO\n\nTop:\nRRR\nGGG\nBBB"
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
