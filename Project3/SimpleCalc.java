
/**
 * Brett Kinsella
 * 8/25/16
 * SimpleCalc
 */
public class SimpleCalc
{
  private int x;
   private int y;
   
   public SimpleCalc (int n1, int n2)
   {
       x = n1;
       y = n2;
    }
    
    public int add()
    {
        return x + y;
    }
    
    public int subtract()
    {
        return x - y;
    }
    
    public int mult()
    {
        return x * y;
    }
    
    public int div()
    {
        return x/y;
    }
    
    public boolean isGreater()
    {
        return x > y;
    }
}

