/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS2s1c3 extends TreeNode {

  public BS2s1c3(Charactar character) {
    super();
    _children.add(new BS2s1c4(character));
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    System.out.println("BRAD: Man, you don't have to wait! You can come over again. Just you.");
    System.out.println("\n\t1. \"No thanks.\" \n\t2. (Be awkward.) \n\t3. \"I'd love to! When?\"");
    System.out.println("Enter \"1\", \"2\", or \"3\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      return _character.updateTree(0);
    }
    else if (input == 2) {
      System.out.println("BRAD: Dope! Let's do Friday.");
      System.out.println("[You will see him on Friday!]");
      return _character.updateTree(1);
    }
    else {
      System.out.println("BRAD: Dope! Let's do Friday.");
      System.out.println("[You will see him on Friday!]");
      return _character.updateTree(2);
    }
  }

}
