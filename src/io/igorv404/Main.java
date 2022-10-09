package io.igorv404;

import io.igorv404.models.FileData;
import io.igorv404.models.Wedding;

public class Main {
  public static void main(String[] args) {
    FileData fileData = new FileData();
    Wedding wedding = new Wedding(fileData.getAllPairs(fileData.countOfPairs()));
    System.out.println(wedding.getAllPossiblePairs());
  }
}
