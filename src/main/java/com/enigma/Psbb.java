package com.enigma;

import java.util.Scanner;

public class Psbb {
  public static void minBus() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input the number of families: ");
    int families = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Input the number of members in the family (separated by a space): ");
    String[] members = scanner.nextLine().split(" ");

    if (members.length != families) {
      System.out.println("Input must be equal with count of family");
      return;
    }

    int maxPassengers = 4;
    int totalMembers = 0;

    for (String member : members) {
      totalMembers += Integer.parseInt(member);
    }

    int totalBuses = (int) Math.ceil((double) totalMembers / maxPassengers);

    System.out.println("Minimum buses required: " + totalBuses);
  }
}
