package com.sxt.obj;

import com.sxt.GameWin;

import java.awt.*;

public class LittleBoss1Bullet extends GameObj{
    @Override
    public Image getImg() {
        return super.getImg();
    }

    public LittleBoss1Bullet() {
        super();
    }

    public LittleBoss1Bullet(Image img, int width, int height, int x, int y, double speed, GameWin frame) {
        super(img, width, height, x, y, speed, frame);
    }

    public LittleBoss1Bullet(Image img, int x, int y, double speed) {
        super(img, x, y, speed);
    }

    public LittleBoss1Bullet(int x, int y) {
        super(x, y);
    }

    @Override
    public void paintself(Graphics g) {
        super.paintself(g);
        y+=speed;
    }

    @Override
    public Rectangle getRec() {
        return super.getRec();
    }
}
