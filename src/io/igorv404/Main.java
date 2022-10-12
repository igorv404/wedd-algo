package io.igorv404;

import io.igorv404.models.FileData;
import io.igorv404.models.Wedd;

public class Main {
  public static void main(String[] args) {
    FileData fileData = new FileData();
    Wedd wedd = new Wedd(fileData.getAllPairs(fileData.countOfPairs()));
    System.out.println(wedd.getAllPossiblePairs());
  }
}
