/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s1c3 extends TreeNode {

  public JS1s1c3(Character character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChange.add(0);
    _childrenLikeChange.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("[The cheerleaders throw sniffled laughter and smiles in your direction. Jessica rolls her eyes at them.]");
    System.out.println("JESSICA: They just think you're kind of cute. So do I.");
    System.out.println("\n\t1. \"(Smile and laugh)\" \n\t2. \"(Stare at them blankly. You are confused.)\"");
    System.out.println("Enter \"1\" or \"2\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      String choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      _character.updateTree(0);
      System.out.println("[They laugh as they make space for you to sit with them. You take a seat.]")
    }
    else {
      _character.updateTree(1);
      System.out.println("[The cheerleaders look at each other. You sit down but no one speaks.]");
    }
  }

}
