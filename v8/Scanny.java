/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/

import java.util.Scanner;
public class Scanny {
  String _response;
  public Scanny() {
    Scanner in = new Scanner(System.in);
    _response = in.nextLine();
  }

  @Override
  public String toString() {
    return _response;
  }

}
