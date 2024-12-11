import java.util.ArrayList;

public class ServeurDeChat extends Mediateur {
    private String nomChat;
    private ArrayList<Utilisateur> lesUsers = new ArrayList<Utilisateur>();
    public boolean ajouterUser(Utilisateur user) {
        return lesUsers.add(user);
    }
    public ServeurDeChat() {
    }
    public boolean retirerUser(Utilisateur user) {
        return lesUsers.remove(user);
    }
    public boolean extisteUser(Utilisateur user) {
        return lesUsers.contains(user);
    }
    public void diffuserMessage(Utilisateur auteur, String message) {
        for (Utilisateur acteur : lesUsers) {
            if (!acteur.equals(auteur)) {
                acteur.recevoirMessageDe(auteur, message);
            }
        }
    }
}
