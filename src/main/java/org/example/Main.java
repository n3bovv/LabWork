package org.example;

public class Main {
    public static void main(String[] args) {
        MiniSQL miniSQL = new MiniSQL();
        miniSQL.start("INSERT KAKADU=kakadoo335, uchitel=ne_beite_pazhe, grade=2, vagon=58tonn");
        miniSQL.start("INSERT KAKADU=kakadoo335, uchitel=ne_beite_pazhe_pazhe, grade=5, vagon=58tonn");
        miniSQL.start("DELETE grade=5");
    }
}