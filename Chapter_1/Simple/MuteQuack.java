package DM.Chapter_1.Simple;

/**
 * @Author: Targue
 * @Date: 2021/6/9-9:59
 * @E-mail: 18961568969@163.com
 * @Description:
 **/
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
