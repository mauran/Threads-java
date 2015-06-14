
public class BenytSnakkesagligePersoner
{
  public static void main(String[] arg)
  {
	  
	  
	  
	// Opret Snakkesageligperson   
    SnakkesagligPerson p = new SnakkesagligPerson("Anders",150, "Heste er fantastiske!"); 
    // Opret en tråd og put ovenstående objekt ind
    Thread t = new Thread(p); 
    // Start tråden
    t.start();

    p = new SnakkesagligPerson("Mauran",400, "Jeg vil bare gerne have en is");                  
    t = new Thread(p);
    t.start();


    p = new SnakkesagligPerson("Mike",400, "Forårsruller er lige mig!");               
    t = new Thread(p);
    t.start();
    
    
  }
}