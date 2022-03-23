package com.company;

public class TwoD extends Figure{
    private float height;

    public TwoD(Color color, float lenght, float height) {
        super(color, lenght);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }
    private float foundSquare(){
        return (height*getLenght());
    }
    public float foundPerimetre(){
        return ((height+getLenght())*2);
    }
    //Пока не нашел применение)))
   // public float foundSquare(float diogonal) {
   //     return ((diogonal*diogonal)/2);
   // }
   // final public double foundPerimetre(double diogonal) {
   //     return ((diogonal*2*1.41));
   //}
    public String figure(){
        if (getLenght()==height)
            return "Квадрад";
        else
            return "Прямоугольник";
    }
    public String info(){
        return ("Цвет: "+getColor()+
                "\nДлина: "+ getLenght()+"см"+
                "\nВысота: "+height+"см"+
                "\nПлощадь: "+foundSquare()+"см2"+
                "\nПериметр: "+foundPerimetre()+"см"+
                "\n"+figure()+"\n");
    }
}
