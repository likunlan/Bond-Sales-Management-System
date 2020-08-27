package demo.citi.dao;

import demo.citi.pojo.LoginInfo;
import demo.citi.pojo.SaleInfo;
import demo.citi.pojo.SelectInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginMapper {
    public boolean selectUser(LoginInfo loginInfo);

    public void insertSaleData(SaleInfo saleInfo);

    public List<SaleInfo> selectSaleDate(SelectInfo selectInfo);
}
