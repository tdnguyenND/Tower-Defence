package Drawer.DrawGameObject;

import GameEntity.Enemy.Enemy;

public class DrawEnemy extends DrawGameObject {
    public static void drawEnemy(Enemy enemy){
        setColor(enemy);
        graphicsContext.strokeOval(enemy.getLocation().getY() - enemy.getWidth()/2,enemy.getLocation().getX() - enemy.getHeight()/2,
                enemy.getHeight(), enemy.getWidth());
        graphicsContext.fillOval(enemy.getLocation().getY() - enemy.getWidth()/2,enemy.getLocation().getX() - enemy.getHeight()/2,
                enemy.getHeight(), enemy.getWidth());
    }
}
