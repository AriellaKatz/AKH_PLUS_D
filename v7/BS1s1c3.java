/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS1s1c3 extends TreeNode {

  public BS1s1c3(Character character) {
    super();
    _children.add(new BS1s1c4(character));
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("BRAD: What, you're not interested in me?");
    System.out.println("\n\t1. \"You're pretty chill.\" \n\t2. \"No.\"");
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
      System.out.println("(You have a basic convo.)");
    }
    else {
      _character.updateTree(1);
      System.out.println("Nice job shutting it down. IT'S OVER.");
      _character.setOver(true);
    }
  }

}
