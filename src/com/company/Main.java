package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        //char[][] carr = new char[n][n];
        char[][] grid = {{'_', '_', '_', '_', '_', '_', '_', '_'},
                {'_', '_', 'X', '_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_', '_', 'X', '_'},
                {'_', 'X', '_', '_', '_', '_', 'X', '_'},
                {'_', 'X', '_', '_', '_', '_', 'X', '_'},
                {'_', 'X', '_', '_', '_', '_', 'X', '_'},
                {'_', '_', 'X', '_', '_', 'X', '_', '_'},
                {'_', '_', '_', '_', '_', '_', '_', '_'}
        };
        nextGeneration(grid, n);


    }

    static void nextGeneration(char[][] grid, int n) {
        int[][] future = new int[n][n];

        for (int l = 1; l < n - 1; l++) {
            for (int m = 1; m < n - 1; m++) {
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        aliveNeighbours += grid[l + i][m + j];


                        aliveNeighbours -= grid[l][m];

                        if ((grid[l][m] == 'X') && (aliveNeighbours < 2)) {
                            future[l][m] = '_';
                        } else if ((grid[l][m] == 'X') && (aliveNeighbours == 2 || aliveNeighbours == 3)) {
                            future[l][m] = 'X';
                        } else if ((grid[l][m] == 'X') && (aliveNeighbours > 3)) {
                            future[l][m] = '_';
                        } else if ((grid[l][m] == '_') && (aliveNeighbours == 3)) {
                            future[l][m] = 'X';
                        }
                    }
                }
            }
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.println(grid[i][j]);
                        }
                        System.out.println();
                    }
                }

            

    }
}
