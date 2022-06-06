/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/
import java.util.ArrayList;

public class JS2s2c1 extends TreeNode {

  public JS2s2c1(Charactar character) {
    super();
    _children.add(new JS2s2c2(character));
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("(A group of pretty girls approach you, giggling.)");
    System.out.println("GIRLS: Yo! Jessica wants you to sit at our table. Wanna come?");
    System.out.println("\n\t1. \"Yea, sure.\" \n\t2. \"Oh I'm good. I'll eat somewhere else.\"");
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
      System.out.println("(The girls sweep you away.)");
    }
    else {
      _character.updateTree(1);
      System.out.println("(You turn around and walk away before you can see their reactions.)");
    }
  }

}
