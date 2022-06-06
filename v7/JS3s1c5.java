/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS3s1c5 extends TreeNode {

  public JS3s1c5(Character character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("(Jessica raises her eyebrows, blushes.)");
    System.out.println("\n\t1. KISS HER (with consent of course) \n\t2. Be a coward, pretend like nothing's happening.");
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
      _character.updateTree(0);
      System.out.println("Jessica's fallen for you! YOU WIN!");
      _character.setFallen(true);
    }
    else {
      _character.updateTree(1);
      System.out.println("You two are cute friends. Maybe you'll have something together in the future, but for the rest of this game, friends you'll remain.");
      _character.setOver(true);
    }
  }

}
