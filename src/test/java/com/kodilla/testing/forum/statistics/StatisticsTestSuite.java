package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    private ArrayList<String> usersNames() {
        return usersNames();
    }

    @Test
    public void testCalculateStatisticWhenPostCountIsNull(){
        //Given
    Statistics statistics = mock(Statistics.class);
    when(statistics.usersNames()).thenReturn(new ArrayList<>());
    when(statistics.postsCount()).thenReturn(0);
    when(statistics.commentsCount()).thenReturn(100);
    StatisticsCounter counter = new StatisticsCounter();

    //When
        counter.calculateAdvStatistics(statistics);
    //Then
        Assert.assertEquals(100, counter.getCommentsCount());
        Assert.assertEquals(0, counter.getUsersNamesQuantity());
        Assert.assertEquals(0, counter.getPostsCount());
        Assert.assertEquals(0,0, counter.getPostsPerUser());
        Assert.assertEquals(0, 0, counter.getCommentsPerUser());
        Assert.assertEquals(0, 0, counter.getCommentsPerPost());
    }

    @Test
    public void testCalculateStatisticWhenPostCountIs1000(){
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(new ArrayList<>());
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(10000);
        StatisticsCounter counter = new StatisticsCounter();

        //When
        counter.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(10000, counter.getCommentsCount());
        Assert.assertEquals(0, counter.getUsersNamesQuantity());
        Assert.assertEquals(1000, counter.getPostsCount());
        Assert.assertEquals(0, counter.getPostsPerUser(),0);
        Assert.assertEquals(0, counter.getCommentsPerUser(), 0);
        Assert.assertEquals(10, counter.getCommentsPerPost(),0);
    }

    @Test
    public void testCalculateStatisticWhenCommentsCountIs0(){
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(new ArrayList<>());
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(0);
        StatisticsCounter counter = new StatisticsCounter();

        //When
        counter.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, counter.getCommentsCount());
        Assert.assertEquals(0, counter.getUsersNamesQuantity());
        Assert.assertEquals(1000, counter.getPostsCount());
        Assert.assertEquals(0, counter.getPostsPerUser(),0);
        Assert.assertEquals(0, counter.getCommentsPerUser(), 0);
        Assert.assertEquals(0, counter.getCommentsPerPost(),0);
    }
    @Test
    public void testCalculateStatisticWhenCommentsLowerPosts(){
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(new ArrayList<>());
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(500);
        StatisticsCounter counter = new StatisticsCounter();

        //When
        counter.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(500, counter.getCommentsCount());
        Assert.assertEquals(0, counter.getUsersNamesQuantity());
        Assert.assertEquals(1000, counter.getPostsCount());
        Assert.assertEquals(0, counter.getPostsPerUser(),0);
        Assert.assertEquals(0, counter.getCommentsPerUser(), 0);
        Assert.assertEquals(0.5, counter.getCommentsPerPost(),0.5);
    }
    @Test
    public void testCalculateStatisticWhenCommentsHigherPosts(){
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(new ArrayList<>());
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(800);
        StatisticsCounter counter = new StatisticsCounter();

        //When
        counter.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(800, counter.getCommentsCount());
        Assert.assertEquals(0, counter.getUsersNamesQuantity());
        Assert.assertEquals(100, counter.getPostsCount());
        Assert.assertEquals(0, counter.getPostsPerUser(),0);
        Assert.assertEquals(0, counter.getCommentsPerUser(), 0);
        Assert.assertEquals(8, counter.getCommentsPerPost(),0);
    }
    @Test
    public void testCalculateStatisticWhenUsersCountIs0(){
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(new ArrayList<>());
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(800);
        StatisticsCounter counter = new StatisticsCounter();

        //When
        counter.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(800, counter.getCommentsCount());
        Assert.assertEquals(0, counter.getUsersNamesQuantity());
        Assert.assertEquals(100, counter.getPostsCount());
        Assert.assertEquals(0, counter.getPostsPerUser(),0);
        Assert.assertEquals(0, counter.getCommentsPerUser(), 0);
        Assert.assertEquals(8, counter.getCommentsPerPost(),0);
    }

    @Test
    public void testCalculateStatisticWhenUsersCountIs100(){

        //Given
        Statistics statistics = mock(Statistics.class);

        ArrayList<String> usersNames = new ArrayList<>();
        for(int n=0; n<100; n++){
            usersNames.add("User"+n);
        }

        when(statistics.usersNames()).thenReturn(usersNames);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(800);
        StatisticsCounter counter = new StatisticsCounter();

        //When
        counter.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(800, counter.getCommentsCount());
        Assert.assertEquals(100, counter.getUsersNamesQuantity());
        Assert.assertEquals(100, counter.getPostsCount());
        Assert.assertEquals(1, counter.getPostsPerUser(),0);
        Assert.assertEquals(8, counter.getCommentsPerUser(), 0);
        Assert.assertEquals(8, counter.getCommentsPerPost(),0);
    }
}
