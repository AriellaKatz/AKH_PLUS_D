/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s2c3 extends TreeNode {

  public JS2s2c3(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(8); //8
    _childrenLikeChanges.add(-7); //-7
  }

  public boolean interact() {
    type("\033[3mThe cheerleaders stifle their laughter and smile in your direction. Jessica rolls her eyes at them.\033[0m");
    type("JESSICA: They just think you're kind of cute. So do I.");
    type("\n\t1. \033[3mSmile and laugh\033[0m \n\t2. \033[3mStare at them blankly. You are confused.\033[0m");
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
      type("\033[3mThey laugh as they make space for you to sit with them. You take a seat.\033[0m");
      return _character.updateTree(0);
    }
    else {
      type("\033[3mThe cheerleaders look at each other. You sit down but no one speaks.\033[0m");
      type("\033[3mIt's really awkward. You finish your food and wish you'd stayed away from their table.\033[0m");
      return _character.updateTree(1);
    }
  }

}
