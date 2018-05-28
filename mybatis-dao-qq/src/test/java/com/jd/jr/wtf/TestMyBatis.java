package com.jd.jr.wtf;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.jd.jr.domain.po.TWtfMyBatisPO;
import com.jd.jr.wtf.mapper.TWtfMyBatisMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wangtengfei3 on 2018/5/26.
 */
public class TestMyBatis {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestMyBatis.class);
    private final static Gson GSON = new Gson();

    public static SqlSessionFactory  getSqlSessionFactory(){
        return null;
    }



    @Test
    public void testMyBatisSelect(){
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            try {
                //TWtfMyBatisPO tWtfMyBatisPO = session.selectOne("com.jd.jr.wtf.tWtfMyBatis.selectTWtfMyBatis", 1);
                TWtfMyBatisMapper tWtfMyBatisMapper =  session.getMapper(TWtfMyBatisMapper.class);
                TWtfMyBatisPO wtfMyBatisPO = tWtfMyBatisMapper.selectTWtfMyBatis(1);
                ObjectMapper mapper = new ObjectMapper();
                String json = mapper.writeValueAsString(wtfMyBatisPO);
                String wtfMyBatisPOJson = GSON.toJson(wtfMyBatisPO);
                LOGGER.info("wtfMyBatisPOJson"+wtfMyBatisPOJson);
                LOGGER.info("json"+json);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                session.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMyBatisInsert(){
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            try {
                //TWtfMyBatisPO tWtfMyBatisPO = session.selectOne("com.jd.jr.wtf.tWtfMyBatis.selectTWtfMyBatis", 1);
                TWtfMyBatisMapper tWtfMyBatisMapper =  session.getMapper(TWtfMyBatisMapper.class);
                TWtfMyBatisPO  tWtfMyBatisPO  = new TWtfMyBatisPO("wtf5","wtf5");
                tWtfMyBatisMapper.insertTWtfMyBatis(tWtfMyBatisPO);
                session.commit();
                //LOGGER.info(wtfMyBatisPO+"");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                session.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMyBatisUpdate(){
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            try {
                //TWtfMyBatisPO tWtfMyBatisPO = session.selectOne("com.jd.jr.wtf.tWtfMyBatis.selectTWtfMyBatis", 1);
                TWtfMyBatisMapper tWtfMyBatisMapper =  session.getMapper(TWtfMyBatisMapper.class);
                TWtfMyBatisPO  tWtfMyBatisPO  = tWtfMyBatisMapper.selectTWtfMyBatis(1);
                tWtfMyBatisPO.setName("wangtengfei"+new Date());
                tWtfMyBatisPO.setNote("wangtengfei"+new Date());
                tWtfMyBatisPO.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-05-28 15:44:44"));
                tWtfMyBatisMapper.updateTWtfMyBatis(tWtfMyBatisPO);
                session.commit();
                //LOGGER.info(wtfMyBatisPO+"");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                session.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
