// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AppGroupArgs, AppGroupState } from "./appGroup";
export type AppGroup = import("./appGroup").AppGroup;
export const AppGroup: typeof import("./appGroup").AppGroup = null as any;
utilities.lazyLoad(exports, ["AppGroup"], () => require("./appGroup"));

export { GetAppGroupsArgs, GetAppGroupsResult, GetAppGroupsOutputArgs } from "./getAppGroups";
export const getAppGroups: typeof import("./getAppGroups").getAppGroups = null as any;
export const getAppGroupsOutput: typeof import("./getAppGroups").getAppGroupsOutput = null as any;
utilities.lazyLoad(exports, ["getAppGroups","getAppGroupsOutput"], () => require("./getAppGroups"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:opensearch/appGroup:AppGroup":
                return new AppGroup(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "opensearch/appGroup", _module)