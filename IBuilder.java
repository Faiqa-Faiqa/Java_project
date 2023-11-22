package Builder;


public interface IBuilder
{
    void buildClientName();
    void buildYear();
    void buildYearlyFee();
    void buildRisk();
    void buildPenalty();
    void buildState();
    void buildNetProfit();
    void buildInsuranceAmount();
    Agreement getAgreement();
    boolean makeClaim();

}
