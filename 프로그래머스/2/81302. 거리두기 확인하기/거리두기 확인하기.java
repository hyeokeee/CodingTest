class Solution {
 
    private static final int dx[] = {0, -1, 1, 0};
    private static final int dy[] = {-1, 0, 0, 1};
    
    private static final char PERSON = 'P';
    private static final char EMPTY = 'O';
 
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for (int i = 0; i < answer.length; i++) {
            String[] place = places[i];
            char[][] room = new char[place.length][];
            for (int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }
            if (isDistanced(room)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }
    
    private boolean isDistanced(char[][] room) {
        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room[y].length; x++) {
                if (room[y][x] != PERSON) continue;
                if (!isDistanced(room, x, y)) return false;
            }
        }
        return true;
    }
    
    private boolean isDistanced(char[][] room, int x, int y) {
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (isOutOfBounds(room, nx, ny)) continue;
            switch (room[ny][nx]) {
                case PERSON: 
                    return false;
                case EMPTY:
                    if (isNextToVolunteer(room, nx, ny, 3 - d)) return false;
                    break;
            }
        }
        return true;
    }
    
    private boolean isNextToVolunteer(
        char[][] room, 
        int x, 
        int y, 
        int exclude
    ) {
        for (int d = 0; d < 4; d++) {
            if (d == exclude) continue;
            
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (isOutOfBounds(room, nx, ny)) continue;
            if (room[ny][nx] == PERSON) return true;
        }
        return false;
    }
    
    private boolean isOutOfBounds(char[][] room, int x, int y) {
        return y < 0 || y >= room.length || x < 0 || x >= room[y].length;
    }
}