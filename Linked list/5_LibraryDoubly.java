class BookNode{
    int id;
    String title,author;
    boolean available=true;
    BookNode next,prev;

    BookNode(int i,String t,String a){
        id=i;title=t;author=a;
    }
}

public class LibraryDoubly{
    static BookNode head=null;

    static void addBook(int id,String t,String a){
        BookNode n=new BookNode(id,t,a);
        if(head==null) head=n;
        else{
            BookNode temp=head;
            while(temp.next!=null) temp=temp.next;
            temp.next=n;
            n.prev=temp;
        }
    }

    static void countBooks(){
        int c=0;
        BookNode temp=head;
        while(temp!=null){ c++; temp=temp.next;}
        System.out.println("Total Books: "+c);
    }

    public static void main(String[] args){
        addBook(1,"DSA","CLRS");
        addBook(2,"Java","James");
        countBooks();
    }
}
