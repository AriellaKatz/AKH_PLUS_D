/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s1c4 extends TreeNode {

  public BS3s1c4(Charactar character) {
    super();
    _children.add(null);
    _children.add(new BS3s1c7(character));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("BRAD: I can drive you, if you want.");
    System.out.println("\n\t1. \"I've got it, thanks.\" \n\t2. \"Oooo, yes please. And thank you/\"");
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
      System.out.println("[Brad's smile falls and his heart breaks from your rejection. IT'S OVER.]");
      _character.setOver(true);
    }
    else {
      _character.updateTree(1);
    }
  }

}
