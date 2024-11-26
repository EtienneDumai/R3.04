import java.util.ArrayList;

public class ObservableMeteo {
    private String dateHeure;
    private double temperature;
    private double pression;
    private ArrayList<ObservateurMeteo> observateurs = new ArrayList<ObservateurMeteo>();
    private String libelleObservable;

    public ObservableMeteo(String libelleObservable) {
        this.libelleObservable = libelleObservable;
    }

    public void ajouterObservateur(ObservateurMeteo observateur) {
        observateurs.add(observateur);
    }

    public void supprimerObservateur(ObservateurMeteo observateur) {
        observateurs.remove(observateur);
    }

    public void notifierObservateurs() {
        for (ObservateurMeteo observateur : observateurs) {
            observateur.actualiser(this);
        }
    }

    public String getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(String dateHeure) {
        this.dateHeure = dateHeure;
        notifierObservateurs();
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifierObservateurs();
    }

    public double getPression() {
        return pression;
    }

    public void setPression(double pression) {
        this.pression = pression;
        notifierObservateurs();
    }
    public void setDateHeureTemperaturePression(String dateHeure, double temperature, double pression) {
        this.dateHeure = dateHeure;
        this.temperature = temperature;
        this.pression = pression;
        notifierObservateurs();
    }
    @Override
    public String toString() {
        return "ObservableMeteo{" +
                "dateHeure='" + dateHeure + '\'' +
                ", temperature=" + temperature +
                ", pression=" + pression +
                '}';
    }
}
