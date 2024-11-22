public class TestComposite {
    public static void main(String[] args) {
        PieceCompose patesBolo = new PieceCompose("Pates Bolo", 0);
        PieceSimple pates = new PieceSimple("Pates", 2);
        PieceCompose sauceBolo = new PieceCompose("Sauce Bolo", 0);
        PieceSimple viandeHachee = new PieceSimple("Viande Hachee", 2);
        PieceCompose sauceTomate = new PieceCompose("Sauce Tomate", 0);
        PieceSimple tomate = new PieceSimple("Tomate", 1);
        PieceSimple assaisonnement = new PieceSimple("Assaisonnement", 1);

        sauceTomate.ajouterPiece(tomate);
        sauceTomate.ajouterPiece(assaisonnement);
        sauceBolo.ajouterPiece(viandeHachee);
        sauceBolo.ajouterPiece(sauceTomate);
        patesBolo.ajouterPiece(pates);
        patesBolo.ajouterPiece(sauceBolo);

        System.out.println(assaisonnement.toString());
        System.out.println("Prix de la Sauce Bolo: " + sauceBolo.get_prix());
        System.out.println("Prix de la Sauce Tomate: " + sauceTomate.get_prix());
        System.out.println("Prix total des Pates Bolo: " + patesBolo.get_prix());
        System.out.println(patesBolo.toString());
    }
}
