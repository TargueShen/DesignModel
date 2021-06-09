package DM.Chapter_1.Dynamic;

/**
 * @Author: Targue
 * @Date: 2021/6/9-10:17
 * @E-mail: 18961568969@163.com
 * @Description:
 **/
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
