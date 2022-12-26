
public class BudgetObservatorImpl implements Observator{
    double budgetGlobal;
    double budgetBloque;

    public BudgetObservatorImpl(double budgetGlobal) {
        this.budgetGlobal = budgetGlobal;
    }


    @Override
    public void update(Observable observable) {
        DemandeObservableImpl demande = ((DemandeObservableImpl) observable);
        if(demande.getState().equals("valide")){
            this.budgetBloque = demande.getBudgetDemande();
            System.out.println("**** demande validee *****");
            System.out.println("Budget Global : "+this.budgetGlobal +"MAD");
            System.out.println("Budget Bloquee : "+this.budgetBloque +"MAD");
            System.out.println("***************************");
        }
        else if(demande.getState().equals("acceptee")){
            this.budgetGlobal = this.budgetGlobal - this.budgetBloque;
            this.budgetBloque = 0;
            System.out.println("**** demande acceptee *****");
            System.out.println("Budget Global : "+this.budgetGlobal +"MAD");
            System.out.println("Budget Bloquee : "+this.budgetBloque +"MAD");
            System.out.println("***************************");
        }
        else{
            System.out.println("**** demande *****");
            System.out.println("Budget Global : "+this.budgetGlobal +"MAD");
            System.out.println("Budget Bloquee : "+this.budgetBloque +"MAD");
            System.out.println("***************************");
        }
    }
}
