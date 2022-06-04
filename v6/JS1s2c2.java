/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS1s2c2 extends TreeNode {

  public JS1s2c2(Character character) {
    super();
    _children.add(new JS1s2c3(character));
    _children.add(new JS1s2c3(character));
    _childrenLikeChange.add(0);
    _childrenLikeChange.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("JESSICA: Aww you actually care?");
    System.out.println("\n\t1. \"Yeah...\" \n\t2. \"Who'd want to miss out on your cheering?\"");
    System.out.println("Enter \"1\" or \"2\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      String choice = in2.toString().trim();
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
