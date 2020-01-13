// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/cs_managed_kubernetes.html.markdown.
 */
export class ManagedKubernetes extends pulumi.CustomResource {
    /**
     * Get an existing ManagedKubernetes resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedKubernetesState, opts?: pulumi.CustomResourceOptions): ManagedKubernetes {
        return new ManagedKubernetes(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cs/managedKubernetes:ManagedKubernetes';

    /**
     * Returns true if the given object is an instance of ManagedKubernetes.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedKubernetes {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedKubernetes.__pulumiType;
    }

    /**
     * The Zone where new kubernetes cluster will be located. If it is not be specified, the `vswitchIds` should be set, the value will be vswitch's zone.
     */
    public readonly availabilityZone!: pulumi.Output<string>;
    /**
     * The path of client certificate, like `~/.kube/client-cert.pem`.
     */
    public readonly clientCert!: pulumi.Output<string | undefined>;
    /**
     * The path of client key, like `~/.kube/client-key.pem`.
     */
    public readonly clientKey!: pulumi.Output<string | undefined>;
    /**
     * The path of cluster ca certificate, like `~/.kube/cluster-ca-cert.pem`
     */
    public readonly clusterCaCert!: pulumi.Output<string | undefined>;
    /**
     * The network that cluster uses, use `flannel` or `terway`.
     */
    public readonly clusterNetworkType!: pulumi.Output<string | undefined>;
    /**
     * Default false, when you want to change `workerInstanceTypes` and `vswitchIds`, you have to set this field to true, then the cluster will be recreated.
     */
    public readonly forceUpdate!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of node image.
     */
    public readonly imageId!: pulumi.Output<string | undefined>;
    /**
     * Whether to install cloud monitor for the kubernetes' node.
     */
    public readonly installCloudMonitor!: pulumi.Output<boolean | undefined>;
    /**
     * The keypair of ssh login cluster node, you have to create it first.
     */
    public readonly keyName!: pulumi.Output<string | undefined>;
    /**
     * An KMS encrypts password used to a cs managed kubernetes. It is conflicted with `password` and `keyName`.
     */
    public readonly kmsEncryptedPassword!: pulumi.Output<string | undefined>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a cs managed kubernetes with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    public readonly kmsEncryptionContext!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The path of kube config, like `~/.kube/config`.
     */
    public readonly kubeConfig!: pulumi.Output<string | undefined>;
    /**
     * A list of one element containing information about the associated log store. It contains the following attributes:
     */
    public readonly logConfig!: pulumi.Output<outputs.cs.ManagedKubernetesLogConfig | undefined>;
    /**
     * The kubernetes cluster's name. It is the only in one Alicloud account.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly namePrefix!: pulumi.Output<string | undefined>;
    /**
     * Whether to create a new nat gateway while creating kubernetes cluster. Default to true.
     */
    public readonly newNatGateway!: pulumi.Output<boolean | undefined>;
    /**
     * The password of ssh login cluster node. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields.
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * The CIDR block for the pod network. When `clusterNetworkType` is  set to `flanne`, you must set value to this filed .
     * It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
     * Maximum number of hosts allowed in the cluster: 256. Refer to [Plan Kubernetes CIDR blocks under VPC](https://www.alibabacloud.com/help/doc-detail/64530.htm).
     */
    public readonly podCidr!: pulumi.Output<string | undefined>;
    /**
     * The ID of security group where the current cluster worker node is located.
     */
    public /*out*/ readonly securityGroupId!: pulumi.Output<string>;
    /**
     * The CIDR block for the service network.  
     * It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
     */
    public readonly serviceCidr!: pulumi.Output<string | undefined>;
    /**
     * Whether to create internet load balancer for API Server. Default to false.
     */
    public readonly slbInternetEnabled!: pulumi.Output<boolean | undefined>;
    public readonly version!: pulumi.Output<string | undefined>;
    /**
     * The ID of VPC where the current cluster is located.
     */
    public /*out*/ readonly vpcId!: pulumi.Output<string>;
    /**
     * The vswitch where new kubernetes cluster will be located. Specify one or more vswitch's id. It must be in the zone which `availabilityZone` specified.
     */
    public readonly vswitchIds!: pulumi.Output<string[] | undefined>;
    /**
     * Enable worker payment auto-renew, defaults to false.
     */
    public readonly workerAutoRenew!: pulumi.Output<boolean | undefined>;
    /**
     * Worker payment auto-renew period. When period unit is `Month`, it can be one of {“1”, “2”, “3”, “6”, “12”}.  When period unit is `Week`, it can be one of {“1”, “2”, “3”}.
     */
    public readonly workerAutoRenewPeriod!: pulumi.Output<number | undefined>;
    /**
     * The data disk category of worker node. Its valid value are `cloudSsd` and `cloudEfficiency`, if not set, data disk will not be created.
     */
    public readonly workerDataDiskCategory!: pulumi.Output<string | undefined>;
    /**
     * The data disk size of worker node. Its valid value range [20~32768] in GB. When `workerDataDiskCategory` is presented, it defaults to 40.
     */
    public readonly workerDataDiskSize!: pulumi.Output<number | undefined>;
    /**
     * The system disk category of worker node. Its valid value are `cloudSsd` and `cloudEfficiency`. Default to `cloudEfficiency`.
     */
    public readonly workerDiskCategory!: pulumi.Output<string | undefined>;
    /**
     * The system disk size of worker node. Its valid value range [20~32768] in GB. Default to 20.
     */
    public readonly workerDiskSize!: pulumi.Output<number | undefined>;
    /**
     * Worker payment type. `PrePaid` or `PostPaid`, defaults to `PostPaid`.
     */
    public readonly workerInstanceChargeType!: pulumi.Output<string | undefined>;
    public readonly workerInstanceTypes!: pulumi.Output<string[]>;
    /**
     * List of cluster worker nodes. It contains several attributes to `Block Nodes`.
     */
    public /*out*/ readonly workerNodes!: pulumi.Output<outputs.cs.ManagedKubernetesWorkerNode[]>;
    /**
     * The total worker node number of the kubernetes cluster. Default to 3. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
     */
    public readonly workerNumber!: pulumi.Output<number | undefined>;
    /**
     * The worker node number of the kubernetes cluster. Default to [3]. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
     */
    public readonly workerNumbers!: pulumi.Output<number | undefined>;
    /**
     * Worker payment period. When period unit is `Month`, it can be one of { “1”, “2”, “3”, “4”, “5”, “6”, “7”, “8”, “9”, “12”, “24”, “36”,”48”,”60”}.  When period unit is `Week`, it can be one of {“1”, “2”, “3”, “4”}.
     */
    public readonly workerPeriod!: pulumi.Output<number | undefined>;
    /**
     * Worker payment period unit. `Month` or `Week`, defaults to `Month`.
     */
    public readonly workerPeriodUnit!: pulumi.Output<string | undefined>;

    /**
     * Create a ManagedKubernetes resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedKubernetesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedKubernetesArgs | ManagedKubernetesState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ManagedKubernetesState | undefined;
            inputs["availabilityZone"] = state ? state.availabilityZone : undefined;
            inputs["clientCert"] = state ? state.clientCert : undefined;
            inputs["clientKey"] = state ? state.clientKey : undefined;
            inputs["clusterCaCert"] = state ? state.clusterCaCert : undefined;
            inputs["clusterNetworkType"] = state ? state.clusterNetworkType : undefined;
            inputs["forceUpdate"] = state ? state.forceUpdate : undefined;
            inputs["imageId"] = state ? state.imageId : undefined;
            inputs["installCloudMonitor"] = state ? state.installCloudMonitor : undefined;
            inputs["keyName"] = state ? state.keyName : undefined;
            inputs["kmsEncryptedPassword"] = state ? state.kmsEncryptedPassword : undefined;
            inputs["kmsEncryptionContext"] = state ? state.kmsEncryptionContext : undefined;
            inputs["kubeConfig"] = state ? state.kubeConfig : undefined;
            inputs["logConfig"] = state ? state.logConfig : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["namePrefix"] = state ? state.namePrefix : undefined;
            inputs["newNatGateway"] = state ? state.newNatGateway : undefined;
            inputs["password"] = state ? state.password : undefined;
            inputs["podCidr"] = state ? state.podCidr : undefined;
            inputs["securityGroupId"] = state ? state.securityGroupId : undefined;
            inputs["serviceCidr"] = state ? state.serviceCidr : undefined;
            inputs["slbInternetEnabled"] = state ? state.slbInternetEnabled : undefined;
            inputs["version"] = state ? state.version : undefined;
            inputs["vpcId"] = state ? state.vpcId : undefined;
            inputs["vswitchIds"] = state ? state.vswitchIds : undefined;
            inputs["workerAutoRenew"] = state ? state.workerAutoRenew : undefined;
            inputs["workerAutoRenewPeriod"] = state ? state.workerAutoRenewPeriod : undefined;
            inputs["workerDataDiskCategory"] = state ? state.workerDataDiskCategory : undefined;
            inputs["workerDataDiskSize"] = state ? state.workerDataDiskSize : undefined;
            inputs["workerDiskCategory"] = state ? state.workerDiskCategory : undefined;
            inputs["workerDiskSize"] = state ? state.workerDiskSize : undefined;
            inputs["workerInstanceChargeType"] = state ? state.workerInstanceChargeType : undefined;
            inputs["workerInstanceTypes"] = state ? state.workerInstanceTypes : undefined;
            inputs["workerNodes"] = state ? state.workerNodes : undefined;
            inputs["workerNumber"] = state ? state.workerNumber : undefined;
            inputs["workerNumbers"] = state ? state.workerNumbers : undefined;
            inputs["workerPeriod"] = state ? state.workerPeriod : undefined;
            inputs["workerPeriodUnit"] = state ? state.workerPeriodUnit : undefined;
        } else {
            const args = argsOrState as ManagedKubernetesArgs | undefined;
            if (!args || args.workerInstanceTypes === undefined) {
                throw new Error("Missing required property 'workerInstanceTypes'");
            }
            inputs["availabilityZone"] = args ? args.availabilityZone : undefined;
            inputs["clientCert"] = args ? args.clientCert : undefined;
            inputs["clientKey"] = args ? args.clientKey : undefined;
            inputs["clusterCaCert"] = args ? args.clusterCaCert : undefined;
            inputs["clusterNetworkType"] = args ? args.clusterNetworkType : undefined;
            inputs["forceUpdate"] = args ? args.forceUpdate : undefined;
            inputs["imageId"] = args ? args.imageId : undefined;
            inputs["installCloudMonitor"] = args ? args.installCloudMonitor : undefined;
            inputs["keyName"] = args ? args.keyName : undefined;
            inputs["kmsEncryptedPassword"] = args ? args.kmsEncryptedPassword : undefined;
            inputs["kmsEncryptionContext"] = args ? args.kmsEncryptionContext : undefined;
            inputs["kubeConfig"] = args ? args.kubeConfig : undefined;
            inputs["logConfig"] = args ? args.logConfig : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["namePrefix"] = args ? args.namePrefix : undefined;
            inputs["newNatGateway"] = args ? args.newNatGateway : undefined;
            inputs["password"] = args ? args.password : undefined;
            inputs["podCidr"] = args ? args.podCidr : undefined;
            inputs["serviceCidr"] = args ? args.serviceCidr : undefined;
            inputs["slbInternetEnabled"] = args ? args.slbInternetEnabled : undefined;
            inputs["version"] = args ? args.version : undefined;
            inputs["vswitchIds"] = args ? args.vswitchIds : undefined;
            inputs["workerAutoRenew"] = args ? args.workerAutoRenew : undefined;
            inputs["workerAutoRenewPeriod"] = args ? args.workerAutoRenewPeriod : undefined;
            inputs["workerDataDiskCategory"] = args ? args.workerDataDiskCategory : undefined;
            inputs["workerDataDiskSize"] = args ? args.workerDataDiskSize : undefined;
            inputs["workerDiskCategory"] = args ? args.workerDiskCategory : undefined;
            inputs["workerDiskSize"] = args ? args.workerDiskSize : undefined;
            inputs["workerInstanceChargeType"] = args ? args.workerInstanceChargeType : undefined;
            inputs["workerInstanceTypes"] = args ? args.workerInstanceTypes : undefined;
            inputs["workerNumber"] = args ? args.workerNumber : undefined;
            inputs["workerNumbers"] = args ? args.workerNumbers : undefined;
            inputs["workerPeriod"] = args ? args.workerPeriod : undefined;
            inputs["workerPeriodUnit"] = args ? args.workerPeriodUnit : undefined;
            inputs["securityGroupId"] = undefined /*out*/;
            inputs["vpcId"] = undefined /*out*/;
            inputs["workerNodes"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ManagedKubernetes.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedKubernetes resources.
 */
export interface ManagedKubernetesState {
    /**
     * The Zone where new kubernetes cluster will be located. If it is not be specified, the `vswitchIds` should be set, the value will be vswitch's zone.
     */
    readonly availabilityZone?: pulumi.Input<string>;
    /**
     * The path of client certificate, like `~/.kube/client-cert.pem`.
     */
    readonly clientCert?: pulumi.Input<string>;
    /**
     * The path of client key, like `~/.kube/client-key.pem`.
     */
    readonly clientKey?: pulumi.Input<string>;
    /**
     * The path of cluster ca certificate, like `~/.kube/cluster-ca-cert.pem`
     */
    readonly clusterCaCert?: pulumi.Input<string>;
    /**
     * The network that cluster uses, use `flannel` or `terway`.
     */
    readonly clusterNetworkType?: pulumi.Input<string>;
    /**
     * Default false, when you want to change `workerInstanceTypes` and `vswitchIds`, you have to set this field to true, then the cluster will be recreated.
     */
    readonly forceUpdate?: pulumi.Input<boolean>;
    /**
     * The ID of node image.
     */
    readonly imageId?: pulumi.Input<string>;
    /**
     * Whether to install cloud monitor for the kubernetes' node.
     */
    readonly installCloudMonitor?: pulumi.Input<boolean>;
    /**
     * The keypair of ssh login cluster node, you have to create it first.
     */
    readonly keyName?: pulumi.Input<string>;
    /**
     * An KMS encrypts password used to a cs managed kubernetes. It is conflicted with `password` and `keyName`.
     */
    readonly kmsEncryptedPassword?: pulumi.Input<string>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a cs managed kubernetes with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    readonly kmsEncryptionContext?: pulumi.Input<{[key: string]: any}>;
    /**
     * The path of kube config, like `~/.kube/config`.
     */
    readonly kubeConfig?: pulumi.Input<string>;
    /**
     * A list of one element containing information about the associated log store. It contains the following attributes:
     */
    readonly logConfig?: pulumi.Input<inputs.cs.ManagedKubernetesLogConfig>;
    /**
     * The kubernetes cluster's name. It is the only in one Alicloud account.
     */
    readonly name?: pulumi.Input<string>;
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * Whether to create a new nat gateway while creating kubernetes cluster. Default to true.
     */
    readonly newNatGateway?: pulumi.Input<boolean>;
    /**
     * The password of ssh login cluster node. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * The CIDR block for the pod network. When `clusterNetworkType` is  set to `flanne`, you must set value to this filed .
     * It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
     * Maximum number of hosts allowed in the cluster: 256. Refer to [Plan Kubernetes CIDR blocks under VPC](https://www.alibabacloud.com/help/doc-detail/64530.htm).
     */
    readonly podCidr?: pulumi.Input<string>;
    /**
     * The ID of security group where the current cluster worker node is located.
     */
    readonly securityGroupId?: pulumi.Input<string>;
    /**
     * The CIDR block for the service network.  
     * It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
     */
    readonly serviceCidr?: pulumi.Input<string>;
    /**
     * Whether to create internet load balancer for API Server. Default to false.
     */
    readonly slbInternetEnabled?: pulumi.Input<boolean>;
    readonly version?: pulumi.Input<string>;
    /**
     * The ID of VPC where the current cluster is located.
     */
    readonly vpcId?: pulumi.Input<string>;
    /**
     * The vswitch where new kubernetes cluster will be located. Specify one or more vswitch's id. It must be in the zone which `availabilityZone` specified.
     */
    readonly vswitchIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Enable worker payment auto-renew, defaults to false.
     */
    readonly workerAutoRenew?: pulumi.Input<boolean>;
    /**
     * Worker payment auto-renew period. When period unit is `Month`, it can be one of {“1”, “2”, “3”, “6”, “12”}.  When period unit is `Week`, it can be one of {“1”, “2”, “3”}.
     */
    readonly workerAutoRenewPeriod?: pulumi.Input<number>;
    /**
     * The data disk category of worker node. Its valid value are `cloudSsd` and `cloudEfficiency`, if not set, data disk will not be created.
     */
    readonly workerDataDiskCategory?: pulumi.Input<string>;
    /**
     * The data disk size of worker node. Its valid value range [20~32768] in GB. When `workerDataDiskCategory` is presented, it defaults to 40.
     */
    readonly workerDataDiskSize?: pulumi.Input<number>;
    /**
     * The system disk category of worker node. Its valid value are `cloudSsd` and `cloudEfficiency`. Default to `cloudEfficiency`.
     */
    readonly workerDiskCategory?: pulumi.Input<string>;
    /**
     * The system disk size of worker node. Its valid value range [20~32768] in GB. Default to 20.
     */
    readonly workerDiskSize?: pulumi.Input<number>;
    /**
     * Worker payment type. `PrePaid` or `PostPaid`, defaults to `PostPaid`.
     */
    readonly workerInstanceChargeType?: pulumi.Input<string>;
    readonly workerInstanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of cluster worker nodes. It contains several attributes to `Block Nodes`.
     */
    readonly workerNodes?: pulumi.Input<pulumi.Input<inputs.cs.ManagedKubernetesWorkerNode>[]>;
    /**
     * The total worker node number of the kubernetes cluster. Default to 3. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
     */
    readonly workerNumber?: pulumi.Input<number>;
    /**
     * The worker node number of the kubernetes cluster. Default to [3]. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
     */
    readonly workerNumbers?: pulumi.Input<number>;
    /**
     * Worker payment period. When period unit is `Month`, it can be one of { “1”, “2”, “3”, “4”, “5”, “6”, “7”, “8”, “9”, “12”, “24”, “36”,”48”,”60”}.  When period unit is `Week`, it can be one of {“1”, “2”, “3”, “4”}.
     */
    readonly workerPeriod?: pulumi.Input<number>;
    /**
     * Worker payment period unit. `Month` or `Week`, defaults to `Month`.
     */
    readonly workerPeriodUnit?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ManagedKubernetes resource.
 */
export interface ManagedKubernetesArgs {
    /**
     * The Zone where new kubernetes cluster will be located. If it is not be specified, the `vswitchIds` should be set, the value will be vswitch's zone.
     */
    readonly availabilityZone?: pulumi.Input<string>;
    /**
     * The path of client certificate, like `~/.kube/client-cert.pem`.
     */
    readonly clientCert?: pulumi.Input<string>;
    /**
     * The path of client key, like `~/.kube/client-key.pem`.
     */
    readonly clientKey?: pulumi.Input<string>;
    /**
     * The path of cluster ca certificate, like `~/.kube/cluster-ca-cert.pem`
     */
    readonly clusterCaCert?: pulumi.Input<string>;
    /**
     * The network that cluster uses, use `flannel` or `terway`.
     */
    readonly clusterNetworkType?: pulumi.Input<string>;
    /**
     * Default false, when you want to change `workerInstanceTypes` and `vswitchIds`, you have to set this field to true, then the cluster will be recreated.
     */
    readonly forceUpdate?: pulumi.Input<boolean>;
    /**
     * The ID of node image.
     */
    readonly imageId?: pulumi.Input<string>;
    /**
     * Whether to install cloud monitor for the kubernetes' node.
     */
    readonly installCloudMonitor?: pulumi.Input<boolean>;
    /**
     * The keypair of ssh login cluster node, you have to create it first.
     */
    readonly keyName?: pulumi.Input<string>;
    /**
     * An KMS encrypts password used to a cs managed kubernetes. It is conflicted with `password` and `keyName`.
     */
    readonly kmsEncryptedPassword?: pulumi.Input<string>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a cs managed kubernetes with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    readonly kmsEncryptionContext?: pulumi.Input<{[key: string]: any}>;
    /**
     * The path of kube config, like `~/.kube/config`.
     */
    readonly kubeConfig?: pulumi.Input<string>;
    /**
     * A list of one element containing information about the associated log store. It contains the following attributes:
     */
    readonly logConfig?: pulumi.Input<inputs.cs.ManagedKubernetesLogConfig>;
    /**
     * The kubernetes cluster's name. It is the only in one Alicloud account.
     */
    readonly name?: pulumi.Input<string>;
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * Whether to create a new nat gateway while creating kubernetes cluster. Default to true.
     */
    readonly newNatGateway?: pulumi.Input<boolean>;
    /**
     * The password of ssh login cluster node. You have to specify one of `password` `keyName` `kmsEncryptedPassword` fields.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * The CIDR block for the pod network. When `clusterNetworkType` is  set to `flanne`, you must set value to this filed .
     * It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
     * Maximum number of hosts allowed in the cluster: 256. Refer to [Plan Kubernetes CIDR blocks under VPC](https://www.alibabacloud.com/help/doc-detail/64530.htm).
     */
    readonly podCidr?: pulumi.Input<string>;
    /**
     * The CIDR block for the service network.  
     * It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
     */
    readonly serviceCidr?: pulumi.Input<string>;
    /**
     * Whether to create internet load balancer for API Server. Default to false.
     */
    readonly slbInternetEnabled?: pulumi.Input<boolean>;
    readonly version?: pulumi.Input<string>;
    /**
     * The vswitch where new kubernetes cluster will be located. Specify one or more vswitch's id. It must be in the zone which `availabilityZone` specified.
     */
    readonly vswitchIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Enable worker payment auto-renew, defaults to false.
     */
    readonly workerAutoRenew?: pulumi.Input<boolean>;
    /**
     * Worker payment auto-renew period. When period unit is `Month`, it can be one of {“1”, “2”, “3”, “6”, “12”}.  When period unit is `Week`, it can be one of {“1”, “2”, “3”}.
     */
    readonly workerAutoRenewPeriod?: pulumi.Input<number>;
    /**
     * The data disk category of worker node. Its valid value are `cloudSsd` and `cloudEfficiency`, if not set, data disk will not be created.
     */
    readonly workerDataDiskCategory?: pulumi.Input<string>;
    /**
     * The data disk size of worker node. Its valid value range [20~32768] in GB. When `workerDataDiskCategory` is presented, it defaults to 40.
     */
    readonly workerDataDiskSize?: pulumi.Input<number>;
    /**
     * The system disk category of worker node. Its valid value are `cloudSsd` and `cloudEfficiency`. Default to `cloudEfficiency`.
     */
    readonly workerDiskCategory?: pulumi.Input<string>;
    /**
     * The system disk size of worker node. Its valid value range [20~32768] in GB. Default to 20.
     */
    readonly workerDiskSize?: pulumi.Input<number>;
    /**
     * Worker payment type. `PrePaid` or `PostPaid`, defaults to `PostPaid`.
     */
    readonly workerInstanceChargeType?: pulumi.Input<string>;
    readonly workerInstanceTypes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The total worker node number of the kubernetes cluster. Default to 3. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
     */
    readonly workerNumber?: pulumi.Input<number>;
    /**
     * The worker node number of the kubernetes cluster. Default to [3]. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
     */
    readonly workerNumbers?: pulumi.Input<number>;
    /**
     * Worker payment period. When period unit is `Month`, it can be one of { “1”, “2”, “3”, “4”, “5”, “6”, “7”, “8”, “9”, “12”, “24”, “36”,”48”,”60”}.  When period unit is `Week`, it can be one of {“1”, “2”, “3”, “4”}.
     */
    readonly workerPeriod?: pulumi.Input<number>;
    /**
     * Worker payment period unit. `Month` or `Week`, defaults to `Month`.
     */
    readonly workerPeriodUnit?: pulumi.Input<string>;
}