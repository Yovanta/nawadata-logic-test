package com.enigma;

import java.util.Scanner;

public class SortCharacter {
  public static void sort() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input one line of words (S): ");
    String input = scanner.nextLine().toLowerCase().replace(" ", "");

    String charVowel = procVowel(input);
    String charConsonant = procConsonant(input);

    System.out.println("Vowel Characters : " + groupCharacter(charVowel));
    System.out.println("Consonant Characters : " + groupCharacter(charConsonant));
  }

  public static String procVowel(String text) {
    StringBuilder vowels = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if ("aiueo".indexOf(c) != -1) {
        vowels.append(c);
      }
    }
    return vowels.toString();
  }

  public static String procConsonant(String text) {
    StringBuilder consonants = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (!(c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o')) {
        consonants.append(c);
      }
    }
    return consonants.toString();
  }

  public static String groupCharacter(String text) {
    StringBuilder ch = new StringBuilder();
    char[] charArray = text.toCharArray();
    for (int i = 0; i < text.length(); i++) {
      if (text.contains(String.valueOf(charArray[i])) && !ch.toString().contains(String.valueOf(charArray[i]))) {
        for (int j = i + 1; j < charArray.length; j++) {
          if (charArray[j] == charArray[i]) {
            ch.append(charArray[j]);
          }
        }
        ch.append(charArray[i]);
      }
    }
    return ch.toString();
  }
}
