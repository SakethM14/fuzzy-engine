package perco;
import java.util.Set;
import java.util.HashSet;

public class Node{

    int status;
    boolean checked;
    // static final NUM_NEIGHBORS = 4;
    Set<Node> neighbors;
    boolean top;
    boolean bottom;
    int[] id;
    public Node(int status){
        this.status = status;
        this.checked = false;
        this.neighbors = new HashSet<Node>();
        this.top = false;
        this.bottom = false;
        this.id = null;
    }
    public Node(int status, int coordY, int coordX){
        this.status = status;
        this.checked = false;
        this.neighbors = new HashSet<Node>();
        this.top = false;
        this.bottom = false;
        id = new int[]{coordY, coordX};
    }

    public void top(){
        top = true;
    }
    public void bottom(){
        bottom = true;
    }
    public String toString(){
        return id.toString();
    }

}
