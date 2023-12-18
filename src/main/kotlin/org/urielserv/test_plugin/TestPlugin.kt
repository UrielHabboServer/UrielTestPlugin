package org.urielserv.test_plugin

import org.urielserv.uriel.core.event_dispatcher.Events
import org.urielserv.uriel.core.event_dispatcher.events.rooms.RoomEnterEvent
import org.urielserv.uriel.core.plugin_loader.UrielPlugin
import org.urielserv.uriel.extensions.on

class TestPlugin : UrielPlugin() {

    override suspend fun onLoad() {
        logger.info("Preparing events...")

        on(Events.RoomEnter) { event ->
            event as RoomEnterEvent

            val habbo = event.habbo

            if (habbo.info.username == "Uriel") {
                habbo.notifications.sendAlert("Welcome!")
            }
        }
    }

}