package demo.citi.pojo;


public class SaleInfo {
    private int id;
    private  String saleName;
    private  String saleKind;
    private String date;
    private double money;

    public SaleInfo(int id, String saleName, String saleKind, String date, double money) {
        this.id = id;
        this.saleName = saleName;
        this.saleKind = saleKind;
        this.date = date;
        this.money = money;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "SaleInfo{" +
                "id=" + id +
                ", saleName='" + saleName + '\'' +
                ", saleKind='" + saleKind + '\'' +
                ", date=" + date +
                ", money=" + money +
                '}';
    }
}
