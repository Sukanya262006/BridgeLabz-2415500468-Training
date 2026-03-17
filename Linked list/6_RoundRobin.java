class ProcessNode{
    int id,burst;
    ProcessNode next;

    ProcessNode(int i,int b){ id=i;burst=b; }
}

public class RoundRobin{
    static ProcessNode head=null;

    static void addProcess(int id,int burst){
        ProcessNode n=new ProcessNode(id,burst);
        if(head==null){
            head=n; n.next=head;
        } else{
            ProcessNode t=head;
            while(t.next!=head) t=t.next;
            t.next=n; n.next=head;
        }
    }

    static void runRR(int q){
        ProcessNode t=head;
        do{
            if(t.burst>0){
                System.out.println("Process "+t.id+" running");
                t.burst-=q;
            }
            t=t.next;
        }while(t!=head);
    }

    public static void main(String[] args){
        addProcess(1,10);
        addProcess(2,5);
        runRR(2);
    }
}
