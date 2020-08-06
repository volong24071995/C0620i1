public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(){
    }
    public QuadraticEquation( double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getterA(){
        return this.a;
    }
    public double getterB(){
        return this.b;
    }
    public double getterC(){
        return this.c;
    }
    public double getDiscriminant(){
        return (Math.pow(getterB(),2))-4*getterA()*getterC();
    }
    public double getRoot1(){
        return (-getterB()+Math.sqrt(getDiscriminant()))/(2*getterA());
    }
    public double getRoot2(){
        return (-getterB()-Math.sqrt(getDiscriminant()))/(2*getterA());
    }
}
