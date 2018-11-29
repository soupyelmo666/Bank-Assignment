package BankAssignment;

import java.util.ArrayList;
import java.util.Random;

public class Searching 
{
    double maxValue;
    double minValue;

    public static void getMax(ArrayList<Double> a) 
    {
        int maxMonth = 0;
        double maxValue = a.get(0);
        
        for (int z = 1; z < a.size(); z++) 
        {
            if (a.get(z) > maxValue) 
            {
                maxValue = a.get(z);
                maxMonth = z - 1;
            }
        }
        System.out.println("Your Max Value was : " + maxValue + " in Month " + maxMonth);
    }
    
    public static void getMin(ArrayList<Double> a) 
    {
        
        int minMonth = 0;
        double minValue = a.get(0);
        
        for (int z = 1; z < a.size(); z++) 
        {
            if (a.get(z) < minValue) 
            {
                minValue = a.get(z);
                minMonth = z - 1;
            }
        }
        System.out.println("Your Min Value was : " + minValue + " in Month " + minMonth);
    }
    
    
    
    public static void buildArray(ArrayList<Double> a)
    {
        for (int month = 0; month < 10; month++) 
        {
            Random random = new Random();
            double randomValue = 0 + (100 - 0) * random.nextDouble();
            
            //accountBalanceList.add(randomValue);
            
            //System.out.println("Month :" + month + "   Account Balance : £" + accountBalanceList.get(month));
        }
    }
    
    public double getMaxValue()
    {
        return maxValue;
    }
    
    public double getMinValue()
    {
        return minValue;
    }
}
