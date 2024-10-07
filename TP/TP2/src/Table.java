public class Table {
    public String numeroTable;
    public Table(String leNumeroDeTable) {
        this.numeroTable = leNumeroDeTable;
    }
    public String getNumeroTable() {
        return numeroTable;
    }
    public void setNumeroTable(String numeroTable) {
        this.numeroTable = numeroTable;
    }
    public String toString() {
        return "La table a le numero de table: " + this.numeroTable;
    }
    public boolean equals(Table t) {
        return this.numeroTable == t.numeroTable;
    }
}
