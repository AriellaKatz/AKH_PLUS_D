/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s1c5 extends TreeNode {

  public JS2s1c5(Character character) {
    super();
    _children.add(new JS2s1c6(character));
    _children.add(null);
    _childrenLikeChange.add(0);
    _childrenLikeChange.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("JESSICA: Hey! Hello?");
    System.out.println("\n\t1. \"Hi.\"");
    System.out.println("Enter \"1\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      String choice = in2.toString().trim();
    }
    System.out.println("Do you hate me or something?");
    System.out.println("\n\t1. \"No. Why would I?\" \n\t2. \"Yes.\"");
    System.out.println("Enter \"1\" or \"2\".");

    in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      String choice = in2.toString().trim();
    }

    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      _character.updateTree(0);
    }
    else {
      _character.updateTree(1);
      System.out.println("JESSICA: Oh. Ummm. Sorry? I'll go.");
    }
  }

}
