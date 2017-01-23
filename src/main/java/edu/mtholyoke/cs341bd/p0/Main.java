package edu.mtholyoke.cs341bd.p0;

public class Main {
  public static void main(String[] args) {
    System.out.println("Programming Assignment #0: Rummy Scoring");
    System.out.println("CS341 - Building a Digital Library");
    // TODO adjust your author name.
    System.out.println("Author: John Foley");

    while(true) {
      String input = CLI.readString("Input> ");
      if(input == null || input.length() == 0) {
        break;
      }
      System.out.println("You have entered: ");
      System.out.println("\t"+input);
      System.out.println();
    }
  }
}
