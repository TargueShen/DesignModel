package DM.Chapter_1.Simple;

/**
 * @Author: Targue
 * @Date: 2021/6/9-10:04
 * @E-mail: 18961568969@163.com
 * @Description:
 **/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
