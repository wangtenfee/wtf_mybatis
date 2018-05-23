package com.jd.jr.mybatis.mapper;

import com.jd.jr.domain.po.TWtfMyBatisPO;

import java.util.List;

/**
 * Created by wangtengfei3 on 2018/5/22.
 */
public interface TWtfMyBatisMapper {
    /**
     * 新增用戶
     * @param tWtfMyBatisPO
     * @return
     * @throws Exception
     */
    public int inserttWtfMyBatisPO(TWtfMyBatisPO tWtfMyBatisPO) throws Exception;
    /**
     * 修改用戶
     * @param tWtfMyBatisPO
     * @param id
     * @return
     * @throws Exception
     */
    public int updatetWtfMyBatisPO (TWtfMyBatisPO tWtfMyBatisPO,int id) throws Exception;
    /**
     * 刪除用戶
     * @param id
     * @return
     * @throws Exception
     */
    public int deletetWtfMyBatisPO(int id) throws Exception;
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     * @throws Exception
     */
    public TWtfMyBatisPO selecttWtfMyBatisPOById(int id) throws Exception;
    /**
     * 查询所有的用户信息
     * @return
     * @throws Exception
     */
    public List<TWtfMyBatisPO> selectAlltWtfMyBatisPO() throws Exception;
}
