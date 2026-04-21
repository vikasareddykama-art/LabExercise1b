package demo;

//1b(1) Check whether "Red" exists in ArrayList

import java.util.*;

public class ColorSearch {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();
     colors.add("Blue");
     colors.add("Green");
     colors.add("Red");
     colors.add("Yellow");

     if (colors.contains("Red")) {
         System.out.println("Red is available");
     } else {
         System.out.println("Red is not available");
     }
 }
}