package Builder;
import State.*;
public class Agreement
{

    private String clientName="";
    private double yearlyFee=0;
    private double risk=0;
    private double insuranceAmount=0;
    private State  currentState= null;
    private double penalty=0;
    private int year=0;
    private double netProfit=0;

    public void setCurrentState(State currentState)
    {
        this.currentState = currentState;
    }
    public State getCurrentstate()
    {
        return currentState;
    }
    public void changeState(){
          this.currentState.changeState(this);
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public int getYear()
    {
        return year;
    }

    public void setNetprofit(double netprofit)
    {
        this.netProfit = netprofit;
    }
    public double getNetprofit()
    {
        return netProfit;
    }

    public void setClientname(String clientname)
    {
        this.clientName = clientname;
    }
    public String getClientname()
    {
        return clientName;
    }

    public void setYearlyfee(double yearlyfee)
    {
        this.yearlyFee = yearlyfee;
    }
    public double getYearlyfee()
    {
        return yearlyFee;
    }

    public void setRisk(double risk)
    {
        this.risk = risk;
    }
    public double getRisk()
    {
        return risk;
    }

    public void setInsuranceAmount(double insuranceAmount)
    {
        this.insuranceAmount = insuranceAmount;
    }
    public double getInsuranceAmount()
    {
        return insuranceAmount;
    }

    public void setPenalty(Double penalty)
    {
        this.penalty= penalty;
    }
    public double getPenalty()
    {
        return penalty;
    }

    public void displayAgreement(int index){
        System.out.println("The Agreement " + index + " is as follows: " +
                "\nYear : " +  getYear() +
                "\nName : " + getClientname() +
                "\nYearlyfee : " +  getYearlyfee()+
                "\nNetprofit " +  getNetprofit() +
                "\nRisk() : " + getRisk() +
                "\nInsuranceAmmount : " + getInsuranceAmount() +
                "\nPenalty : " +  getPenalty() +
                "\nCurrentstate : " +  getCurrentstate());

        System.out.println("\n\n\n-----------------------------------------");
    }
}
