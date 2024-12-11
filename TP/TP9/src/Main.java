//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ServeurDeChat serveur = new ServeurDeChat();
        Utilisateur utilisateur1 = new Utilisateur();
        utilisateur1.setNom("Alice");
        Utilisateur utilisateur2 = new Utilisateur();
        utilisateur2.setNom("Bob");
        Utilisateur utilisateur3 = new Utilisateur();
        utilisateur3.setNom("Charlie");
        serveur.ajouterUser(utilisateur1);
        serveur.ajouterUser(utilisateur2);
        serveur.ajouterUser(utilisateur3);
        serveur.diffuserMessage(utilisateur1, "Bonjour tout le monde !");

    }
}