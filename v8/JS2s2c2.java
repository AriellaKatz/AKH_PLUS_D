/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s2c2 extends TreeNode {

  public JS2s2c2(Charactar character) {
    super();
    _children.add(null);
    _children.add(new JS2s2c3(character));
    _childrenLikeChanges.add(0); //0
    _childrenLikeChanges.add(0); //6
    _character = character;
  }

  public boolean interact() {
    System.out.println("(You arrive at the table.)");
    System.out.println("JESSICA: Hiiii. These are my teammates aka my besties. The tall one is Charlotte. The peppy one over there is Keria...");
    System.out.println("(The girls introduce themselves.)");
    System.out.println("\n\t1. \"Hey. It's nice to meet you guys.\"");
    System.out.println("Enter \"1\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      choice = in2.toString().trim();
    }
    System.out.println("(The cheerleaders whisper amongst themselves.)");

    System.out.println("\n\t1. \"(Ignore it.)\" \n\t2. \"Heard my name. You guys talking about me?\"");
    System.out.println("Enter \"1\" or \"2\".");
    in = new Scanny();
    choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      choice = in2.toString().trim();
    }

    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      return _character.updateTree(0);
    }
    else {
      return _character.updateTree(1);
    }
  }

}
