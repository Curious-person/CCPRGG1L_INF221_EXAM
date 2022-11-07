public class FinalExam {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'R', 'E', 'I', 'M', 'A', 'E', 'R', 'S', 'G', 'T' },
                { 'E', 'V', 'D', 'B', 'D', 'V', 'I', 'A', 'B', 'I' },
                { 'E', 'L', 'R', 'O', 'F', 'S', 'A', 'W', 'U', 'K' },
                { 'B', 'G', 'C', 'E', 'I', 'L', 'C', 'J', 'H', 'T' },
                { 'S', 'S', 'K', 'G', 'D', 'Z', 'H', 'S', 'T', 'O' },
                { 'V', 'M', 'J', 'A', 'V', 'H', 'Z', 'S', 'I', 'K' },
                { 'C', 'H', 'I', 'L', 'L', 'T', 'O', 'P', 'G', 'M' },
                { 'Y', 'S', 'P', 'I', 'T', 'A', 'P', 'R', 'W', 'D' },
                { 'G', 'B', 'D', 'S', 'T', 'K', 'P', 'W', 'S', 'O' },
                { 'G', 'T', 'L', 'H', 'Q', 'X', 'Q', 'L', 'O', 'E' },
        };

        // =============================================================
        // ALAK - (10 points)
        System.out.println(" ");
        System.out.println("1. ALAK ");

        //outer loop
        for (char i = 0; i < 10; i++) {
            
            //inner loop
            System.out.println("");
            for (int j = 0; j < 10; j++) {

                if (i == 4 && j == 2) {
                    System.out.print(array[i][j]);
                }
                else if (i == 5 && j == 3) {
                    System.out.print(array[i][j]);
                }
                else if (i == 6 && j == 4) {
                    System.out.print(array[i][j]);
                }
                else if (i == 7 && j == 5) {
                    System.out.print(array[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // =============================================================
        // GITHUB - (10 points)
        System.out.println(" ");
        System.out.println("2. GITHUB ");

        for (int i = 0; i < 10; i++) {
            
            System.out.println(" ");
            for (int j = 0; j < 10; j++) {
                if (j == 8 && (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6)) {
                    System.out.print(array[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // =============================================================
        // SISIG - (10 points)
        System.out.println(" ");
        System.out.println("3. SISIG ");

        for (int row = 0; row < 10; row++) {

            System.out.println(" ");
            for (int column = 0; column < 10; column++) {

                if (row == 0 && column == 7) {
                    System.out.print(array[row][column]);
                }
                else if (row == 1 && column == 6) {
                    System.out.print(array[row][column]);
                }
                else if (row == 2 && column == 5) {
                    System.out.print(array[row][column]);
                }
                else if (row == 3 && column == 4) {
                    System.out.print(array[row][column]);
                }
                else if (row == 4 && column == 3) {
                    System.out.print(array[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // =============================================================
        // VSCODE - (10 points)
        System.out.println(" ");
        System.out.println("4. VSCODE ");

        //outer loop
        for (int a = 0; a < 10; a++) {

            //inner loop
            System.out.println(" ");
            for (int b = 0; b < 10; b++) {
                
                if (a == 0 && b == 5) {
                    System.out.print(array[a][b]);
                }
                else if (a == 1 && b == 4) {
                    System.out.print(array[a][b]);
                }
                else if (a == 2 && b == 3) {
                    System.out.print(array[a][b]);
                }
                else if (a == 3 && b == 2) {
                    System.out.print(array[a][b]);
                }
                else if (a == 4 && b == 1) {
                    System.out.print(array[a][b]);
                }
                else if (a == 5 && b == 0) {
                    System.out.print(array[a][b]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // =============================================================
        // BEER - (10 points)
        System.out.println(" ");
        System.out.println("5. BEER ");

        for (int i = 0; i < 10; i++) {

            System.out.println(" ");
            for (int j = 0; j < 10; j++) {

                if (j == 0 && (i == 0 || i == 1 || i == 2 || i == 3)) {
                    System.out.print(array[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // =============================================================
        // JAVA - (10 points)
        System.out.println(" ");
        System.out.println("6. JAVA ");

        for (int i = 0; i < 10; i++) {

            System.out.println(" ");
            for (int j = 0; j < 10; j++) {
                
                if (i == 0 && j == 4) {
                    System.out.print(array[i][j]);
                }
                else if (i == 1 && j == 5) {
                    System.out.print(array[i][j]);
                }
                else if (i == 2 && j == 6) {
                    System.out.print(array[i][j]);
                }
                else if (i == 3 && j == 7) {
                    System.out.print(array[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // =============================================================
        // TIKTOK - (10 points)
        System.out.println(" ");
        System.out.println("7. TIKTOK ");

        for (int i = 0; i < array.length; i++) {

            System.out.println(" ");
            for (int j = 0; j < array.length; j++) {

                if (j == 9 && (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5)) {
                    System.out.print(array[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // =============================================================
        // CHILLTOP - (10 points)
        System.out.println(" ");
        System.out.println("8. CHILLTOP ");

        for (int i = 0; i < 10; i++) {

            System.out.println(" ");
            for (int j = 0; j < 10; j++) {

                if (i == 6 && (j == 0 || j == 1 || j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j == 7)) {
                    System.out.print(array[i][j]);
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        // =============================================================
        // REDHORSE - (10 points)
        System.out.println(" ");
        System.out.println("9. REDHORSE ");

        for (int i = 0; i < array.length; i++) {

            System.out.println();
            for (int j = 0; j < array.length; j++) {
                
                if (i == 2 && j == 2) {
                    System.out.print(array[i][j]);
                }
                else if (i == 3 && j == 3) {
                    System.out.print(array[i][j]);
                }
                else if (i == 4 && j == 4) {
                    System.out.print(array[i][j]);
                }
                else if (i == 5 && j == 5) {
                    System.out.print(array[i][j]);
                }
                else if (i == 6 && j == 6) {
                    System.out.print(array[i][j]);
                }
                else if (i == 7 && j == 7) {
                    System.out.print(array[i][j]);
                }
                else if (i == 8 && j == 8) {
                    System.out.print(array[i][j]);
                }
                else if (i == 9 && j == 9) {
                    System.out.print(array[i][j]);
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        // =============================================================
        // TIPSY - (10 points)
        System.out.println(" ");
        System.out.println("10. TIPSY ");

        for (int i = 0; i < array.length; i++) {

            System.out.println(" ");
            for (int j = 0; j < array.length; j++) {
                
                if (i == 7 && (j == 0 || j == 1 || j == 2 || j == 3 || j == 4)) {
                    System.out.print(array[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // =============================================================

        // BONUS
        // SLY starts to learn programming. The first task is drawing a fox! However, that turns out to be too hard for a beginner, so she decides to draw a snake instead.

        // A snake is a pattern on a n by m table. Denote c-th cell of r-th row as (r, c). The tail of the snake is located at (1, 1), then it's body extends to (1, m), then goes down 2 rows to (3, m), then goes left to (3, 1) and so on.

        // Your task is to draw this snake for Fox Ciel: the empty cells should be represented as dot characters ('.') and the snake cells should be filled with number signs ('#').

        // Consider sample tests in order to understand the snake pattern.
        
        
        // Input
        // The only line contains two integers: n and m (3 ≤ n, m ≤ 50).

        // n is an odd number.

        // Output
        // Output n lines. Each line should contain a string consisting of m characters. Do not output spaces.
        
        // Example
        // Input: 3 3
        
        // ###
        // ..#
        // ###
        // #..
        // ###
        
        
//         Input: 9 9
            
// #########
// ........#
// #########
// #........
// #########
// ........#
// #########
// #........
// #########
    }
}
