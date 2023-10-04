public abstract class ShapeDecorator extends Trophee {

    protected Trophee trophee;

    public ShapeDecorator(Trophee trophee) {
        super(trophee.getOwner(), trophee.getBattle(), trophee.getStatus(), trophee.getName());
        this.trophee = trophee;
    }

    @Override
    public String getShape() {

        return this.trophee.getShape();
    }
}
