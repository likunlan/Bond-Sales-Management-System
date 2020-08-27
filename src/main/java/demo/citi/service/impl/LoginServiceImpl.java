package demo.citi.service.impl;

import demo.citi.dao.LoginMapper;
import demo.citi.pojo.LoginInfo;
import demo.citi.pojo.SaleInfo;
import demo.citi.pojo.SelectInfo;
import demo.citi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;
    @Override
    public boolean selectLogin(LoginInfo loginInfo) {
        return loginMapper.selectUser(loginInfo);

    }

    @Override
    public void insertSaleData(SaleInfo saleInfo) {
        loginMapper.insertSaleData(saleInfo);
    }

    @Override
    public List<SaleInfo> selectSaleDate(SelectInfo selectInfo) {
        return loginMapper.selectSaleDate(selectInfo);
    }
}
