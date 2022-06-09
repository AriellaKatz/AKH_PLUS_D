/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/

import java.util.Scanner;
public class Scanny {
  private String _response;

  public Scanny(Charactar character, Player player) {
    if (player.hasFriend() && !character.getIR()) {
      type("Would you like some advice from Richard?");
      type("Enter \"yes\" or \"no\".");
      Scanner i = new Scanner(System.in);
      String resp = i.nextLine();
      if (resp.trim().toLowerCase().equals("yes")) {
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

  //to print stuff so it looks like it's being typed out
  public static void type(String s){
    String punc = ",.?!-";
    for(int i = 0; i < s.length(); i++){
      System.out.print(s.charAt(i));
      if (punc.indexOf(s.charAt(i)) >= 0) {
        delay(200);
      }
      else {
        delay(35);
      }
    }
    System.out.println("");
  }
  // Built in delay
  public static void delay(int milliseconds) {
    long beginTimer = System.currentTimeMillis();
    while (System.currentTimeMillis() - beginTimer < milliseconds) {
      continue;
    }
  }

}
