// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ShortUrlArgs, ShortUrlState } from "./shortUrl";
export type ShortUrl = import("./shortUrl").ShortUrl;
export const ShortUrl: typeof import("./shortUrl").ShortUrl = null as any;
utilities.lazyLoad(exports, ["ShortUrl"], () => require("./shortUrl"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:sms/shortUrl:ShortUrl":
                return new ShortUrl(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "sms/shortUrl", _module)