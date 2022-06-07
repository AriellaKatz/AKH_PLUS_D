/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s1c5 extends TreeNode {

  public BS3s1c5(Charactar character) {
    super();
    _children.add(null);
    _children.add(new BS3s1c6(character));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    System.out.println("(Kiss him goodnight? But ask him first.)");
    System.out.println("\n\t1. \"Yes\" \n\t2. \"No\"");
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
      System.out.println("Brad has fallen for you. YOU WIN!");
      _character.setFallen(true);
      return _character.updateTree(0);
    }
    else {
      return _character.updateTree(1);
    }
  }

}
