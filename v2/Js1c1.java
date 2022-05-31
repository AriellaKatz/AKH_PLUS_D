/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
//touch hair
import java.util.ArrayList;

public class Js1c1 extends TreeNode {

  public Js1c1(Character character) {
    super(); //calls TreeNode();
    _children.add(new Js1c2(character));
    _children.add(new Js1c3(character));
    _likeChange = 0;
    _character = character;
  }

  public void interact() {

  }

}
