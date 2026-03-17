class MovieNode {
    String title,director;
    int year;
    double rating;
    MovieNode next,prev;

    MovieNode(String t,String d,int y,double r){
        title=t;director=d;year=y;rating=r;
    }
}

public class DoublyMovieSystem {
    static MovieNode head=null;

    static void addMovie(String t,String d,int y,double r){
        MovieNode n=new MovieNode(t,d,y,r);
        if(head==null) head=n;
        else{
            MovieNode temp=head;
            while(temp.next!=null) temp=temp.next;
            temp.next=n;
            n.prev=temp;
        }
    }

    static void displayForward(){
        MovieNode temp=head;
        while(temp!=null){
            System.out.println(temp.title+" "+temp.rating);
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        addMovie("Inception","Nolan",2010,9.0);
        addMovie("Avatar","Cameron",2009,8.5);
        displayForward();
    }
}
