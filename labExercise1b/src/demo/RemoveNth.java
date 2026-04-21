package demo;

//1b(5) Delete nth element using remove(index)

import java.util.*;

public class RemoveNth {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();
     colors.add("Red");
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");

     int n = 2; // remove 3rd element (index = 2)

     colors.remove(n);

     System.out.println("After removing nth element: " + colors);
 }
}