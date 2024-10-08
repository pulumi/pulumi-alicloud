// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetNamespacesArgs, GetNamespacesResult, GetNamespacesOutputArgs } from "./getNamespaces";
export const getNamespaces: typeof import("./getNamespaces").getNamespaces = null as any;
export const getNamespacesOutput: typeof import("./getNamespaces").getNamespacesOutput = null as any;
utilities.lazyLoad(exports, ["getNamespaces","getNamespacesOutput"], () => require("./getNamespaces"));

export { NamespaceArgs, NamespaceState } from "./namespace";
export type Namespace = import("./namespace").Namespace;
export const Namespace: typeof import("./namespace").Namespace = null as any;
utilities.lazyLoad(exports, ["Namespace"], () => require("./namespace"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:schedulerx/namespace:Namespace":
                return new Namespace(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "schedulerx/namespace", _module)
