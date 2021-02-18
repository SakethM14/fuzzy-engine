package percolation;
import java.util.Random;

public class Grid{

    int[][] cells;
    Node[][] nodeCells;
    int[] dim;
    double p;

    public Grid(int length, int width, double probability) {
        cells = new int[length][width];
        dim = {length, width};
        p = probability;
        fill(p);
        nodeCells = new Node[length][width];

    }
    public void fill(){
        Random r = new Random();
        for (int i = 0; i < dim[0]; i++) {
            for (int j = 0; j < dim[1]; j++) {
                if (nextDouble() < p){
                    cells[i][j] = 1;
                }
                else {
                    cells[i][j] = 0;
                }
            }
        }
    }
    public Node[][] toNode(){
        for (int i = 0; i < dim[0]; i++) {
            for (int j = 0; j < dim[1]; j++) {
                nodeCells[i][j] = new Node(cells[i][j], i, j);
            }
        }
        for (int i = 0; i < dim[0]; i++) {
            for (int j = 0; j < dim[1]; j++) {
                if (j < dim[1]-1) {
                    nodeCells[i][j].neighbors.add(nodeCells[i][j+1]);
                    nodeCells[i][j+1].neighbors.add(nodeCells[i][j]);
                }
                if (i < dim[1]-1) {
                    nodeCells[i][j].neighbors.add(nodeCells[i+1][j]);
                    nodeCells[i+1][j].neighbors.add(nodeCells[i][j]);
                }
            }
        }
    }
    public String toString(){
        for (int i = 0; i < dim[0]; i++) {
            for (int j = 0; j < dim[1]; j++) {
                if (cells[i][j] == 1) {
                    System.out.print("X ");
                }
                else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
