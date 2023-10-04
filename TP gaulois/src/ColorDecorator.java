public class ColorDecorator extends ShapeDecorator {

    private String color;
    public ColorDecorator(Trophee trophee, String color) {
        super(trophee);
        this.color = color;
    }

    @Override
    public String getShape() {
        return (super.getShape() + ", " + this.color);
    }
}
