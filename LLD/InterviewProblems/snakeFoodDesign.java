package InterviewProblems;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class GameBoard {
    public Integer width;
    public Integer height;

    GameBoard(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Integer getWidth() {
        return this.width;
    }

    public Integer getHeight() {
        return this.height;
    }
}

class Pair<K, V> {
    public K first;
    public V second;

    Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }
}

class Snake {
    public Deque<Pair<Integer, Integer>> body;
    public Map<Pair<Integer, Integer>, Boolean> positionMap;

    Snake() {
        this.body = new LinkedList<>();
        this.positionMap = new HashMap<>();

        Pair<Integer, Integer> initialPos = new Pair<>(0, 0);
        this.body.offerFirst(initialPos);
        this.positionMap.put(initialPos, true);
    }
}

public class snakeFoodDesign { 
    public static void main(String[] args) {
       
    }
}
