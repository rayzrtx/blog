package com.codeup;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by raylinares on 1/6/17.
 */
public class HibernatePostsDao implements Posts {

    private Session session;

    public HibernatePostsDao(Session session){  //constructor that takes in a session
        this.session = session;
    }
    @Override
    public List<Post> allPosts(){
        return session.createQuery("from Post").list();
    }
    @Override
    public void savePost(Post post){
        Transaction tx = session.beginTransaction();
        session.save(post);
        tx.commit();
    }
    @Override
    public Post findPost(long id){
        Query query= session.createQuery("from Post where id=:id");
        query.setParameter("id", id);
        return (Post) query.getSingleResult();
    }
    @Override
    public void updatePost(Post post){
        Transaction tx = session.beginTransaction();
        session.update(post);
        tx.commit();
    }

}
