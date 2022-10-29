class Main {

double budget = 230.00;
 
public static double overallSum(double[]valueSum) { 

double sum = 0; 

for(int i = 0; i < valueSum.length; i = i + 1) {
sum = (valueSum[i] + sum);
}
return sum;
} 

public static double amountLeft(double total) {

double left = 0;
if (total < budget) {
    left = left + (budget - total);
}
return left;
    }
    
public static double overBudget(double total) {

double over = 0;
if(total > budget) {
over = over + (total - budget);
    }
return over;
    }
    
public static void printItems() { 

double[] items = {5.99, 4.82, 4.83, 9.79, 14.90, 25.00, 2.50, 2.50, 19.10, 13.99, 9.99, 6.92, 6.99, 27.99, 3.72, 4.09, 10.70, 8.75, 8.75, 12.60, 7.99, 4.99, 0.00, 14.99};

double itemSum = overallSum(items);
double budgetPass = overBudget(itemSum);
double changeLeft = amountLeft(itemSum);

System.out.println("\nTotal of Items: £" + String.format("%.2f", itemSum));
System.out.println("No. of Items: " + items.length);
System.out.println("Amount Left: £" + String.format("%.2f", changeLeft)); 
System.out.println("Over Budget: £" + String.format("%.2f", budgetPass)); 

}
    public static void main(String[] args) {
    printItems();
    }
}
