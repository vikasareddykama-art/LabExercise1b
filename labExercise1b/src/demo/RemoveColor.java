package demo;

//1b(2) Remove 2nd element and "Blue"

import java.util.*;

public class RemoveColor {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();
     colors.add("Red");
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");

     // Remove 2nd element (index 1)
     colors.remove(1);

     // Remove "Blue"
     colors.remove("Blue");

     System.out.println("After removal: " + colors);
 }
}