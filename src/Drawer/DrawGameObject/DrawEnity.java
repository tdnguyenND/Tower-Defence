package Drawer.DrawGameObject;

import GameEntity.Enemy.Enemy;
import GameEntity.Enemy.EnemyManager;
import Program.GameManager;
import javafx.scene.canvas.GraphicsContext;


public class DrawEnity {
    private static GameManager gameManager;

    public static void init(GraphicsContext graphicsContext, GameManager _gameManager) {
        DrawGameObject.init(graphicsContext);
        gameManager = _gameManager;
    }

    public static void draw(){
        /**
         * TODO:
         *  -Draw Tower
         *  -Draw Enemy
         *  -Draw Bullet
         */
        for (Enemy enemy: EnemyManager.listEnemy){
            DrawGameObject.draw(enemy);
        }

    }
}
