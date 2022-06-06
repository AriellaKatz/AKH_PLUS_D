/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s1c6 extends TreeNode {

  public BS3s1c6(Character character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("BRAD: Morning! I made eggs.");
    System.out.println("\n\t1. \"Oh thank you! I have to go now. It was really fun!\" \n\t2. \"(TAKE YOUR CHANCE and kiss him good morning. But ask him first)\"");
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
    }
    else {
      _character.updateTree(1);
      System.out.println("(Brad is stunned but quickly regains his composure)");
      System.out.println("BRAD: Damn that was snazzy. Wanna do it again?")
      _character.setFallen(true);
    }
  }

}
