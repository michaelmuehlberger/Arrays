/*
 * Tetris
 * Program using arrays
 * Author: Michael Muehlberger
 * Last Change: 30.12.2022
 */

public class Arrays {

    //prints a row of a matrice
    static void printRow(char[][] matrice, int row) {

        for (int i = 0; i < matrice[row].length; i++) {

            char element = matrice[row][i];
            System.out.printf("%c", element);

            if (i != (matrice[row].length - 1)) {
                System.out.print(" ");
            }
        }
    }

    //prints all matrices
    static void printMatrices(char[][] matrice1, char[][] matrice2, char[][] matrice3, char[][] matrice4) {

        for (int element = 0; element <= 3; element++) {

            printRow(matrice1, element);
            System.out.print("  ");
            printRow(matrice2, element);
            System.out.print("  ");
            printRow(matrice3, element);
            System.out.print("  ");
            printRow(matrice4, element);

            System.out.println("");
        }

    }

    //rotates a matrice
    static char[][] rotateMatrice(char[][] matrice) {
        int r;

        char[][] rMatrice = new char[4][4];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {

                r = 3 - i; //rotation of line
                rMatrice[j][r] = matrice[i][j];

            }
        }
        return rMatrice;
    }

    public static void main(String[] args) {

        char[][] matrice1 = {{'-', '-', '-', '-'}, {'-', 'o', '-', '-'}, {'o', 'o', 'o', '-'}, {'-', '-', '-', '-'}};
        char[][] matrice2 = {{'-', '-', '-', '-'}, {'-', 'o', 'o', '-'}, {'o', 'o', '-', '-'}, {'-', '-', '-', '-'}};
        char[][] matrice3 = {{'-', '-', '-', '-'}, {'-', 'o', '-', '-'}, {'-', 'o', '-', '-'}, {'-', 'o', 'o', '-'}};
        char[][] matrice4 = {{'-', '-', 'o', '-'}, {'-', '-', 'o', '-'}, {'-', '-', 'o', '-'}, {'-', '-', 'o', '-'}};

        for (int i = 0; i <= 4; i++) {
            printMatrices(matrice1, matrice2, matrice3, matrice4);

            matrice1 = rotateMatrice(matrice1).clone();
            matrice2 = rotateMatrice(matrice2).clone();
            matrice3 = rotateMatrice(matrice3).clone();
            matrice4 = rotateMatrice(matrice4).clone();

            if (i < 4) {
                System.out.println("");
            }
        }
    }
}