package app.classes;

import java.util.Scanner;
public class Bar {
    private int _numarul_de_bauturi;
    private Bautura[] _bauturi;

    public Bar(int numarul_de_bauturi) {
        _numarul_de_bauturi = numarul_de_bauturi;
    }
    public void set_numarul_de_bauturi(int numarul_de_bauturi)
    {
        _numarul_de_bauturi = numarul_de_bauturi;
    }
    public int get_numarul_de_bauturi()
    {
        return _numarul_de_bauturi;
    }
    public void set_bauturi() {
        _bauturi = new Bautura[_numarul_de_bauturi];
    }
    public Bautura[] get_bauturi()
    {
        return _bauturi;
    }
    public void instantiereBauturi(Scanner sc) {
        for (int i = 0; i < _numarul_de_bauturi; ++i) {
            System.out.println("Nume: ");
            String st = sc.nextLine();
            System.out.println("Pret: ");
            float f = sc.nextFloat();
            sc.nextLine();
            System.out.println("Cantitate: ");
            String s = sc.nextLine();
            _bauturi[i] = new Bautura(st, f, s);
        }
        for (int i = 0; i < _numarul_de_bauturi; ++i) {
            System.out.println("Nume: " + _bauturi[i].get_nume());
            System.out.println("Pret: " + _bauturi[i].get_pret());
            System.out.println("Cant: " + _bauturi[i].get_cantitate());
            System.out.println(_bauturi[i].toString());
        }
    }

    public float notadePlata(Persoana p, float total,int nr) {
        for (int i = 0; i < nr; ++i) {
            total = total + _bauturi[i].get_pret();
        }
        //System.out.println("Nota de plata este in valoare de " + total + " lei");
        return total;

    }
}

