/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s1c6 extends TreeNode {

  public JS2s1c6(Character character) {
    super();
    _children.add(null);
    _children.add(new JS2c1c7(character));
    _children.add(new JS2c1c7(character));
    _childrenLikeChange.add(0);
    _childrenLikeChange.add(0);
    _childrenLikeChange.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("JESSICA: Then why are you ignoring me?");
    System.out.println("\n\t1. \"Oh ummm...\" \n\t2. \"I'm not, I'm not!\" \n\t3. \"(Get flustered)\"");
    System.out.println("Enter \"1\", \"2\" or \"3\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      String choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      _character.updateTree(0);
      System.out.println("Oh I see how it is. I was going to ask you to link again if you wanted to, but I guess not.");
    }
    else if (input == 2) {
      _character.updateTree(1);
    }
    else {
      _character.updateTree(2);
    }
  }

}
