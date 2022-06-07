/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s1c7 extends TreeNode {

  public BS3s1c7(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    System.out.println("[Brad opens his car door for you. You get out and walk to your front door]");
    System.out.println("\n\t1. \"Thank you Brad! Hanging out with you was a lot of fun. See you.\" \n\t2. \"(Walk back to him and kiss him goodbye. But ask first)\"");
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
      System.out.println("[You will see him again, this time at the movies.]");
      return _character.updateTree(0);
    }
    else {
      System.out.println("(Brad is stunned but quickly regains his composure)");
      System.out.println("BRAD: Damn that was snazzy. Wanna do it again?");
      System.out.println("Brad has fallen for you. YOU WIN!");
      _character.setFallen(true);
      return _character.updateTree(1);
    }
  }

}
