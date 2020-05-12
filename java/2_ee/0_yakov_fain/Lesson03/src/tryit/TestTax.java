package tryit;

class TestTax{
    public static void main(String[] args){
    	
    	
           Tax   t = new Tax();    // Creating an instance of Tax. The first part of the assignment
           
           //NJTax   t = new NJTax();  // Creating an instance of NJTax. The second part of the assignment
           
           t.grossIncome= 50000;  // assigning the values
           t.dependents= 2;
           t.state= "NJ";
                            
           double yourTax = t.calcTax(); //calculating tax 
                           
          // Printing the result 
          System.out.println("Your tax is " + yourTax);
    } 
}
