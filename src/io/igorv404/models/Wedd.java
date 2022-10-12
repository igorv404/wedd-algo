package io.igorv404.models;

import java.util.ArrayList;
import java.util.List;

public class Wedd {
  private final List<List<Integer>> pairs;

  public Wedd(List<List<Integer>> pairs) {
    this.pairs = pairs;
  }

  public List<List<Integer>> getAllPossiblePairs() {
    List<Integer> firstTribe = new ArrayList<>();
    List<Integer> secondTribe = new ArrayList<>();
    List<List<Integer>> relationVariables = new ArrayList<>();
    int count = 0;
    firstTribe.add(pairs.get(0).get(0));
    firstTribe.add(pairs.get(0).get(1));
    for (List<Integer> pair : pairs) {
      if (firstTribe.contains(pair.get(0))) {
        if (!firstTribe.contains(pair.get(1))) {
          firstTribe.add(pair.get(1));
        }
      } else if (firstTribe.contains(pair.get(1))) {
        if (!firstTribe.contains(pair.get(0))) {
          firstTribe.add(pair.get(0));
        }
      } else {
        secondTribe.add(pair.get(0));
        secondTribe.add(pair.get(1));
      }
    }
    for (Integer person1: firstTribe) {
      for (Integer person2: secondTribe) {
        if ((person1 % 2 != 0 && person2 % 2 == 0) || (person1 % 2 == 0 && person2 % 2 != 0)) {
          List<Integer> newPair = new ArrayList<>();
          newPair.add(person1);
          newPair.add(person2);
          relationVariables.add(newPair);
          count++;
        }
      }
    }
    System.out.println(count);
    return relationVariables;
  }
}
