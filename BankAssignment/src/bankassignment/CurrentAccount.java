package bankassignment;

// @author Oliver Hughes

public class CurrentAccount extends Account
{
    protected double currentBalence;
    protected double startingBalence;
    
    @Override
    protected double setStartAmount(double userInput)
    { 
        if (userInput < 1)
        {
            System.out.println ("Error: Current account must be created "
                    + "with a minimum balance of £1. ");

            //INSERT CODE TO STOP PROGRAM AND MAKE USER ENTER ANOTHER VALUE
        }
        else
        startingBalence = userInput;
        currentBalence = startingBalence;
        return startingBalence;
    }

    @Override
    protected double makeTransaction (double amount)
    {
        double newBalence;
        newBalence = currentBalence + amount;
        
        if (amount >= 500)
        {
            newBalence = currentBalence + 10;
        }  
        
        this.checkBalence(newBalence);
        
        return currentBalence;
    }
    
    /*Checks if the balence after the transaction is above the minimum amount. 
    if it is then currentBalence will change, 
    if its not then currentBalence will stay the same */
    @Override
    protected double checkBalence(double newBalence)
    {
       if (newBalence >= -1000)
       {
           currentBalence = newBalence;
       }
       else 
           System.out.println("Error: Transaction has been rejected."
                   + "Overdraft cannot exceed £1000");
       
       return currentBalence;
    }
}
