package DM.Chapter_1.Simple;

/**
 * @Author: Targue
 * @Date: 2021/6/9-9:56
 * @E-mail: 18961568969@163.com
 * @Description:
 **/
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
