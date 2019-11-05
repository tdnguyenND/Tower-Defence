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

    public BulletManager() {
    }

    public static void addBullet(String bulletType, Position pos, Enemy target, Tower tower){
        if(bulletType.equals("NormalBullet")) {
            Bullet newBullet = new NormalBullet(target, tower);
            bulletList.add(newBullet);
        }
        else if(bulletType.equals("MachineGunBullet")) {
            Bullet newBullet = new MachineGunBullet(target, tower);
            bulletList.add(newBullet);
        }
        else if(bulletType.equals("SnipperBullet")) {
            Bullet newBullet = new SnipperBullet(target, tower);
            bulletList.add(newBullet);
        }
    }

    public static void deleteBullet(Bullet bullet){
        bulletList.remove(bullet);
    }
}
