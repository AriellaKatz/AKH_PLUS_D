/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-26
*/

import java.util.ArrayList;
public class Player{

  private ArrayList<Charactar> _rank;
  private String _name;
  private boolean _hasFriend;
  private boolean _dead;

  public Player() {
    _rank = new ArrayList<Charactar>();
    _name = "notYet";
    _hasFriend = false;
  }

  public void sortRank() {
   ArrayList<Charactar> temp = new ArrayList<Charactar>();
   int k = 0;
   while (_rank.size() > 0) {
     k = 0;
     for (int i = 0; i < _rank.size(); i++) {
       if (_rank.get(i).getAttraction() > _rank.get(k).getAttraction()) {
         k = i;
       }
     }
     temp.add(_rank.get(k));
     _rank.remove(k);
   }
   _rank = temp;
  }

  public ArrayList<Charactar> getRank() {
    return _rank;
  }

  public void addToRank(Charactar character) {
    _rank.add(character);
  }

  // Accessor for _name
  public String getName() {
    return _name;
  }

  // Changes _name
  public String setName(String name) {
    String old = _name;
    _name = name;
    return old;
  }

  public boolean hasFriend() {
    return _hasFriend;
  }

  // Accessor for _dead
  public boolean isDead(){
    return _dead;
  }

  // Changes _dead
  public boolean die() {
    _dead = true;
    return _dead;
  }

}
