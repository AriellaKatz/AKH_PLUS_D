/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s2c1 extends TreeNode {

  public BS3s2c1(Charactar character) {
    super();
    _children.add(new BS3s2c2(character));
    _children.add(new BS3s2c3(character));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    System.out.println("[You and Brad are sitting next to each other in the movie theater]");
    System.out.println("BRAD: This movie is hella mid.");
    System.out.println("\n\t1. \"For real dude, I know. Let's get out of here.\" \n\t2. \"Do you know what isn't mid? You.\"");
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
      return _character.updateTree(0);
    }
    else {
      return _character.updateTree(1);
    }
  }

}
