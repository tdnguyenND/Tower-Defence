package Drawer.DrawGameObject;

import GameEntity.Bullet.Bullet;
import GameEntity.Bullet.BulletManager;
import GameEntity.Enemy.Enemy;
import GameEntity.Enemy.EnemyManager;
import GameEntity.GameTile.Tower.Tower;
import GameEntity.GameTile.Tower.TowerManager;
import Program.GameManager;
import javafx.scene.canvas.GraphicsContext;


public class DrawEnity {
    private static GameManager gameManager;

    public static boolean init(GraphicsContext graphicsContext, GameManager _gameManager) {
        DrawGameObject.init(graphicsContext);
        gameManager = _gameManager;
        return (gameManager != null);
    }

    public static void draw(){
        /**
         * TODO:
         *  -Draw Tower
         *  -Draw Enemy
         *  -Draw Bullet
         */
        for (Enemy enemy: EnemyManager.listEnemy){
            DrawEnemy.drawEnemy(enemy);
        }
        for (Tower tower: TowerManager.towerList){
            DrawTower.drawTower(tower);
        }
        for (Bullet bullet: BulletManager.bulletList){
            DrawBullet.drawBullet(bullet);
        }
    }
}
