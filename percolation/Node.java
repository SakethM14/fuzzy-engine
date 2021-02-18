package percolation;

public class Node{

    int status;
    boolean checked;
    // static final NUM_NEIGHBORS = 4;
    Set<Node> neighbors;
    boolean top;
    boolean bottom;
    public Node(int status){
        this.status = status;
        this.checked = false;
        this.neighbors = new HashSet<Node>();
        this.top = false;
        this.bottom = false;
    }
    public void top(){
        top = true;
    }
    public void bottom(){
        bottom = true;
    }


}


