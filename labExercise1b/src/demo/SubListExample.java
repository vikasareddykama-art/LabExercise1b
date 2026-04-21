package demo;

//1b(4) Extract first and second elements using subList()

import java.util.*;

public class SubListExample {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();
     colors.add("Red");
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");

     List<String> sub = colors.subList(0, 2);

     System.out.println("Extracted elements: " + sub);
 }
}