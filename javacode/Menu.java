import java.util.*;
public class Menu
{
    User U;
    Network N;
    Menu(User u, Network n)
    {
        U=u;
        N=n;
        while(true)
        {
            System.out.println("1. Show your Wall");
            System.out.println("2. Posts");
            System.out.println("3. Send Friend Requests ");
            System.out.println("4. Show Accept/Reject Friend Requests");
            System.out.println("5. Show my Friends");
            System.out.println("6. Logout");
            System.out.println("0. Exit");
            
            Scanner read=new Scanner(System.in);
            int choice=read.nextInt();
            
            if(choice==1)
            {
                u.printWall();
            }
            
            
            if(choice==2)
            {
                System.out.println("1. Make a new post in your wall");
                System.out.println("2. Make a post in your friend wall");
                System.out.println("3. Replay to a post of Friend ");
                System.out.println("4. Make a Like");
                System.out.println("0. Back");
                System.out.println("Give choice:");
                
                int c=read.nextInt();
                if(c==1)
                {
                    Message m=new Message(u);
                    m.newMsg(u);
                    u.M.add(m);
                    
                }
                if (c==2)
                {
                    if(u.F.size()>0)
                    {
                        u.printFriends();
                        System.out.println("Give number:");
                        int iu=read.nextInt();
                        Message m=new Message(u);
                        m.newMsg(u);
                        u.F.get(iu).M.add(m);
                    }
                    else
                    {
                        System.out.println("No friends found!");
                    }
                }
                
                if (c==3)
                {
                    if(u.F.size()>0)
                    {
                        u.printFriends();
                        System.out.println("Give number:");
                        int iu=read.nextInt();

                        u.F.get(iu).printMessage();
                        if(u.F.get(iu).M.size()>0)
                        {
                            System.out.println("Give number:");
                            int im=read.nextInt();
                            System.out.println("Reply message:");
                            Message m=new Message(u);
                            m.newMsg(u);
                            u.F.get(iu).M.get(im).putReply(m);
                        }
                    }
                
                
                }
                if (c==4)
                {
                  if(u.F.size()>0)
                    {
                        u.printFriends();
                        System.out.println("Give number:");
                        int iu=read.nextInt();

                        u.F.get(iu).printMessage();
                        if(u.F.get(iu).M.size()>0)
                        {
                            System.out.println("Give number:");
                            int im=read.nextInt();
                            
                            u.F.get(iu).M.get(im).MakeLike(u);
                        }
                    }
                
                }
            }
            
            if(choice==3)
            {
                N.print_non_friends(u);
                System.out.println("Give number:");
                int iu=read.nextInt();
                FriendRequests r=new FriendRequests(u,N.U.get(iu));
                N.U.get(iu).R.add(r);
                
            }
            
             if(choice==4)
            {
                u.printReq();
                if (u.R.size()>0)
                {
                    System.out.println("Give number:");
                    int iu=read.nextInt();

                    System.out.println("Give 1 for Accept or 2 for Reject:");
                    int a=read.nextInt();
                    if(a==1)  u.R.get(iu).accept();
                    if(a==2)  u.R.get(iu).reject();
                }
                else
                {
                    System.out.println("No Requests found!");
                }
            }
            
             
             if (choice==5)
             {
                 u.printFriends();
             }
            if (choice==6)
            {
                break;
            }
            
            
            if (choice==0)
            {
                System.exit(0);
            }
        }
    }
    
    
    
}