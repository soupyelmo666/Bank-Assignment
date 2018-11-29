package bankassignment;

// @author Oliver Hughes

import java.text.DecimalFormat;

public class SavingsAccount extends Account
{
    protected double currentBalence;
    protected double startingBalence;
    private double interest;
    
    //Tacks of how many withdraws have occured for the current year
    private int withdrawsPerYear = 0;
    
    //Tracks the current month. Used to determine when a year ends
    private int month = 0;
    
    
    @Override
    public double setStartAmount(double userInput)
    {
        if (userInput < 100)
        {
            System.out.println ("Error: Savings account must be created "
                    + "with a minimum balance of £100. ");

            //INSERT CODE TO STOP PROGRAM AND MAKE USER ENTER ANOTHER VALUE
        }
        else
        {
        startingBalence = userInput;
        currentBalence = startingBalence;
        System.out.println("StartAmount is " + startingBalence);
        }
        return startingBalence;
    }

    
    @Override
    protected double makeTransaction(double amount)
    {
        double newBalence;
        this.calculateInterest();
    
       //If the amount is less than 0 then transaction is a withdraw
        if (amount < 0)
        {
            this.checkYear(month);
            if (withdrawsPerYear < 2)
            {     
                newBalence = currentBalence + amount;
                this.checkBalence(newBalence);
                if(currentBalence == newBalence)
                {
                    withdrawsPerYear++;
                }
            }
            else 
                System.out.println("Error: Transaction has been rejected."
                + "Withdraw limit has been reached (2 per year)");          
        }
        else
        {
            newBalence = currentBalence + amount;
        }
        month++;
    
        //Calculate the value of currentBalence + interest to 2 decimal places. 
        currentBalence = currentBalence + interest;
        DecimalFormat df = new DecimalFormat("#.00");      
        currentBalence = Double.valueOf(df.format(currentBalence));
        return currentBalence;
    }
    
    
    //Calculate a months interest based on the current balence
    private double calculateInterest()
    {
        interest = (0.03 / 12) * currentBalence ;
        return interest;
    }
    
    /*if 12 transactions have occured. 
    Then it's a new year and withdrawsPerYer is reset */
    private void checkYear(int month)
    {
        if (month % 12 == 0)
        {   
            withdrawsPerYear = 0;
        }  
    }
    
    /*Checks if the balence after the transaction is above the minimum amount. 
    if it is then currentBalence will change, 
    if it's not then currentBalence will stay the same and display an error */
    @Override
    protected double checkBalence(double amount)
    {
        if(amount >= 100)
        {
            currentBalence = amount;
        }
        else 
        System.out.println("Error: Transaction has been rejected."
                + "Savings account balance cannot drop below £100");

        return currentBalence;
    }
} 

