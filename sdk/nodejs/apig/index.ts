// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { EnvironmentArgs, EnvironmentState } from "./environment";
export type Environment = import("./environment").Environment;
export const Environment: typeof import("./environment").Environment = null as any;
utilities.lazyLoad(exports, ["Environment"], () => require("./environment"));

export { GatewayArgs, GatewayState } from "./gateway";
export type Gateway = import("./gateway").Gateway;
export const Gateway: typeof import("./gateway").Gateway = null as any;
utilities.lazyLoad(exports, ["Gateway"], () => require("./gateway"));

export { HttpApiArgs, HttpApiState } from "./httpApi";
export type HttpApi = import("./httpApi").HttpApi;
export const HttpApi: typeof import("./httpApi").HttpApi = null as any;
utilities.lazyLoad(exports, ["HttpApi"], () => require("./httpApi"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:apig/environment:Environment":
                return new Environment(name, <any>undefined, { urn })
            case "alicloud:apig/gateway:Gateway":
                return new Gateway(name, <any>undefined, { urn })
            case "alicloud:apig/httpApi:HttpApi":
                return new HttpApi(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "apig/environment", _module)
pulumi.runtime.registerResourceModule("alicloud", "apig/gateway", _module)
pulumi.runtime.registerResourceModule("alicloud", "apig/httpApi", _module)
