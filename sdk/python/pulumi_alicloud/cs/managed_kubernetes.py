# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class ManagedKubernetes(pulumi.CustomResource):
    availability_zone: pulumi.Output[str]
    """
    The Zone where new kubernetes cluster will be located. If it is not be specified, the `vswitch_ids` should be set, the value will be vswitch's zone.
    """
    client_cert: pulumi.Output[str]
    """
    The path of client certificate, like `~/.kube/client-cert.pem`.
    """
    client_key: pulumi.Output[str]
    """
    The path of client key, like `~/.kube/client-key.pem`.
    """
    cluster_ca_cert: pulumi.Output[str]
    """
    The path of cluster ca certificate, like `~/.kube/cluster-ca-cert.pem`
    """
    cluster_network_type: pulumi.Output[str]
    """
    The network that cluster uses, use `flannel` or `terway`.
    """
    force_update: pulumi.Output[bool]
    """
    Default false, when you want to change `worker_instance_types` and `vswitch_ids`, you have to set this field to true, then the cluster will be recreated.
    """
    image_id: pulumi.Output[str]
    """
    The ID of node image.
    """
    install_cloud_monitor: pulumi.Output[bool]
    """
    Whether to install cloud monitor for the kubernetes' node.
    """
    key_name: pulumi.Output[str]
    """
    The keypair of ssh login cluster node, you have to create it first.
    """
    kms_encrypted_password: pulumi.Output[str]
    """
    An KMS encrypts password used to a cs managed kubernetes. It is conflicted with `password` and `key_name`.
    """
    kms_encryption_context: pulumi.Output[dict]
    """
    An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a cs managed kubernetes with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
    """
    kube_config: pulumi.Output[str]
    """
    The path of kube config, like `~/.kube/config`.
    """
    log_config: pulumi.Output[dict]
    """
    A list of one element containing information about the associated log store. It contains the following attributes:
    
      * `project` (`str`) - Log Service project name, cluster logs will output to this project.
      * `type` (`str`) - Type of collecting logs, only `SLS` are supported currently.
    """
    name: pulumi.Output[str]
    """
    The kubernetes cluster's name. It is the only in one Alicloud account.
    """
    name_prefix: pulumi.Output[str]
    new_nat_gateway: pulumi.Output[bool]
    """
    Whether to create a new nat gateway while creating kubernetes cluster. Default to true.
    """
    password: pulumi.Output[str]
    """
    The password of ssh login cluster node. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
    """
    pod_cidr: pulumi.Output[str]
    """
    The CIDR block for the pod network. When `cluster_network_type` is  set to `flanne`, you must set value to this filed .
    It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
    Maximum number of hosts allowed in the cluster: 256. Refer to [Plan Kubernetes CIDR blocks under VPC](https://www.alibabacloud.com/help/doc-detail/64530.htm).
    """
    security_group_id: pulumi.Output[str]
    """
    The ID of security group where the current cluster worker node is located.
    """
    service_cidr: pulumi.Output[str]
    """
    The CIDR block for the service network.  
    It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
    """
    slb_internet_enabled: pulumi.Output[bool]
    """
    Whether to create internet load balancer for API Server. Default to false.
    """
    version: pulumi.Output[str]
    vpc_id: pulumi.Output[str]
    """
    The ID of VPC where the current cluster is located.
    """
    vswitch_ids: pulumi.Output[list]
    """
    The vswitch where new kubernetes cluster will be located. Specify one or more vswitch's id. It must be in the zone which `availability_zone` specified.
    """
    worker_auto_renew: pulumi.Output[bool]
    """
    Enable worker payment auto-renew, defaults to false.
    """
    worker_auto_renew_period: pulumi.Output[float]
    """
    Worker payment auto-renew period. When period unit is `Month`, it can be one of {“1”, “2”, “3”, “6”, “12”}.  When period unit is `Week`, it can be one of {“1”, “2”, “3”}.
    """
    worker_data_disk_category: pulumi.Output[str]
    """
    The data disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`, if not set, data disk will not be created.
    """
    worker_data_disk_size: pulumi.Output[float]
    """
    The data disk size of worker node. Its valid value range [20~32768] in GB. When `worker_data_disk_category` is presented, it defaults to 40.
    """
    worker_disk_category: pulumi.Output[str]
    """
    The system disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
    """
    worker_disk_size: pulumi.Output[float]
    """
    The system disk size of worker node. Its valid value range [20~32768] in GB. Default to 20.
    """
    worker_instance_charge_type: pulumi.Output[str]
    """
    Worker payment type. `PrePaid` or `PostPaid`, defaults to `PostPaid`.
    """
    worker_instance_types: pulumi.Output[list]
    worker_nodes: pulumi.Output[list]
    """
    List of cluster worker nodes. It contains several attributes to `Block Nodes`.
    
      * `id` (`str`) - ID of the node.
      * `name` (`str`) - The kubernetes cluster's name. It is the only in one Alicloud account.
      * `privateIp` (`str`) - The private IP address of node.
    """
    worker_number: pulumi.Output[float]
    """
    The total worker node number of the kubernetes cluster. Default to 3. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
    """
    worker_numbers: pulumi.Output[float]
    """
    The worker node number of the kubernetes cluster. Default to [3]. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
    """
    worker_period: pulumi.Output[float]
    """
    Worker payment period. When period unit is `Month`, it can be one of { “1”, “2”, “3”, “4”, “5”, “6”, “7”, “8”, “9”, “12”, “24”, “36”,”48”,”60”}.  When period unit is `Week`, it can be one of {“1”, “2”, “3”, “4”}.
    """
    worker_period_unit: pulumi.Output[str]
    """
    Worker payment period unit. `Month` or `Week`, defaults to `Month`.
    """
    def __init__(__self__, resource_name, opts=None, availability_zone=None, client_cert=None, client_key=None, cluster_ca_cert=None, cluster_network_type=None, force_update=None, image_id=None, install_cloud_monitor=None, key_name=None, kms_encrypted_password=None, kms_encryption_context=None, kube_config=None, log_config=None, name=None, name_prefix=None, new_nat_gateway=None, password=None, pod_cidr=None, service_cidr=None, slb_internet_enabled=None, version=None, vswitch_ids=None, worker_auto_renew=None, worker_auto_renew_period=None, worker_data_disk_category=None, worker_data_disk_size=None, worker_disk_category=None, worker_disk_size=None, worker_instance_charge_type=None, worker_instance_types=None, worker_number=None, worker_numbers=None, worker_period=None, worker_period_unit=None, __props__=None, __name__=None, __opts__=None):
        """
        Create a ManagedKubernetes resource with the given unique name, props, and options.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] availability_zone: The Zone where new kubernetes cluster will be located. If it is not be specified, the `vswitch_ids` should be set, the value will be vswitch's zone.
        :param pulumi.Input[str] client_cert: The path of client certificate, like `~/.kube/client-cert.pem`.
        :param pulumi.Input[str] client_key: The path of client key, like `~/.kube/client-key.pem`.
        :param pulumi.Input[str] cluster_ca_cert: The path of cluster ca certificate, like `~/.kube/cluster-ca-cert.pem`
        :param pulumi.Input[str] cluster_network_type: The network that cluster uses, use `flannel` or `terway`.
        :param pulumi.Input[bool] force_update: Default false, when you want to change `worker_instance_types` and `vswitch_ids`, you have to set this field to true, then the cluster will be recreated.
        :param pulumi.Input[str] image_id: The ID of node image.
        :param pulumi.Input[bool] install_cloud_monitor: Whether to install cloud monitor for the kubernetes' node.
        :param pulumi.Input[str] key_name: The keypair of ssh login cluster node, you have to create it first.
        :param pulumi.Input[str] kms_encrypted_password: An KMS encrypts password used to a cs managed kubernetes. It is conflicted with `password` and `key_name`.
        :param pulumi.Input[dict] kms_encryption_context: An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a cs managed kubernetes with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        :param pulumi.Input[str] kube_config: The path of kube config, like `~/.kube/config`.
        :param pulumi.Input[dict] log_config: A list of one element containing information about the associated log store. It contains the following attributes:
        :param pulumi.Input[str] name: The kubernetes cluster's name. It is the only in one Alicloud account.
        :param pulumi.Input[bool] new_nat_gateway: Whether to create a new nat gateway while creating kubernetes cluster. Default to true.
        :param pulumi.Input[str] password: The password of ssh login cluster node. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        :param pulumi.Input[str] pod_cidr: The CIDR block for the pod network. When `cluster_network_type` is  set to `flanne`, you must set value to this filed .
               It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
               Maximum number of hosts allowed in the cluster: 256. Refer to [Plan Kubernetes CIDR blocks under VPC](https://www.alibabacloud.com/help/doc-detail/64530.htm).
        :param pulumi.Input[str] service_cidr: The CIDR block for the service network.  
               It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
        :param pulumi.Input[bool] slb_internet_enabled: Whether to create internet load balancer for API Server. Default to false.
        :param pulumi.Input[list] vswitch_ids: The vswitch where new kubernetes cluster will be located. Specify one or more vswitch's id. It must be in the zone which `availability_zone` specified.
        :param pulumi.Input[bool] worker_auto_renew: Enable worker payment auto-renew, defaults to false.
        :param pulumi.Input[float] worker_auto_renew_period: Worker payment auto-renew period. When period unit is `Month`, it can be one of {“1”, “2”, “3”, “6”, “12”}.  When period unit is `Week`, it can be one of {“1”, “2”, “3”}.
        :param pulumi.Input[str] worker_data_disk_category: The data disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`, if not set, data disk will not be created.
        :param pulumi.Input[float] worker_data_disk_size: The data disk size of worker node. Its valid value range [20~32768] in GB. When `worker_data_disk_category` is presented, it defaults to 40.
        :param pulumi.Input[str] worker_disk_category: The system disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
        :param pulumi.Input[float] worker_disk_size: The system disk size of worker node. Its valid value range [20~32768] in GB. Default to 20.
        :param pulumi.Input[str] worker_instance_charge_type: Worker payment type. `PrePaid` or `PostPaid`, defaults to `PostPaid`.
        :param pulumi.Input[float] worker_number: The total worker node number of the kubernetes cluster. Default to 3. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
        :param pulumi.Input[float] worker_numbers: The worker node number of the kubernetes cluster. Default to [3]. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
        :param pulumi.Input[float] worker_period: Worker payment period. When period unit is `Month`, it can be one of { “1”, “2”, “3”, “4”, “5”, “6”, “7”, “8”, “9”, “12”, “24”, “36”,”48”,”60”}.  When period unit is `Week`, it can be one of {“1”, “2”, “3”, “4”}.
        :param pulumi.Input[str] worker_period_unit: Worker payment period unit. `Month` or `Week`, defaults to `Month`.
        
        The **log_config** object supports the following:
        
          * `project` (`pulumi.Input[str]`) - Log Service project name, cluster logs will output to this project.
          * `type` (`pulumi.Input[str]`) - Type of collecting logs, only `SLS` are supported currently.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/cs_managed_kubernetes.html.markdown.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['availability_zone'] = availability_zone
            __props__['client_cert'] = client_cert
            __props__['client_key'] = client_key
            __props__['cluster_ca_cert'] = cluster_ca_cert
            __props__['cluster_network_type'] = cluster_network_type
            __props__['force_update'] = force_update
            __props__['image_id'] = image_id
            __props__['install_cloud_monitor'] = install_cloud_monitor
            __props__['key_name'] = key_name
            __props__['kms_encrypted_password'] = kms_encrypted_password
            __props__['kms_encryption_context'] = kms_encryption_context
            __props__['kube_config'] = kube_config
            __props__['log_config'] = log_config
            __props__['name'] = name
            __props__['name_prefix'] = name_prefix
            __props__['new_nat_gateway'] = new_nat_gateway
            __props__['password'] = password
            __props__['pod_cidr'] = pod_cidr
            __props__['service_cidr'] = service_cidr
            __props__['slb_internet_enabled'] = slb_internet_enabled
            __props__['version'] = version
            __props__['vswitch_ids'] = vswitch_ids
            __props__['worker_auto_renew'] = worker_auto_renew
            __props__['worker_auto_renew_period'] = worker_auto_renew_period
            __props__['worker_data_disk_category'] = worker_data_disk_category
            __props__['worker_data_disk_size'] = worker_data_disk_size
            __props__['worker_disk_category'] = worker_disk_category
            __props__['worker_disk_size'] = worker_disk_size
            __props__['worker_instance_charge_type'] = worker_instance_charge_type
            if worker_instance_types is None:
                raise TypeError("Missing required property 'worker_instance_types'")
            __props__['worker_instance_types'] = worker_instance_types
            __props__['worker_number'] = worker_number
            __props__['worker_numbers'] = worker_numbers
            __props__['worker_period'] = worker_period
            __props__['worker_period_unit'] = worker_period_unit
            __props__['security_group_id'] = None
            __props__['vpc_id'] = None
            __props__['worker_nodes'] = None
        super(ManagedKubernetes, __self__).__init__(
            'alicloud:cs/managedKubernetes:ManagedKubernetes',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, availability_zone=None, client_cert=None, client_key=None, cluster_ca_cert=None, cluster_network_type=None, force_update=None, image_id=None, install_cloud_monitor=None, key_name=None, kms_encrypted_password=None, kms_encryption_context=None, kube_config=None, log_config=None, name=None, name_prefix=None, new_nat_gateway=None, password=None, pod_cidr=None, security_group_id=None, service_cidr=None, slb_internet_enabled=None, version=None, vpc_id=None, vswitch_ids=None, worker_auto_renew=None, worker_auto_renew_period=None, worker_data_disk_category=None, worker_data_disk_size=None, worker_disk_category=None, worker_disk_size=None, worker_instance_charge_type=None, worker_instance_types=None, worker_nodes=None, worker_number=None, worker_numbers=None, worker_period=None, worker_period_unit=None):
        """
        Get an existing ManagedKubernetes resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] availability_zone: The Zone where new kubernetes cluster will be located. If it is not be specified, the `vswitch_ids` should be set, the value will be vswitch's zone.
        :param pulumi.Input[str] client_cert: The path of client certificate, like `~/.kube/client-cert.pem`.
        :param pulumi.Input[str] client_key: The path of client key, like `~/.kube/client-key.pem`.
        :param pulumi.Input[str] cluster_ca_cert: The path of cluster ca certificate, like `~/.kube/cluster-ca-cert.pem`
        :param pulumi.Input[str] cluster_network_type: The network that cluster uses, use `flannel` or `terway`.
        :param pulumi.Input[bool] force_update: Default false, when you want to change `worker_instance_types` and `vswitch_ids`, you have to set this field to true, then the cluster will be recreated.
        :param pulumi.Input[str] image_id: The ID of node image.
        :param pulumi.Input[bool] install_cloud_monitor: Whether to install cloud monitor for the kubernetes' node.
        :param pulumi.Input[str] key_name: The keypair of ssh login cluster node, you have to create it first.
        :param pulumi.Input[str] kms_encrypted_password: An KMS encrypts password used to a cs managed kubernetes. It is conflicted with `password` and `key_name`.
        :param pulumi.Input[dict] kms_encryption_context: An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating a cs managed kubernetes with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        :param pulumi.Input[str] kube_config: The path of kube config, like `~/.kube/config`.
        :param pulumi.Input[dict] log_config: A list of one element containing information about the associated log store. It contains the following attributes:
        :param pulumi.Input[str] name: The kubernetes cluster's name. It is the only in one Alicloud account.
        :param pulumi.Input[bool] new_nat_gateway: Whether to create a new nat gateway while creating kubernetes cluster. Default to true.
        :param pulumi.Input[str] password: The password of ssh login cluster node. You have to specify one of `password` `key_name` `kms_encrypted_password` fields.
        :param pulumi.Input[str] pod_cidr: The CIDR block for the pod network. When `cluster_network_type` is  set to `flanne`, you must set value to this filed .
               It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
               Maximum number of hosts allowed in the cluster: 256. Refer to [Plan Kubernetes CIDR blocks under VPC](https://www.alibabacloud.com/help/doc-detail/64530.htm).
        :param pulumi.Input[str] security_group_id: The ID of security group where the current cluster worker node is located.
        :param pulumi.Input[str] service_cidr: The CIDR block for the service network.  
               It cannot be duplicated with the VPC CIDR and CIDR used by Kubernetes cluster in VPC, cannot be modified after creation.
        :param pulumi.Input[bool] slb_internet_enabled: Whether to create internet load balancer for API Server. Default to false.
        :param pulumi.Input[str] vpc_id: The ID of VPC where the current cluster is located.
        :param pulumi.Input[list] vswitch_ids: The vswitch where new kubernetes cluster will be located. Specify one or more vswitch's id. It must be in the zone which `availability_zone` specified.
        :param pulumi.Input[bool] worker_auto_renew: Enable worker payment auto-renew, defaults to false.
        :param pulumi.Input[float] worker_auto_renew_period: Worker payment auto-renew period. When period unit is `Month`, it can be one of {“1”, “2”, “3”, “6”, “12”}.  When period unit is `Week`, it can be one of {“1”, “2”, “3”}.
        :param pulumi.Input[str] worker_data_disk_category: The data disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`, if not set, data disk will not be created.
        :param pulumi.Input[float] worker_data_disk_size: The data disk size of worker node. Its valid value range [20~32768] in GB. When `worker_data_disk_category` is presented, it defaults to 40.
        :param pulumi.Input[str] worker_disk_category: The system disk category of worker node. Its valid value are `cloud_ssd` and `cloud_efficiency`. Default to `cloud_efficiency`.
        :param pulumi.Input[float] worker_disk_size: The system disk size of worker node. Its valid value range [20~32768] in GB. Default to 20.
        :param pulumi.Input[str] worker_instance_charge_type: Worker payment type. `PrePaid` or `PostPaid`, defaults to `PostPaid`.
        :param pulumi.Input[list] worker_nodes: List of cluster worker nodes. It contains several attributes to `Block Nodes`.
        :param pulumi.Input[float] worker_number: The total worker node number of the kubernetes cluster. Default to 3. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
        :param pulumi.Input[float] worker_numbers: The worker node number of the kubernetes cluster. Default to [3]. It is limited up to 50 and if you want to enlarge it, please apply white list or contact with us.
        :param pulumi.Input[float] worker_period: Worker payment period. When period unit is `Month`, it can be one of { “1”, “2”, “3”, “4”, “5”, “6”, “7”, “8”, “9”, “12”, “24”, “36”,”48”,”60”}.  When period unit is `Week`, it can be one of {“1”, “2”, “3”, “4”}.
        :param pulumi.Input[str] worker_period_unit: Worker payment period unit. `Month` or `Week`, defaults to `Month`.
        
        The **log_config** object supports the following:
        
          * `project` (`pulumi.Input[str]`) - Log Service project name, cluster logs will output to this project.
          * `type` (`pulumi.Input[str]`) - Type of collecting logs, only `SLS` are supported currently.
        
        The **worker_nodes** object supports the following:
        
          * `id` (`pulumi.Input[str]`) - ID of the node.
          * `name` (`pulumi.Input[str]`) - The kubernetes cluster's name. It is the only in one Alicloud account.
          * `privateIp` (`pulumi.Input[str]`) - The private IP address of node.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/cs_managed_kubernetes.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["availability_zone"] = availability_zone
        __props__["client_cert"] = client_cert
        __props__["client_key"] = client_key
        __props__["cluster_ca_cert"] = cluster_ca_cert
        __props__["cluster_network_type"] = cluster_network_type
        __props__["force_update"] = force_update
        __props__["image_id"] = image_id
        __props__["install_cloud_monitor"] = install_cloud_monitor
        __props__["key_name"] = key_name
        __props__["kms_encrypted_password"] = kms_encrypted_password
        __props__["kms_encryption_context"] = kms_encryption_context
        __props__["kube_config"] = kube_config
        __props__["log_config"] = log_config
        __props__["name"] = name
        __props__["name_prefix"] = name_prefix
        __props__["new_nat_gateway"] = new_nat_gateway
        __props__["password"] = password
        __props__["pod_cidr"] = pod_cidr
        __props__["security_group_id"] = security_group_id
        __props__["service_cidr"] = service_cidr
        __props__["slb_internet_enabled"] = slb_internet_enabled
        __props__["version"] = version
        __props__["vpc_id"] = vpc_id
        __props__["vswitch_ids"] = vswitch_ids
        __props__["worker_auto_renew"] = worker_auto_renew
        __props__["worker_auto_renew_period"] = worker_auto_renew_period
        __props__["worker_data_disk_category"] = worker_data_disk_category
        __props__["worker_data_disk_size"] = worker_data_disk_size
        __props__["worker_disk_category"] = worker_disk_category
        __props__["worker_disk_size"] = worker_disk_size
        __props__["worker_instance_charge_type"] = worker_instance_charge_type
        __props__["worker_instance_types"] = worker_instance_types
        __props__["worker_nodes"] = worker_nodes
        __props__["worker_number"] = worker_number
        __props__["worker_numbers"] = worker_numbers
        __props__["worker_period"] = worker_period
        __props__["worker_period_unit"] = worker_period_unit
        return ManagedKubernetes(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
