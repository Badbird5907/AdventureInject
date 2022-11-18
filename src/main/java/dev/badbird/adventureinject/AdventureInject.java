package dev.badbird.adventureinject;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(
        id = "adventureinject",
        name = "AdventureInject",
        version = BuildConstants.VERSION
)
public class AdventureInject {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) throws ClassNotFoundException {
        Class.forName("net.kyori" + ".text" + ".Component");
        logger.info("Adventure injected.");
    }
}
