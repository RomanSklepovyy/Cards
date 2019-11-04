package com.task3.carddeck;
import java.util.Arrays;
import java.util.Comparator;
import java.lang.Integer;

public class DeckComparator implements Comparator<Card> {

    public int compare(Card card1, Card card2) {

        int value1 = Integer.compare(Arrays.asList(Suit.values).indexOf(card1.getSuit()), Arrays.asList(Suit.values).indexOf(card2.getSuit()));

        if (value1 == 0) {
            int value2 = Integer.compare(Arrays.asList(Rank.values).indexOf(card1.getRank()), Arrays.asList(Rank.values).indexOf(card2.getRank()));;
            return value2;
        }

        return value1;
    }
}