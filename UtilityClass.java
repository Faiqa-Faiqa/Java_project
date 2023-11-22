package Utility;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class UtilityClass {

    public static String[] femaleNames = {"Emily","Emma","Olivia","Ava","Isabella",
            "Sophia","Mia","Charlotte","Amelia","Evelyn"};

   // static String[] femaleNamesAndYear=new String[100];
    static ArrayList<String>femaleNamesAndYears=new ArrayList<>();

     static void addTofemaleNamesAndYear(String name,int year){
         if(!FindFemaleNamesAndYear(name+year))
              femaleNamesAndYears.add(name+year);
     }

     static boolean FindFemaleNamesAndYear(String value){
         for(String femaleNamesAndYear:femaleNamesAndYears){
             if (femaleNamesAndYear == value){
                 return false;
             }
         }
          return true;
     }
    //a helper method to keep only 2 digits of a double value after comma
    public static double helperDoubleRound(double originalValue){
        DecimalFormat df = new DecimalFormat("#.##");
        double roundedValue = Double.parseDouble(df.format(originalValue));
        return roundedValue;
    }
    //helper method to generate a radom number in certain range
    public static double helperRandomGenerator(double minValue, double maxValue){
        Random random = new Random();
        double randomValue = minValue + (maxValue - minValue) * random.nextDouble();
        return randomValue;
    }

}
