public class SnakkesagligPerson implements Runnable
{
  private String navn;
  private String emne;
  private int ventetid;

  public SnakkesagligPerson(String n, int t, String e)
  {
    navn = n;
    ventetid = t;
    emne = e;
  }

  public void run()
  {
    for (int i=0; i<5; i++)
    {
      System.out.println(navn+": bla bla bla " + emne +i);
      try {  Thread.sleep(ventetid); } catch (Exception e) {} // vent lidt
    }
  }
}