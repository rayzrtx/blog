package com.codeup.posts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by raylinares on 1/5/17.
 */
public class DaoFactory {
    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static Session session = sessionFactory.openSession();

    private static Posts postsDao;

    public static Posts getPostsDao(){
        if (postsDao == null) {
            postsDao = new HibernatePostsDao(session);  //passes hibernate session to HibernatePostsDao when it creates a new one
        }
        return postsDao;
    }


}
