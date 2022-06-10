/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-26
*/

import java.util.ArrayList;

public class Woo {

  private Player _player;
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
    new ImageOpen("../logo2.jpg");

    // Introductions
    for (int i = 0; i < 3; i++) {
      String s = "Meet " + _player.getRank().get(i).getName() + ": " + _player.getRank().get(i).getDescrip();
      type(s);
      delay(1000);
    }
  }

  public void play(){



  }

  public String probeTree(Character character){
    return "";
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
    game.play();
  }

}
