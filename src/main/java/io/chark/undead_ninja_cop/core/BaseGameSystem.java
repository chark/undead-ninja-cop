package io.chark.undead_ninja_cop.core;

import io.chark.undead_ninja_cop.config.Configuration;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Base implementation of entity system.
 */
public abstract class BaseGameSystem implements GameSystem {

    /**
     * Main game configuration settings.
     */
    protected final Configuration configuration = Configuration
            .getInstance();

    /**
     * Set of entities that this system works with.
     */
    protected final Set<Entity> entities = new HashSet<>();

    /**
     * Main resource loader for loading resources.
     */
    protected ResourceLoader resourceLoader;

    /**
     * Main entity manager.
     */
    protected EntityManager entityManager;

    @Override
    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    @Override
    public void removeEntity(Entity entity) {
        entities.remove(entity);
    }

    @Override
    public void removeEntities() {
        entities.clear();
    }

    @Override
    public void create() {
    }

    @Override
    public void dispose() {
    }

    @Override
    public void updateEntities(float dt) {
    }

    @Override
    public void renderEntities(float dt) {
    }

    @Override
    public Set<Class<? extends Component>> getComponentTypes() {
        return Collections.emptySet();
    }

    /**
     * Inject main game entity manager,
     */
    void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Inject resource loader.
     */
    void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}