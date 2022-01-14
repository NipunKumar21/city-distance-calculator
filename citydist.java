import java.util.*;
public class citydist {
public static void main(String[] args)
          {
                 Scanner scanner = new Scanner (System.in);
                 LinkedList citiesList = new LinkedList();
                 LinkedList yList = new LinkedList();
                 LinkedList xList = new LinkedList();
                 String city = "";
                 double x = 0;
                 double y = 0;
                 int choice = 0;
                  // First run to enter the starting location.
                 System.out.println("Enter the name of the city:");
                 city = scanner.next();
                 citiesList.addFirst(city);
                 System.out.println("Enter the X coordinate");
                 x = scanner.nextDouble();
                 xList.addFirst(x);
                 System.out.println("Enter the Y coordinate");
                 y = scanner.nextDouble();
                 yList.addFirst(y);
                 System.out.println("City: " + city + " X " + x + " Y " + y);
                 System.out.println("CityList: " + citiesList + " X " + xList + " Y " + yList);
                 System.out.println();
                 System.out.println("Pick one of the following choices:");
                 System.out.println(" 1. Enter another city");
                 System.out.println(" 2. Enter destination");
                 System.out.println(" 3. Exit");
                 System.out.println();
                 choice = scanner.nextInt();
                 while(choice == 1)
                 {
                        switch(choice)
                        {
                           // enter additional cities
                           case 1:
                                  System.out.println("Enter the name of the city:");
                                  city = scanner.next();
                                  citiesList.add(city);
                                  System.out.println("Enter the X coordinate");
                                  x = scanner.nextDouble();
                                  xList.add(x);
                                  System.out.println("Enter the Y coordinate");
                                  y = scanner.nextDouble();
                                  yList.add(y);
                                  System.out.println("City: " + city + " X " + x + " Y " + y);
                                  System.out.println("CityList: " + citiesList + " X " + xList + " Y " + yList);
                                                // ask for next choice
                                  System.out.println();
                                  System.out.println("Pick one of the following choices:");
                                  System.out.println(" 1. Enter another city");
                                  System.out.println(" 2. Enter destination");
                                  System.out.println(" 3. Exit");
                                  System.out.println();
                                  choice = scanner.nextInt();
                                  break;
                           case 3:
                                        // Exit
                                  System.out.println("Good bye");
                                  System.exit(0);
                                  break;
                        }// end switch
                 }// end loop
                        // Enter final destination
                 System.out.println("Enter your final destination:");
                 city = scanner.next();
                 citiesList.addLast(city);
                 System.out.println("Enter the X coordinate");
                 x = scanner.nextDouble();
                 xList.addLast(x);
                 System.out.println("Enter the Y coordinate");
                 y = scanner.nextDouble();
                 yList.addLast(y);
                 System.out.println("City: " + city + " X " + x + " Y " + y);
                 System.out.println("CityList: " + citiesList + " X " + xList + " Y " + yList);
                 // Compute the distance between all the cities recursively, print all cities, and the total distance
                                  // between all cities. Not Sure How....?????
                 double distance = 0;
                 double endX = 0;
                 double startX = 0;
                 double endY = 0;
                 double startY = 0;

                 distance = Math.sqrt((endX-startX)*(endX-startX) + (endY-startY)*(endY-startY));

 

          }// end main

   }//end class

