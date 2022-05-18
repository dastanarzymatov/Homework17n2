public class Main {
    public static void main(String[] args) {

        AbstractShape abstractShape=new ShapeInfo();
        System.out.println(abstractShape.getPerimeter());
        AbstractShape abstractShape2=new Bio();
        System.out.println(abstractShape2.getPerimeter());
        AbstractShape abstractShape3=new Sinus();
        System.out.println(abstractShape3.getPerimeter());
        AbstractShape abstractShape4=new Kosinus();
        System.out.println(abstractShape4.getPerimeter());
        AbstractShape abstractShape5=new Tanges();
        System.out.println(abstractShape5.getPerimeter());

    }
}