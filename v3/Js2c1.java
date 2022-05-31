/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
//invitation to game
import java.util.ArrayList;

public class Js2c1 extends TreeNode {

  public Js2c1(Character character) {
    super();
    _children.add(new Js2c2(character));
    _children.add(new Js2c3(character));
    _likeChange = 0;
    _character = character;
  }

  public void interact() {

  }

}
