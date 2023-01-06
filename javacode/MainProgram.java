import java.util.*;
public class MainProgram {

    public static void main(String[] args) {
        Network N=new Network();
       
        
        User u1=new User();
        u1.set("arxo@a.gr", "1234");
        User u2=new User();
       u2.set("elen@b.gr", "1234");
     
       N.add(u1);
       N.add(u2);
       N.printAll();
        while(true)
        {
         System.out.println("Create new User ? (Y/N)");
         Scanner read=new Scanner(System.in);
         String ans=read.nextLine();
         if(ans.equals("Y"))
         {
             User u=new User();
             u.create();
             N.add(u);
             
             
         }
         else
         {
            System.out.println("Try to Login:");
            User u=N.login();
            if(u!=null)
            {
                Menu M=new Menu(u,N);
            }
            else
            {
                System.out.println("Error Login");
            }
         }
            
         
        }
    }
    
}
