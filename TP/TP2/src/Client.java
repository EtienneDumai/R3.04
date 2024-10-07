public class Client {
    public String telephone;
    public String nom;
    public Table maTable;
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
    public void setMaTable(Table maTable) {
        this.maTable = maTable;
    }
    public Table getMaTable() {
        return this.maTable;
    }
    public String toString() {
        return "Le client a pour nom : " + this.nom + " et pour numero de telephone : " + this.telephone;
    }
    public void delierLaTable(){
        if(this.getMaTable() != null){
            this.maTable.setMonCLient(null);

        this.setMaTable(null);
        }
    }
    public void lierMaTable(Table laTable) {
        if(laTable != null){
            this.delierLaTable();
            laTable.delierMonClient();
            this.setMaTable(laTable);
            laTable.setMonClient(this);
        }
    }

}
