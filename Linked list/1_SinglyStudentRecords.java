class StudentNode {
    int roll, age;
    String name;
    char grade;
    StudentNode next;

    StudentNode(int r, String n, int a, char g) {
        roll=r; name=n; age=a; grade=g; next=null;
    }
}

public class SinglyStudentRecords {
    static StudentNode head = null;

    static void addStudent(int r,String n,int a,char g){
        StudentNode newNode=new StudentNode(r,n,a,g);
        if(head==null) head=newNode;
        else{
            StudentNode temp=head;
            while(temp.next!=null) temp=temp.next;
            temp.next=newNode;
        }
    }

    static void display(){
        StudentNode temp=head;
        while(temp!=null){
            System.out.println(temp.roll+" "+temp.name+" "+temp.age+" "+temp.grade);
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        addStudent(1,"Krish",20,'A');
        addStudent(2,"Aman",21,'B');
        display();
    }
}
