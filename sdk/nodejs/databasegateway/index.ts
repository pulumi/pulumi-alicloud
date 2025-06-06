// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GatewayArgs, GatewayState } from "./gateway";
export type Gateway = import("./gateway").Gateway;
export const Gateway: typeof import("./gateway").Gateway = null as any;
utilities.lazyLoad(exports, ["Gateway"], () => require("./gateway"));

export { GetGatewaysArgs, GetGatewaysResult, GetGatewaysOutputArgs } from "./getGateways";
export const getGateways: typeof import("./getGateways").getGateways = null as any;
export const getGatewaysOutput: typeof import("./getGateways").getGatewaysOutput = null as any;
utilities.lazyLoad(exports, ["getGateways","getGatewaysOutput"], () => require("./getGateways"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:databasegateway/gateway:Gateway":
                return new Gateway(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "databasegateway/gateway", _module)
