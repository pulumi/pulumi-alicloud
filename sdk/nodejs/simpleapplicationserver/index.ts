// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./customImage";
export * from "./firewallRule";
export * from "./getImages";
export * from "./getInstances";
export * from "./getServerCustomImages";
export * from "./getServerDisks";
export * from "./getServerFirewallRules";
export * from "./getServerPlans";
export * from "./getServerSnapshots";
export * from "./instance";
export * from "./snapshot";

// Import resources to register:
import { CustomImage } from "./customImage";
import { FirewallRule } from "./firewallRule";
import { Instance } from "./instance";
import { Snapshot } from "./snapshot";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:simpleapplicationserver/customImage:CustomImage":
                return new CustomImage(name, <any>undefined, { urn })
            case "alicloud:simpleapplicationserver/firewallRule:FirewallRule":
                return new FirewallRule(name, <any>undefined, { urn })
            case "alicloud:simpleapplicationserver/instance:Instance":
                return new Instance(name, <any>undefined, { urn })
            case "alicloud:simpleapplicationserver/snapshot:Snapshot":
                return new Snapshot(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "simpleapplicationserver/customImage", _module)
pulumi.runtime.registerResourceModule("alicloud", "simpleapplicationserver/firewallRule", _module)
pulumi.runtime.registerResourceModule("alicloud", "simpleapplicationserver/instance", _module)
pulumi.runtime.registerResourceModule("alicloud", "simpleapplicationserver/snapshot", _module)