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
  _rank.add(new Brad(this));
  _rank.add(new Jessica(this));
  _rank.add(new Richard(this));
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
      s++;
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
