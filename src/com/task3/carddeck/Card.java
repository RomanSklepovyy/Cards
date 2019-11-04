package com.task3.carddeck;

import java.util.Arrays;
import java.util.Comparator;

public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public static Comparator<Card> compareBySuitAndRank = new Comparator<Card>() {
        public int compare(Card card1, Card card2) {

            int value1 = Integer.compare(Arrays.asList(Suit.values).indexOf(card1.getSuit()), Arrays.asList(Suit.values).indexOf(card2.getSuit()));

            if (value1 == 0) {
                int value2 = Integer.compare(Arrays.asList(Rank.values).indexOf(card1.getRank()), Arrays.asList(Rank.values).indexOf(card2.getRank()));;
                return value2;
            }

            return value1;
        }
    };

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + suit.getName() +
                ", suit=" + rank.getName() +
                '}';
    }
}

