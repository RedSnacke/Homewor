package com.company;

final public class ThreeD extends TwoD{
    private float width;
    private ProductionMaterial material;

    public ThreeD(Color color, float lenght, float height, float width, ProductionMaterial material) {
        super(color, lenght, height);
        this.width = width;
        this.material = material;
    }

    public float getWidth() {
        return width;
    }

    public ProductionMaterial getMaterial() {
        return material;
    }

    private float foundVolume(){
        return (width*getHeight()*getLenght());
    }

    @Override
    public String figure() {
        if (width==getHeight()&&width==getLenght())
            return "Куб";
        else
            return "Параллелепипед";
    }

    @Override
    public String info() {
        return "Цвет: "+getColor()+
                "\nДлина: "+ getLenght()+"см"+
                "\nВысота: "+getHeight()+"см"+
                "\nШирина: "+width+"см"+
                "\nОбъем: "+foundVolume()+"см3"+
                "\nФигура: "+figure()+
                "\nМатериал: "+material.getMaterial()+
                "\nПрочность: "+material.getStrenght()+"гр/см3"+"\n";
    }
}