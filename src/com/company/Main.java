package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ProductionMaterial material=new ProductionMaterial("Углепластик",1.58);
        TwoD form=new TwoD(Color.Синий, 6, 6);
        System.out.println(form.info());
        TwoD form2=new TwoD(Color.Желтый, 6, 10);
        System.out.println(form2.info());
        ThreeD form3=new ThreeD(Color.Черный, 6, 6,6,material);
        System.out.println(form3.info());
        ThreeD form4=new ThreeD(Color.Синий, 6, 10, 10,material);
        System.out.println(form4.info());
    }

}
