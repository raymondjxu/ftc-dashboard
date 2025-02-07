package net.raymondjxu.ftc.dashboard.canvas;

public class Alpha extends CanvasOp {
    private double alpha;

    public Alpha(double alpha) {
        super(Type.ALPHA);

        this.alpha = alpha;
    }
}
