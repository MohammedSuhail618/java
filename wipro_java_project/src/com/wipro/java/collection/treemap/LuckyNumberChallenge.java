package com.wipro.java.collection.treemap;

import java.sql.*;
import java.util.*;

public class LuckyNumberChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String url = "jdbc:mysql://localhost:3306/game_db";
        String user = "root";
        String password = "Suhail@123";

        do {
            System.out.print("Enter your name: ");
            String playerName = scanner.nextLine();
            System.out.print("Choose difficulty (1: Easy, 2: Medium, 3: Hard): ");
            int maxRange = switch (scanner.nextInt()) {
                case 1 -> 50; case 2 -> 100; case 3 -> 200; default -> 100;
            };

            int randomNumber = random.nextInt(maxRange) + 1, attempts = 0;
            boolean guessedCorrectly = false;

            while (!guessedCorrectly) {
                System.out.print("Your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                if (guess == randomNumber) {
                    guessedCorrectly = true;
                    System.out.println("Congrats! Attempts: " + attempts);
                } else {
                    System.out.println(guess < randomNumber ? "Too low!" : "Too high!");
                    if (attempts % 3 == 0)
                        System.out.println("Hint: The number is " + (randomNumber % 2 == 0 ? "even." : "odd."));
                }
            }

            // Save player data
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                String sql = "INSERT INTO players (name, attempts) VALUES (?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setString(1, playerName);
                    pstmt.setInt(2, attempts);
                    pstmt.executeUpdate();
                }
                System.out.println("Data saved! Top players:");
                try (ResultSet rs = conn.createStatement().executeQuery("SELECT name, attempts FROM players ORDER BY attempts ASC LIMIT 5")) {
                    while (rs.next())
                        System.out.println(rs.getString("name") + ": " + rs.getInt("attempts"));
                }
            } catch (SQLException e) { e.printStackTrace(); }

            System.out.print("Play again? (yes/no): ");
            scanner.nextLine(); // Consume newline
        } while (scanner.nextLine().equalsIgnoreCase("yes"));

        scanner.close();
    }
}
