package com.pyz;

import java.math.BigDecimal;

import org.hibernate.Query;
import org.hibernate.Session;
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
    
    public CUser find(int id){
        return (CUser) sessionFactory.getCurrentSession().get(CUser.class,new Integer(id));
    }
    
    public int cnt(){
        Session session=sessionFactory.getCurrentSession();
        String hql="select count(1) from CUser";
        Query query=session.createQuery(hql);
        int count=((Long)query.uniqueResult()).intValue();
        return count;
    }
}
