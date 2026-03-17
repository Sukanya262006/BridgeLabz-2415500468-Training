class TicketNode{
    int id;
    TicketNode next;
    TicketNode(int i){ id=i; }
}

public class TicketCircular{
    static TicketNode head=null;

    static void addTicket(int id){
        TicketNode n=new TicketNode(id);
        if(head==null){
            head=n; n.next=head;
        } else{
            TicketNode t=head;
            while(t.next!=head) t=t.next;
            t.next=n; n.next=head;
        }
    }

    static void countTickets(){
        if(head==null) return;
        int c=0;
        TicketNode t=head;
        do{
            c++; t=t.next;
        }while(t!=head);
        System.out.println("Total tickets: "+c);
    }

    public static void main(String[] args){
        addTicket(101); addTicket(102);
        countTickets();
    }
}
