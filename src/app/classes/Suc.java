package app.classes;

import java.util.Scanner;

public class Suc extends Bautura {
    private int _carbogazos;
    public Suc()
    {
           super();
    }
    public Suc(String nume,float pret,String cantitate,int carbogazos)
    {
        super(nume,pret,cantitate);
        set_carbogazos(carbogazos);
    }
    public void set_nume(String nume)
    {
        super.set_nume(nume);
    }
    public void set_pret(float pret)
    {
        super.set_pret(pret);
    }
    public void  set_cantitate(String cantitate)
    {
        super.set_cantitate(cantitate);
    }
    public void set_carbogazos(int carbogazos)
    {
        _carbogazos=carbogazos;
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
    public int get_carbogazos()
    {
        return _carbogazos;
    }
    public void este_carbogazos()
    {
        if(_carbogazos==0)
        {
            System.out.println("Sucul nu este carbogazos!");
        }
        else  System.out.println("Sucul este carbogazos!");
    }
    @Override
    public String toString()
    {
        return super.toString() + "\nCarbogazos: " + _carbogazos;
    }
    public Suc[] instantiereBauturi(Suc[] sucuri,Scanner sc, int nr)
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
            System.out.println("Carbogazos: ");
            int c = sc.nextInt();
            sucuri[i] = new Suc(st,f,s,c);
        }
        for (int i = 0; i < nr; ++i) {
            System.out.println("Nume: " + sucuri[i].get_nume());
            System.out.println("Pret: " + sucuri[i].get_pret());
            System.out.println("Cant: " + sucuri[i].get_cantitate());
            sucuri[i].este_carbogazos();
            System.out.println(sucuri[i].toString());
        }
        return sucuri;
    }
    public float notadePlata(Suc [] sucuri,Persoana p, float total,int nr) {
        for (int i = 0; i < nr; ++i) {
            total = total + sucuri[i].get_pret();
        }
        return total;

    }
}
