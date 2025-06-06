// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AuditCallbackArgs, AuditCallbackState } from "./auditCallback";
export type AuditCallback = import("./auditCallback").AuditCallback;
export const AuditCallback: typeof import("./auditCallback").AuditCallback = null as any;
utilities.lazyLoad(exports, ["AuditCallback"], () => require("./auditCallback"));

export { BizTypeArgs, BizTypeState } from "./bizType";
export type BizType = import("./bizType").BizType;
export const BizType: typeof import("./bizType").BizType = null as any;
utilities.lazyLoad(exports, ["BizType"], () => require("./bizType"));

export { CallbackArgs, CallbackState } from "./callback";
export type Callback = import("./callback").Callback;
export const Callback: typeof import("./callback").Callback = null as any;
utilities.lazyLoad(exports, ["Callback"], () => require("./callback"));

export { ImageLibArgs, ImageLibState } from "./imageLib";
export type ImageLib = import("./imageLib").ImageLib;
export const ImageLib: typeof import("./imageLib").ImageLib = null as any;
utilities.lazyLoad(exports, ["ImageLib"], () => require("./imageLib"));

export { KeywordLibArgs, KeywordLibState } from "./keywordLib";
export type KeywordLib = import("./keywordLib").KeywordLib;
export const KeywordLib: typeof import("./keywordLib").KeywordLib = null as any;
utilities.lazyLoad(exports, ["KeywordLib"], () => require("./keywordLib"));

export { OssStockTaskArgs, OssStockTaskState } from "./ossStockTask";
export type OssStockTask = import("./ossStockTask").OssStockTask;
export const OssStockTask: typeof import("./ossStockTask").OssStockTask = null as any;
utilities.lazyLoad(exports, ["OssStockTask"], () => require("./ossStockTask"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:aligreen/auditCallback:AuditCallback":
                return new AuditCallback(name, <any>undefined, { urn })
            case "alicloud:aligreen/bizType:BizType":
                return new BizType(name, <any>undefined, { urn })
            case "alicloud:aligreen/callback:Callback":
                return new Callback(name, <any>undefined, { urn })
            case "alicloud:aligreen/imageLib:ImageLib":
                return new ImageLib(name, <any>undefined, { urn })
            case "alicloud:aligreen/keywordLib:KeywordLib":
                return new KeywordLib(name, <any>undefined, { urn })
            case "alicloud:aligreen/ossStockTask:OssStockTask":
                return new OssStockTask(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "aligreen/auditCallback", _module)
pulumi.runtime.registerResourceModule("alicloud", "aligreen/bizType", _module)
pulumi.runtime.registerResourceModule("alicloud", "aligreen/callback", _module)
pulumi.runtime.registerResourceModule("alicloud", "aligreen/imageLib", _module)
pulumi.runtime.registerResourceModule("alicloud", "aligreen/keywordLib", _module)
pulumi.runtime.registerResourceModule("alicloud", "aligreen/ossStockTask", _module)
