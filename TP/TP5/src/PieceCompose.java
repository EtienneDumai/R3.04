import java.util.ArrayList;

public class PieceCompose extends PieceComposante {
    private ArrayList<PieceComposante> _listePieces = new ArrayList<>();

    public PieceCompose(String libelle, int prix) {
        super(libelle, prix);
        set_prix(0); // Ensure initial price is zero
    }

    @Override
    public int get_prix() {
        int prixTotal = 0;
        for (PieceComposante piece : _listePieces) {
            prixTotal += piece.get_prix();
        }
        return prixTotal;
    }

    @Override
    public void set_prix(int prix) {
        this._prix = prix; // Directly set price when explicitly called
    }

    public ArrayList<PieceComposante> get_listePieces() {
        return _listePieces;
    }

    public void set_listePieces(ArrayList<PieceComposante> listePieces) {
        this._listePieces = listePieces;
        set_prix(get_prix()); // Update the price whenever the list changes
    }

    public boolean ajouterPiece(PieceComposante piece) {
        boolean added = _listePieces.add(piece);
        if (added) {
            set_prix(get_prix()); // Automatically recalculate the price
        }
        return added;
    }

    public boolean retirerPiece(PieceComposante piece) {
        boolean removed = _listePieces.remove(piece);
        if (removed) {
            set_prix(get_prix()); // Automatically recalculate the price
        }
        return removed;
    }

    public boolean existePiece(PieceComposante piece) {
        return _listePieces.contains(piece);
    }
}
