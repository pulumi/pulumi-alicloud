import * as pulumi from "@pulumi/pulumi";
/**
 * This resource will help you to manager a Kubernetes Cluster. The cluster is same as container service created by web console.
 *
 * -> **NOTE:** Kubernetes cluster only supports VPC network and it can access internet while creating kubernetes cluster.
 * A Nat Gateway and configuring a SNAT for it can ensure one VPC network access internet. If there is no nat gateway in the
 * VPC, you can set `new_nat_gateway` to "true" to create one automatically.
 *
 * -> **NOTE:** If there is no specified `vswitch_ids`, the resource will create a new VPC and VSwitch while creating kubernetes cluster.
 *
 * -> **NOTE:** Each kubernetes cluster contains 3 master nodes and those number cannot be changed at now.
 *
 * -> **NOTE:** Creating kubernetes cluster need to install several packages and it will cost about 15 minutes. Please be patient.
 *
 * -> **NOTE:** From version 1.9.4, the provider supports to download kube config, client certificate, client key and cluster ca certificate
 * after creating cluster successfully, and you can put them into the specified location, like '~/.kube/config'.
 *
 * -> **NOTE:** From version 1.16.0, the provider supports Multiple Availability Zones Kubernetes Cluster. To create a cluster of this kind,
 * you must specify three items in `vswitch_ids`, `master_instance_types` and `worker_instance_types`.
 *
 * -> **NOTE:** From version 1.20.0, the provider supports disabling internet load balancer for API Server by setting `false` to `slb_internet_enabled`.
 */
export declare class Kubernetes extends pulumi.CustomResource {
    /**
     * Get an existing Kubernetes resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KubernetesState): Kubernetes;
    /**
     * The Zone where new kubernetes cluster will be located. If it is not be specified, the value will be vswitch's zone.
     */
    readonly availabilityZone: pulumi.Output<string>;
    /**
     * The path of client certificate, like `~/.kube/client-cert.pem`.
     */
    readonly clientCert: pulumi.Output<string | undefined>;
    /**
     * The path of client key, like `~/.kube/client-key.pem`.
     */
    readonly clientKey: pulumi.Output<string | undefined>;
    /**
     * The path of cluster ca certificate, like `~/.kube/cluster-ca-cert.pem`
     */
    readonly clusterCaCert: pulumi.Output<string | undefined>;
    /**
     * The network that cluster uses, use `flannel` or `terway`.
     */
    readonly clusterNetworkType: pulumi.Output<string | undefined>;
    /**
     * Map of kubernetes cluster connection information. It contains several attributes to `Block Connections`.
     */
    readonly connections: pulumi.Output<{
        apiServerInternet: string;
        apiServerIntranet: string;
        masterPublicIp: string;
        serviceDomain: string;
    }>;
    /**
     * Whether to allow to SSH login kubernetes. Default to false.
     */
    readonly enableSsh: pulumi.Output<boolean | undefined>;
    /**
     * The ID of node image.
     */
    readonly imageId: pulumi.Output<string>;
    /**
     * Whether to install cloud monitor for the kubernetes' node.
     */
    readonly installCloudMonitor: pulumi.Output<boolean | undefined>;
    /**
     * Whether to use outdated instance type. Default to false.
     */
    readonly isOutdated: pulumi.Output<boolean | undefined>;
    /**
     * The keypair of ssh login cluster node, you have to create it first.
     */
    readonly keyName: pulumi.Output<string | undefined>;
    /**
     * The path of kube config, like `~/.kube/config`.
     */
    readonly kubeConfig: pulumi.Output<string | undefined>;
    /**
     * A list of one element containing information about the associated log store. It contains the following attributes:
     */
    readonly logConfig: pulumi.Output<{
        project?: string;
        type: string;
    } | undefined>;
    /**
     * The system disk category of master node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
     */
    readonly masterDiskCategory: pulumi.Output<string | undefined>;
    /**
     * The system disk size of master node. Its valid value range [20~32768] in GB. Default to 20.
     */
    readonly masterDiskSize: pulumi.Output<number | undefined>;
    /**
     * (Required, Force new resource) The instance type of master node.
     */
    readonly masterInstanceType: pulumi.Output<string | undefined>;
    /**
     * The instance type of master node. Specify one type for single AZ Cluster, three types for MultiAZ Cluster.
     */
    readonly masterInstanceTypes: pulumi.Output<string[]>;
    /**
     * List of cluster master nodes. It contains several attributes to `Block Nodes`.
     */
    readonly masterNodes: pulumi.Output<{
        id: string;
        name: string;
        privateIp: string;
    }[]>;
    /**
     * The kubernetes cluster's name. It is the only in one Alicloud account.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The kubernetes cluster name's prefix. It is conflict with `name`. If it is specified, terraform will using it to build the only cluster name. Default to "Terraform-Creation".
     */
    readonly namePrefix: pulumi.Output<string | undefined>;
    /**
     * The ID of nat gateway used to launch kubernetes cluster.
     */
    readonly natGatewayId: pulumi.Output<string>;
    /**
     * Whether to create a new nat gateway while creating kubernetes cluster. Default to true.
     */
    readonly newNatGateway: pulumi.Output<boolean | undefined>;
    /**
     * The network mask used on pods for each node, ranging from `24` to `28`.
     * Larger this number is, less pods can be allocated on each node. Default value is `24`, means you can allocate 256 pods on each node.
     */
    readonly nodeCidrMask: pulumi.Output<number | undefined>;
    /**
     * (Deprecated from version 1.9.4) It has been deprecated from provider version 1.9.4. New field `master_nodes` and `worker_nodes` replace it.
     */
    readonly nodes: pulumi.Output<string[] | undefined>;
    /**
     * The password of ssh login cluster node. You have to specify one of `password` and `key_name` fields.
     */
    readonly password: pulumi.Output<string | undefined>;
    /**
     * The CIDR block for the pod network. It will be allocated automatically when `vswitch_ids` is not specified.
     * It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
     * Maximum number of hosts allowed in the cluster: 256. Refer to [Plan Kubernetes CIDR blocks under VPC](https://www.alibabacloud.com/help/doc-detail/64530.htm).
     */
    readonly podCidr: pulumi.Output<string | undefined>;
    /**
     * The ID of security group where the current cluster worker node is located.
     */
    readonly securityGroupId: pulumi.Output<string>;
    /**
     * The CIDR block for the service network.  It will be allocated automatically when `vswitch_id` is not specified.
     * It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
     */
    readonly serviceCidr: pulumi.Output<string | undefined>;
    /**
     * (Deprecated from version 1.9.2).
     */
    readonly slbId: pulumi.Output<string>;
    /**
     * The ID of public load balancer where the current cluster master node is located.
     */
    readonly slbInternet: pulumi.Output<string>;
    /**
     * Whether to create internet load balancer for API Server. Default to true.
     */
    readonly slbInternetEnabled: pulumi.Output<boolean | undefined>;
    /**
     * The ID of private load balancer where the current cluster master node is located.
     */
    readonly slbIntranet: pulumi.Output<string>;
    readonly version: pulumi.Output<string | undefined>;
    /**
     * The ID of VPC where the current cluster is located.
     */
    readonly vpcId: pulumi.Output<string>;
    /**
     * (Force new resource) The vswitch where new kubernetes cluster will be located. If it is not specified, a new VPC and VSwicth will be built. It must be in the zone which `availability_zone` specified.
     */
    readonly vswitchId: pulumi.Output<string | undefined>;
    /**
     * The vswitch where new kubernetes cluster will be located. For SingleAZ Cluster, if it is not specified, a new VPC and VSwicth will be built. It must be in the zone which `availability_zone` specified. For MultiAZ Cluster, you must create three vswitches firstly, specify them here.
     */
    readonly vswitchIds: pulumi.Output<string[]>;
    /**
     * The data disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`, if not set, data disk will not be created.
     */
    readonly workerDataDiskCategory: pulumi.Output<string | undefined>;
    /**
     * The data disk size of worker node. Its valid value range [20~32768] in GB. When `worker_data_disk_category` is presented, it defaults to 40.
     */
    readonly workerDataDiskSize: pulumi.Output<number | undefined>;
    /**
     * The system disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
     */
    readonly workerDiskCategory: pulumi.Output<string | undefined>;
    /**
     * The system disk size of worker node. Its valid value range [20~32768] in GB. Default to 20.
     */
    readonly workerDiskSize: pulumi.Output<number | undefined>;
    /**
     * (Required, Force new resource) The instance type of worker node.
     */
    readonly workerInstanceType: pulumi.Output<string | undefined>;
    /**
     * The instance type of worker node. Specify one type for single AZ Cluster, three types for MultiAZ Cluster.
     */
    readonly workerInstanceTypes: pulumi.Output<string[]>;
    /**
     * List of cluster worker nodes. It contains several attributes to `Block Nodes`.
     */
    readonly workerNodes: pulumi.Output<{
        id: string;
        name: string;
        privateIp: string;
    }[]>;
    /**
     * The worker node number of the kubernetes cluster. Default to 3. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
     */
    readonly workerNumber: pulumi.Output<number | undefined>;
    /**
     * The ECS instance node number in the current container cluster.
     */
    readonly workerNumbers: pulumi.Output<number[] | undefined>;
    /**
     * Create a Kubernetes resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KubernetesArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Kubernetes resources.
 */
export interface KubernetesState {
    /**
     * The Zone where new kubernetes cluster will be located. If it is not be specified, the value will be vswitch's zone.
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
     * Map of kubernetes cluster connection information. It contains several attributes to `Block Connections`.
     */
    readonly connections?: pulumi.Input<{
        apiServerInternet?: pulumi.Input<string>;
        apiServerIntranet?: pulumi.Input<string>;
        masterPublicIp?: pulumi.Input<string>;
        serviceDomain?: pulumi.Input<string>;
    }>;
    /**
     * Whether to allow to SSH login kubernetes. Default to false.
     */
    readonly enableSsh?: pulumi.Input<boolean>;
    /**
     * The ID of node image.
     */
    readonly imageId?: pulumi.Input<string>;
    /**
     * Whether to install cloud monitor for the kubernetes' node.
     */
    readonly installCloudMonitor?: pulumi.Input<boolean>;
    /**
     * Whether to use outdated instance type. Default to false.
     */
    readonly isOutdated?: pulumi.Input<boolean>;
    /**
     * The keypair of ssh login cluster node, you have to create it first.
     */
    readonly keyName?: pulumi.Input<string>;
    /**
     * The path of kube config, like `~/.kube/config`.
     */
    readonly kubeConfig?: pulumi.Input<string>;
    /**
     * A list of one element containing information about the associated log store. It contains the following attributes:
     */
    readonly logConfig?: pulumi.Input<{
        project?: pulumi.Input<string>;
        type: pulumi.Input<string>;
    }>;
    /**
     * The system disk category of master node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
     */
    readonly masterDiskCategory?: pulumi.Input<string>;
    /**
     * The system disk size of master node. Its valid value range [20~32768] in GB. Default to 20.
     */
    readonly masterDiskSize?: pulumi.Input<number>;
    /**
     * (Required, Force new resource) The instance type of master node.
     */
    readonly masterInstanceType?: pulumi.Input<string>;
    /**
     * The instance type of master node. Specify one type for single AZ Cluster, three types for MultiAZ Cluster.
     */
    readonly masterInstanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of cluster master nodes. It contains several attributes to `Block Nodes`.
     */
    readonly masterNodes?: pulumi.Input<pulumi.Input<{
        id?: pulumi.Input<string>;
        name?: pulumi.Input<string>;
        privateIp?: pulumi.Input<string>;
    }>[]>;
    /**
     * The kubernetes cluster's name. It is the only in one Alicloud account.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The kubernetes cluster name's prefix. It is conflict with `name`. If it is specified, terraform will using it to build the only cluster name. Default to "Terraform-Creation".
     */
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * The ID of nat gateway used to launch kubernetes cluster.
     */
    readonly natGatewayId?: pulumi.Input<string>;
    /**
     * Whether to create a new nat gateway while creating kubernetes cluster. Default to true.
     */
    readonly newNatGateway?: pulumi.Input<boolean>;
    /**
     * The network mask used on pods for each node, ranging from `24` to `28`.
     * Larger this number is, less pods can be allocated on each node. Default value is `24`, means you can allocate 256 pods on each node.
     */
    readonly nodeCidrMask?: pulumi.Input<number>;
    /**
     * (Deprecated from version 1.9.4) It has been deprecated from provider version 1.9.4. New field `master_nodes` and `worker_nodes` replace it.
     */
    readonly nodes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The password of ssh login cluster node. You have to specify one of `password` and `key_name` fields.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * The CIDR block for the pod network. It will be allocated automatically when `vswitch_ids` is not specified.
     * It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
     * Maximum number of hosts allowed in the cluster: 256. Refer to [Plan Kubernetes CIDR blocks under VPC](https://www.alibabacloud.com/help/doc-detail/64530.htm).
     */
    readonly podCidr?: pulumi.Input<string>;
    /**
     * The ID of security group where the current cluster worker node is located.
     */
    readonly securityGroupId?: pulumi.Input<string>;
    /**
     * The CIDR block for the service network.  It will be allocated automatically when `vswitch_id` is not specified.
     * It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
     */
    readonly serviceCidr?: pulumi.Input<string>;
    /**
     * (Deprecated from version 1.9.2).
     */
    readonly slbId?: pulumi.Input<string>;
    /**
     * The ID of public load balancer where the current cluster master node is located.
     */
    readonly slbInternet?: pulumi.Input<string>;
    /**
     * Whether to create internet load balancer for API Server. Default to true.
     */
    readonly slbInternetEnabled?: pulumi.Input<boolean>;
    /**
     * The ID of private load balancer where the current cluster master node is located.
     */
    readonly slbIntranet?: pulumi.Input<string>;
    readonly version?: pulumi.Input<string>;
    /**
     * The ID of VPC where the current cluster is located.
     */
    readonly vpcId?: pulumi.Input<string>;
    /**
     * (Force new resource) The vswitch where new kubernetes cluster will be located. If it is not specified, a new VPC and VSwicth will be built. It must be in the zone which `availability_zone` specified.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * The vswitch where new kubernetes cluster will be located. For SingleAZ Cluster, if it is not specified, a new VPC and VSwicth will be built. It must be in the zone which `availability_zone` specified. For MultiAZ Cluster, you must create three vswitches firstly, specify them here.
     */
    readonly vswitchIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The data disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`, if not set, data disk will not be created.
     */
    readonly workerDataDiskCategory?: pulumi.Input<string>;
    /**
     * The data disk size of worker node. Its valid value range [20~32768] in GB. When `worker_data_disk_category` is presented, it defaults to 40.
     */
    readonly workerDataDiskSize?: pulumi.Input<number>;
    /**
     * The system disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
     */
    readonly workerDiskCategory?: pulumi.Input<string>;
    /**
     * The system disk size of worker node. Its valid value range [20~32768] in GB. Default to 20.
     */
    readonly workerDiskSize?: pulumi.Input<number>;
    /**
     * (Required, Force new resource) The instance type of worker node.
     */
    readonly workerInstanceType?: pulumi.Input<string>;
    /**
     * The instance type of worker node. Specify one type for single AZ Cluster, three types for MultiAZ Cluster.
     */
    readonly workerInstanceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of cluster worker nodes. It contains several attributes to `Block Nodes`.
     */
    readonly workerNodes?: pulumi.Input<pulumi.Input<{
        id?: pulumi.Input<string>;
        name?: pulumi.Input<string>;
        privateIp?: pulumi.Input<string>;
    }>[]>;
    /**
     * The worker node number of the kubernetes cluster. Default to 3. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
     */
    readonly workerNumber?: pulumi.Input<number>;
    /**
     * The ECS instance node number in the current container cluster.
     */
    readonly workerNumbers?: pulumi.Input<pulumi.Input<number>[]>;
}
/**
 * The set of arguments for constructing a Kubernetes resource.
 */
export interface KubernetesArgs {
    /**
     * The Zone where new kubernetes cluster will be located. If it is not be specified, the value will be vswitch's zone.
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
     * Whether to allow to SSH login kubernetes. Default to false.
     */
    readonly enableSsh?: pulumi.Input<boolean>;
    /**
     * Whether to install cloud monitor for the kubernetes' node.
     */
    readonly installCloudMonitor?: pulumi.Input<boolean>;
    /**
     * Whether to use outdated instance type. Default to false.
     */
    readonly isOutdated?: pulumi.Input<boolean>;
    /**
     * The keypair of ssh login cluster node, you have to create it first.
     */
    readonly keyName?: pulumi.Input<string>;
    /**
     * The path of kube config, like `~/.kube/config`.
     */
    readonly kubeConfig?: pulumi.Input<string>;
    /**
     * A list of one element containing information about the associated log store. It contains the following attributes:
     */
    readonly logConfig?: pulumi.Input<{
        project?: pulumi.Input<string>;
        type: pulumi.Input<string>;
    }>;
    /**
     * The system disk category of master node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
     */
    readonly masterDiskCategory?: pulumi.Input<string>;
    /**
     * The system disk size of master node. Its valid value range [20~32768] in GB. Default to 20.
     */
    readonly masterDiskSize?: pulumi.Input<number>;
    /**
     * (Required, Force new resource) The instance type of master node.
     */
    readonly masterInstanceType?: pulumi.Input<string>;
    /**
     * The instance type of master node. Specify one type for single AZ Cluster, three types for MultiAZ Cluster.
     */
    readonly masterInstanceTypes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The kubernetes cluster's name. It is the only in one Alicloud account.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The kubernetes cluster name's prefix. It is conflict with `name`. If it is specified, terraform will using it to build the only cluster name. Default to "Terraform-Creation".
     */
    readonly namePrefix?: pulumi.Input<string>;
    /**
     * Whether to create a new nat gateway while creating kubernetes cluster. Default to true.
     */
    readonly newNatGateway?: pulumi.Input<boolean>;
    /**
     * The network mask used on pods for each node, ranging from `24` to `28`.
     * Larger this number is, less pods can be allocated on each node. Default value is `24`, means you can allocate 256 pods on each node.
     */
    readonly nodeCidrMask?: pulumi.Input<number>;
    /**
     * (Deprecated from version 1.9.4) It has been deprecated from provider version 1.9.4. New field `master_nodes` and `worker_nodes` replace it.
     */
    readonly nodes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The password of ssh login cluster node. You have to specify one of `password` and `key_name` fields.
     */
    readonly password?: pulumi.Input<string>;
    /**
     * The CIDR block for the pod network. It will be allocated automatically when `vswitch_ids` is not specified.
     * It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
     * Maximum number of hosts allowed in the cluster: 256. Refer to [Plan Kubernetes CIDR blocks under VPC](https://www.alibabacloud.com/help/doc-detail/64530.htm).
     */
    readonly podCidr?: pulumi.Input<string>;
    /**
     * The CIDR block for the service network.  It will be allocated automatically when `vswitch_id` is not specified.
     * It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
     */
    readonly serviceCidr?: pulumi.Input<string>;
    /**
     * Whether to create internet load balancer for API Server. Default to true.
     */
    readonly slbInternetEnabled?: pulumi.Input<boolean>;
    readonly version?: pulumi.Input<string>;
    /**
     * (Force new resource) The vswitch where new kubernetes cluster will be located. If it is not specified, a new VPC and VSwicth will be built. It must be in the zone which `availability_zone` specified.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * The vswitch where new kubernetes cluster will be located. For SingleAZ Cluster, if it is not specified, a new VPC and VSwicth will be built. It must be in the zone which `availability_zone` specified. For MultiAZ Cluster, you must create three vswitches firstly, specify them here.
     */
    readonly vswitchIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The data disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`, if not set, data disk will not be created.
     */
    readonly workerDataDiskCategory?: pulumi.Input<string>;
    /**
     * The data disk size of worker node. Its valid value range [20~32768] in GB. When `worker_data_disk_category` is presented, it defaults to 40.
     */
    readonly workerDataDiskSize?: pulumi.Input<number>;
    /**
     * The system disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
     */
    readonly workerDiskCategory?: pulumi.Input<string>;
    /**
     * The system disk size of worker node. Its valid value range [20~32768] in GB. Default to 20.
     */
    readonly workerDiskSize?: pulumi.Input<number>;
    /**
     * (Required, Force new resource) The instance type of worker node.
     */
    readonly workerInstanceType?: pulumi.Input<string>;
    /**
     * The instance type of worker node. Specify one type for single AZ Cluster, three types for MultiAZ Cluster.
     */
    readonly workerInstanceTypes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The worker node number of the kubernetes cluster. Default to 3. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
     */
    readonly workerNumber?: pulumi.Input<number>;
    /**
     * The ECS instance node number in the current container cluster.
     */
    readonly workerNumbers?: pulumi.Input<pulumi.Input<number>[]>;
}
