package me.mrbast.DadaParticle;

import org.bukkit.Location;
import org.bukkit.Particle;


public class DotParticleEffect extends ParticleEffect {

    private Particle particle;

    public DotParticleEffect(Location location, Particle particle) {
        super(location);
        this.particle = particle;
    }

    @Override
    public void init() {

    }

    @Override
    public TickStatus tick() {
        location.getWorld().spawnParticle(particle, location, 1);
        return TickStatus.END;
    }
}
