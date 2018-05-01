package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * author anand.
 * since on 24/3/18.
 */
class Movie{

    String name;
    float ratting;
    boolean isHit;

    public Movie(String name, float ratting, boolean isHit) {
        this.name = name;
        this.ratting = ratting;
        this.isHit = isHit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRatting() {
        return ratting;
    }

    public void setRatting(float ratting) {
        this.ratting = ratting;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }

    @Override
    public String toString() {
        return name+" "+ratting+" "+isHit;
    }
}
class SortByRating implements Comparator<Movie>{
    @Override
    public int compare(Movie movie1, Movie movie2) {
        if(movie1.getRatting()>movie2.getRatting()) return 1;
        else if(movie1.getRatting()<movie2.getRatting()) return -1;
        else return 0;
    }
}

class SortByName implements Comparator<Movie>{
    @Override
    public int compare(Movie movie, Movie t1) {
        return movie.getName().compareTo(t1.getName());
    }
}
public class collection_sorting {

    public static void main(String args[]){
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("Avatar", (float) 8.5,true));
        movies.add(new Movie("Avanger", (float) 5.5,true));
        movies.add(new Movie("jayho", (float) 0.5,false));
        movies.add(new Movie("zero", (float) 4.5,true));

       // movies.stream().sorted().forEach(i-> System.out.println(i));

        for(Movie movie:movies)
            System.out.println(movie);
        System.out.println("\nAfter sorting by ratting:");
        Collections.sort(movies,new SortByRating());



        for(Movie movie:movies)
            System.out.println(movie);

        System.out.println("\nAfter sort by name:");
        Collections.sort(movies,new SortByName());

        for(Movie movie:movies)
            System.out.println(movie);
    }
}
