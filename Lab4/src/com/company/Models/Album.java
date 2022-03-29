package com.company.Models;

import java.util.Comparator;

public class Album implements Comparator<Album>, Comparable<Album>{
    String nume;
    String artist;
    double rating;
    int anul_publicarii;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getAnul_publicarii() {
        return anul_publicarii;
    }

    public void setAnul_publicarii(int anul_publicarii) {
        this.anul_publicarii = anul_publicarii;
    }

    public Album() {
    }

    @Override
    public String toString() {
        return "\n" + "Album{" +
                "nume='" + nume + '\'' +
                ", artist='" + artist + '\'' +
                ", rating=" + rating +
                ", anul_publicarii=" + anul_publicarii +
                '}';
    }

    public Album(String nume, String artist, double rating, int anul_publicarii) {
        this.nume = nume;
        this.artist = artist;
        this.rating = rating;
        this.anul_publicarii = anul_publicarii;
    }

    @Override
    public int compare(Album album1, Album album2) {

        if (album1.nume == album2.nume && album1.rating == album2.rating) return album1.anul_publicarii - album2.anul_publicarii;

        if (album1.nume == album2.nume) return (int) (album1.rating - album2.rating);

        return album1.nume.compareTo(album2.nume);
    }

    @Override
    public int compareTo(Album album) {
        if(this.nume.equals(album.nume)) {
            if (this.rating == album.rating)
                return this.anul_publicarii - album.anul_publicarii;
            return (int) this.rating - (int) album.rating;
        }
        return this.nume.compareTo(album.nume);
    }
}
