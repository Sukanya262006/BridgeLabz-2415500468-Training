class TaskNode {
    int id;
    TaskNode next;

    TaskNode(int id){ this.id=id; }
}

public class CircularTaskScheduler {
    static TaskNode head=null;

    static void addTask(int id){
        TaskNode n=new TaskNode(id);
        if(head==null){
            head=n;
            n.next=head;
        } else{
            TaskNode temp=head;
            while(temp.next!=head) temp=temp.next;
            temp.next=n;
            n.next=head;
        }
    }

    static void display(){
        if(head==null) return;
        TaskNode temp=head;
        do{
            System.out.print(temp.id+" ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println();
    }

    public static void main(String[] args){
        addTask(1); addTask(2); addTask(3);
        display();
    }
}
