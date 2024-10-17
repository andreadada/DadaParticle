package me.mrbast.DadaParticle;


import org.bukkit.Location;


public class LineParticleEffect extends ParticleEffect {

    private double amount;
    private int step;
    private double stepLengthX;
    private double stepLengthY;
    private double stepLengthZ;
    private ParticleEffect dotParticle;

    public LineParticleEffect(Location start, Location end, ParticleEffect particle, double amount) {
        super(start);
        this.amount = amount;
        this.step = 0;

        this.stepLengthX = (end.getX() - start.getX()) / amount;
        this.stepLengthY = (end.getY() - start.getY()) / amount;
        this.stepLengthZ = (end.getZ() - start.getZ()) / amount;

        this.dotParticle = particle;
    }

    @Override
    public void init() {

    }

    @Override
    public TickStatus tick() {
        double x = location.getX() + (step * stepLengthX);
        double y = location.getY() + (step * stepLengthY);
        double z = location.getZ() + (step * stepLengthZ);


        dotParticle.location = new Location(location.getWorld(), x, y, z);
        dotParticle.tick();

        step++;
        return step >= amount ? TickStatus.END : TickStatus.CONTINUE;
    }
}