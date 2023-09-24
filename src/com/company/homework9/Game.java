package com.company.homework9;

public class Game {
    private Game activeGame;

    private int waitingCounter;

    private final String name;
    private final Genre genre;
    private final Type type;

    public enum Genre { ACTION, SPORT, RACE }
    public enum Type { VIRTUAL, PHYSICAL }


    private Game(String name, Genre genre, Type type) {
        this.name = name;
        this.genre = genre;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public Type getType() {
        return type;
    }

    public static class GameDisk {
        private final String description;
        private final Game data;

        private GameDisk(String name, Genre genre, String description) {
            this.data = new Game(name, genre, Type.PHYSICAL);
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public Game getData() {
            return data;
        }

        public static GameDisk getDisk(String name, Genre genre, String description) {
            return new GameDisk(name, genre, description);
        }
    }

    public static class VirtualGame {
        private final int rating;
        private final Game data;

        private VirtualGame(String name, Genre genre, int rating) {
            this.data = new Game(name, genre, Type.VIRTUAL);
            this.rating = rating;
        }

        public int getRating() {
            return rating;
        }

        public Game getData() {
            return data;
        }

        public static VirtualGame getVirtualGame(String name, Genre genre, int rating) {
            return new VirtualGame(name, genre, rating);
        }
    }

}

