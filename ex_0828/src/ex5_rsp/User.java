package ex5_rsp;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private int win;
    private int lose;
    private int draw;

    public User(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getWin() {
        return win;
    }

    public int getLose() {
        return lose;
    }

    public int getDraw() {
        return draw;
    }

    public void addWin() {
        win++;
    }

    public void addLose() {
        lose++;
    }

    public void addDraw() {
        draw++;
    }

    public void printScore() {
        System.out.println(
            win + "승, "
            + lose + "패, "
            + draw + "무"
        );
    }
}

