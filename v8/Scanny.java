/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/

import java.util.Scanner;
public class Scanny {
  String _response;

  public Scanny(Charactar character, Player player) {
    if (player.hasFriend()) {
      type("Would you like some advice from Richard?");
      type("Enter \"yes\" or \"no\".");
      Scanner i = new Scanner(System.in);
      String resp = i.nextLine();
      if (i.trim().toLowerCase().equals("yes")) {
        int advice = character.probeTree();
        type("Richard says you should choose option " + advice + ".\n");
      }
    }
    Scanner in = new Scanner(System.in);
    _response = in.nextLine();
  }

  @Override
  public String toString() {
    return _response;
  }

}
