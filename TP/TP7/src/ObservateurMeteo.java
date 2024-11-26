public class ObservateurMeteo {
    private String libelleObservateur;
    private ObservableMeteo observable;
    private String dateHeure;
    private double temperature;
    private double pression;

    public ObservateurMeteo(String libelleObservateur) {
        this.libelleObservateur = libelleObservateur;
    }

    public void setObservable(ObservableMeteo observable) {
        this.observable = observable;
    }

    public String getLibelleObservateur() {
        return libelleObservateur;
    }

    public void setLibelleObservateur(String libelleObservateur) {
        this.libelleObservateur = libelleObservateur;
    }

    public String getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(String dateHeure) {
        this.dateHeure = dateHeure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPression() {
        return pression;
    }

    public void setPression(double pression) {
        this.pression = pression;
    }

    @Override
    public String toString() {
        return "ObservateurMeteo{" +
                "libelleObservateur='" + libelleObservateur + '\'' +
                ", dateHeure='" + dateHeure + '\'' +
                ", temperature=" + temperature +
                ", pression=" + pression +
                '}';
    }
    public void actualiser(ObservableMeteo observable) {
        this.dateHeure = observable.getDateHeure();
        this.temperature = observable.getTemperature();
        this.pression = observable.getPression();
    }
}
