/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s1c1 extends TreeNode {

  public JS2s1c1(Charactar character) {
    super();
    _children.add(new JS2s1c2(character));
    _children.add(new JS2s1c5(character));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("(You see Jessica.)");
    System.out.println("\n\t1. (Go up to her): \"Jessica! What's up?\" \n\t2. (Ignore her.)");
    System.out.println("Enter \"1\" or \"2\"");
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
    }
    else {
      _character.updateTree(1);
    }
  }

}
