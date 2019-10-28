package GameEntity.Bullet;

import Debugger.Log;
import Map.Map;
import GameEntity.GameTile.Tower.TowerManager;
import Program.Position;

import java.util.ArrayList;
import java.util.List;

public class BulletManager {
    private static List<Bullet> bulletList = new ArrayList<Bullet>();

    public static void addBullet(String bulletType, Position pos){
        switch(bulletType){
            case "NormalBullet":
                Bullet newBullet = new NormalBullet();
                bulletList.add(newBullet);
                break;
            case "MachineGunBullet":
                Bullet newBullet = new MachineGunBullet();
                bulletList.add(newBullet);
                break;
            case "SnipperBullet":
                Bullet newBullet = new SnipperBullet();
                bulletList.add(newBullet);
                break;
        }
    }
     public static void deleteBullet(Bullet bullet){
        bulletList.remove(bullet);
     }


}
