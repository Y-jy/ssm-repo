package cn.itcast.service.impl;

import cn.itcast.dao.IAccountDao;
import cn.itcast.pojo.Account;
import cn.itcast.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public int saveAccount(Account account) {
        return accountDao.saveAccount(account);
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findByid(int id) {
        return accountDao.findByid(id);
    }

    @Override
    public int delByid(int id) {
        return accountDao.delByid(id);
    }

    @Override
    public int upAccount(Account account) {
        return accountDao.upAccount(account);
    }
}
