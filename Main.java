/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner /**
         *
         * @author Sangeerththan
         */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        String operation;
        int answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my calculator");
        System.out.println("Enter first number");
        a = scanner.nextInt();
        System.out.println("Enter second number");
        b = scanner.nextInt();
        System.out.println("Enter operation");
        operation = scanner.next();
        if("+"​.equals(operation) {
            answer = add(a, b);
            ​System.out.println("Answer is: " ​+ answer);
        
        }else {
​
            System.out.println("Unsupported operation");
        }
    }
    private static int add(int a, int ​b) {
        return ​(a + b);
    }
}
