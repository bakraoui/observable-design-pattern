import java.util.ArrayList;
import java.util.List;

public class DemandeObservableImpl implements Observable{
    String state = "demande";

    public double getBudgetDemande() {
        return budgetDemande;
    }

    public void setBudgetDemande(double budgetDemande) {
        this.budgetDemande = budgetDemande;
    }

    double budgetDemande = 0;
    List<Observator> departements = new ArrayList<>();

    @Override
    public void subscribe(Observator observator) {
           departements.add(observator);
    }

    @Override
    public void unsubscribe(Observator observator) {
          departements.remove(observator);
    }

    @Override
    public void notifyObserver() {
          for(Observator o : departements){
              o.update(this);
          }
    }
    public void setState(String state){
        this.state = state;
        this.notifyObserver();
    }

    public String getState() {
        return state;
    }

}
