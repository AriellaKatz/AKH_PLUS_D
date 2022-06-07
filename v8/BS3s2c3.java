/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s2c3 extends TreeNode {

  public BS3s2c3(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    System.out.println("BRAD: Yoooo. Bro, I don't think you're mid either. I didn't realize you felt the same.");
    System.out.println("\n\t1. \"Well I do. (Passionately kiss him)\" \n\t2. \"Jk, you clapped.\"");
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
      System.out.println("(Brad is stunned but quickly regains his composure)");
      System.out.println("BRAD: Damn that was snazzy. Wanna do it again?");
      _character.setFallen(true);
      return _character.updateTree(0);
    }
    else {
      System.out.println("(Brad gives you a ????? face and leaves silently.)");
      System.out.println("Your relationship will not recover. IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
