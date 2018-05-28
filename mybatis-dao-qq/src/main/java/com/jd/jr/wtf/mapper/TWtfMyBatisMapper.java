package com.jd.jr.wtf.mapper;

import com.jd.jr.domain.po.TWtfMyBatisPO;

/**
 * Created by wangtengfei3 on 2018/5/27.
 */
public interface TWtfMyBatisMapper {

    /**
     * 根据ID查询
     * */
    public TWtfMyBatisPO selectTWtfMyBatis(long id) throws Exception;

    public void insertTWtfMyBatis(TWtfMyBatisPO tWtfMyBatisPO) throws Exception;

    public void updateTWtfMyBatis(TWtfMyBatisPO tWtfMyBatisPO) throws Exception;

    public void deleteTWtfMyBatis(long id) throws Exception;


}
