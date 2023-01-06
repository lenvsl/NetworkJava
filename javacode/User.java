import java.util.*;
public class User
{
    List<User> F=new ArrayList<User>();
    List<FriendRequests> R=new ArrayList<FriendRequests>();
    List<Message> M=new ArrayList<Message>();
    String email;
    String password;
    
    User()
    {
        email="";
        password="";
     
    }
    
    User(String e, String p)
    {
        email=e;
        password=p;
    }
    
    void create()
    {
        Scanner read=new Scanner(System.in);
        System.out.println("Give email:");
        email=read.nextLine();
        System.out.println("Give password:");
        password=read.nextLine();
        
    }
    
    void set(String e, String p)
    {
        email=e; password=p;
    }
    
    
    @Override
    public String toString()
    {
       return ("User with Email: "+email);
    }
    
    
    void printFriends()
    {
         int i=0;
        for (User u : F){
            System.out.println(i+". "+u.toString());
            i++;
        }
    }
    
    void printMessage()
    {
         int i=0;
        for (Message m : M){
            System.out.println(i+". "+m.msg);
            i++;
        }
    }
    
    void printReq()
    {
         int i=0;
        for (FriendRequests r : R){
            System.out.println(i+". "+r.toString());
            i++;
        }
    }
    
    
    void printWall()
    {
        for (Message m: M)
        {
            m.print();
        }
        
        for (User u: F )
        {
            System.out.println("Post of Friend "+u.toString());
            for (Message m: u.M)
            {
                m.print();
            }
        }
    }
    
}