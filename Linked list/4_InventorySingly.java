class ItemNode{
    int id,qty;
    String name;
    double price;
    ItemNode next;

    ItemNode(int i,String n,int q,double p){
        id=i;name=n;qty=q;price=p;
    }
}

public class InventorySingly{
    static ItemNode head=null;

    static void addItem(int id,String name,int qty,double price){
        ItemNode n=new ItemNode(id,name,qty,price);
        if(head==null) head=n;
        else{
            ItemNode t=head;
            while(t.next!=null) t=t.next;
            t.next=n;
        }
    }

    static double totalValue(){
        double sum=0;
        ItemNode t=head;
        while(t!=null){
            sum+=t.qty*t.price;
            t=t.next;
        }
        return sum;
    }

    public static void main(String[] args){
        addItem(1,"Pen",10,5);
        addItem(2,"Book",5,50);
        System.out.println("Total Value: "+totalValue());
    }
}
