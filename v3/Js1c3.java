/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
//hair soft :D, inv to hang
import java.util.ArrayList;

public class Js1c3 extends TreeNode {

  public Js1c3(Character character) {
    super();
    _children.add(new Js2c1(character));
    _children.add(null); //In the interact() method, if player chooses
    // option 1, it's over and player can no longer proceed w/ jessica
    _likeChange = 0;
    _character = character;
  }

  public void interact() {

  }

}
