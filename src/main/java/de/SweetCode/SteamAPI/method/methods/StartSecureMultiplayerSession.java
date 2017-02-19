package de.SweetCode.SteamAPI.method.methods;

import de.SweetCode.SteamAPI.SteamHTTPMethod;
import de.SweetCode.SteamAPI.SteamHost;
import de.SweetCode.SteamAPI.SteamVersion;
import de.SweetCode.SteamAPI.SteamVisibility;
import de.SweetCode.SteamAPI.interfaces.ICheatReportingService;
import de.SweetCode.SteamAPI.method.SteamMethod;
import de.SweetCode.SteamAPI.method.input.Input;
import de.SweetCode.SteamAPI.method.option.SteamMethodVersion;
import de.SweetCode.SteamAPI.method.option.options.AppIDOption;
import de.SweetCode.SteamAPI.method.option.options.KeyOption;
import de.SweetCode.SteamAPI.method.option.options.SteamIDOption;
import de.SweetCode.SteamAPI.method.result.SteamMethodResult;

import java.util.Collections;

public class StartSecureMultiplayerSession extends SteamMethod {

    public StartSecureMultiplayerSession(ICheatReportingService steamInterface) {
        super(
            steamInterface,
            "StartSecureMultiplayerSession",
            Collections.singletonList(
                SteamMethodVersion.create()
                    .method(SteamHTTPMethod.POST)
                    .hosts(SteamHost.PUBLIC, SteamHost.PARTNER)
                    .version(SteamVersion.V_1)
                    .visibility(SteamVisibility.PUBLISHER)
                    .add(new KeyOption(true))
                    .add(new SteamIDOption(true))
                    .add(new AppIDOption(true))
                .build()
            )
        );
    }

    @Override
    public SteamMethodResult execute(SteamHTTPMethod method, SteamHost host, SteamVersion version, Input input) {
        return null;
    }
}