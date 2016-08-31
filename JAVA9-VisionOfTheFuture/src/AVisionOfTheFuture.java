/*
 * This program is part of my learning Java series
 * This one looks at different forms of loops
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/08/java-9-repeating-ourselves-with-loops.html
 * 
 * YOU ALREADY KNOW WHAT WAITS FOR YOU IN ROOM 101
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Aug 2016
 */

import org.junit.Test;
import static org.junit.Assert.*;
 
public class AVisionOfTheFuture {
 
       /*
       * "If you want a vision of the future,
        * imagine a boot stamping on a human face - forever"
       * George Orwell, 1984
       */
      
       public void imagineABoot()
       {
              System.out.println("Stamping on a human face!");
       }
      
       @Test
       public void forVisionOfTheFuture()
       {
              for (int counter = 1 ; counter > 0 ; counter++)
              {
                     imagineABoot();
              }
       }
      
}