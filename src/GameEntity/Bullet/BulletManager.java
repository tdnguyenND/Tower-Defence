package GameEntity.Bullet;

import Debugger.Log;
import Map.Map;
import Tower.TowerManager;

import java.util.ArrayList;
import java.util.List;

public class BulletManager {
    private static List<Bullet> bulletList = new ArrayList<Bullet>();

    public static void addMachineGunBullet(){
        Bullet newBullet = new MachineGunBullet();
        addBullet(newBullet);
    }

    public static void addBullet(Bullet newBullet){
        if(newBullet != null) bulletList.add(newBullet);
    }


}
