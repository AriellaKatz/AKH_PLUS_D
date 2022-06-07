/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS3s1c4 extends TreeNode {

  public JS3s1c4(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    System.out.println("JESSICA: Prove it.");
    System.out.println("\n\t1. \"I'll date you if that's what you want.\" \n\t2. \"No, I've changed my mind. Give me my ice cream back.\"");
    System.out.println("Enter \"1\" or \"2\"");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      System.out.println("JESSICA: (Rolls her eyes jokingly, smiles) \"Fiiine.\"");
      System.out.println("Jessica's fallen for you! YOU WIN!");
      _character.setFallen(true);
      return _character.updateTree(0);
    }
    else {
      System.out.println("You two are cute friends. Maybe you'll have something together in the future, but for the rest of this game, friends you'll remain.");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
