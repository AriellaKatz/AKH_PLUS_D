/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s2c3 extends TreeNode {

  public JS2s2c3(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    System.out.println("(The cheerleaders stifle their laughter and smile in your direction. Jessica rolls her eyes at them.)");
    System.out.println("JESSICA: They just think you're kind of cute. So do I.");
    System.out.println("\n\t1. \"(Smile and laugh)\" \n\t2. \"(Stare at them blankly. You are confused.)\"");
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
      System.out.println("(They laugh as they make space for you to sit with them. You take a seat.)");
      return _character.updateTree(0);
    }
    else {
      System.out.println("(The cheerleaders look at each other. You sit down but no one speaks.)");
      System.out.println("(It's really awkward. You finish your food and wish you'd stayed away from their table.)");
      return _character.updateTree(1);
    }
  }

}
