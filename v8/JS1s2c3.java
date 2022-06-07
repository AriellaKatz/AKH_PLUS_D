/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS1s2c3 extends TreeNode {

  public JS1s2c3(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(6);
    _childrenLikeChanges.add(8);
    _character = character;
  }

  public void interact() {
    System.out.println("JESSICA: I reserved a seat for you over there.");
    System.out.println("\n\t1. \"Thanks! Have fun\" \n\t2. \"Make sure to smile in my direction! I'll be waiting.\"");
    System.out.println("Enter \"1\" or \"2\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      _character.updateTree(0);
      System.out.println("JESSICA: You too!");
    }
    else {
      _character.updateTree(1);
      System.out.println("(Jessica blushes slightly)");
    }
  }

}
