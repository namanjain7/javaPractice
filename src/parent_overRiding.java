public class parent_overRiding {
    private void m1(){
        System.out.println("This is m1 of parent class!");
    }
    protected void m2(){
        System.out.println("This is m2 of parent class");
    }
}

class child_overRiding extends parent_overRiding{
    private void m1(){
        System.out.println("This is m1 of child class!");
    }

    @Override
    public void m2() {
        System.out.println("This is m2 of child class!!");
    }
}
