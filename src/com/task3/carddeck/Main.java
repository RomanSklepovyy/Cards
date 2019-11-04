package com.task3.carddeck;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();

        deck.ShowConsoleDeck();

        deck.shuffle();

        deck.ShowConsoleDeck();

        deck.drawOne();
        deck.drawOne();
        deck.drawOne();

        deck.order();
        deck.ShowConsoleDeck();

        for (int i = 0; i < deck.getCards().size(); i++)
        {
            System.out.println(i + ") " + deck.getCards().get(i).toString());
        }

    }
}
