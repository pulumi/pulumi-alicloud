// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AclArgs, AclState } from "./acl";
export type Acl = import("./acl").Acl;
export const Acl: typeof import("./acl").Acl = null as any;
utilities.lazyLoad(exports, ["Acl"], () => require("./acl"));

export { AclEntryAttachmentArgs, AclEntryAttachmentState } from "./aclEntryAttachment";
export type AclEntryAttachment = import("./aclEntryAttachment").AclEntryAttachment;
export const AclEntryAttachment: typeof import("./aclEntryAttachment").AclEntryAttachment = null as any;
utilities.lazyLoad(exports, ["AclEntryAttachment"], () => require("./aclEntryAttachment"));

export { AScriptArgs, AScriptState } from "./ascript";
export type AScript = import("./ascript").AScript;
export const AScript: typeof import("./ascript").AScript = null as any;
utilities.lazyLoad(exports, ["AScript"], () => require("./ascript"));

export { GetAclsArgs, GetAclsResult, GetAclsOutputArgs } from "./getAcls";
export const getAcls: typeof import("./getAcls").getAcls = null as any;
export const getAclsOutput: typeof import("./getAcls").getAclsOutput = null as any;
utilities.lazyLoad(exports, ["getAcls","getAclsOutput"], () => require("./getAcls"));

export { GetAscriptsArgs, GetAscriptsResult, GetAscriptsOutputArgs } from "./getAscripts";
export const getAscripts: typeof import("./getAscripts").getAscripts = null as any;
export const getAscriptsOutput: typeof import("./getAscripts").getAscriptsOutput = null as any;
utilities.lazyLoad(exports, ["getAscripts","getAscriptsOutput"], () => require("./getAscripts"));

export { GetHealthCheckTemplatesArgs, GetHealthCheckTemplatesResult, GetHealthCheckTemplatesOutputArgs } from "./getHealthCheckTemplates";
export const getHealthCheckTemplates: typeof import("./getHealthCheckTemplates").getHealthCheckTemplates = null as any;
export const getHealthCheckTemplatesOutput: typeof import("./getHealthCheckTemplates").getHealthCheckTemplatesOutput = null as any;
utilities.lazyLoad(exports, ["getHealthCheckTemplates","getHealthCheckTemplatesOutput"], () => require("./getHealthCheckTemplates"));

export { GetListenersArgs, GetListenersResult, GetListenersOutputArgs } from "./getListeners";
export const getListeners: typeof import("./getListeners").getListeners = null as any;
export const getListenersOutput: typeof import("./getListeners").getListenersOutput = null as any;
utilities.lazyLoad(exports, ["getListeners","getListenersOutput"], () => require("./getListeners"));

export { GetLoadBalancersArgs, GetLoadBalancersResult, GetLoadBalancersOutputArgs } from "./getLoadBalancers";
export const getLoadBalancers: typeof import("./getLoadBalancers").getLoadBalancers = null as any;
export const getLoadBalancersOutput: typeof import("./getLoadBalancers").getLoadBalancersOutput = null as any;
utilities.lazyLoad(exports, ["getLoadBalancers","getLoadBalancersOutput"], () => require("./getLoadBalancers"));

export { GetRulesArgs, GetRulesResult, GetRulesOutputArgs } from "./getRules";
export const getRules: typeof import("./getRules").getRules = null as any;
export const getRulesOutput: typeof import("./getRules").getRulesOutput = null as any;
utilities.lazyLoad(exports, ["getRules","getRulesOutput"], () => require("./getRules"));

export { GetSecurityPoliciesArgs, GetSecurityPoliciesResult, GetSecurityPoliciesOutputArgs } from "./getSecurityPolicies";
export const getSecurityPolicies: typeof import("./getSecurityPolicies").getSecurityPolicies = null as any;
export const getSecurityPoliciesOutput: typeof import("./getSecurityPolicies").getSecurityPoliciesOutput = null as any;
utilities.lazyLoad(exports, ["getSecurityPolicies","getSecurityPoliciesOutput"], () => require("./getSecurityPolicies"));

export { GetServerGroupsArgs, GetServerGroupsResult, GetServerGroupsOutputArgs } from "./getServerGroups";
export const getServerGroups: typeof import("./getServerGroups").getServerGroups = null as any;
export const getServerGroupsOutput: typeof import("./getServerGroups").getServerGroupsOutput = null as any;
utilities.lazyLoad(exports, ["getServerGroups","getServerGroupsOutput"], () => require("./getServerGroups"));

export { GetSystemSecurityPoliciesArgs, GetSystemSecurityPoliciesResult, GetSystemSecurityPoliciesOutputArgs } from "./getSystemSecurityPolicies";
export const getSystemSecurityPolicies: typeof import("./getSystemSecurityPolicies").getSystemSecurityPolicies = null as any;
export const getSystemSecurityPoliciesOutput: typeof import("./getSystemSecurityPolicies").getSystemSecurityPoliciesOutput = null as any;
utilities.lazyLoad(exports, ["getSystemSecurityPolicies","getSystemSecurityPoliciesOutput"], () => require("./getSystemSecurityPolicies"));

export { GetZonesArgs, GetZonesResult, GetZonesOutputArgs } from "./getZones";
export const getZones: typeof import("./getZones").getZones = null as any;
export const getZonesOutput: typeof import("./getZones").getZonesOutput = null as any;
utilities.lazyLoad(exports, ["getZones","getZonesOutput"], () => require("./getZones"));

export { HealthCheckTemplateArgs, HealthCheckTemplateState } from "./healthCheckTemplate";
export type HealthCheckTemplate = import("./healthCheckTemplate").HealthCheckTemplate;
export const HealthCheckTemplate: typeof import("./healthCheckTemplate").HealthCheckTemplate = null as any;
utilities.lazyLoad(exports, ["HealthCheckTemplate"], () => require("./healthCheckTemplate"));

export { ListenerArgs, ListenerState } from "./listener";
export type Listener = import("./listener").Listener;
export const Listener: typeof import("./listener").Listener = null as any;
utilities.lazyLoad(exports, ["Listener"], () => require("./listener"));

export { ListenerAclAttachmentArgs, ListenerAclAttachmentState } from "./listenerAclAttachment";
export type ListenerAclAttachment = import("./listenerAclAttachment").ListenerAclAttachment;
export const ListenerAclAttachment: typeof import("./listenerAclAttachment").ListenerAclAttachment = null as any;
utilities.lazyLoad(exports, ["ListenerAclAttachment"], () => require("./listenerAclAttachment"));

export { ListenerAdditionalCertificateAttachmentArgs, ListenerAdditionalCertificateAttachmentState } from "./listenerAdditionalCertificateAttachment";
export type ListenerAdditionalCertificateAttachment = import("./listenerAdditionalCertificateAttachment").ListenerAdditionalCertificateAttachment;
export const ListenerAdditionalCertificateAttachment: typeof import("./listenerAdditionalCertificateAttachment").ListenerAdditionalCertificateAttachment = null as any;
utilities.lazyLoad(exports, ["ListenerAdditionalCertificateAttachment"], () => require("./listenerAdditionalCertificateAttachment"));

export { LoadBalancerArgs, LoadBalancerState } from "./loadBalancer";
export type LoadBalancer = import("./loadBalancer").LoadBalancer;
export const LoadBalancer: typeof import("./loadBalancer").LoadBalancer = null as any;
utilities.lazyLoad(exports, ["LoadBalancer"], () => require("./loadBalancer"));

export { LoadBalancerCommonBandwidthPackageAttachmentArgs, LoadBalancerCommonBandwidthPackageAttachmentState } from "./loadBalancerCommonBandwidthPackageAttachment";
export type LoadBalancerCommonBandwidthPackageAttachment = import("./loadBalancerCommonBandwidthPackageAttachment").LoadBalancerCommonBandwidthPackageAttachment;
export const LoadBalancerCommonBandwidthPackageAttachment: typeof import("./loadBalancerCommonBandwidthPackageAttachment").LoadBalancerCommonBandwidthPackageAttachment = null as any;
utilities.lazyLoad(exports, ["LoadBalancerCommonBandwidthPackageAttachment"], () => require("./loadBalancerCommonBandwidthPackageAttachment"));

export { RuleArgs, RuleState } from "./rule";
export type Rule = import("./rule").Rule;
export const Rule: typeof import("./rule").Rule = null as any;
utilities.lazyLoad(exports, ["Rule"], () => require("./rule"));

export { SecurityPolicyArgs, SecurityPolicyState } from "./securityPolicy";
export type SecurityPolicy = import("./securityPolicy").SecurityPolicy;
export const SecurityPolicy: typeof import("./securityPolicy").SecurityPolicy = null as any;
utilities.lazyLoad(exports, ["SecurityPolicy"], () => require("./securityPolicy"));

export { ServerGroupArgs, ServerGroupState } from "./serverGroup";
export type ServerGroup = import("./serverGroup").ServerGroup;
export const ServerGroup: typeof import("./serverGroup").ServerGroup = null as any;
utilities.lazyLoad(exports, ["ServerGroup"], () => require("./serverGroup"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:alb/aScript:AScript":
                return new AScript(name, <any>undefined, { urn })
            case "alicloud:alb/acl:Acl":
                return new Acl(name, <any>undefined, { urn })
            case "alicloud:alb/aclEntryAttachment:AclEntryAttachment":
                return new AclEntryAttachment(name, <any>undefined, { urn })
            case "alicloud:alb/healthCheckTemplate:HealthCheckTemplate":
                return new HealthCheckTemplate(name, <any>undefined, { urn })
            case "alicloud:alb/listener:Listener":
                return new Listener(name, <any>undefined, { urn })
            case "alicloud:alb/listenerAclAttachment:ListenerAclAttachment":
                return new ListenerAclAttachment(name, <any>undefined, { urn })
            case "alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment":
                return new ListenerAdditionalCertificateAttachment(name, <any>undefined, { urn })
            case "alicloud:alb/loadBalancer:LoadBalancer":
                return new LoadBalancer(name, <any>undefined, { urn })
            case "alicloud:alb/loadBalancerCommonBandwidthPackageAttachment:LoadBalancerCommonBandwidthPackageAttachment":
                return new LoadBalancerCommonBandwidthPackageAttachment(name, <any>undefined, { urn })
            case "alicloud:alb/rule:Rule":
                return new Rule(name, <any>undefined, { urn })
            case "alicloud:alb/securityPolicy:SecurityPolicy":
                return new SecurityPolicy(name, <any>undefined, { urn })
            case "alicloud:alb/serverGroup:ServerGroup":
                return new ServerGroup(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "alb/aScript", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/acl", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/aclEntryAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/healthCheckTemplate", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/listener", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/listenerAclAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/listenerAdditionalCertificateAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/loadBalancer", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/loadBalancerCommonBandwidthPackageAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/rule", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/securityPolicy", _module)
pulumi.runtime.registerResourceModule("alicloud", "alb/serverGroup", _module)