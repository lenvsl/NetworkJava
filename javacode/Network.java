import java.util.*;
public class Network
{
    List<User> U=new ArrayList<User>();
    
    Network()
    {
        
    }
    
    void add(User u)
    {
        U.add(u);
    }
    
    
    User login()
    {
        Scanner read=new Scanner(System.in);
        System.out.println("Give email:");
        String e=read.nextLine();
        System.out.println("Give password:");
        String p=read.nextLine();
        
        for (User uu : U)
        {
            if (uu.email.equals(e) && uu.password.equals(p))
            {
               return uu; 
            }
        }
        return null;
    }
    
    void print_non_friends(User u1)
    {
        int i=0;
        for (User u : U){
            if (u!=u1)
            {
                if(!u1.F.contains(u) )
                {
                    int f=0;
                    for (FriendRequests fr :u1.R)
                    {
                        if(fr.u2==u) {f=1; break;}
                    }
                    if(f==0)
                        System.out.println(i+". "+u.toString());
                }
            }
            i++;
        }
    }
    
    void printAll()
    {
         int i=0;
        for (User u : U){
            System.out.println(i+". "+u.toString());
            i++;
        }
    }
    
}