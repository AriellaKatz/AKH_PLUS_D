/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/
import java.util.ArrayList;

public class JS3s1c1 extends TreeNode {

  public JS3s1c1(Charactar character, Player player) {
    super(character, player);
    _children.add(new JS3s1c2(character, player));
    _children.add(new JS3s1c3(character, player));
    _children.add(null);
    _childrenLikeChanges.add(10);
    _childrenLikeChanges.add(9);
    _childrenLikeChanges.add(-120);
  }

  public boolean interact() {
    type("(You and Jessica are walking together.)");
    type("\n\t1. Ask her on a date. \n\t2. Give her your ice cream cone. \n\t3. Why are you walking with her? Walk away and never speak to her again.");
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
    else if (input == 2) {
      return _character.updateTree(1);
    }
    else {
      type("That's one way to end a relationship. IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(2);
    }
  }

}
