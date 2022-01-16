interface display 
{  
    default void show() 
    { 
        System.out.println("displaying"); 
    } 
} 
interface view
{  
    default void show() 
    { 
        System.out.println("viewing"); 
    } 
}  
public class dimond implements display, view
{  
    public void show() 
    {  
       display.super.show(); 
        view.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        dimond ob = new dimond(); 
        ob.show(); 
    } 
}
