package ch.lazzaretti.exercise02;

public class LabyrinthFindAllPaths extends Labyrinth {


    public boolean findPath(int x, int y, String path) {
        path += "-> [" + x + ", " + y + "] ";
        if (!isAccessible(x, y) || visited[x][y]) {
            return false;
        } else if (x == targetX && y == targetY) {
            System.out.println(path);
            return true;
        } else {
            visited[x][y] = true;
            boolean left = findPath(x - 1, y, path);
            boolean right = findPath(x + 1, y, path);
            boolean up = findPath(x, y - 1, path);
            boolean down = findPath(x, y + 1, path);
            visited[x][y] = false;
            return left || right || up || down;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LabyrinthFindAllPaths().findPath(0, 0, "PATH: "));
    }
}
