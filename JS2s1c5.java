/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s1c5 extends TreeNode {

  public JS2s1c5(Charactar character) {
    super();
    _children.add(new JS2s1c6(character));
    _children.add(null);
    _childrenLikeChanges.add(5);
    _childrenLikeChanges.add(-12);
    _character = character;
  }

  public boolean interact() {
    type("JESSICA: Hey! Hello?");
    type("\n\t1. \"Hi.\"");
    type("Enter \"1\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      choice = in2.toString().trim();
    }


    type("JESSICA: Do you hate me or something?");
    type("\n\t1. \"No. Why would I?\" \n\t2. \"Yes.\"");
    type("Enter \"1\" or \"2\".");
    _character.changeAttraction(4);
    System.out.println("JESSICA: Do you hate me or something?");
    System.out.println("\n\t1. \"No. Why would I?\" \n\t2. \"Yes.\"");
    System.out.println("Enter \"1\" or \"2\".");
    in = new Scanny();
    choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      choice = in2.toString().trim();
    }

    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      return _character.updateTree(0);
    }
    else {
      type("JESSICA: Oh. Ummm. Sorry? I'll go.");
      type("Why so salty? Jessica hates you too. IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
