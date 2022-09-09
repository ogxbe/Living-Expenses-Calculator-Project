public class Budget { // Start class
    public static void main(String[] args) 
     { // Start main method
      
        // ************
        // Project 1
        // ************

        // Variables (all will be doubles)
            double hrlywage = 10; // hourly amount paid to TA (10.00/hr)
            double rent = 625; // amount spent on housing
            double internet = 27; // amount spent on internet
            double groceries = 250; // amount spent on groceries
            double extraFun = 150; // used as allowance
            double totalExpenses = (rent + internet + groceries + extraFun); // How much they spend monthly, should be $1052.
        
            // PUT VARIABLES FOR TIME NEEDED HERE
        
            double totalTimeNeeded = (totalExpenses / hrlywage); // how many time is needed in total, prints out 105.2
            double timeNeededWeekly = (totalTimeNeeded / 4); // time needed to be worked each week, prints out 26.3
            
            // figure out the problem with the math BELOW

            double extraTime = 100 / 10; // the math is wrong here
            double extraTimeNeeded = (extraTime + timeNeededWeekly); // the math is wrong here, prints out 1452 instead of 1152.
            
            // Print Statements
        System.out.println("The TA is paid " + hrlywage + " dollars per hour.");
        System.out.println("The TA spends $" + rent + " on rent, $" + internet + " on their internet bill, $" + groceries + 
        " on their groceries, and have $" + extraFun + " left over as extra allowance"); // make sure theres two 0's after the decimal, ex: "500.00"
        
        System.out.println("The TA's total monthly expenses is $" + totalExpenses + ".");
            System.out.println("The TA needs to work " + timeNeededWeekly + " hours a week to break even and cover their living expenses.");
        System.out.println("The TA needs to work " + extraTimeNeeded + " hours to break even and have an extra $100 per month."); 
    } // End main method
} // End class
