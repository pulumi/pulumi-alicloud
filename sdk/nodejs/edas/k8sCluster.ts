// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an EDAS K8s cluster resource. For information about EDAS K8s Cluster and how to use it, see[What is EDAS K8s Cluster](https://www.alibabacloud.com/help/en/doc-detail/85108.htm).
 *
 * > **NOTE:** Available since v1.93.0.
 *
 * ## Import
 *
 * EDAS cluster can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:edas/k8sCluster:K8sCluster cluster cluster_id
 * ```
 */
export class K8sCluster extends pulumi.CustomResource {
    /**
     * Get an existing K8sCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: K8sClusterState, opts?: pulumi.CustomResourceOptions): K8sCluster {
        return new K8sCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:edas/k8sCluster:K8sCluster';

    /**
     * Returns true if the given object is an instance of K8sCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is K8sCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === K8sCluster.__pulumiType;
    }

    /**
     * The import status of cluster: 
     * `1`: success.
     * `2`: failed.
     * `3`: importing.
     * `4`: deleted.
     */
    public /*out*/ readonly clusterImportStatus!: pulumi.Output<number>;
    /**
     * The name of the cluster that you want to create.
     */
    public /*out*/ readonly clusterName!: pulumi.Output<string>;
    /**
     * The type of the cluster that you want to create. Valid values only: 5: K8s cluster.
     */
    public /*out*/ readonly clusterType!: pulumi.Output<number>;
    /**
     * The ID of the alicloud container service kubernetes cluster that you want to import.
     */
    public readonly csClusterId!: pulumi.Output<string>;
    /**
     * The ID of the namespace where you want to import. You can call the [ListUserDefineRegion](https://www.alibabacloud.com/help/en/doc-detail/149377.htm?spm=a2c63.p38356.879954.34.331054faK2yNvC#doc-api-Edas-ListUserDefineRegion) operation to query the namespace ID.
     */
    public readonly namespaceId!: pulumi.Output<string | undefined>;
    /**
     * The network type of the cluster that you want to create. Valid values: 1: classic network. 2: VPC.
     */
    public /*out*/ readonly networkMode!: pulumi.Output<number>;
    /**
     * The ID of the Virtual Private Cloud (VPC) for the cluster.
     */
    public /*out*/ readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a K8sCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: K8sClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: K8sClusterArgs | K8sClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as K8sClusterState | undefined;
            resourceInputs["clusterImportStatus"] = state ? state.clusterImportStatus : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["clusterType"] = state ? state.clusterType : undefined;
            resourceInputs["csClusterId"] = state ? state.csClusterId : undefined;
            resourceInputs["namespaceId"] = state ? state.namespaceId : undefined;
            resourceInputs["networkMode"] = state ? state.networkMode : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as K8sClusterArgs | undefined;
            if ((!args || args.csClusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'csClusterId'");
            }
            resourceInputs["csClusterId"] = args ? args.csClusterId : undefined;
            resourceInputs["namespaceId"] = args ? args.namespaceId : undefined;
            resourceInputs["clusterImportStatus"] = undefined /*out*/;
            resourceInputs["clusterName"] = undefined /*out*/;
            resourceInputs["clusterType"] = undefined /*out*/;
            resourceInputs["networkMode"] = undefined /*out*/;
            resourceInputs["vpcId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(K8sCluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering K8sCluster resources.
 */
export interface K8sClusterState {
    /**
     * The import status of cluster: 
     * `1`: success.
     * `2`: failed.
     * `3`: importing.
     * `4`: deleted.
     */
    clusterImportStatus?: pulumi.Input<number>;
    /**
     * The name of the cluster that you want to create.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * The type of the cluster that you want to create. Valid values only: 5: K8s cluster.
     */
    clusterType?: pulumi.Input<number>;
    /**
     * The ID of the alicloud container service kubernetes cluster that you want to import.
     */
    csClusterId?: pulumi.Input<string>;
    /**
     * The ID of the namespace where you want to import. You can call the [ListUserDefineRegion](https://www.alibabacloud.com/help/en/doc-detail/149377.htm?spm=a2c63.p38356.879954.34.331054faK2yNvC#doc-api-Edas-ListUserDefineRegion) operation to query the namespace ID.
     */
    namespaceId?: pulumi.Input<string>;
    /**
     * The network type of the cluster that you want to create. Valid values: 1: classic network. 2: VPC.
     */
    networkMode?: pulumi.Input<number>;
    /**
     * The ID of the Virtual Private Cloud (VPC) for the cluster.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a K8sCluster resource.
 */
export interface K8sClusterArgs {
    /**
     * The ID of the alicloud container service kubernetes cluster that you want to import.
     */
    csClusterId: pulumi.Input<string>;
    /**
     * The ID of the namespace where you want to import. You can call the [ListUserDefineRegion](https://www.alibabacloud.com/help/en/doc-detail/149377.htm?spm=a2c63.p38356.879954.34.331054faK2yNvC#doc-api-Edas-ListUserDefineRegion) operation to query the namespace ID.
     */
    namespaceId?: pulumi.Input<string>;
}
