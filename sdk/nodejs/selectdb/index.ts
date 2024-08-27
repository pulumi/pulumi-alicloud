// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { DbClusterArgs, DbClusterState } from "./dbCluster";
export type DbCluster = import("./dbCluster").DbCluster;
export const DbCluster: typeof import("./dbCluster").DbCluster = null as any;
utilities.lazyLoad(exports, ["DbCluster"], () => require("./dbCluster"));

export { DbInstanceArgs, DbInstanceState } from "./dbInstance";
export type DbInstance = import("./dbInstance").DbInstance;
export const DbInstance: typeof import("./dbInstance").DbInstance = null as any;
utilities.lazyLoad(exports, ["DbInstance"], () => require("./dbInstance"));

export { GetDbClustersArgs, GetDbClustersResult, GetDbClustersOutputArgs } from "./getDbClusters";
export const getDbClusters: typeof import("./getDbClusters").getDbClusters = null as any;
export const getDbClustersOutput: typeof import("./getDbClusters").getDbClustersOutput = null as any;
utilities.lazyLoad(exports, ["getDbClusters","getDbClustersOutput"], () => require("./getDbClusters"));

export { GetDbInstancesArgs, GetDbInstancesResult, GetDbInstancesOutputArgs } from "./getDbInstances";
export const getDbInstances: typeof import("./getDbInstances").getDbInstances = null as any;
export const getDbInstancesOutput: typeof import("./getDbInstances").getDbInstancesOutput = null as any;
utilities.lazyLoad(exports, ["getDbInstances","getDbInstancesOutput"], () => require("./getDbInstances"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:selectdb/dbCluster:DbCluster":
                return new DbCluster(name, <any>undefined, { urn })
            case "alicloud:selectdb/dbInstance:DbInstance":
                return new DbInstance(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "selectdb/dbCluster", _module)
pulumi.runtime.registerResourceModule("alicloud", "selectdb/dbInstance", _module)