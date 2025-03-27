package com.pescador95.cursos.nelioalves.secao12.ex2.application;

import com.pescador95.cursos.nelioalves.secao12.ex2.entities.Comment;
import com.pescador95.cursos.nelioalves.secao12.ex2.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awsome!");

        Post p1 = new Post(sdf.parse("21/09/2024 07:30:00"), "Traveling to new Zealand", "I'm going to visit this wonderful country!", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1.toString());

    }
}
