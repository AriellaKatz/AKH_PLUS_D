/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/
import java.util.ArrayList;
import java.util.Scanner;

public class JS2s1c3 extends TreeNode {

  public JS2s1c3(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(2);
    _childrenLikeChanges.add(5);
    _character = character;
  }

  public boolean interact() {
    type("JESSICA: Aww! Glad you did. Did you see me cheer? Was I good?");
    type("\n\t1. \"Of course, you were great.\"");
    type("Enter \"1\"");
    Scanner i = new Scanner(System.in);
    String choice = i.nextLine().trim();
    while (!choice.equals("1")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanner i2 = new Scanner(System.in);
      choice = i2.nextLine().trim();
    }
    type("JESSICA: I smiled for you!");
    _character.changeAttraction(3);

    type("\n\t1. \"Oh? I didn't see.\" \n\t2. \"Yes, you looked very pretty.\"");
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
      type("(Jessica pouts but tries to hide it.)");
      type("(You part ways... to meet again?)");
      return _character.updateTree(0);
    }
    else {
      type("(You part ways... to meet again?)");
      return _character.updateTree(1);
    }
  }

}
