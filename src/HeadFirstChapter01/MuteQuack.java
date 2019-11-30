package HeadFirstChapter01;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Silence :X");
    }
}
