package common;


public class LearningExtends {
    private String s;
    private int i;
    public LearningExtends(){
        System.out.println("父类无参构造函数");
    }

    LearningExtends(String s, int i){
        this.s = s;
        this.i = i;
        System.out.println("父类有参构造函数, s = " + s + " i = " + i);
    }
}

class LearningExtends1 extends LearningExtends{
    private String s;
    private int i;
    LearningExtends1(){
        super();
        System.out.println("子类无参构造函数");

    }

    LearningExtends1(String s, int i){
        super(s, i);
        System.out.println("子类有参构造函数, s = " + s + " i = " + i);
        this.s = s + s;
        this.i = i * i;

    }



    public static void main(String[] args) {
        LearningExtends1 learningExtends1 = new LearningExtends1();
        LearningExtends1 learningExtends2 = new LearningExtends1("Hello Jack",12);
        System.out.println(learningExtends2.s + learningExtends2.i);
    }
}


class LearningExtends3 extends LearningExtends{
    public static void main(String[] args) {
        new LearningExtends1("Hello Jack",12);
    }
}