package ru.netology.java.mvn;

public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager() {

        this.limit = 10;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int replyLength;
        if (films.length < limit) {
            replyLength = films.length;
        } else {
            replyLength = limit;
        }
        String[] reply = new String[replyLength];
        for (int i = 0; i < reply.length; i++) {
            reply[i] = films[films.length - 1 - i];
        }
        return reply;
    }
}
