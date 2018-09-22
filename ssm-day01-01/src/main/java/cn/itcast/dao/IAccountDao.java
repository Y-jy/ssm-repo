package cn.itcast.dao;

import cn.itcast.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public interface IAccountDao {

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
     * @param id
     * @return
     */
    public int upAccount(Account account);

}
