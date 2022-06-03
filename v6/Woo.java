/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-26
*/

import java.util.ArrayList;

public class Woo {

  private Player _player;
  private Jessica _jessica;
  private Richard _richard;
  private Brad _brad;
  private boolean _gameOver;

  public Woo(){
    _player = new Player();
    _gameOver = false;
// characters will be instaniated after get to know you method (they start out)
// with certain attraction levels
  }

  public void introduction() {
    // Welcome Message
    System.out.println("Welcome to: ");
    new ImageOpen("logo2.jpg");

    // Introductions
    for (int i = 0; i < 3; i++) {
      String s = "Meet " + _player.getRank().get(i).getName() + ": " + _player.getRank().get(i).getDescrip();
      type(s);
      delay(1000);
    }

    int startingAttraction = 0;
    String s = "Tell us a bit about yourself.";
    type(s);
    Scanny in = new Scanny();
    String intro = in.toString().trim().toLowerCase();
    s = "Great... let's get started!";
    type(s);
    if (intro.indexOf("smart") != -1) {
      startingAttraction ++;
    }
    if (intro.indexOf("sweet") != -1) {
      startingAttraction ++;
    }
    if (intro.indexOf("funny") != -1) {
      startingAttraction ++;
    }
    if (intro.indexOf("hot") != -1
    || intro.indexOf("pretty") != -1) {
      startingAttraction ++;
    }
    if (intro.indexOf("gamer") != -1
    || intro.indexOf("gaming") != -1) {
      startingAttraction -= 10;
    }
    if (intro.indexOf("comp sci") != -1
    || intro.indexOf("compsci") != -1
    || intro.indexOf("cs") != -1
    || intro.indexOf("coding") != -1
    || intro.indexOf("programming") != -1) {
      startingAttraction -= 10;
    }

    _jessica = new Jessica(startingAttraction);
    _richard = new Richard(startingAttraction);
    _brad = new Brad(startingAttraction);

  }

/*  public void play(){
    String s = "";

    if (_jessica.isOver() && _richard.isOver() && _brad.isOver()) {
      _gameOver = true;
      s = "You've struck out with ALL of them. GAME OVER.";
      type(s);
    }
    else {

    }

  } */

  public int probeTree(Character character){
    int option = 0;
    int bestLike = Integer.MIN_VALUE;
    for (int i = 0; i < character.getStage().get(0).getChildren().size(); i++) {
      int like = probeTreeHelper(character.getStage().get(0).getChildren().get(i));
      if (like > bestLike) {
        bestLike = like;
        option = i;
      }
    }
    return option+1;
  }

  public int probeTreeHelper(TreeNode node) {
    if (node.getChildren().size() == 0) {
      return node.getLikeChange();
    }
    else {
      int bestLike = Integer.MIN_VALUE;
      for (int i = 0; i < node.getChildren().size(); i++) {
        int like = probeTreeHelper(node.getChildren().get(i));
        if (like > bestLike) {
          bestLike = like;
        }
      }
      return node.getLikeChange() + bestLike;
    }
  }

  //to print stuff so it looks like it's being typed out
  public static void type(String s){
    String punc = ",.?!-";
    for(int i = 0; i < s.length(); i++){
      System.out.print(s.charAt(i));
      if (punc.indexOf(s.charAt(i)) >= 0) {
        delay(300);
      }
      else {
        delay(35);
      }
    }
    System.out.println("");
  }
  // Built in delay
  public static void delay(int milliseconds) {
    long beginTimer = System.currentTimeMillis();
    while (System.currentTimeMillis() - beginTimer < milliseconds) {
      continue;
    }
  }

  public static void main(String[] args) {
    Woo game = new Woo();
    game.introduction();
  //  game.play();
  }

}
