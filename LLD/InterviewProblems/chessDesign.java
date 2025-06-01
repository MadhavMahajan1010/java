package InterviewProblems;

class Player {

    public String name;
    public boolean isWhiteSide;

    Player(String name, boolean isWhite) {
        this.name = name;
        this.isWhiteSide = isWhite;
    }

    public String getName() {
        return this.name;
    }

    public boolean isWhite() {
        return this.isWhiteSide;
    }
}

enum status {
    Active, saved, blackWin, whiteWin, stalemate;
}

abstract class peice {

    public boolean killed;
    public boolean isWhite;

    peice(boolean killed) {
        this.killed = killed;
    }

    public boolean isWhite() {
        return this.isWhite;
    }

    public boolean isKilled() {
        return this.killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

}

class queen extends peice {
    queen(boolean killed) {
        super(killed);
    }
}

class king extends peice {
    king(boolean killed) {
        super(killed);
    }
}

class rook extends peice {
    rook(boolean killed) {
        super(killed);
    }
}

class knight extends peice {
    knight(boolean killed) {
        super(killed);
    }
}

class bishop extends peice {
    bishop(boolean killed) {
        super(killed);
    }
}

class pawn extends peice {
    pawn(boolean killed) {
        super(killed);
    }
}

class cell {
    public Integer row;
    public Integer col;
    public boolean occupied;
    public peice peice;

    cell(Integer row, Integer col) {
        this.occupied = false;
        this.row=row;
        this.col=col;
    }

    public peice getPeice() {
        return this.peice;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public void setPeice(peice peice) {
        this.peice = peice;
    }
}
class board{
    public cell[][] instance;
    board(){
        this.instance= new cell[8][8];
    }

}
public class chessDesign {
    public static void main(String[] args) {

    }
}
