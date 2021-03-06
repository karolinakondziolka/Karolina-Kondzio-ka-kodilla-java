package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Text number 1", (text -> "ABC "+ text +" ABC") );
        poemBeautifier.beautify("Text number 2", (text ->  text.toUpperCase()) );
        poemBeautifier.beautify("Text number 3", (text ->  text.toLowerCase()) );
        poemBeautifier.beautify("Text number 4", (text ->  text +" "+ text +" "+ text));
    }

}

