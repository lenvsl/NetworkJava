import java.util.*;
public class FriendRequests{
    User u1,u2;
    int time;
    
    FriendRequests(User uu1, User uu2)
    {
        u1=uu1;
        u2=uu2;
        time = (int) new Date().getTime();
    }
    
      @Override
    public String toString()
    {
       return ("Request from : "+u1.toString()+" to user "+u2.toString());
    }
    
    void accept()
    {
        u1.F.add(u2);
        u2.F.add(u1);
        u1.R.remove(this);
        u2.R.remove(this);
    }
    
    
    void reject()
    {
        u1.R.remove(this);
         u2.R.remove(this);
    }
    
}
