// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Container Service cluster credential on Alibaba Cloud.
 *
 * > **NOTE:** Available since v1.187.0
 *
 * > **NOTE:** This datasource can be used on all kinds of ACK clusters, including managed clusters, imported kubernetes clusters, serverless clusters and edge clusters. Please make sure that the target cluster is not in the failed state before using this datasource, since the api server of clusters in the failed state cannot be accessed.
 */
export function getClusterCredential(args: GetClusterCredentialArgs, opts?: pulumi.InvokeOptions): Promise<GetClusterCredentialResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cs/getClusterCredential:getClusterCredential", {
        "clusterId": args.clusterId,
        "outputFile": args.outputFile,
        "temporaryDurationMinutes": args.temporaryDurationMinutes,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusterCredential.
 */
export interface GetClusterCredentialArgs {
    /**
     * The id of target cluster.
     */
    clusterId: string;
    /**
     * File name where to save the returned KubeConfig (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * Automatic expiration time of the returned credential. The valid value between `15` and `4320`, in minutes. When this field is omitted, the expiration time will be determined by the system automatically and the result will be in the attributed field `expiration`.
     */
    temporaryDurationMinutes?: number;
}

/**
 * A collection of values returned by getClusterCredential.
 */
export interface GetClusterCredentialResult {
    /**
     * (Available in 1.105.0+) Nested attribute containing certificate authority data for your cluster.
     */
    readonly certificateAuthority: outputs.cs.GetClusterCredentialCertificateAuthority;
    /**
     * The id of target cluster.
     */
    readonly clusterId: string;
    /**
     * The name of target cluster.
     */
    readonly clusterName: string;
    /**
     * Expiration time of kube config. Format: UTC time in rfc3339.
     */
    readonly expiration: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Sensitive) The kube config to use to authenticate with the cluster.
     */
    readonly kubeConfig: string;
    readonly outputFile?: string;
    readonly temporaryDurationMinutes?: number;
}
/**
 * This data source provides Container Service cluster credential on Alibaba Cloud.
 *
 * > **NOTE:** Available since v1.187.0
 *
 * > **NOTE:** This datasource can be used on all kinds of ACK clusters, including managed clusters, imported kubernetes clusters, serverless clusters and edge clusters. Please make sure that the target cluster is not in the failed state before using this datasource, since the api server of clusters in the failed state cannot be accessed.
 */
export function getClusterCredentialOutput(args: GetClusterCredentialOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetClusterCredentialResult> {
    return pulumi.output(args).apply((a: any) => getClusterCredential(a, opts))
}

/**
 * A collection of arguments for invoking getClusterCredential.
 */
export interface GetClusterCredentialOutputArgs {
    /**
     * The id of target cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * File name where to save the returned KubeConfig (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * Automatic expiration time of the returned credential. The valid value between `15` and `4320`, in minutes. When this field is omitted, the expiration time will be determined by the system automatically and the result will be in the attributed field `expiration`.
     */
    temporaryDurationMinutes?: pulumi.Input<number>;
}