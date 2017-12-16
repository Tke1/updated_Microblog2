import static java.lang.System.out; 

import java.util.*; 

public class Post
{
    private static int nextPostNumber =1; 
    private String author;
    private int postNumber;
    private String content; 
    private String url; 
    private String web; 
    private String u; 

    public Post()
    {
        this.postNumber=nextPostNumber; 
        nextPostNumber++; 
        this.author= author; 
        this.content=content; 
    }

    //public Post3(String author, String content)
    //{
    //  this.postNumber=nextPostNumber; 
    //  nextPostNumber++; 
    //  this.author= author; 
    //  this.content=content; 
    //}
    
   
    public void setAuthor(String a)
    {
        this.author=a; 
    }

    public String getAuthor()
    {
        return this.author; 
    }

    public String content() 
    {
        return this.content; 
    }

    public void setContent(String c)
    {
        this.content=c; 
    }

    public String toString()
    {
        return this.postNumber + " " + this.author+ "\n" + this.content; 
    }

    public void setInput(String c)
    {
        Scanner keyboard = new Scanner (System.in); 
        //out.println("current author's username");
        // this.author= keyboard.nextLine();
        out.println("Enter the content"); 
        c= keyboard.nextLine(); 
        this.content = c; 
    }

    public String input()
    {
        return this.input(); 
    }

    //public void setAskUrl(String u)
    //{
      //  Scanner keyboard = new Scanner (System.in); 
         

      //  url = u; 
    //}

    //public String askUrl()
    //{
     //   return url; 
    //}
    
    public void setWebAddress(String w) 
    {
        Scanner keyboard = new Scanner (System.in); 
        out.println("Type your web address"); 
        w= keyboard.nextLine(); 
        this.web=w; 
    }

    public String webAddress()
    {
        return this.webAddress(); 
    }
    public String setWeb(String w)
    {
        return this.web= w; 
    }
    public String web()
    {
        return this.web; 
    }
    
    public void print()
    {
        out.println(this.postNumber+" " + this.author); 
        out.println(this.content);
        //out.println(this.web); 
         if (this.web == null)
                {
                     out.println(); 
                } else
                {
                    out.print(this.web); 
                    out.println(); 
                }
                
        
    }

    
    public void printUrl()
    {
        out.println(this.url); 
    }
}