package DM.Chapter_1.Dynamic;

/**
 * @Author: Targue
 * @Date: 2021/6/9-10:23
 * @E-mail: 18961568969@163.com
 * @Description:
 **/
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("I am a model duck");
    }
}
