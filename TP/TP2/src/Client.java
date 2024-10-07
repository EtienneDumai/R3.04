public class Client {
    public String telephone;
    public String nom;
    public Client(String telephone, String nom) {
        this.telephone = telephone;
        this.nom = nom;
    }
    public String getTelephone() {
        return this.telephone;
    }
    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String toString() {
        return "Le client a pour nom : " + this.nom + " et pour numero de telephone : " + this.telephone;
    }

}
