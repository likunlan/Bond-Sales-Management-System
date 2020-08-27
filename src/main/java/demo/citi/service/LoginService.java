package demo.citi.service;

import demo.citi.pojo.LoginInfo;
import demo.citi.pojo.SaleInfo;
import demo.citi.pojo.SelectInfo;

import java.util.List;

public interface LoginService {
    //登陆服务，只用关注于是否能找到该数据即可
    public boolean selectLogin(LoginInfo loginInfo);
    //插入销售数据服务,只用往里面插入数据
    public void insertSaleData(SaleInfo saleInfo);
    //查询销售数据服务，只用往里面查询数据
    public List<SaleInfo> selectSaleDate(SelectInfo selectInfo);
}
