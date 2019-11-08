package GameEntity.Bullet;

import GameEntity.Enemy.Enemy;
import GameEntity.GameTile.Tower.Tower;

import java.util.Set;

public class BulletManager {
    private static Set<Bullet> bulletList;
    private static Enemy target;
    private static Tower tower;

    public BulletManager() {
    }

    public static void addBullet(String bulletType){
        if(bulletType.equals("NormalBullet")) {
            Bullet newBullet = new NormalBullet(target, tower);
            bulletList.add(newBullet);
        }
        else if(bulletType.equals("MachineGunBullet")) {
            Bullet newBullet = new MachineGunBullet(target, tower);
            bulletList.add(newBullet);
        }
        else if(bulletType.equals("SniperBullet")) {
            Bullet newBullet = new Sniper(target, tower);
            bulletList.add(newBullet);
        }
    }

    public static void deleteBullet(Bullet bullet){
        bulletList.remove(bullet);
    }

    public static void update(){
        if(!bulletList.isEmpty()){
            for(Bullet bullet: bulletList) bullet.update();
        }
        else{
            BulletManager.addBullet("NormalBullet");
            BulletManager.addBullet("MachineGunBullet");
            BulletManager.addBullet("SniperBullet");
        }
    }

    public static void reset(){
        bulletList.clear();
    }
}
