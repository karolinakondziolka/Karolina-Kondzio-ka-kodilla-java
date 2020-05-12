package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {

    int usersNamesQuantity;
    int postsCount;
    int commentsCount;
    double postsPerUser;
    double commentsPerUser;
    double commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersNamesQuantity = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        if (usersNamesQuantity != 0) {
            this.postsPerUser = this.postsCount / this.usersNamesQuantity;
        } else {
            postsPerUser = 0.0;
        }
        if (usersNamesQuantity != 0) {
            this.commentsPerUser = this.commentsCount / this.usersNamesQuantity;
        } else {
            commentsPerUser = 0.0;
        }
        if (postsCount != 0) {
            this.commentsPerPost = this.commentsCount / this.postsCount;
        } else {
            commentsPerPost = 0.0;
        }

    }

    public int getUsersNamesQuantity() {
        return usersNamesQuantity;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}



