package demo.citi.controller;

import demo.citi.pojo.LoginInfo;
import demo.citi.pojo.SaleInfo;
import demo.citi.pojo.SelectInfo;
import demo.citi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.HashSet;
import java.util.List;
@SessionAttributes(names = {"account"})
@Controller
public class MyController {
    //Session的属性
    public static final String ACCOUNT="account";
    //saleName属性
    public static final String SALENAME="saleName";
    //saleKind属性
    public static final String SALEKIND="saleKind";
    //错误信息
    public static final String ERRORMSGKEY="errorMsg";
    public static final String ERRORMSGVALUE="您的账号密码输入错误，请重新输入";
    //登录页面
    public static final String LOGIN="login";
    //登录中间件
    public static final String SIGNIN="signin";
    //查询页面
    public static final String SELECT="select";
    //插入页面
    public static final String INSERT="insert";
    //测试页面
    public static final String TEST="test";
    public static final String SALE_INFO = "saleInfo";
    public static final String SELECT_RESULT = "selectResult";
    public static final String REDIRECT = "redirect:./";
    public static final String FORWARD = "forward:./";


    static HashSet<String> nameSet=new HashSet<>();
    static HashSet<String> kindSet=new HashSet<>();
    static {
        String[] saleNames= {"张三", "李四", "王五"};
        for (String salename:saleNames
        ) {
            nameSet.add(salename);
        }

        String[] saleKinds= {"债权A", "债权B", "债权C"};
        for (String sale_kind:saleKinds
        ) {
            kindSet.add(sale_kind);
        }
    }

    @Autowired
    LoginService loginService;


    @RequestMapping(value = "login",method = RequestMethod.GET)
    public ModelAndView getLogin(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName(LOGIN);
        return modelAndView;
    }
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public ModelAndView userSignIn(LoginInfo loginInfo){
        ModelAndView modelAndView=new ModelAndView();
        boolean isInDB = loginService.selectLogin(loginInfo);
        if(isInDB){
            //       下面调用两个服务获得当前销售人员列表
            modelAndView.addObject(ACCOUNT,loginInfo.getAccount());
            modelAndView.setViewName(REDIRECT+INSERT);
        }else{
            modelAndView.setViewName(LOGIN);
            modelAndView.addObject(ERRORMSGKEY,ERRORMSGVALUE);
        }
        return modelAndView;
    }
    @RequestMapping(value = "insert",method = RequestMethod.GET)
    public ModelAndView salesRecordInsert(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName(INSERT);
        modelAndView.addObject(SALENAME,nameSet);
        modelAndView.addObject(SALEKIND,kindSet);
        return modelAndView;
    }
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public ModelAndView insertData(SaleInfo saleInfo)  {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(SALENAME,nameSet);
        modelAndView.addObject(SALEKIND,kindSet);
        modelAndView.setViewName(INSERT);
        modelAndView.addObject(SALE_INFO,saleInfo);
        loginService.insertSaleData(saleInfo);
        return modelAndView;
    }
    @RequestMapping(value = "select",method = RequestMethod.POST)
    public ModelAndView selectSaleDate(SelectInfo selectInfo){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(SELECT);
        modelAndView.addObject(SALENAME,nameSet);
        modelAndView.addObject(SALEKIND,kindSet);
        List<SaleInfo> selectResult=loginService.selectSaleDate(selectInfo);
        modelAndView.addObject(SELECT_RESULT,selectResult);
        return modelAndView;
    }
    @RequestMapping(value = "select",method = RequestMethod.GET)
    public ModelAndView selectSaleDate(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(SELECT);
        modelAndView.addObject(SALENAME,nameSet);
        modelAndView.addObject(SALEKIND,kindSet);
        return modelAndView;
    }
}
