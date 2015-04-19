/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loonyquiz;

/**
 *
 * @author Hannah
 */
public class Time
{
    private static long startTime;
    
    public static void startTimer()
    {
        startTime = System.currentTimeMillis();
    }

    public static long readTimeTaken()
    {
        return System.currentTimeMillis() - startTime;
    }

    public static long getTimeInMills()
    {
        return System.currentTimeMillis();
    }
}
