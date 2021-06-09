package DM.Chapter_1.Simple;

/**
 * @Author: Targue
 * @Date: 2021/6/9-9:57
 * @E-mail: 18961568969@163.com
 * @Description:
 **/
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
