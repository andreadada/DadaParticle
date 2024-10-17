package me.mrbast.DadaParticle;

import org.bukkit.plugin.java.JavaPlugin;

public class DadaParticle {



    private ParticleExecutor particleExecutor;
    private JavaPlugin javaPlugin;

    public  DadaParticle(JavaPlugin javaPlugin){
        this.javaPlugin = javaPlugin;
    }



    public ParticleExecutor getParticleExecutor() {
        return particleExecutor;
    }

    public void setParticleExecutor(ParticleExecutor particleExecutor) {
        this.particleExecutor = particleExecutor;
    }
}
