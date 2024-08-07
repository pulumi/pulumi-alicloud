// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { OidcProviderArgs, OidcProviderState } from "./oidcProvider";
export type OidcProvider = import("./oidcProvider").OidcProvider;
export const OidcProvider: typeof import("./oidcProvider").OidcProvider = null as any;
utilities.lazyLoad(exports, ["OidcProvider"], () => require("./oidcProvider"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:ims/oidcProvider:OidcProvider":
                return new OidcProvider(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "ims/oidcProvider", _module)
