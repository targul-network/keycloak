package net.targul.keycloak.eventlistener.provider;

import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.admin.AdminEvent;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmProvider;

import org.jboss.logging.Logger;

public class EventListenerProviderImpl implements EventListenerProvider {

    private static final Logger log = Logger.getLogger(EventListenerProviderImpl.class);

    private final KeycloakSession session;
    private final RealmProvider model;

    public EventListenerProviderImpl(KeycloakSession session) {
        this.session = session;
        this.model = session.realms();
    }

    @Override
    public void onEvent(Event event) {
        // todo
    }

    @Override
    public void onEvent(AdminEvent adminEvent, boolean b) {
        // todo
    }

    @Override
    public void close() {

    }
}
