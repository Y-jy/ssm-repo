package cn.itcast.service;

import cn.itcast.pojo.Account;

import java.util.List;

public interface IAccountService {

    /**
     * 保存数据
     * @param account
     */
    public int saveAccount(Account account);

    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 根据id查询
     * @return
     */
    public Account findByid(int id);

    /**
     * 删除
     * @param id
     * @return
     */
    public int delByid(int id);

    /**
     * 修改
     * @param account
     * @return
     */
    public int upAccount(Account account);
}
