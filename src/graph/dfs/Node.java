package graph.dfs;

public class Node {
    private String data;
    private boolean isVisited;

    public Node(String data){
        this.data = data;
    }

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public boolean isVisited(){
        return isVisited;
    }

    public void setVisited(boolean isVisited){
        this.isVisited = isVisited;
    }
}
