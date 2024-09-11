package onlinemart;

public class cast {
    void  fun(){
        System.out.println("ok");

    }
}
class  run extends  cast{
    void fun(){
        System.out.println("ok 2");
    }

    public static void main(String[] args) {
        cast sc1=new run();
        sc1.fun();
        run sc2=(run)sc1;
        sc2.fun();

    }
}
