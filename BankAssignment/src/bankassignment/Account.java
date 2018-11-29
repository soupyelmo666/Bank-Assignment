package bankassignment;

// @author Oliver Hughes

import java.util.Random;

public abstract class Account 
{
    protected double currentBalence;
    protected double startingBalence;
    private boolean tranType;
    private double tranAmount;
    
    //Sets the starting balence of the simulation
    protected abstract double setStartAmount(double input);
    
    //Checks the account balence to ensure it has not droped below the minimum 
    protected abstract double checkBalence(double balence);
    
    //Performs a transaction within the simulation 
    protected abstract double makeTransaction(double genAmount);
    
     
    public void generateTransaction()
    {
       this.transactionType();
       this.transactionAmount(tranType);
       this.makeTransaction(tranAmount);
    }

    //boolean that decides if the transactioon will be a deposit or withdraw 
    private boolean transactionType()
    {
        Random boo = new Random();
        tranType = boo.nextBoolean();
        return tranType;
    }

    //Generates the value of the transaction (between £0 and £5000)
    private double transactionAmount(boolean type)
    {
        Random transaction = new Random();
        
        tranAmount = transaction.nextInt(5000);
        if (type == false)
        {
            tranAmount = tranAmount * (-1);
        }
        return tranAmount;     
    }
}
