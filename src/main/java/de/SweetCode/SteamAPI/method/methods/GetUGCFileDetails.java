package de.SweetCode.SteamAPI.method.methods;

import de.SweetCode.SteamAPI.SteamHTTPMethod;
import de.SweetCode.SteamAPI.SteamHost;
import de.SweetCode.SteamAPI.SteamVersion;
import de.SweetCode.SteamAPI.SteamVisibility;
import de.SweetCode.SteamAPI.interfaces.ISteamRemoteStorage;
import de.SweetCode.SteamAPI.method.SteamMethod;
import de.SweetCode.SteamAPI.method.SteamMethodVersion;
import de.SweetCode.SteamAPI.method.option.Option;
import de.SweetCode.SteamAPI.method.option.OptionTypes;
import de.SweetCode.SteamAPI.method.option.options.AppIDOption;
import de.SweetCode.SteamAPI.method.option.options.KeyOption;

import java.util.Collections;

public class GetUGCFileDetails extends SteamMethod {

    public GetUGCFileDetails(ISteamRemoteStorage steamInterface) {
        super(
            steamInterface,
            "GetUGCFileDetails",
            Collections.singletonList(
                SteamMethodVersion.create()
                    .method(SteamHTTPMethod.GET)
                    .hosts(SteamHost.PUBLIC, SteamHost.PARTNER)
                    .version(SteamVersion.V_1)
                    .visibility(SteamVisibility.ALL)
                    .add(new KeyOption(false))
                    .add(new AppIDOption(true))
                    .add(
                        Option.create()
                            .key("ugcid")
                            .description("ID of UGC file to get info for.")
                            .optionType(OptionTypes.UINT_64)
                            .isRequired(true)
                        .build()
                    )
                    .add(
                        Option.create()
                            .key("steamid")
                            .description("If specified, only returns details if the file is owned by the SteamID specified.")
                            .optionType(OptionTypes.UINT_64)
                            .isRequired(false)
                        .build()
                    )
                .build()
            )
        );
    }

}
