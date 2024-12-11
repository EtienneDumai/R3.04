public class Utilisateur extends Acteur {
    private String nom;
    private ServeurDeChat monServeur;
    public Utilisateur() {
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setServeurDeChat(ServeurDeChat serveurDeChat) {
        this.monServeur = serveurDeChat;
    }
    public void recevoirMessageDe(Utilisateur auteur, String message) {
        System.out.println(auteur.getNom() + " a dit : " + message);
    }

}
