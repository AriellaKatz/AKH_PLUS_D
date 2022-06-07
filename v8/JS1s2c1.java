/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS1s2c1 extends TreeNode {

  public JS1s2c1(Charactar character) {
    super();
    _children.add(null); //option 1 leads to the end of the scene
    _children.add(new JS1s2c2(character));
    _children.add(new JS1s2c2(character)); //options 2 and 3 lead to the same thing but w diff likeChanges
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(-3);
    _childrenLikeChanges.add(7);
    _character = character;
  }

  public void interact() {
    System.out.println("JESSICA: You wanna come to the football game Thursday? I'll be cheering.");
    System.out.println("\n\t1. \"Sorry I hate football\" \n\t2. \"Oh, sure! I'll bring my friend.\" \n\t3. \"Yes! I'll be your cheerleader.\""); // ofc ill be cheering you on
    System.out.println("Enter \"1\", \"2\" or \"3\".");
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
      System.out.println("(You skip the football game.)");
    }
    else if (input == 2) {
      _character.updateTree(1);
    }
    else {
      _character.updateTree(1);
    }
  }

}
