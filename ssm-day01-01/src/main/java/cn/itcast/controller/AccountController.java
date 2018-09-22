package cn.itcast.controller;

import cn.itcast.pojo.Account;
import cn.itcast.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    /**
     * 查询所有
     * @param
     * @return
     */
    @RequestMapping("/findAll")
    public String showFindAll(HttpServletRequest request){
        List<Account> accounts = accountService.findAll();
        request.setAttribute("accounts",accounts);
        return "accountList";
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping("/findByid")
    public String findByid(HttpServletRequest request,int id){
        Account account = accountService.findByid(id);
        request.setAttribute("account",account);
        return "upAccount";
    }

    /**
     * 根据id删除
     * @param request
     * @param id
     * @return
     */
    @RequestMapping("/delByid")
    public String delByid(HttpServletRequest request,int id){
        int n = accountService.delByid(id);

        if(n>0){
            System.out.println("删除成功");
            return "redirect:/account/findAll";
        }else {
            request.setAttribute("flag","删除失败");
            return "accountList";
        }
    }

    /**
     * 修改用户信息
     * @param request
     * @param account
     * @return
     */
    @RequestMapping("/upAccount")
    public String upAccount(HttpServletRequest request,Account account){
        int n = accountService.upAccount(account);
        if(n>0){
            request.setAttribute("flag","修改成功");
            return "redirect:/account/findAll";
        }else {
            request.setAttribute("flag","修改失败");
            return "upAccount";
        }
    }

    /**
     * 添加用户
     * @param request
     * @param account
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(HttpServletRequest request,Account account){
        int n = accountService.saveAccount(account);
        if(n>0){
            request.setAttribute("flag","添加成功");
            return "redirect:/account/findAll";
        }else {
            request.setAttribute("flag","添加失败");
            return "saveAccount";
        }
    }
}
