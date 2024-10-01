/**
 * Classe : Ingredient
 *
 * @author: Lopistéguy Philippe
 * @date : jj/mm/aa
 **/
public class Ingredients {
    // ATTRIBUTS
// ATTRIBUTS de classe – NON -
// ATTRIBUTS d'instance
    private String _libelle;
    private int _quantite;

    // CONSTRUCTEURS complete la/les facon/s de creer un objet
// sans parametre => initialise les attributs par defaut
    public Ingredients() {
        _libelle = "";
        _quantite = 0;
    }

    // un parametre par attribut => affecte les attributs
    public Ingredients(String l, int q) {
        set_libelle(l);
        set_quantite(q);
    }

    // constructeur par recopie (cf. 3.a)
// => recopie/affecte les meme valeurs que celles de l'objet modele
    public Ingredients(Ingredients ingredientsModele) {
        set_libelle(ingredientsModele.get_libelle());
        set_quantite(ingredientsModele.get_quantite());
    }

    // METHODES D'ENCAPSULATION : get&set quantite, libelle
// encapsulation de _quantite ===========
    public void set_quantite(int q) {
        _quantite = q;
    }

    public int get_quantite() {
        return _quantite;
    }

    // encapsulation de _libelle ===========
    public void set_libelle(String l) {
        _libelle = l;
    }

    public String get_libelle() {
        return (_libelle);
    }

    // METHODES USUELLES : equals, toString, clone
// Dit si les attributs de l'objet courrant et ceux de l'objet
// reference par unIngredient ont les meme valeurs
    public boolean equals(Ingredients unIngredients) {
        boolean resultat; // le resultat doit etre booleen
        resultat = (get_libelle() == unIngredients.get_libelle() && get_quantite() == unIngredients.get_quantite());
        return resultat; // une fois etabli, on retourne le resultat booleen
    }

    // Solution alternative au constructeur par recopie (cf. la methode clone())
    public Ingredients dupliquer() {
        Ingredients laCopie; // declare un pointeur
        laCopie = new Ingredients(); // cree un objet sur lequel pointe laCopie
        laCopie.set_libelle(get_libelle());
        laCopie.set_quantite(get_quantite());
        return laCopie;
// tout ce code équivaut a :
// return (new Ingredient(get_libelle(), get_quantite()));
    }

    // Produit une version String de l'objet
    public String toString() {
        String message;
        message = "_libelle (" + get_libelle() + "), _quantitie (" + get_quantite() + ")";
        return message;
    }

    // METHODES SPECIFIQUES : afficher
// Affice directement les valeurs de l'objet
    public void afficher() {
        System.out.println("je suis un ingredient " + get_libelle() + " " + get_quantite());
    }
}