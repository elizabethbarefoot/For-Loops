
/**
 * Write a description of class ForLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForLoops
{
    
    public void run() {
        for (int i = 0; i <= 15; i++) {
            System.out.println("i is equal to " + i);
        }
        
        for (int j  = 10; j  > 2; j -= 2) {
            System.out.println("j is equal to " + j);
        }
        
        for (int k  = 10; k != 0; k -= 3) {
            System.out.println("k is equal to " + k);
        }
    }
    
    public static void main(String[] args)
    {        
        ForLoops hw = new ForLoops();
        hw.run();
    }
}
