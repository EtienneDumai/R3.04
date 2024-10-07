public class Client {
    public int telephone;
    public String nom;
    public Client(int telephone, String nom) {
        this.telephone = telephone;
        this.nom = nom;
    }
    public int getTelephone() {
        return this.telephone;
    }
    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    public String toString() {
        return "Le client a pour nom : " + this.nom + " et pour numero de telephone : " + this.telephone;
    }

}
