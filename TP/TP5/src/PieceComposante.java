abstract public class PieceComposante {
    protected String _libelle;
    protected int _prix;
    abstract public int get_prix() ;

    abstract public void set_prix(int prix) ;
    public String get_libelle() {
        return _libelle;
    }
    public void set_libelle(String libelle) {
        _libelle = libelle;
    }
    public PieceComposante(String libelle, int prix) {
        _libelle = libelle;
        _prix = prix;
    }
    public String toString() {
        return "Libelle: " + get_libelle() + " Prix: " + get_prix();
    }
}
