package inher_poly;

class Noodle {
    double lengthInCentimeters;
    double widthInCentimeters;
    String shape;
    String ingredients;
    String texture = "brittle";

    public Noodle(double lengthInCentimeters, double widthInCentimeters, String shape, String ingredients) {
        this.lengthInCentimeters = lengthInCentimeters;
        this.widthInCentimeters = widthInCentimeters;
        this.shape = shape;
        this.ingredients = ingredients;
//        this.texture = texture;
    }

    public void cook(){
        this.texture = "cooked";
    }


}
