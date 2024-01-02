package beginner;
class First {    
    static int addition(int a, int b){
        return a+b;
    }
    public int addition_ (int a, int b){
        return a+b;
    }
    public static void main(String[] args) {   
        // static is used if we are trying to call a funtion from same class without calling object 
        System.out.println("value trhough static method = "+First.addition(1,2));
        //  public is used only if we are trying to call object 
        First obj = new First();
        System.out.println("value through public method = "+obj.addition_(4, 2));
}
}