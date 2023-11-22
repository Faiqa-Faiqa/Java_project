package Builder;

public class Engineer
{
    private IBuilder iBuilder;
    public Engineer(IBuilder iBuilder)
    {
        this.iBuilder=iBuilder;
    }
    public void createAgreement()
    {
        this.iBuilder.buildState();
        this.iBuilder.buildClientName();
        this.iBuilder.buildYear();
        this.iBuilder.buildYearlyFee();
        this.iBuilder.buildRisk();
        this.iBuilder.buildInsuranceAmount();
        this.iBuilder.buildPenalty();
        this.iBuilder.buildNetProfit();
    }
    public Agreement getAgreement()
    {
        return this.iBuilder.getAgreement();
    }
}
