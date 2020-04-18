package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTest {
public static void main(String[] args) {
	
	//Create 3 objects of different card and store them into LinkedList.
	//Using for loop/advanced for loop/ iterator access all methods of the class.
LinkedList<Card> cards=new LinkedList<>();
cards.add(new ABank("Bank of America "));
cards.add(new Suntrust("SunTrust "));
cards.add(new WellsFargo("Wells Fargo "));

for(int i=0;i<cards.size();i++) {
	cards.get(i).Apply();
	cards.get(i).CancelCard();
}
for (Card card:cards) {
	card.Apply();
	card.CancelCard();
}
Iterator<Card> list=cards.iterator();
list.hasNext();
list.next().CancelCard();
list.next().Apply();
}
}
