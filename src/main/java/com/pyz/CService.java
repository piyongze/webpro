package com.pyz;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional 
public class CService {

    @Autowired
    CDao dao;
    
    public void saveCuser(){
        CUser user=new CUser();
        user.setName("testpyz");
        dao.save(user);
    }
}
