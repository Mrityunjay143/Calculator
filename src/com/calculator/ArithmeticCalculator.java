package com.calculator;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		char operator;
	    Double numb1, numb2, result;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);
	    try{
	      System.out.println("Enter first number");
	      numb1 = input.nextDouble();
	      System.out.println("Enter second number");
	      numb2 = input.nextDouble();
	      switch (operator) {
	        case '+':
	        result = numb1 + numb2;
	        System.out.println(numb1 + " + " + numb2 + " = " + result);
	        break;
	        case '-':
	        result = numb1 - numb2;
	        System.out.println(numb1 + " - " + numb2 + " = " + result);
	        break;
	        case '*':
	        result = numb1 * numb2;
	        System.out.println(numb1 + " * " + numb2 + " = " + result);
	        break;
	        case '/':
	        if (numb2 != 0){
	          result = numb1 / numb2;
	          System.out.println(numb1 + " / " + numb2 + " = " + result);
	        }
	        else{
	          throw new ArithmeticException("dividing a number by 0 is not allowed in this program");
	        }
	        break;
	        default:
	        System.out.println("Invalid operator!");
	        break;
	      }
	    
	    }
	    catch(ArithmeticException e){
	      System.out.println(e.getMessage());
	    }
	    catch(ArrayIndexOutOfBoundsException e){
	      System.out.println("Warning: ArrayIndexOutOfBoundsException");
	    }
	    catch(Exception e){
	      System.out.println("input should be in form of number 123");
	    }
	}

}
