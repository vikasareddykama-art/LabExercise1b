package demo;

//1b(3) Sort colors using Collections.sort()

import java.util.*;

public class SortColors {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();
     colors.add("Red");
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");

     Collections.sort(colors);

     System.out.println("Sorted Colors: " + colors);
 }
}