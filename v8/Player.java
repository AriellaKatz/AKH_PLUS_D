/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-26
*/

import java.util.ArrayList;
public class Player{

private ArrayList<Charactar> _rank;
private final ArrayList<Charactar> _order;
private String _name;
private boolean _hasFriend;

public Player() {
  _rank = new ArrayList<Charactar>();
  _rank.add(new Brad());
  _rank.add(new Jessica());
  _rank.add(new Richard());
  _order = new ArrayList<Charactar>();
  _order.add(_rank.get(0));
  _order.add(_rank.get(1));
  _order.add(_rank.get(2));
  _name = "notYet";
}

//QSort Things (sorts in descending order)
public void sortRank() {
  qSort(0, _rank.size()-1);
}
private void qSort(int loPos, int hiPos) {
  if (loPos == hiPos) { return; }
  else {
    int s = partition(loPos, hiPos);
    qSort(s, hiPos);
    if (s != 0) {
      qSort(loPos, s-1);
    }
  }
}
private int partition(int loPos, int hiPos) {
  int v = _rank.get(hiPos).getAttraction();
  int s = loPos;
  for (int i = loPos; i < hiPos; i++) {
    if (_rank.get(i).getAttraction() >= v) {
      swap(i, s);
      s++;public int probeTree(){
    int option = 0;
    int bestLike = Integer.MIN_VALUE;
    for (int i = 0; i < _currentStage.get(0).getChildren().size(); i++) {
      int like = probeTreeHelper(_currentStage.get(0).getChildren().get(i));
      if (like > bestLike) {
        bestLike = like;
        option = i;
      }
    }
    double chance = Math.random();
    //2/3 of the time gives good advice
    if (chance < 0.66) {
      return option+1; //+1 b/c when the player sees their list of options, it starts at 1, not 0, but option is the index of the array
    }
    //1/3 of the time gives bad advice
    else {
      if (option == 0) { return 2; }
      else { return option; }
    }
  }
    }
  }
  swap(s, hiPos);
  return s;
}
private void swap(int x, int y) {
  Charactar tmp = _rank.get(x);
  _rank.set(x, _rank.get(y));
  _rank.set(y, tmp);
}

public boolean hasFriend() {
  return _hasFriend;
}

/*public void sortRank() {
 ArrayList<Charactar> temp = new ArrayList<Charactar>();
 int k = 0;
 while (_rank.size() > 0) {
   for (int i = 0; i < _rank.size(); i++) {
     k = 0;
     if (_rank.get(i).getAttraction() > _rank.get(k).getAttraction()) {
       k = i;
     }
   }
   temp.add(_rank.get(k));
   _rank.remove(k);
 }
 _rank = temp;
}*/

public ArrayList<Charactar> getRank() {
  return _rank;
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

//sorts the characters based on how much they like the protagonist (likeabliity)
// public void sortRank(){
//
// }

}
