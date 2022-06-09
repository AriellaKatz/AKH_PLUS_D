/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/
import java.util.ArrayList;

public class JS2s2c1 extends TreeNode {

  public JS2s2c1(Charactar character, Player player) {
    super(character, player);
    _children.add(new JS2s2c2(character, player));
    _children.add(null);
    _childrenLikeChanges.add(0); //5
    _childrenLikeChanges.add(0); //-3
    _character = character;
  }

  public boolean interact() {
    type("(A group of pretty girls approach you, giggling.)");
    type("GIRLS: Yo! Jessica wants you to sit at our table. Wanna come?");
    type("\n\t1. \"Yea, sure.\" \n\t2. \"Oh I'm good. I'll eat somewhere else.\"");
    type("Enter \"1\" or \"2\".");
    Scanny in = new Scanny(_character, _player);
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny(_character, _player);
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      type("(The girls sweep you away.)");
      return _character.updateTree(0);
    }
    else {
      type("(You turn around and walk away before you can see their reactions.)");
      return _character.updateTree(1);
    }
  }

}
