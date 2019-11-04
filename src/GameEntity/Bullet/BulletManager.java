package GameEntity.Bullet;

import Debugger.Log;
import GameEntity.Enemy.Enemy;
import GameEntity.GameTile.Tower.Tower;
import Map.Map;
import GameEntity.GameTile.Tower.TowerManager;
import Program.Position;

import java.util.Set;

public class BulletManager {
    private static Set<Bullet> bulletList;

    public static void addBullet(String bulletType, Position pos, Enemy target, Tower tower){
        switch(bulletType){
            case "NormalBullet":
                Bullet newBullet = new NormalBullet(Enemy target, Tower tower);
                bulletList.add(newBullet);
                break;
            case "MachineGunBullet":
                Bullet newBullet = new MachineGunBullet(Enemy target, Tower tower);
                bulletList.add(newBullet);
                break;
            case "SnipperBullet":
                Bullet newBullet = new SnipperBullet(Enemy target, Tower tower);
                bulletList.add(newBullet);
                break;
        }
    }
    public static void deleteBullet(Bullet bullet){
        bulletList.remove(bullet);
    }


}
