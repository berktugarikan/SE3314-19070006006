package org.example;

public class LoopControl {


    public void incorrectVariableUsage() {
        int index;
        // Some other code
        System.out.println("Preparing to loop...");
        // Loop starts much later after declaration
        index = 0;
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }

    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            } /*else {

            }*/
        }
    }

    public void modifiedControlVariable() {
        for (int m = 0; m < 10; m+=3) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                System.out.println("to " + m);
            }
        }
    }

    public void correctVariableUsage() {
        // int index; // Declare the variable here
        System.out.println("Preparing to loop...");
        for (int index = 0; index < 5; index++) { // Initialize the variable at the start of the loop
            System.out.println(index);
        }
    }

    public void correctlyModifiedControlVariable() {
        for (int m = 0; m < 10; m+=3) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                System.out.println("to " + m);
            }
        }
    }
    public void sumOfSquares() {
        int sum = 0; // Declaring variable at appropriate location
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);
    }

    public void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void modifyIndexIncorrectly() {
        for (int i = 1; i <= 10; i+=3) {
            System.out.println("Adjusting loop index from " + i);
            System.out.println("to " + i);
        }
    }
}
