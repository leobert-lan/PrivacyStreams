package com.github.privacystreams.communication;

import android.Manifest;

import com.github.privacystreams.core.providers.MStreamProvider;

/**
 * Provide a live stream of phone call events.
 */

public class PhonecallUpdatesProvider extends MStreamProvider {

    PhonecallUpdatesProvider() {
        this.addRequiredPermissions(Manifest.permission.PROCESS_OUTGOING_CALLS);
        this.addRequiredPermissions(Manifest.permission.READ_PHONE_STATE);
    }

    @Override
    protected void provide() {
        // TODO implement this
    }
}
