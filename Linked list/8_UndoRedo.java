class StateNode{
    String text;
    StateNode next,prev;
    StateNode(String t){ text=t; }
}

public class UndoRedo{
    static StateNode current=null;

    static void addState(String t){
        StateNode n=new StateNode(t);
        if(current==null) current=n;
        else{
            current.next=n;
            n.prev=current;
            current=n;
        }
    }

    static void undo(){ if(current!=null && current.prev!=null) current=current.prev; }
    static void redo(){ if(current!=null && current.next!=null) current=current.next; }

    public static void main(String[] args){
        addState("Hello");
        addState("Hello World");
        undo();
        System.out.println(current.text);
    }
}
