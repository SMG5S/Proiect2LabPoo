package app.classes;

public class Bautura {
    private String _nume;
    private float _pret;
    private String _cantitate;
    public Bautura()
    {

    }
    public Bautura(String nume,float pret,String cantitate)
    {
        _nume=nume;
        _pret=pret;
        _cantitate=cantitate;
    }
    public void set_nume(String nume)
    {
        _nume=nume;
    }
    public void set_pret(float pret)
    {
        _pret = pret;
    }
    public void  set_cantitate(String cantitate)
    {
        _cantitate=cantitate;
    }
    public String get_nume()
    {
        return _nume;
    }
    public float get_pret()
    {
        return _pret;
    }
    public String get_cantitate()
    {
        return _cantitate;
    }
    @Override
    public String toString()
    {
        String r = "Detaliile unei bauturi: ";
        r += "\nNume: " + _nume;
        r += "\nPret: " + _pret;
        r += "\nCantitate: " + _cantitate;
        return r;
    }
}
