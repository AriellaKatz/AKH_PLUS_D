/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS2s2c4 extends TreeNode {

  public BS2s2c4(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    System.out.println("BRAD: Oh, lit! We should hang out, just the two of us.");
    System.out.println("\n\t1. \"Oh, that's not what I meant. See you around!\" \n\t2. \"Perfect!\"");
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
      System.out.println("Aww, you've been friendzoned. Maybe you'll have something in the future, but for now, IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(0);
    }
    else {
      System.out.println("[You will hang out at his place.]");
      return _character.updateTree(1);
    }
  }

}
