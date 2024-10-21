import java.util.ArrayList;

public class PieceCompose extends PieceComposante {
    private int _prix;
    private ArrayList<PieceComposante> _listePieces;
    public PieceCompose(String libelle, int prix) {
        super(libelle, prix);
    }
    public int get_prix() {
        return _prix;
    }
    public void set_prix(int prix) {
        _prix = prix;
    }
    public ArrayList<PieceComposante> get_listePieces(){
        return _listePieces;
    }
}
