package com.company.homework9;

import java.util.Arrays;

import java.util.Comparator;

public class PlayRoom {
    public static void main(String[] args) {
        Game.GameDisk[] physicalGames = new Game.GameDisk[] {
                Game.GameDisk.getDisk("Game1", Game.Genre.ACTION, "Description1"),
                Game.GameDisk.getDisk("Game2", Game.Genre.SPORT, "Description2"),
                Game.GameDisk.getDisk("Game3", Game.Genre.RACE, "Description3"),
                Game.GameDisk.getDisk("Game4", Game.Genre.ACTION, "Description4")
        };

        Game.VirtualGame[] virtualGames = new Game.VirtualGame[] {
                Game.VirtualGame.getVirtualGame("Game5", Game.Genre.SPORT, 4),
                Game.VirtualGame.getVirtualGame("Game6", Game.Genre.ACTION, 5),
                Game.VirtualGame.getVirtualGame("Game7", Game.Genre.RACE, 3),
                Game.VirtualGame.getVirtualGame("Game8", Game.Genre.ACTION, 2)
        };

        // Сортировка физических игр по жанру
        Arrays.sort(physicalGames, Comparator.comparing(game -> game.getData().getGenre()));

        // Сортировка виртуальных игр по рейтингу
        Arrays.sort(virtualGames, (game1, game2) -> Integer.compare(game2.getRating(), game1.getRating()));

        System.out.println("Physical Games (Sorted by Genre):");
        Arrays.stream(physicalGames).forEach(game -> {
            System.out.println("Name: " + game.getData().getName());
            System.out.println("Genre: " + game.getData().getGenre());
            System.out.println("Description: " + game.getDescription());
            System.out.println();
        });

        System.out.println("Virtual Games (Sorted by Rating):");
        Arrays.stream(virtualGames).forEach(game -> {
            System.out.println("Name: " + game.getData().getName());
            System.out.println("Genre: " + game.getData().getGenre());
            System.out.println("Rating: " + game.getRating());
            System.out.println();
        });
    }
}

