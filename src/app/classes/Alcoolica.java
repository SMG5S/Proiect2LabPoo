package app.classes;

import java.util.Scanner;

public class Alcoolica extends Bautura {
    private int _alcool;
    public Alcoolica()
    {
        super();
    }
    public Alcoolica(String nume,float pret,String cantitate,int alcool)
    {
        super(nume,pret,cantitate);
        set_alcool(alcool);
    }
    public void set_nume(String nume)
    {
        super.set_nume(nume);
    }
    public void set_pret(float pret)
    {
        super.set_pret(pret);
    }
    public void set_cantitate(String cantitate)
    {
        super.set_cantitate(cantitate);
    }
    public void set_alcool(int alcool)
    {
        _alcool = alcool;
    }
    public String get_nume()
    {
        return super.get_nume();
    }
    public float get_pret()
    {
        return super.get_pret();
    }
    public String get_cantitate()
    {
        return super.get_cantitate();
    }
    public int get_alcool()
    {
        return _alcool;
    }
    public void este_alcoolica()
    {
        if(_alcool==0)
        {
            System.out.println("Bautura nu este alcoolica!");
        }
        else  System.out.println("Bautura este alcoolica!");
    }
    public Alcoolica[] instantiereBauturi(Alcoolica[] bauturi_alcoolice,Scanner sc, int nr)
    {
        for (int i = 0; i < nr; ++i) {
            sc.nextLine();
            System.out.println("Nume: ");
            String st = sc.nextLine();
            System.out.println("Pret: ");
            float f = sc.nextFloat();
            sc.nextLine();
            System.out.println("Cantitate: ");
            String s = sc.nextLine();
            System.out.println("Alcool: ");
            int c = sc.nextInt();
            bauturi_alcoolice[i] = new Alcoolica(st,f,s,c);
        }
        for (int i = 0; i < nr; ++i) {
            System.out.println("Nume: " + bauturi_alcoolice[i].get_nume());
            System.out.println("Pret: " + bauturi_alcoolice[i].get_pret());
            System.out.println("Cant: " + bauturi_alcoolice[i].get_cantitate());
            System.out.println("Alcool: " + bauturi_alcoolice[i].get_alcool());
            bauturi_alcoolice[i].este_alcoolica();
            System.out.println(bauturi_alcoolice[i].toString());
        }
        return bauturi_alcoolice;
    }
    public float notadePlata(Alcoolica[] bauturi_alcoolice,Persoana p, float total,int nr) {
        for (int i = 0; i < nr; ++i) {
            total = total + bauturi_alcoolice[i].get_pret();
        }
        return total;
    }
    @Override
    public String toString()
    {
        return super.toString()+ "\nAlcool: " + _alcool;
    }
}
