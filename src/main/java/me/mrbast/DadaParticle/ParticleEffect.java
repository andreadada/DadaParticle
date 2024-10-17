package me.mrbast.DadaParticle;

import org.bukkit.Location;

public abstract class ParticleEffect {

    protected Location location;

    public ParticleEffect(Location location) {
        this.location = location;
    }

    public abstract void init();
    public abstract TickStatus tick();
}