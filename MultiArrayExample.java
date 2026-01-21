public class MultiArrayExample {
    public static void main(String[] args) {

        int[][] marks = {
            {80, 85, 90},
            {75, 88, 92},
            {70, 78, 85}
        };

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
