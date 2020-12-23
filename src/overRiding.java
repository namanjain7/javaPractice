public class overRiding {
    class parent{
        private void m1(){
            System.out.println("This is m1 of parent class!");
        }
        protected void m2(){
            System.out.println("This is m2 of parent class");
        }
    }
    class child extends parent{
        private void m1(){
            System.out.println("This is m1 of child class!");
        }

        @Override
        public void m2() {
            System.out.println("This is m2 of child class!!");
        }
    }
}
