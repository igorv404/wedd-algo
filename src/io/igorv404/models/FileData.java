package io.igorv404.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileData {
  public int countOfPairs() {
    try {
      BufferedReader reader = new BufferedReader(new FileReader(String.format("%s%s%s%s%s%s%s%s%s%s%s",
              System.getProperty("user.dir"), File.separator, "src", File.separator,
              "io", File.separator, "igorv404", File.separator, "resources", File.separator, "input.txt")));
      return Integer.parseInt(reader.readLine());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return 0;
  }

  public List<List<Integer>> getAllPairs(int count) {
    List<List<Integer>> pairs = new ArrayList<>();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(String.format("%s%s%s%s%s%s%s%s%s%s%s",
              System.getProperty("user.dir"), File.separator, "src", File.separator,
              "io", File.separator, "igorv404", File.separator, "resources", File.separator, "input.txt")));
      reader.readLine();
      for (int i = 0; i < count; i++) {
        List<Integer> pair = new ArrayList<>();
        String[] linePair = reader.readLine().split(" ");
        for (int n = 0; n < 2; n++) {
          pair.add(Integer.valueOf(linePair[n]));
        }
        pairs.add(pair);
      }
      return pairs;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return pairs;
  }
}
