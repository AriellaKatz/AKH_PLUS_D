/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s2c4 extends TreeNode {

  public BS3s2c4(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(new BS3s2c6(character, player));
    _childrenLikeChanges.add(-57);
    _childrenLikeChanges.add(5);
    _character = character;
  }

  public boolean interact() {
    type("BRAD: What's Dee's?");
    type("\n\t1. \"DEEZ NUTZ\" \n\t2. \"It’s a really good nut shop. My favorite that they sell is pecans. Growing up I would always go with my grandfather and now it’s my only memory of him that I have left. I just miss him so much sometimes. And my grandma has been so sad and quiet since he passed. I just wish we could all see him one last time. There’s so much I didn’t say to him because I thought I had time but now I realize that I have to say what I want to say as soon as I think about it because I don’t want to miss my chance like I did with him. \033[3mYou start crying\033[0m Brad, I want us to be official. I want everyone to know that you're my man and nobody can go between us. \"");
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
      type("Sorry, Brad just can't handle what a catch you are. IT'S OVER.");
      return _character.updateTree(0);
    }
    else {
      return _character.updateTree(1);
    }
  }

}
