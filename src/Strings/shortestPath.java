package Strings;

public class shortestPath {

    //question - given a route containing  4 directions (E,W, S, N) ,
    // find the shortest path to reach the destination
    //"WNEENESENNN"

    //diagram  - N ->  y + 1 , S -> y - 1 , E -> x + 1 , W -> x - 1


    public static void main(String[] args) {
         String path = "WNEENESENNN";
         System.out.println(getShortestPath(path));
    }

    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            //north
            if (path.charAt(i) == 'N') {
                y++;
            }
            //south
            else if (path.charAt(i) == 'S') {
                y--;
            }
            //east
            else if (path.charAt(i) == 'E') {
                x++;
            }
            //west
            else if (path.charAt(i) == 'W') {
                x--;
            }

        }

        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);

    }

}
