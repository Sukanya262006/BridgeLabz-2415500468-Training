import java.util.*;

class UserNode{
    int id;
    List<Integer> friends=new ArrayList<>();
    UserNode next;

    UserNode(int id){ this.id=id; }
}

public class SocialMedia{
    static UserNode head=null;

    static void addUser(int id){
        UserNode n=new UserNode(id);
        if(head==null) head=n;
        else{
            UserNode t=head;
            while(t.next!=null) t=t.next;
            t.next=n;
        }
    }

    public static void main(String[] args){
        addUser(1); addUser(2);
        System.out.println("Users created");
    }
}
