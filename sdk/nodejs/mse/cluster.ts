// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * MSE Cluster can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:mse/cluster:Cluster example mse-cn-0d9xxxx
 * ```
 */
export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState, opts?: pulumi.CustomResourceOptions): Cluster {
        return new Cluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:mse/cluster:Cluster';

    /**
     * Returns true if the given object is an instance of Cluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cluster.__pulumiType;
    }

    /**
     * The whitelist. **NOTE:** This attribute is invalid when the value of `pubNetworkFlow` is `0` and the value of `netType` is `privatenet`.
     */
    public readonly aclEntryLists!: pulumi.Output<string[] | undefined>;
    /**
     * (Available since v1.205.0) The application version.
     */
    public /*out*/ readonly appVersion!: pulumi.Output<string>;
    /**
     * The alias of MSE Cluster.
     */
    public readonly clusterAliasName!: pulumi.Output<string>;
    /**
     * (Available since v1.162.0) The cluster id of Cluster.
     */
    public /*out*/ readonly clusterId!: pulumi.Output<string>;
    /**
     * The engine specification of MSE Cluster. **NOTE:** From version 1.188.0, `clusterSpecification` can be modified. If you were an international user, please use the specification version ending with `_200_c`.Valid values:
     * - Professional Edition
     * - `MSE_SC_1_2_60_c`: 1C2G
     * - `MSE_SC_2_4_60_c`: 2C4G
     * - `MSE_SC_4_8_60_c`: 4C8G
     * - `MSE_SC_8_16_60_c`: 8C16G
     * - `MSE_SC_16_32_60_c`:16C32G
     * - `MSE_SC_1_2_200_c`: 1C2G
     * - `MSE_SC_2_4_200_c`: 2C4G
     * - `MSE_SC_4_8_200_c`: 4C8G
     * - `MSE_SC_8_16_200_c`: 8C16G
     * - `MSE_SC_16_32_200_c`:16C32G
     * - Developer Edition
     * - `MSE_SC_1_2_60_c`: 1C2G
     * - `MSE_SC_2_4_60_c`: 2C4G
     * - `MSE_SC_1_2_200_c`: 1C2G
     * - `MSE_SC_2_4_200_c`: 2C4G
     * - Serverless Edition
     * - `MSE_SC_SERVERLESS`: Available since v1.232.0
     */
    public readonly clusterSpecification!: pulumi.Output<string>;
    /**
     * The type of MSE Cluster.
     */
    public readonly clusterType!: pulumi.Output<string>;
    /**
     * The version of MSE Cluster. See [details](https://www.alibabacloud.com/help/en/mse/developer-reference/api-mse-2019-05-31-createcluster)
     */
    public readonly clusterVersion!: pulumi.Output<string>;
    /**
     * The connection type. Valid values: `slb`,`singleEni`(Available since v1.232.0). If your region is one of `ap-southeast-6、us-west-1、eu-central-1、us-east-1、ap-southeast-1`,and your cluster's mseVersion is `mseDev`,please use `singleEni`.
     */
    public readonly connectionType!: pulumi.Output<string>;
    /**
     * The type of Disk.
     */
    public readonly diskType!: pulumi.Output<string | undefined>;
    /**
     * The count of instance. **NOTE:** From version 1.188.0, `instanceCount` can be modified.
     */
    public readonly instanceCount!: pulumi.Output<number>;
    /**
     * The version of MSE. Valid values: `mseDev` or `msePro` or `mseServerless`(Available since v1.232.0).
     */
    public readonly mseVersion!: pulumi.Output<string>;
    /**
     * The type of network. Valid values: `privatenet` and `pubnet` and `both`(Available since v1.232.0).
     */
    public readonly netType!: pulumi.Output<string>;
    /**
     * Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The specification of private network SLB.
     */
    public readonly privateSlbSpecification!: pulumi.Output<string | undefined>;
    /**
     * The public network bandwidth.
     */
    public readonly pubNetworkFlow!: pulumi.Output<string>;
    /**
     * The specification of public network SLB. Serverless Instance could ignore this parameter.
     */
    public readonly pubSlbSpecification!: pulumi.Output<string | undefined>;
    /**
     * The extended request parameters in the JSON format.
     */
    public readonly requestPars!: pulumi.Output<string | undefined>;
    /**
     * The resource group of the resource.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * The status of MSE Cluster.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The tag of the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The id of the VPC.
     */
    public readonly vpcId!: pulumi.Output<string>;
    /**
     * The id of VSwitch.
     */
    public readonly vswitchId!: pulumi.Output<string | undefined>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterState | undefined;
            resourceInputs["aclEntryLists"] = state ? state.aclEntryLists : undefined;
            resourceInputs["appVersion"] = state ? state.appVersion : undefined;
            resourceInputs["clusterAliasName"] = state ? state.clusterAliasName : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["clusterSpecification"] = state ? state.clusterSpecification : undefined;
            resourceInputs["clusterType"] = state ? state.clusterType : undefined;
            resourceInputs["clusterVersion"] = state ? state.clusterVersion : undefined;
            resourceInputs["connectionType"] = state ? state.connectionType : undefined;
            resourceInputs["diskType"] = state ? state.diskType : undefined;
            resourceInputs["instanceCount"] = state ? state.instanceCount : undefined;
            resourceInputs["mseVersion"] = state ? state.mseVersion : undefined;
            resourceInputs["netType"] = state ? state.netType : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["privateSlbSpecification"] = state ? state.privateSlbSpecification : undefined;
            resourceInputs["pubNetworkFlow"] = state ? state.pubNetworkFlow : undefined;
            resourceInputs["pubSlbSpecification"] = state ? state.pubSlbSpecification : undefined;
            resourceInputs["requestPars"] = state ? state.requestPars : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            if ((!args || args.clusterSpecification === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterSpecification'");
            }
            if ((!args || args.clusterType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterType'");
            }
            if ((!args || args.clusterVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterVersion'");
            }
            if ((!args || args.instanceCount === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceCount'");
            }
            if ((!args || args.netType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'netType'");
            }
            if ((!args || args.pubNetworkFlow === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pubNetworkFlow'");
            }
            resourceInputs["aclEntryLists"] = args ? args.aclEntryLists : undefined;
            resourceInputs["clusterAliasName"] = args ? args.clusterAliasName : undefined;
            resourceInputs["clusterSpecification"] = args ? args.clusterSpecification : undefined;
            resourceInputs["clusterType"] = args ? args.clusterType : undefined;
            resourceInputs["clusterVersion"] = args ? args.clusterVersion : undefined;
            resourceInputs["connectionType"] = args ? args.connectionType : undefined;
            resourceInputs["diskType"] = args ? args.diskType : undefined;
            resourceInputs["instanceCount"] = args ? args.instanceCount : undefined;
            resourceInputs["mseVersion"] = args ? args.mseVersion : undefined;
            resourceInputs["netType"] = args ? args.netType : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["privateSlbSpecification"] = args ? args.privateSlbSpecification : undefined;
            resourceInputs["pubNetworkFlow"] = args ? args.pubNetworkFlow : undefined;
            resourceInputs["pubSlbSpecification"] = args ? args.pubSlbSpecification : undefined;
            resourceInputs["requestPars"] = args ? args.requestPars : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["appVersion"] = undefined /*out*/;
            resourceInputs["clusterId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Cluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    /**
     * The whitelist. **NOTE:** This attribute is invalid when the value of `pubNetworkFlow` is `0` and the value of `netType` is `privatenet`.
     */
    aclEntryLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (Available since v1.205.0) The application version.
     */
    appVersion?: pulumi.Input<string>;
    /**
     * The alias of MSE Cluster.
     */
    clusterAliasName?: pulumi.Input<string>;
    /**
     * (Available since v1.162.0) The cluster id of Cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The engine specification of MSE Cluster. **NOTE:** From version 1.188.0, `clusterSpecification` can be modified. If you were an international user, please use the specification version ending with `_200_c`.Valid values:
     * - Professional Edition
     * - `MSE_SC_1_2_60_c`: 1C2G
     * - `MSE_SC_2_4_60_c`: 2C4G
     * - `MSE_SC_4_8_60_c`: 4C8G
     * - `MSE_SC_8_16_60_c`: 8C16G
     * - `MSE_SC_16_32_60_c`:16C32G
     * - `MSE_SC_1_2_200_c`: 1C2G
     * - `MSE_SC_2_4_200_c`: 2C4G
     * - `MSE_SC_4_8_200_c`: 4C8G
     * - `MSE_SC_8_16_200_c`: 8C16G
     * - `MSE_SC_16_32_200_c`:16C32G
     * - Developer Edition
     * - `MSE_SC_1_2_60_c`: 1C2G
     * - `MSE_SC_2_4_60_c`: 2C4G
     * - `MSE_SC_1_2_200_c`: 1C2G
     * - `MSE_SC_2_4_200_c`: 2C4G
     * - Serverless Edition
     * - `MSE_SC_SERVERLESS`: Available since v1.232.0
     */
    clusterSpecification?: pulumi.Input<string>;
    /**
     * The type of MSE Cluster.
     */
    clusterType?: pulumi.Input<string>;
    /**
     * The version of MSE Cluster. See [details](https://www.alibabacloud.com/help/en/mse/developer-reference/api-mse-2019-05-31-createcluster)
     */
    clusterVersion?: pulumi.Input<string>;
    /**
     * The connection type. Valid values: `slb`,`singleEni`(Available since v1.232.0). If your region is one of `ap-southeast-6、us-west-1、eu-central-1、us-east-1、ap-southeast-1`,and your cluster's mseVersion is `mseDev`,please use `singleEni`.
     */
    connectionType?: pulumi.Input<string>;
    /**
     * The type of Disk.
     */
    diskType?: pulumi.Input<string>;
    /**
     * The count of instance. **NOTE:** From version 1.188.0, `instanceCount` can be modified.
     */
    instanceCount?: pulumi.Input<number>;
    /**
     * The version of MSE. Valid values: `mseDev` or `msePro` or `mseServerless`(Available since v1.232.0).
     */
    mseVersion?: pulumi.Input<string>;
    /**
     * The type of network. Valid values: `privatenet` and `pubnet` and `both`(Available since v1.232.0).
     */
    netType?: pulumi.Input<string>;
    /**
     * Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The specification of private network SLB.
     */
    privateSlbSpecification?: pulumi.Input<string>;
    /**
     * The public network bandwidth.
     */
    pubNetworkFlow?: pulumi.Input<string>;
    /**
     * The specification of public network SLB. Serverless Instance could ignore this parameter.
     */
    pubSlbSpecification?: pulumi.Input<string>;
    /**
     * The extended request parameters in the JSON format.
     */
    requestPars?: pulumi.Input<string>;
    /**
     * The resource group of the resource.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The status of MSE Cluster.
     */
    status?: pulumi.Input<string>;
    /**
     * The tag of the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The id of the VPC.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The id of VSwitch.
     */
    vswitchId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * The whitelist. **NOTE:** This attribute is invalid when the value of `pubNetworkFlow` is `0` and the value of `netType` is `privatenet`.
     */
    aclEntryLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The alias of MSE Cluster.
     */
    clusterAliasName?: pulumi.Input<string>;
    /**
     * The engine specification of MSE Cluster. **NOTE:** From version 1.188.0, `clusterSpecification` can be modified. If you were an international user, please use the specification version ending with `_200_c`.Valid values:
     * - Professional Edition
     * - `MSE_SC_1_2_60_c`: 1C2G
     * - `MSE_SC_2_4_60_c`: 2C4G
     * - `MSE_SC_4_8_60_c`: 4C8G
     * - `MSE_SC_8_16_60_c`: 8C16G
     * - `MSE_SC_16_32_60_c`:16C32G
     * - `MSE_SC_1_2_200_c`: 1C2G
     * - `MSE_SC_2_4_200_c`: 2C4G
     * - `MSE_SC_4_8_200_c`: 4C8G
     * - `MSE_SC_8_16_200_c`: 8C16G
     * - `MSE_SC_16_32_200_c`:16C32G
     * - Developer Edition
     * - `MSE_SC_1_2_60_c`: 1C2G
     * - `MSE_SC_2_4_60_c`: 2C4G
     * - `MSE_SC_1_2_200_c`: 1C2G
     * - `MSE_SC_2_4_200_c`: 2C4G
     * - Serverless Edition
     * - `MSE_SC_SERVERLESS`: Available since v1.232.0
     */
    clusterSpecification: pulumi.Input<string>;
    /**
     * The type of MSE Cluster.
     */
    clusterType: pulumi.Input<string>;
    /**
     * The version of MSE Cluster. See [details](https://www.alibabacloud.com/help/en/mse/developer-reference/api-mse-2019-05-31-createcluster)
     */
    clusterVersion: pulumi.Input<string>;
    /**
     * The connection type. Valid values: `slb`,`singleEni`(Available since v1.232.0). If your region is one of `ap-southeast-6、us-west-1、eu-central-1、us-east-1、ap-southeast-1`,and your cluster's mseVersion is `mseDev`,please use `singleEni`.
     */
    connectionType?: pulumi.Input<string>;
    /**
     * The type of Disk.
     */
    diskType?: pulumi.Input<string>;
    /**
     * The count of instance. **NOTE:** From version 1.188.0, `instanceCount` can be modified.
     */
    instanceCount: pulumi.Input<number>;
    /**
     * The version of MSE. Valid values: `mseDev` or `msePro` or `mseServerless`(Available since v1.232.0).
     */
    mseVersion?: pulumi.Input<string>;
    /**
     * The type of network. Valid values: `privatenet` and `pubnet` and `both`(Available since v1.232.0).
     */
    netType: pulumi.Input<string>;
    /**
     * Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The specification of private network SLB.
     */
    privateSlbSpecification?: pulumi.Input<string>;
    /**
     * The public network bandwidth.
     */
    pubNetworkFlow: pulumi.Input<string>;
    /**
     * The specification of public network SLB. Serverless Instance could ignore this parameter.
     */
    pubSlbSpecification?: pulumi.Input<string>;
    /**
     * The extended request parameters in the JSON format.
     */
    requestPars?: pulumi.Input<string>;
    /**
     * The resource group of the resource.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The tag of the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The id of the VPC.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The id of VSwitch.
     */
    vswitchId?: pulumi.Input<string>;
}
