package DM.Chapter_1.Dynamic;

/**
 * @Author: Targue
 * @Date: 2021/6/9-10:25
 * @E-mail: 18961568969@163.com
 * @Description:
 **/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new ModelDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
    }
}
