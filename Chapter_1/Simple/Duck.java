package DM.Chapter_1.Simple;

/**
 * @Author: Targue
 * @Date: 2021/6/9-9:47
 * @E-mail: 18961568969@163.com
 * @Description:
 **/
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

}
