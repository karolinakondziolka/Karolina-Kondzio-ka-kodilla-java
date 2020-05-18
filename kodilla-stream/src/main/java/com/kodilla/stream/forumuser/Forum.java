package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){
        theForumUserList.add(new ForumUser( 1, "Moscow", 'M', 1998, 9, 11, 98));
        theForumUserList.add(new ForumUser( 2, "Madryt", 'M', 1987, 6, 13, 85));
        theForumUserList.add(new ForumUser( 3, "Wenecja", 'K', 1990, 12, 12, 124));
        theForumUserList.add(new ForumUser( 4, "New York", 'M', 2004, 7, 24, 187));
        theForumUserList.add(new ForumUser( 5, "Padwa", 'K', 1998, 8, 31, 256));
        theForumUserList.add(new ForumUser( 6, "Oslo", 'M', 1995, 7, 4, 0));
        theForumUserList.add(new ForumUser( 7, "Praga", 'K', 1992, 9, 10, 245));
        theForumUserList.add(new ForumUser( 8, "Wenezuela", 'K', 1999, 2, 28, 99));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
