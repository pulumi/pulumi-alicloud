// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetInstanceAttachmentsArgs, GetInstanceAttachmentsResult, GetInstanceAttachmentsOutputArgs } from "./getInstanceAttachments";
export const getInstanceAttachments: typeof import("./getInstanceAttachments").getInstanceAttachments = null as any;
export const getInstanceAttachmentsOutput: typeof import("./getInstanceAttachments").getInstanceAttachmentsOutput = null as any;
utilities.lazyLoad(exports, ["getInstanceAttachments","getInstanceAttachmentsOutput"], () => require("./getInstanceAttachments"));

export { GetInstancesArgs, GetInstancesResult, GetInstancesOutputArgs } from "./getInstances";
export const getInstances: typeof import("./getInstances").getInstances = null as any;
export const getInstancesOutput: typeof import("./getInstances").getInstancesOutput = null as any;
utilities.lazyLoad(exports, ["getInstances","getInstancesOutput"], () => require("./getInstances"));

export { GetSearchIndexesArgs, GetSearchIndexesResult, GetSearchIndexesOutputArgs } from "./getSearchIndexes";
export const getSearchIndexes: typeof import("./getSearchIndexes").getSearchIndexes = null as any;
export const getSearchIndexesOutput: typeof import("./getSearchIndexes").getSearchIndexesOutput = null as any;
utilities.lazyLoad(exports, ["getSearchIndexes","getSearchIndexesOutput"], () => require("./getSearchIndexes"));

export { GetSecondaryIndexesArgs, GetSecondaryIndexesResult, GetSecondaryIndexesOutputArgs } from "./getSecondaryIndexes";
export const getSecondaryIndexes: typeof import("./getSecondaryIndexes").getSecondaryIndexes = null as any;
export const getSecondaryIndexesOutput: typeof import("./getSecondaryIndexes").getSecondaryIndexesOutput = null as any;
utilities.lazyLoad(exports, ["getSecondaryIndexes","getSecondaryIndexesOutput"], () => require("./getSecondaryIndexes"));

export { GetServiceArgs, GetServiceResult, GetServiceOutputArgs } from "./getService";
export const getService: typeof import("./getService").getService = null as any;
export const getServiceOutput: typeof import("./getService").getServiceOutput = null as any;
utilities.lazyLoad(exports, ["getService","getServiceOutput"], () => require("./getService"));

export { GetTablesArgs, GetTablesResult, GetTablesOutputArgs } from "./getTables";
export const getTables: typeof import("./getTables").getTables = null as any;
export const getTablesOutput: typeof import("./getTables").getTablesOutput = null as any;
utilities.lazyLoad(exports, ["getTables","getTablesOutput"], () => require("./getTables"));

export { GetTunnelsArgs, GetTunnelsResult, GetTunnelsOutputArgs } from "./getTunnels";
export const getTunnels: typeof import("./getTunnels").getTunnels = null as any;
export const getTunnelsOutput: typeof import("./getTunnels").getTunnelsOutput = null as any;
utilities.lazyLoad(exports, ["getTunnels","getTunnelsOutput"], () => require("./getTunnels"));

export { InstanceArgs, InstanceState } from "./instance";
export type Instance = import("./instance").Instance;
export const Instance: typeof import("./instance").Instance = null as any;
utilities.lazyLoad(exports, ["Instance"], () => require("./instance"));

export { InstanceAttachmentArgs, InstanceAttachmentState } from "./instanceAttachment";
export type InstanceAttachment = import("./instanceAttachment").InstanceAttachment;
export const InstanceAttachment: typeof import("./instanceAttachment").InstanceAttachment = null as any;
utilities.lazyLoad(exports, ["InstanceAttachment"], () => require("./instanceAttachment"));

export { SearchIndexArgs, SearchIndexState } from "./searchIndex";
export type SearchIndex = import("./searchIndex").SearchIndex;
export const SearchIndex: typeof import("./searchIndex").SearchIndex = null as any;
utilities.lazyLoad(exports, ["SearchIndex"], () => require("./searchIndex"));

export { SecondaryIndexArgs, SecondaryIndexState } from "./secondaryIndex";
export type SecondaryIndex = import("./secondaryIndex").SecondaryIndex;
export const SecondaryIndex: typeof import("./secondaryIndex").SecondaryIndex = null as any;
utilities.lazyLoad(exports, ["SecondaryIndex"], () => require("./secondaryIndex"));

export { TableArgs, TableState } from "./table";
export type Table = import("./table").Table;
export const Table: typeof import("./table").Table = null as any;
utilities.lazyLoad(exports, ["Table"], () => require("./table"));

export { TunnelArgs, TunnelState } from "./tunnel";
export type Tunnel = import("./tunnel").Tunnel;
export const Tunnel: typeof import("./tunnel").Tunnel = null as any;
utilities.lazyLoad(exports, ["Tunnel"], () => require("./tunnel"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:ots/instance:Instance":
                return new Instance(name, <any>undefined, { urn })
            case "alicloud:ots/instanceAttachment:InstanceAttachment":
                return new InstanceAttachment(name, <any>undefined, { urn })
            case "alicloud:ots/searchIndex:SearchIndex":
                return new SearchIndex(name, <any>undefined, { urn })
            case "alicloud:ots/secondaryIndex:SecondaryIndex":
                return new SecondaryIndex(name, <any>undefined, { urn })
            case "alicloud:ots/table:Table":
                return new Table(name, <any>undefined, { urn })
            case "alicloud:ots/tunnel:Tunnel":
                return new Tunnel(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "ots/instance", _module)
pulumi.runtime.registerResourceModule("alicloud", "ots/instanceAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "ots/searchIndex", _module)
pulumi.runtime.registerResourceModule("alicloud", "ots/secondaryIndex", _module)
pulumi.runtime.registerResourceModule("alicloud", "ots/table", _module)
pulumi.runtime.registerResourceModule("alicloud", "ots/tunnel", _module)
