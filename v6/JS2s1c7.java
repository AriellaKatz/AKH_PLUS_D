/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s1c7 extends TreeNode {

  public JS2s1c7(Character character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("JESSICA: Oh? Reeaaallyy. Hahaha, you're adorable you know?");
    System.out.println("\n\t1. \"Yea, I know.\" \n\t2. \"Ahaha, sure...\"");
    System.out.println("Enter \"1\"  or \"2\".");
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
      System.out.println("(Jessica raises her eyebrows in amusement.)");
    }
    else {
      _character.updateTree(1);
      System.out.println("(The bell rings and you scurry away to class.)");
    }
  }

}
