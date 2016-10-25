package io.chark.undead_ninja_cop.engine.system.tiled;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.World;
import io.chark.undead_ninja_cop.core.GameSystem;
import io.chark.undead_ninja_cop.core.GameSystemFactory;

public class TiledSystemFactory implements GameSystemFactory {

    private final OrthographicCamera camera;
    private final SpriteBatch spriteBatch;
    private final World world;

    public TiledSystemFactory(OrthographicCamera camera,
                              SpriteBatch spriteBatch,
                              World world) {

        this.camera = camera;
        this.spriteBatch = spriteBatch;
        this.world = world;
    }

    @Override
    public GameSystem create() {
        return new TiledMapSystem(camera, spriteBatch, world);
    }
}