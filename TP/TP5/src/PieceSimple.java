public class PieceSimple extends PieceComposante {

    private int _prix;
    public PieceSimple(String libelle, int prix) {
        super(libelle, prix);
    }
    public int get_prix() {
        return _prix;
    }
    public void set_prix(int prix) {
        _prix = prix;
    }
}
