package Builder;
import State.Active;
import State.NotActive;
import State.State;
import Utility.*;
public class CarAgreementBuilder implements IBuilder {
    private Agreement agreement;
    private State NotActive;

    public  CarAgreementBuilder() {
        this.agreement = new Agreement();
    }

    @Override
    public void buildState()
    {
        this.agreement.setCurrentState(new Active());
    }
    @Override
    public void buildClientName()
    {
        this.agreement.setClientname(UtilityClass.femaleNames[(int) UtilityClass.helperRandomGenerator(0,9)]);
    }

    @Override
    public void buildYear()
    {
        this.agreement.setYear((int) UtilityClass.helperRandomGenerator(2015,2023));
    }

    @Override
    public void buildYearlyFee()
    {
        //the yearly fee is between 500$ and 10,000$
        this.agreement.setYearlyfee( UtilityClass.helperDoubleRound(UtilityClass.helperRandomGenerator(500,10000)));
    }

    @Override
    public void buildRisk() {
        //	Risk. (Yearly Chance of accident, 5% to 100%).
        this.agreement.setRisk(UtilityClass.helperDoubleRound(UtilityClass.helperRandomGenerator(.05,1)));
    }

    @Override
    public void buildInsuranceAmount()
    {
        if (makeClaim())
        {
            this.agreement.setInsuranceAmount(
                    UtilityClass.helperDoubleRound(this.agreement.getYearlyfee() * UtilityClass.helperRandomGenerator(5, 20)));
        }
    }

    @Override
    public void buildPenalty()
    {
        if (this.agreement.getCurrentstate()== NotActive)
        {
            //there is a 10% penalty to pay
            this.agreement.setPenalty(
                    UtilityClass.helperDoubleRound (this.agreement.getYearlyfee()* 0.1));
            //but the yearly fee becomes zero.
            this.agreement.setYearlyfee(0);
        }
    }

    @Override
    public void buildNetProfit()
    {
       this.agreement.setNetprofit(
               UtilityClass.helperDoubleRound(this.agreement.getYearlyfee()-
                       this.agreement.getInsuranceAmount()));
    }

    @Override
    public Agreement getAgreement() {
        return this.agreement;
    }

    @Override
    public boolean makeClaim()
    {
       if (this.agreement.getRisk()>.75)
            return true;
       return false;
    }




}
