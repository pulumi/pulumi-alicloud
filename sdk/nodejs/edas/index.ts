// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ApplicationArgs, ApplicationState } from "./application";
export type Application = import("./application").Application;
export const Application: typeof import("./application").Application = null as any;
utilities.lazyLoad(exports, ["Application"], () => require("./application"));

export { ApplicationDeploymentArgs, ApplicationDeploymentState } from "./applicationDeployment";
export type ApplicationDeployment = import("./applicationDeployment").ApplicationDeployment;
export const ApplicationDeployment: typeof import("./applicationDeployment").ApplicationDeployment = null as any;
utilities.lazyLoad(exports, ["ApplicationDeployment"], () => require("./applicationDeployment"));

export { ApplicationScaleArgs, ApplicationScaleState } from "./applicationScale";
export type ApplicationScale = import("./applicationScale").ApplicationScale;
export const ApplicationScale: typeof import("./applicationScale").ApplicationScale = null as any;
utilities.lazyLoad(exports, ["ApplicationScale"], () => require("./applicationScale"));

export { ClusterArgs, ClusterState } from "./cluster";
export type Cluster = import("./cluster").Cluster;
export const Cluster: typeof import("./cluster").Cluster = null as any;
utilities.lazyLoad(exports, ["Cluster"], () => require("./cluster"));

export { DeployGroupArgs, DeployGroupState } from "./deployGroup";
export type DeployGroup = import("./deployGroup").DeployGroup;
export const DeployGroup: typeof import("./deployGroup").DeployGroup = null as any;
utilities.lazyLoad(exports, ["DeployGroup"], () => require("./deployGroup"));

export { GetApplicationsArgs, GetApplicationsResult, GetApplicationsOutputArgs } from "./getApplications";
export const getApplications: typeof import("./getApplications").getApplications = null as any;
export const getApplicationsOutput: typeof import("./getApplications").getApplicationsOutput = null as any;
utilities.lazyLoad(exports, ["getApplications","getApplicationsOutput"], () => require("./getApplications"));

export { GetClustersArgs, GetClustersResult, GetClustersOutputArgs } from "./getClusters";
export const getClusters: typeof import("./getClusters").getClusters = null as any;
export const getClustersOutput: typeof import("./getClusters").getClustersOutput = null as any;
utilities.lazyLoad(exports, ["getClusters","getClustersOutput"], () => require("./getClusters"));

export { GetDeployGroupsArgs, GetDeployGroupsResult, GetDeployGroupsOutputArgs } from "./getDeployGroups";
export const getDeployGroups: typeof import("./getDeployGroups").getDeployGroups = null as any;
export const getDeployGroupsOutput: typeof import("./getDeployGroups").getDeployGroupsOutput = null as any;
utilities.lazyLoad(exports, ["getDeployGroups","getDeployGroupsOutput"], () => require("./getDeployGroups"));

export { GetNamespacesArgs, GetNamespacesResult, GetNamespacesOutputArgs } from "./getNamespaces";
export const getNamespaces: typeof import("./getNamespaces").getNamespaces = null as any;
export const getNamespacesOutput: typeof import("./getNamespaces").getNamespacesOutput = null as any;
utilities.lazyLoad(exports, ["getNamespaces","getNamespacesOutput"], () => require("./getNamespaces"));

export { GetServiceArgs, GetServiceResult, GetServiceOutputArgs } from "./getService";
export const getService: typeof import("./getService").getService = null as any;
export const getServiceOutput: typeof import("./getService").getServiceOutput = null as any;
utilities.lazyLoad(exports, ["getService","getServiceOutput"], () => require("./getService"));

export { InstanceClusterAttachmentArgs, InstanceClusterAttachmentState } from "./instanceClusterAttachment";
export type InstanceClusterAttachment = import("./instanceClusterAttachment").InstanceClusterAttachment;
export const InstanceClusterAttachment: typeof import("./instanceClusterAttachment").InstanceClusterAttachment = null as any;
utilities.lazyLoad(exports, ["InstanceClusterAttachment"], () => require("./instanceClusterAttachment"));

export { K8sApplicationArgs, K8sApplicationState } from "./k8sApplication";
export type K8sApplication = import("./k8sApplication").K8sApplication;
export const K8sApplication: typeof import("./k8sApplication").K8sApplication = null as any;
utilities.lazyLoad(exports, ["K8sApplication"], () => require("./k8sApplication"));

export { K8sClusterArgs, K8sClusterState } from "./k8sCluster";
export type K8sCluster = import("./k8sCluster").K8sCluster;
export const K8sCluster: typeof import("./k8sCluster").K8sCluster = null as any;
utilities.lazyLoad(exports, ["K8sCluster"], () => require("./k8sCluster"));

export { K8sSlbAttachmentArgs, K8sSlbAttachmentState } from "./k8sSlbAttachment";
export type K8sSlbAttachment = import("./k8sSlbAttachment").K8sSlbAttachment;
export const K8sSlbAttachment: typeof import("./k8sSlbAttachment").K8sSlbAttachment = null as any;
utilities.lazyLoad(exports, ["K8sSlbAttachment"], () => require("./k8sSlbAttachment"));

export { NamespaceArgs, NamespaceState } from "./namespace";
export type Namespace = import("./namespace").Namespace;
export const Namespace: typeof import("./namespace").Namespace = null as any;
utilities.lazyLoad(exports, ["Namespace"], () => require("./namespace"));

export { SlbAttachmentArgs, SlbAttachmentState } from "./slbAttachment";
export type SlbAttachment = import("./slbAttachment").SlbAttachment;
export const SlbAttachment: typeof import("./slbAttachment").SlbAttachment = null as any;
utilities.lazyLoad(exports, ["SlbAttachment"], () => require("./slbAttachment"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:edas/application:Application":
                return new Application(name, <any>undefined, { urn })
            case "alicloud:edas/applicationDeployment:ApplicationDeployment":
                return new ApplicationDeployment(name, <any>undefined, { urn })
            case "alicloud:edas/applicationScale:ApplicationScale":
                return new ApplicationScale(name, <any>undefined, { urn })
            case "alicloud:edas/cluster:Cluster":
                return new Cluster(name, <any>undefined, { urn })
            case "alicloud:edas/deployGroup:DeployGroup":
                return new DeployGroup(name, <any>undefined, { urn })
            case "alicloud:edas/instanceClusterAttachment:InstanceClusterAttachment":
                return new InstanceClusterAttachment(name, <any>undefined, { urn })
            case "alicloud:edas/k8sApplication:K8sApplication":
                return new K8sApplication(name, <any>undefined, { urn })
            case "alicloud:edas/k8sCluster:K8sCluster":
                return new K8sCluster(name, <any>undefined, { urn })
            case "alicloud:edas/k8sSlbAttachment:K8sSlbAttachment":
                return new K8sSlbAttachment(name, <any>undefined, { urn })
            case "alicloud:edas/namespace:Namespace":
                return new Namespace(name, <any>undefined, { urn })
            case "alicloud:edas/slbAttachment:SlbAttachment":
                return new SlbAttachment(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "edas/application", _module)
pulumi.runtime.registerResourceModule("alicloud", "edas/applicationDeployment", _module)
pulumi.runtime.registerResourceModule("alicloud", "edas/applicationScale", _module)
pulumi.runtime.registerResourceModule("alicloud", "edas/cluster", _module)
pulumi.runtime.registerResourceModule("alicloud", "edas/deployGroup", _module)
pulumi.runtime.registerResourceModule("alicloud", "edas/instanceClusterAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "edas/k8sApplication", _module)
pulumi.runtime.registerResourceModule("alicloud", "edas/k8sCluster", _module)
pulumi.runtime.registerResourceModule("alicloud", "edas/k8sSlbAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "edas/namespace", _module)
pulumi.runtime.registerResourceModule("alicloud", "edas/slbAttachment", _module)
