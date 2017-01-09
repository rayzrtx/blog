package com.codeup;

import org.hibernate.Session;
import org.hibernate.Transaction;

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

}
