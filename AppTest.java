package za.ac.cput.Projects;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        int num1 = 4;
        int num2 = 2;
        String operator = '-';
        int ans;

        ans = num1 - num2;

        System.out.println("The answer to the mathematical problem of "+num1+" "+operator+" "+num2+" is: " +ans);

        assertTrue( true );
    }
}
