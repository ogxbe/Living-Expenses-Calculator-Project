public class Budget { // Start class
    public static void main(String[] args) 
     { // Start main method
      
        // ************
        // Project 1
        // ************

        // Variables (all will be doubles)
            double wage = 10; // hourly amount paid to TA (10.00/hr)
            double rent = 625; // amount spent on housing
            double internet = 27; // amount spent on internet
            double groceries = 250; // amount spent on groceries
            double extraFun = 150; // used as allowance
            double totalExpenses = (rent + internet + groceries + extraFun); // How much they spend monthly, should be $1052.
            double savings = 100; // amount wanting to be saved
           
            // PUT VARIABLES FOR TIME NEEDED HERE
        
            double totalTimeNeeded = (totalExpenses / wage); // how much time is needed in total, prints out 105.2
            double timeNeededWeekly = (totalTimeNeeded / 4); // time needed to be worked each week, prints out 26.3            
            double extraTime = savings / wage; // amount of time needed to be worked to have an extra $100
            double totalExtraTimeNeeded = (extraTime + totalTimeNeeded); //extra time needed in total to get an extra $100, prints out 115.2
            double extraTimeNeededWeekly = totalExtraTimeNeeded / 4; // extra time needed weekly to get an extra $100, prints out 28.8
            
            // Print Statements
        System.out.println("The TA is paid " + wage + " dollars per hour.");
        System.out.println("The TA spends $" + rent + " on rent, $" + internet + " on their internet bill, $" + groceries +  " on their groceries, and have $" + extraFun + " left over as extra allowance"); 
        // make sure theres two 0's after the decimal, ex: "500.00". It's something along the lines of %.02f, value
        
        System.out.println("The TA's total monthly expenses is $" + totalExpenses + ".");
            System.out.println("The TA needs to work " + timeNeededWeekly + " hours weekly or " + totalTimeNeeded + " hours to break even and cover their monthly living expenses.");
        System.out.println("The TA needs to work " + extraTimeNeededWeekly + " hours weekly or " + totalExtraTimeNeeded + " hours to have an extra $100 after their expenses."); 
    } // End main method
} // End class
