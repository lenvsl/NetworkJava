import java.util.*;
public class Message
{
    User u;
    int time;
    String msg;
    List<User> Likes=new ArrayList<User>();
    List<Message> Rpl=new ArrayList<Message>();
    
    Message(User u1)
    {
        u=u1;
        
    }

    
    void newMsg(User u1)
    {
        System.out.println("Message: ");
        Scanner read=new Scanner(System.in);
        u=u1;
        msg=read.nextLine();
         time = (int) new Date().getTime();
    }
    
    void putReply(Message m)
    {
        Rpl.add(m);
    }
    void MakeLike(User u2)
    {
        if (!Likes.contains(u2))
        {
            Likes.add(u2);
        }
    }
    
    int number_of_likes()
    {
        return Likes.size();
    }
    
    
    void print()
    {
        System.out.println("User:"+ u.toString()+":"+msg);
        System.out.println("Likes:"+number_of_likes());
        for (Message m : Rpl)
        {
           System.out.println("   User:"+ u.toString()+":"+m.msg); 
        }
    }
    
    
   
}