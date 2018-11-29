package bankassignment;

//Oliver Hughes

import java.util.TimerTask;

public class AccountTimerTask extends TimerTask
{
    Account ac;
    AccountTimerTask(Account ac)
    {
        this.ac = ac;
    }
    
    @Override
    public void run()
    {
        ac.generateTransaction();
    }
}
