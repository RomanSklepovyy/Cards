package com.task3.carddeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Deck
{
    ArrayList<Card> cards = new ArrayList<Card>();

    public Deck() {

        for (int i = 0; i < Suit.values.length; i++)
        {
            for (int j = 0; j < Rank.values.length; j++) {
                cards.add(new Card(Rank.values[j], Suit.values[i]));
            }
        }
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /* * Впорядкування колоди за мастями та значеннями
     * Порядок сотрування:
     * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
     * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
     * Наприклад
     * HEARTS Ace
     * HEARTS King
     * HEARTS Queen
     * HEARTS Jack
     * HEARTS 10
     * HEARTS 9
     * HEARTS 8
     * HEARTS 7
     * HEARTS 6
     * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order()
    {
       Collections.sort(cards, Card.compareBySuitAndRank);
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {

        if (cards.size() > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {

        if (hasNext())
        {
            Card card = cards.get(cards.size()-1);
            cards.remove(card);
            return card;
        }

        return null;
    }

    public void ShowConsoleDeck()
    {
        System.out.println("\n------------------------------------------------------");
        for (int i = 0; i < cards.size(); i++)
        {
            System.out.println((i+1) + ") " + cards.get(i).toString());
        }
    }

}
