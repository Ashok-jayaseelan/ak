import java.io.*; 
  
public class GFG { 
    
    static void vowelOrConsonant(char x) 
    { 
        if (x == 'a' || x == 'e' || x == 'i' || 
                          x == 'o' || x == 'u') 
            System.out.println("invalid"); 
        else
            System.out.println(""); 
    } 
  
    
    static public void main(String[] args) 
    { 
        vowelOrConsonant('c'); 
        vowelOrConsonant('e'); 
    } 
}
