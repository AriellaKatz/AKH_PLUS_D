/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;
import java.util.Scanner;

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
    type("(You arrive at the table.)");
    type("JESSICA: Hiiii. These are my teammates aka my besties. The tall one is Charlotte. The peppy one over there is Keria...");
    type("(The girls introduce themselves.)");
    type("\n\t1. \"Hey. It's nice to meet you guys.\"");
    type("Enter \"1\".");
    Scanner i = new Scanner(System.in);
    String choice = i.nextLine().trim();
    while (!choice.equals("1")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanner i2 = new Scanner(System.in);
      choice = i2.nextLine().trim();
    }
    type("(The cheerleaders whisper amongst themselves.)");

    type("\n\t1. \"(Ignore it.)\" \n\t2. \"Heard my name. You guys talking about me?\"");
    type("Enter \"1\" or \"2\".");
    Scanny in = new Scanny();
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
      return _character.updateTree(1);
    }
  }

}
