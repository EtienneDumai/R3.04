public class Table {
    public int numeroTable;
    public Table(int leNumeroDeTable) {
        this.numeroTable = leNumeroDeTable;
    }
    public int getNumeroTable() {
        return numeroTable;
    }
    public void setNumeroTable(int numeroTable) {
        this.numeroTable = numeroTable;
    }
    public String toString() {
        return "La table a le numero de table: " + this.numeroTable;
    }
    public boolean equals(Table t) {
        return this.numeroTable == t.numeroTable;
    }
}
