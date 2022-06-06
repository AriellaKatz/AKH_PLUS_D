/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS2s2c2 extends TreeNode {

  public BS2s2c2(Charactar character) {
    super();
    _children.add(null);
    _children.add(new BS2s2c3(character));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("(Ask Brad on a date?)");
    System.out.println("\n\t1. Yes \n\t2. No");
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
      System.out.println("BRAD: Hell yeah! Come over to my place!");
      System.out.println("[You will go over to his place.]");
    }
    else {
      _character.updateTree(1);
    }
  }

}
