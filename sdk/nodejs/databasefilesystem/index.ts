// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AutoSnapShotPolicyArgs, AutoSnapShotPolicyState } from "./autoSnapShotPolicy";
export type AutoSnapShotPolicy = import("./autoSnapShotPolicy").AutoSnapShotPolicy;
export const AutoSnapShotPolicy: typeof import("./autoSnapShotPolicy").AutoSnapShotPolicy = null as any;
utilities.lazyLoad(exports, ["AutoSnapShotPolicy"], () => require("./autoSnapShotPolicy"));

export { GetAutoSnapShotPoliciesArgs, GetAutoSnapShotPoliciesResult, GetAutoSnapShotPoliciesOutputArgs } from "./getAutoSnapShotPolicies";
export const getAutoSnapShotPolicies: typeof import("./getAutoSnapShotPolicies").getAutoSnapShotPolicies = null as any;
export const getAutoSnapShotPoliciesOutput: typeof import("./getAutoSnapShotPolicies").getAutoSnapShotPoliciesOutput = null as any;
utilities.lazyLoad(exports, ["getAutoSnapShotPolicies","getAutoSnapShotPoliciesOutput"], () => require("./getAutoSnapShotPolicies"));

export { GetInstancesArgs, GetInstancesResult, GetInstancesOutputArgs } from "./getInstances";
export const getInstances: typeof import("./getInstances").getInstances = null as any;
export const getInstancesOutput: typeof import("./getInstances").getInstancesOutput = null as any;
utilities.lazyLoad(exports, ["getInstances","getInstancesOutput"], () => require("./getInstances"));

export { GetSnapshotsArgs, GetSnapshotsResult, GetSnapshotsOutputArgs } from "./getSnapshots";
export const getSnapshots: typeof import("./getSnapshots").getSnapshots = null as any;
export const getSnapshotsOutput: typeof import("./getSnapshots").getSnapshotsOutput = null as any;
utilities.lazyLoad(exports, ["getSnapshots","getSnapshotsOutput"], () => require("./getSnapshots"));

export { InstanceArgs, InstanceState } from "./instance";
export type Instance = import("./instance").Instance;
export const Instance: typeof import("./instance").Instance = null as any;
utilities.lazyLoad(exports, ["Instance"], () => require("./instance"));

export { InstanceAttachmentArgs, InstanceAttachmentState } from "./instanceAttachment";
export type InstanceAttachment = import("./instanceAttachment").InstanceAttachment;
export const InstanceAttachment: typeof import("./instanceAttachment").InstanceAttachment = null as any;
utilities.lazyLoad(exports, ["InstanceAttachment"], () => require("./instanceAttachment"));

export { ServiceLinkedRoleArgs, ServiceLinkedRoleState } from "./serviceLinkedRole";
export type ServiceLinkedRole = import("./serviceLinkedRole").ServiceLinkedRole;
export const ServiceLinkedRole: typeof import("./serviceLinkedRole").ServiceLinkedRole = null as any;
utilities.lazyLoad(exports, ["ServiceLinkedRole"], () => require("./serviceLinkedRole"));

export { SnapshotArgs, SnapshotState } from "./snapshot";
export type Snapshot = import("./snapshot").Snapshot;
export const Snapshot: typeof import("./snapshot").Snapshot = null as any;
utilities.lazyLoad(exports, ["Snapshot"], () => require("./snapshot"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:databasefilesystem/autoSnapShotPolicy:AutoSnapShotPolicy":
                return new AutoSnapShotPolicy(name, <any>undefined, { urn })
            case "alicloud:databasefilesystem/instance:Instance":
                return new Instance(name, <any>undefined, { urn })
            case "alicloud:databasefilesystem/instanceAttachment:InstanceAttachment":
                return new InstanceAttachment(name, <any>undefined, { urn })
            case "alicloud:databasefilesystem/serviceLinkedRole:ServiceLinkedRole":
                return new ServiceLinkedRole(name, <any>undefined, { urn })
            case "alicloud:databasefilesystem/snapshot:Snapshot":
                return new Snapshot(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "databasefilesystem/autoSnapShotPolicy", _module)
pulumi.runtime.registerResourceModule("alicloud", "databasefilesystem/instance", _module)
pulumi.runtime.registerResourceModule("alicloud", "databasefilesystem/instanceAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "databasefilesystem/serviceLinkedRole", _module)
pulumi.runtime.registerResourceModule("alicloud", "databasefilesystem/snapshot", _module)
