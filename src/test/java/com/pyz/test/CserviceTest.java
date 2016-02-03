package com.pyz.test;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pyz.CService;
import com.pyz.CUser;

/**
 * 单元测试
 * @author Yongze.Pi
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:springtest.xml"})
public class CserviceTest {
    
    @Autowired
    CService cser;
    
    /**
     * 通过判定表行数来确定成功失败
     */
    @Test
    @Transactional
    @Rollback
    public void testSaveCuser(){
        
        int before=cser.getCnt();
        cser.saveCuser();
        int end=cser.getCnt();
        assertEquals(before+1, end);
    }
    
    /**
     * 数据库内必须有该数据 否则单元测试无法通过
     */
    @Test
    @Transactional
    public void testFindUser(){
        
        CUser user=cser.findUser(8);
        assertNotNull(user);
    }
}
