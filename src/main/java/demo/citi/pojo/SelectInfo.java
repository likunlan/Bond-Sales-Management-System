package demo.citi.pojo;


public class SelectInfo {
    private String saleName;
    private String saleKind;
    private String startDate;
    private String endDate;

    @Override
    public String toString() {
        return super.toString();
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getSaleKind() {
        return saleKind;
    }

    public void setSaleKind(String saleKind) {
        this.saleKind = saleKind;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
