package app.classes;

import app.interfaces.IPersoana;

import java.util.Scanner;
public class Persoana implements IPersoana {
    private String _nume;
    private float _cash;
    private float _card;
    public Persoana(String nume,float cash,float card)
    {
        set_nume(nume);
        set_Cash(cash);
        set_card(card);
    }
    public void set_nume(String nume)
    {
        _nume = nume;
    }
    public void set_Cash(float cash)
    {
        _cash = cash;
    }
    public void set_card(float card)
    {
        _card = card;
    }
    public String get_nume()
    {
        return _nume;
    }
    public float get_cash()
    {
        return _cash;
    }
    public float get_card()
    {
        return _card;
    }
    @Override
    public String toString()
    {
        String r = "\nNume: " + _nume;
        r = r + "\nCash: " + _cash;
        r = r + "\nCard: " + _card;
        return r;
    }
    public void platestenotadePlata(Scanner sc, float total)
    {
        String optiuni;
        System.out.println("Cu ce doriti sa platiti plata?");
        optiuni=sc.next();
        switch(optiuni) {
            case "card":
                if(_cash<total && _card >=total)
                {
                    System.out.println("Plata a fost achitata cu cardul");
                    _card = _card - total;
                    System.out.println("Card: " + get_card());
                }
                else if(_cash>=total && _card >=total)
                {
                    System.out.println("Plata a fost achitata cu cardul");
                    _card = _card - total;
                    System.out.println("Card: " + get_card());
                }
                else
                {
                    System.out.println("Nota de plata nu a putut fi achitata!");
                    System.out.println("T: " + total);
                }
                break;
            case "cash":
                if (_card <total && _cash>=total) {
                    System.out.println("Plata a fost achitata cu bani cash");
                    _cash = _cash - total;
                    System.out.println("Cash: " + get_cash());
                }
                else if(_card >=total && _cash>=total)
                {
                    System.out.println("Plata a fost achitata cu bani cash");
                    _cash = _cash - total;
                    System.out.println("Cash: " + get_cash());
                }
                else
                {
                    System.out.println("Nota de plata nu a putut fi achitata!");
                    System.out.println("T: " + total);
                }
                break;
            case "ambele":
                if(_cash>= _card)
                {
                    System.out.println("Plata a fost achitata cu bani cash si card");
                    total=total-_cash;
                    _cash=0;
                    total=total- _card;
                    _card =0;
                    System.out.println("Total: "+ total);
                    System.out.println("Cash: " + get_cash());
                    System.out.println("Card: " + get_card());
                }
                else
                {
                    System.out.println("Plata a fost achitata cu bani cash si card");
                    total=total- _card;
                    _card =0;
                    total=total-_cash;
                    _cash=0;
                    System.out.println("Total: "+ total);
                    System.out.println("Card: " + get_card());
                    System.out.println("Cash: " + get_cash());
                }
                break;
            default:
                System.out.println("Nota de plata nu a fost achitata!");
                System.out.println("Daca nu puteti plati in urmatoarele zile atunci va trebui sa luam masuri!");
                break;
        }

    }
}
