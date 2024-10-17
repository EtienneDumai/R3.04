public class SingletonChefCuisine {
    private static SingletonChefCuisine instance;
    private String nom;
    private String prenom;

    private SingletonChefCuisine() {}
    public static SingletonChefCuisine getInstance() {
        if (instance == null) {
            instance = new SingletonChefCuisine();
        }
        return instance;
    }
    //get instance de la question 3 :
    private SingletonChefCuisine(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public static SingletonChefCuisine getInstance(String nom, String prenom) {
        if (instance == null) {
            instance = new SingletonChefCuisine(nom, prenom);
        }
        return instance;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
