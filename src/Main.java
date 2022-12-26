public class Main {
    public static void main(String[] args) {
        DemandeObservableImpl demande = new DemandeObservableImpl();
        Observator departement = new BudgetObservatorImpl(6000);
        demande.subscribe(departement);
        demande.setState("demande");
        demande.setBudgetDemande(2000);
        System.out.println("|++++++++++++++++++++++++++|");
        demande.setState("valide");
        System.out.println("|++++++++++++++++++++++++++|");
        demande.setState("acceptee");
    }
}