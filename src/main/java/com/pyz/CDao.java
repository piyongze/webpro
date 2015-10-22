package com.pyz;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CDao {

    @Autowired
    SessionFactory sessionFactory;
    
    
    
    public void save(CUser user){
        sessionFactory.getCurrentSession().save(user);
    }
}
