/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS1s1c2 extends TreeNode {

  public BS1s1c2(Charactar character) {
    super();
    _children.add(new BS1s1c4(character));
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("BRAD: You're that new kid?");
    System.out.println("\n\t1. \"Yeah, tell me a bit about this place!\" \n\t2. \"Yeah, see you around!\"");
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
      System.out.println("(You have a basic convo with him.)");
    }
    else {
      _character.updateTree(1);
      System.out.println("(You never interact with him again.) IT'S OVER.");
      _character.setOver(true);
    }
  }

}
