import static java.lang.System.out; 
import java.util.*; 

public class Menu {
    //public static User3 retriveCurrentUser(ArrayList<User3>allUsers, String userName)
    //{
    //   int allUsersList=allUsers.size();
    //   for(int i=0; i<allUsersList; i++)
    //   {
    //       if(allUsers.get(i).equals(userName))
    //       {
    //           return allUsers.get(i);
    //       }
    //   }
    //   return null; 
    //}

    //public void input()
    //{
    // Scanner keyboard = new Scanner(System.in);
    //ArrayList<User3>allUsers= new ArrayList<User3>(); 

    // User3 a=new User3( "Jason Beton", "jeb@gmail.com", "eTop", "www.esgda.com"); 
    //User3 b=new User3( "Edward Crown", "playtimeEC@yahoo.com", "play2q", "www.ecown.com"); 
    //User3 c=new User3(  "Dexter Milton", "dexter.milton@msn.com", "tepdw", "www.mildex.com"); 

    //allUsers.add(a);
    //allUsers.add(b); 
    //allUsers.add(c);
    //out.println(allUsers); 
    //out.println("Choose an username from the following above");
    //String selection=keyboard.nextLine(); 
    //}
    public static void printUserName(ArrayList<User>ulist)
    {
        for (int i=0; i<ulist.size(); i++)
        {
            out.println((i+1)+ ": " + ulist.get(i).getUserName()); 
        }
    }

    public static void findOldPost(String selection, ArrayList<Post>plist)
    {
        for(int i = (plist.size()-1); i >= 0; i--)
        {
            if (selection.equals(plist.get(i).getAuthor()))
            //if(currentUser.getUserName().equals(plist.get(i).getAuthor()))
            {
                //out.print(currentUser.numberOfPost); 
                plist.get(i).print(); 
                break; 
            }               

        }
    }

    public static void printMenu()
    {
        out.println("Main Menu"); 
        out.println("1) Create a new user"); 
        out.println("2) Become an existing user"); 
        out.println("3) Create a post as the current user"); 
        out.println("4) Print all posts"); 
        out.println("5) Print all users");
        //out.println("6) Exit"); 
        out.println();
    }
    //public static void input()
    //{
    //    Scanner keyboard= new Scanner (System.in); 
    //  out.println("Enter the content"); 
    //  String content=keyboard.nextLine(); 

    //}
    //public static void printMyPost()
    //{

    //}
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); 
        String y = ""; 
        boolean quit = false;
        String selection=""; 
        int userOption; 
        String currentName =""; 
        int UI=-1; 

        ArrayList<User>allUsers= new ArrayList<User>(); 

        User a=new User( "Jason Beton", "jeb@gmail.com", "eTop", "www.esgda.com \n"); 
        User b=new User( "Edward Crown", "playtimeEC@yahoo.com", "play2q", "www.ecown.com \n"); 
        User c=new User(  "Dexter Milton", "dexter.milton@msn.com", "tepdw", "www.mildex.com \n"); 

        allUsers.add(a);
        allUsers.add(b); 
        allUsers.add(c);

        ArrayList<Post>allPosts= new ArrayList<Post>();

        //Post3 d= new Post3("eTop", "What's up?"); 
        //Post3 f= new Post3("play2q", "wow!"); 
        //Post3 g= new Post3 ("tepdw", "awesome!"); 

        //out.println(allUsers); 
        //out.println("Choose an username from the following above");
        //String selection=keyboard.nextLine(); 

        out.println("Welcome to Microblog."); 

        //out.println("Enter your name"); 
        //String response= keyboard.nextLine(); 
        do
        {

            printMenu(); 
            out.println("Your are currently user" + " "+ selection + "." + "What would you like to do? Enter choice [1-5].");  
            int choice= keyboard.nextInt(); 
            out.println(); 
            
                    switch (choice)
                    {
                        case 1:
                        out.println("Type your full name");
                        String name= keyboard.next();
                        out.println("Create a username");
                        String userName= keyboard.next();
                        out.println("Type your email.");
                        String email= keyboard.next();
                        out.println("Type the link to your avatar.");
                        String url= keyboard.next();
                        //myPost.setAskUrl(url); 
                        selection=userName; 
                        User author = new User(name, email,userName, url);

                        allUsers.add(author); 
                        break;
                        case 2:
                        printUserName(allUsers);
                        out.println("Choose an username from the above by entering the number of pick.");
                        userOption=keyboard.nextInt();
                        //currentName= Integer.toString(userOption); 
                        for(int i=0; i<allUsers.size(); i++)
                        {
                            if (userOption == (i+1))

                            {
                                selection= allUsers.get(i).getUserName();
                                //y = allUsers.get(i).getUrl(); 
                            }
                        }

                        break;
                        case 3: 
                        Post myPost= new Post();
                        myPost.setAuthor(selection); 

                        findOldPost(selection, allPosts); 
                        out.println(); 
                        myPost.setInput((keyboard.nextLine())); 
                        out.println("Would you like to add web address to your post? Please enter Yes or No"); 
                        String u= keyboard.next().toString().trim();

                        if(u.equals("Yes") || u.equals("yes") || u.equals("YES"))
                        {
                            myPost.setWebAddress((keyboard.nextLine())); 

                            //out.println(y); 
                        }
                        else
                        {
                            out.println("no web address is reported"); 
                        }

                        myPost.print();

                        allPosts.add(myPost); 

                        //findOldPost(selection, allPosts); 
                        //out.println(); 
                        //myPost.setInput((keyboard.nextLine())); 
                        //out.println("Would you like to add web address to your post? Please enter Yes or No"); 
                        // String u= keyboard.next().toString().trim();

                        //if(u.equals("Yes") || u.equals("yes") || u.equals("YES"))
                        //{
                        // myPost.setWebAddress((keyboard.nextLine())); 

                        //out.println(y); 
                        //}
                        //else
                        //{
                        //    out.println("no web address is reported"); 
                        // }

                        // myPost.print();

                        //allPosts.add(myPost); 
                        break; 
                        case 4: 
                        for  (int i=0; i<allPosts.size(); i++)
                        {
                            allPosts.get(i).print();  
                        }
                        break;
                        case 5:  
                        for (int i=0; i<allUsers.size(); i++)
                        {
                            allUsers.get(i).print(); 
                        }
                        break; 
                        case 0:
                        quit=true;
                        break;
                        default: 
                        out.println("Invalid choice.");
                    }
                   out.println(); 
                } while (!quit); 
                                                out.println("Good Bye!"); 
            }

        }
   