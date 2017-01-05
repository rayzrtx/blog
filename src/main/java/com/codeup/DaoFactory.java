package com.codeup;

/**
 * Created by raylinares on 1/5/17.
 */
public class DaoFactory {
    private static Posts postsDao;

    public static Posts getPostsDao(){
        if (postsDao == null) {
            postsDao= new ListPosts();
        }
        return postsDao;
    }


}
