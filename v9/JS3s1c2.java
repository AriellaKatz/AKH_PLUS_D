/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/
import java.util.ArrayList;

public class JS3s1c2 extends TreeNode {

  public JS3s1c2(Charactar character, Player player) {
    super(character, player);
    _children.add(new JS3s1c5(character, player ));
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
  }

  public boolean interact() {
    type("JESSICA: Ohhh so you like me...");
    type("\n\t1. \"Yeah, and you like me back.\" \n\t2. \"I guess...\"");
    type("Enter \"1\", \"2\", or \"3\".");
    Scanny in = new Scanny(_character, _player);
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny(_character, _player);
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      return _character.updateTree(0);
    }
    else {
      type("JESSICA: Aw you're so cute.");
      type("Sorry, you've been friendzoned. IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(1);
    }

  }

}
