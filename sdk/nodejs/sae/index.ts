// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ApplicationArgs, ApplicationState } from "./application";
export type Application = import("./application").Application;
export const Application: typeof import("./application").Application = null as any;
utilities.lazyLoad(exports, ["Application"], () => require("./application"));

export { ApplicationScalingRuleArgs, ApplicationScalingRuleState } from "./applicationScalingRule";
export type ApplicationScalingRule = import("./applicationScalingRule").ApplicationScalingRule;
export const ApplicationScalingRule: typeof import("./applicationScalingRule").ApplicationScalingRule = null as any;
utilities.lazyLoad(exports, ["ApplicationScalingRule"], () => require("./applicationScalingRule"));

export { ConfigMapArgs, ConfigMapState } from "./configMap";
export type ConfigMap = import("./configMap").ConfigMap;
export const ConfigMap: typeof import("./configMap").ConfigMap = null as any;
utilities.lazyLoad(exports, ["ConfigMap"], () => require("./configMap"));

export { GetApplicationScalingRulesArgs, GetApplicationScalingRulesResult, GetApplicationScalingRulesOutputArgs } from "./getApplicationScalingRules";
export const getApplicationScalingRules: typeof import("./getApplicationScalingRules").getApplicationScalingRules = null as any;
export const getApplicationScalingRulesOutput: typeof import("./getApplicationScalingRules").getApplicationScalingRulesOutput = null as any;
utilities.lazyLoad(exports, ["getApplicationScalingRules","getApplicationScalingRulesOutput"], () => require("./getApplicationScalingRules"));

export { GetApplicationsArgs, GetApplicationsResult, GetApplicationsOutputArgs } from "./getApplications";
export const getApplications: typeof import("./getApplications").getApplications = null as any;
export const getApplicationsOutput: typeof import("./getApplications").getApplicationsOutput = null as any;
utilities.lazyLoad(exports, ["getApplications","getApplicationsOutput"], () => require("./getApplications"));

export { GetConfigMapsArgs, GetConfigMapsResult, GetConfigMapsOutputArgs } from "./getConfigMaps";
export const getConfigMaps: typeof import("./getConfigMaps").getConfigMaps = null as any;
export const getConfigMapsOutput: typeof import("./getConfigMaps").getConfigMapsOutput = null as any;
utilities.lazyLoad(exports, ["getConfigMaps","getConfigMapsOutput"], () => require("./getConfigMaps"));

export { GetGreyTagRoutesArgs, GetGreyTagRoutesResult, GetGreyTagRoutesOutputArgs } from "./getGreyTagRoutes";
export const getGreyTagRoutes: typeof import("./getGreyTagRoutes").getGreyTagRoutes = null as any;
export const getGreyTagRoutesOutput: typeof import("./getGreyTagRoutes").getGreyTagRoutesOutput = null as any;
utilities.lazyLoad(exports, ["getGreyTagRoutes","getGreyTagRoutesOutput"], () => require("./getGreyTagRoutes"));

export { GetIngressesArgs, GetIngressesResult, GetIngressesOutputArgs } from "./getIngresses";
export const getIngresses: typeof import("./getIngresses").getIngresses = null as any;
export const getIngressesOutput: typeof import("./getIngresses").getIngressesOutput = null as any;
utilities.lazyLoad(exports, ["getIngresses","getIngressesOutput"], () => require("./getIngresses"));

export { GetInstanceSpecificationsArgs, GetInstanceSpecificationsResult, GetInstanceSpecificationsOutputArgs } from "./getInstanceSpecifications";
export const getInstanceSpecifications: typeof import("./getInstanceSpecifications").getInstanceSpecifications = null as any;
export const getInstanceSpecificationsOutput: typeof import("./getInstanceSpecifications").getInstanceSpecificationsOutput = null as any;
utilities.lazyLoad(exports, ["getInstanceSpecifications","getInstanceSpecificationsOutput"], () => require("./getInstanceSpecifications"));

export { GetNamespacesArgs, GetNamespacesResult, GetNamespacesOutputArgs } from "./getNamespaces";
export const getNamespaces: typeof import("./getNamespaces").getNamespaces = null as any;
export const getNamespacesOutput: typeof import("./getNamespaces").getNamespacesOutput = null as any;
utilities.lazyLoad(exports, ["getNamespaces","getNamespacesOutput"], () => require("./getNamespaces"));

export { GetServiceArgs, GetServiceResult, GetServiceOutputArgs } from "./getService";
export const getService: typeof import("./getService").getService = null as any;
export const getServiceOutput: typeof import("./getService").getServiceOutput = null as any;
utilities.lazyLoad(exports, ["getService","getServiceOutput"], () => require("./getService"));

export { GreyTagRouteArgs, GreyTagRouteState } from "./greyTagRoute";
export type GreyTagRoute = import("./greyTagRoute").GreyTagRoute;
export const GreyTagRoute: typeof import("./greyTagRoute").GreyTagRoute = null as any;
utilities.lazyLoad(exports, ["GreyTagRoute"], () => require("./greyTagRoute"));

export { IngressArgs, IngressState } from "./ingress";
export type Ingress = import("./ingress").Ingress;
export const Ingress: typeof import("./ingress").Ingress = null as any;
utilities.lazyLoad(exports, ["Ingress"], () => require("./ingress"));

export { LoadBalancerInternetArgs, LoadBalancerInternetState } from "./loadBalancerInternet";
export type LoadBalancerInternet = import("./loadBalancerInternet").LoadBalancerInternet;
export const LoadBalancerInternet: typeof import("./loadBalancerInternet").LoadBalancerInternet = null as any;
utilities.lazyLoad(exports, ["LoadBalancerInternet"], () => require("./loadBalancerInternet"));

export { LoadBalancerIntranetArgs, LoadBalancerIntranetState } from "./loadBalancerIntranet";
export type LoadBalancerIntranet = import("./loadBalancerIntranet").LoadBalancerIntranet;
export const LoadBalancerIntranet: typeof import("./loadBalancerIntranet").LoadBalancerIntranet = null as any;
utilities.lazyLoad(exports, ["LoadBalancerIntranet"], () => require("./loadBalancerIntranet"));

export { NamespaceArgs, NamespaceState } from "./namespace";
export type Namespace = import("./namespace").Namespace;
export const Namespace: typeof import("./namespace").Namespace = null as any;
utilities.lazyLoad(exports, ["Namespace"], () => require("./namespace"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:sae/application:Application":
                return new Application(name, <any>undefined, { urn })
            case "alicloud:sae/applicationScalingRule:ApplicationScalingRule":
                return new ApplicationScalingRule(name, <any>undefined, { urn })
            case "alicloud:sae/configMap:ConfigMap":
                return new ConfigMap(name, <any>undefined, { urn })
            case "alicloud:sae/greyTagRoute:GreyTagRoute":
                return new GreyTagRoute(name, <any>undefined, { urn })
            case "alicloud:sae/ingress:Ingress":
                return new Ingress(name, <any>undefined, { urn })
            case "alicloud:sae/loadBalancerInternet:LoadBalancerInternet":
                return new LoadBalancerInternet(name, <any>undefined, { urn })
            case "alicloud:sae/loadBalancerIntranet:LoadBalancerIntranet":
                return new LoadBalancerIntranet(name, <any>undefined, { urn })
            case "alicloud:sae/namespace:Namespace":
                return new Namespace(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "sae/application", _module)
pulumi.runtime.registerResourceModule("alicloud", "sae/applicationScalingRule", _module)
pulumi.runtime.registerResourceModule("alicloud", "sae/configMap", _module)
pulumi.runtime.registerResourceModule("alicloud", "sae/greyTagRoute", _module)
pulumi.runtime.registerResourceModule("alicloud", "sae/ingress", _module)
pulumi.runtime.registerResourceModule("alicloud", "sae/loadBalancerInternet", _module)
pulumi.runtime.registerResourceModule("alicloud", "sae/loadBalancerIntranet", _module)
pulumi.runtime.registerResourceModule("alicloud", "sae/namespace", _module)
