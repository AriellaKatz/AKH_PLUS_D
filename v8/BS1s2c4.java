/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS1s2c4 extends TreeNode {

  public BS1s2c4(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    System.out.println("BRAD: Rad! We should hang out sometime!");
    System.out.println("\n\t1. \"I'm pretty busy...\" \n\t2. \"Totally!\"");
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
      System.out.println("Aww, you've hurt his feelings. Be nice.");
      return character.updateTree(0);
    }
    else {
      System.out.println("Slay! Maybe this is actually going somewhere!");
      return  _character.updateTree(1);
    }
  }

}
