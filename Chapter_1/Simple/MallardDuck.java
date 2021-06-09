package DM.Chapter_1.Simple;

/**
 * @Author: Targue
 * @Date: 2021/6/9-10:01
 * @E-mail: 18961568969@163.com
 * @Description:
 **/
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I am a real Mallard duck");
    }
}
