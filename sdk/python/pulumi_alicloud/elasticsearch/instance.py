# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class Instance(pulumi.CustomResource):
    data_node_amount: pulumi.Output[float]
    """
    The Elasticsearch cluster's data node quantity, between 2 and 50.
    """
    data_node_disk_size: pulumi.Output[float]
    """
    The single data node storage space.
    - `cloud_ssd`: An SSD disk, supports a maximum of 2048 GiB (2 TB).
    - `cloud_efficiency` An ultra disk, supports a maximum of 5120 GiB (5 TB). If the data to be stored is larger than 2048 GiB, an ultra disk can only support the following data sizes (GiB): [`2560`, `3072`, `3584`, `4096`, `4608`, `5120`].
    """
    data_node_disk_type: pulumi.Output[str]
    """
    The data node disk type. Supported values: cloud_ssd, cloud_efficiency.
    """
    data_node_spec: pulumi.Output[str]
    """
    The data node specifications of the Elasticsearch instance.
    """
    description: pulumi.Output[str]
    """
    The description of instance. It a string of 0 to 30 characters.
    """
    domain: pulumi.Output[str]
    """
    Instance connection domain (only VPC network access supported).
    """
    instance_charge_type: pulumi.Output[str]
    """
    Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
    """
    kibana_domain: pulumi.Output[str]
    """
    Kibana console domain (Internet access supported).
    """
    kibana_port: pulumi.Output[float]
    """
    Kibana console port.
    """
    kibana_whitelists: pulumi.Output[list]
    """
    Set the Kibana's IP whitelist in internet network.
    """
    kms_encrypted_password: pulumi.Output[str]
    """
    An KMS encrypts password used to a instance. If the `password` is filled in, this field will be ignored, but you have to specify one of `password` and `kms_encrypted_password` fields.
    """
    kms_encryption_context: pulumi.Output[dict]
    """
    An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
    """
    master_node_spec: pulumi.Output[str]
    """
    The dedicated master node spec. If specified, dedicated master node will be created.
    """
    password: pulumi.Output[str]
    """
    The password of the instance. The password can be 8 to 32 characters in length and must contain three of the following conditions: uppercase letters, lowercase letters, numbers, and special characters (!@#$%^&*()_+-=).
    """
    period: pulumi.Output[float]
    """
    The duration that you will buy Elasticsearch instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
    """
    port: pulumi.Output[float]
    """
    Instance connection port.
    """
    private_whitelists: pulumi.Output[list]
    """
    Set the instance's IP whitelist in VPC network.
    """
    public_whitelists: pulumi.Output[list]
    status: pulumi.Output[str]
    """
    The Elasticsearch instance status. Includes `active`, `activating`, `inactive`. Some operations are denied when status is not `active`.
    """
    version: pulumi.Output[str]
    """
    Elasticsearch version. Supported values: `5.5.3_with_X-Pack`, `6.3_with_X-Pack` and `6.7_with_X-Pack`.
    """
    vswitch_id: pulumi.Output[str]
    """
    The ID of VSwitch.
    """
    zone_count: pulumi.Output[float]
    """
    The Multi-AZ supported for Elasticsearch, between 1 and 3. The `data_node_amount` value must be an integral multiple of the `zone_count` value.
    """
    def __init__(__self__, resource_name, opts=None, data_node_amount=None, data_node_disk_size=None, data_node_disk_type=None, data_node_spec=None, description=None, instance_charge_type=None, kibana_whitelists=None, kms_encrypted_password=None, kms_encryption_context=None, master_node_spec=None, password=None, period=None, private_whitelists=None, public_whitelists=None, version=None, vswitch_id=None, zone_count=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Elasticsearch instance resource. It contains data nodes, dedicated master node(optional) and etc. It can be associated with private IP whitelists and kibana IP whitelist.
        
        > **NOTE:** Only one operation is supported in a request. So if `data_node_spec` and `data_node_disk_size` are both changed, system will respond error.
        
        > **NOTE:** At present, `version` can not be modified once instance has been created.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[float] data_node_amount: The Elasticsearch cluster's data node quantity, between 2 and 50.
        :param pulumi.Input[float] data_node_disk_size: The single data node storage space.
               - `cloud_ssd`: An SSD disk, supports a maximum of 2048 GiB (2 TB).
               - `cloud_efficiency` An ultra disk, supports a maximum of 5120 GiB (5 TB). If the data to be stored is larger than 2048 GiB, an ultra disk can only support the following data sizes (GiB): [`2560`, `3072`, `3584`, `4096`, `4608`, `5120`].
        :param pulumi.Input[str] data_node_disk_type: The data node disk type. Supported values: cloud_ssd, cloud_efficiency.
        :param pulumi.Input[str] data_node_spec: The data node specifications of the Elasticsearch instance.
        :param pulumi.Input[str] description: The description of instance. It a string of 0 to 30 characters.
        :param pulumi.Input[str] instance_charge_type: Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        :param pulumi.Input[list] kibana_whitelists: Set the Kibana's IP whitelist in internet network.
        :param pulumi.Input[str] kms_encrypted_password: An KMS encrypts password used to a instance. If the `password` is filled in, this field will be ignored, but you have to specify one of `password` and `kms_encrypted_password` fields.
        :param pulumi.Input[dict] kms_encryption_context: An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        :param pulumi.Input[str] master_node_spec: The dedicated master node spec. If specified, dedicated master node will be created.
        :param pulumi.Input[str] password: The password of the instance. The password can be 8 to 32 characters in length and must contain three of the following conditions: uppercase letters, lowercase letters, numbers, and special characters (!@#$%^&*()_+-=).
        :param pulumi.Input[float] period: The duration that you will buy Elasticsearch instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
        :param pulumi.Input[list] private_whitelists: Set the instance's IP whitelist in VPC network.
        :param pulumi.Input[str] version: Elasticsearch version. Supported values: `5.5.3_with_X-Pack`, `6.3_with_X-Pack` and `6.7_with_X-Pack`.
        :param pulumi.Input[str] vswitch_id: The ID of VSwitch.
        :param pulumi.Input[float] zone_count: The Multi-AZ supported for Elasticsearch, between 1 and 3. The `data_node_amount` value must be an integral multiple of the `zone_count` value.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/elasticsearch_instance.html.markdown.
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

            if data_node_amount is None:
                raise TypeError("Missing required property 'data_node_amount'")
            __props__['data_node_amount'] = data_node_amount
            if data_node_disk_size is None:
                raise TypeError("Missing required property 'data_node_disk_size'")
            __props__['data_node_disk_size'] = data_node_disk_size
            if data_node_disk_type is None:
                raise TypeError("Missing required property 'data_node_disk_type'")
            __props__['data_node_disk_type'] = data_node_disk_type
            if data_node_spec is None:
                raise TypeError("Missing required property 'data_node_spec'")
            __props__['data_node_spec'] = data_node_spec
            __props__['description'] = description
            __props__['instance_charge_type'] = instance_charge_type
            __props__['kibana_whitelists'] = kibana_whitelists
            __props__['kms_encrypted_password'] = kms_encrypted_password
            __props__['kms_encryption_context'] = kms_encryption_context
            __props__['master_node_spec'] = master_node_spec
            __props__['password'] = password
            __props__['period'] = period
            __props__['private_whitelists'] = private_whitelists
            __props__['public_whitelists'] = public_whitelists
            if version is None:
                raise TypeError("Missing required property 'version'")
            __props__['version'] = version
            if vswitch_id is None:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__['vswitch_id'] = vswitch_id
            __props__['zone_count'] = zone_count
            __props__['domain'] = None
            __props__['kibana_domain'] = None
            __props__['kibana_port'] = None
            __props__['port'] = None
            __props__['status'] = None
        super(Instance, __self__).__init__(
            'alicloud:elasticsearch/instance:Instance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, data_node_amount=None, data_node_disk_size=None, data_node_disk_type=None, data_node_spec=None, description=None, domain=None, instance_charge_type=None, kibana_domain=None, kibana_port=None, kibana_whitelists=None, kms_encrypted_password=None, kms_encryption_context=None, master_node_spec=None, password=None, period=None, port=None, private_whitelists=None, public_whitelists=None, status=None, version=None, vswitch_id=None, zone_count=None):
        """
        Get an existing Instance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[float] data_node_amount: The Elasticsearch cluster's data node quantity, between 2 and 50.
        :param pulumi.Input[float] data_node_disk_size: The single data node storage space.
               - `cloud_ssd`: An SSD disk, supports a maximum of 2048 GiB (2 TB).
               - `cloud_efficiency` An ultra disk, supports a maximum of 5120 GiB (5 TB). If the data to be stored is larger than 2048 GiB, an ultra disk can only support the following data sizes (GiB): [`2560`, `3072`, `3584`, `4096`, `4608`, `5120`].
        :param pulumi.Input[str] data_node_disk_type: The data node disk type. Supported values: cloud_ssd, cloud_efficiency.
        :param pulumi.Input[str] data_node_spec: The data node specifications of the Elasticsearch instance.
        :param pulumi.Input[str] description: The description of instance. It a string of 0 to 30 characters.
        :param pulumi.Input[str] domain: Instance connection domain (only VPC network access supported).
        :param pulumi.Input[str] instance_charge_type: Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
        :param pulumi.Input[str] kibana_domain: Kibana console domain (Internet access supported).
        :param pulumi.Input[float] kibana_port: Kibana console port.
        :param pulumi.Input[list] kibana_whitelists: Set the Kibana's IP whitelist in internet network.
        :param pulumi.Input[str] kms_encrypted_password: An KMS encrypts password used to a instance. If the `password` is filled in, this field will be ignored, but you have to specify one of `password` and `kms_encrypted_password` fields.
        :param pulumi.Input[dict] kms_encryption_context: An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        :param pulumi.Input[str] master_node_spec: The dedicated master node spec. If specified, dedicated master node will be created.
        :param pulumi.Input[str] password: The password of the instance. The password can be 8 to 32 characters in length and must contain three of the following conditions: uppercase letters, lowercase letters, numbers, and special characters (!@#$%^&*()_+-=).
        :param pulumi.Input[float] period: The duration that you will buy Elasticsearch instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
        :param pulumi.Input[float] port: Instance connection port.
        :param pulumi.Input[list] private_whitelists: Set the instance's IP whitelist in VPC network.
        :param pulumi.Input[str] status: The Elasticsearch instance status. Includes `active`, `activating`, `inactive`. Some operations are denied when status is not `active`.
        :param pulumi.Input[str] version: Elasticsearch version. Supported values: `5.5.3_with_X-Pack`, `6.3_with_X-Pack` and `6.7_with_X-Pack`.
        :param pulumi.Input[str] vswitch_id: The ID of VSwitch.
        :param pulumi.Input[float] zone_count: The Multi-AZ supported for Elasticsearch, between 1 and 3. The `data_node_amount` value must be an integral multiple of the `zone_count` value.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/elasticsearch_instance.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["data_node_amount"] = data_node_amount
        __props__["data_node_disk_size"] = data_node_disk_size
        __props__["data_node_disk_type"] = data_node_disk_type
        __props__["data_node_spec"] = data_node_spec
        __props__["description"] = description
        __props__["domain"] = domain
        __props__["instance_charge_type"] = instance_charge_type
        __props__["kibana_domain"] = kibana_domain
        __props__["kibana_port"] = kibana_port
        __props__["kibana_whitelists"] = kibana_whitelists
        __props__["kms_encrypted_password"] = kms_encrypted_password
        __props__["kms_encryption_context"] = kms_encryption_context
        __props__["master_node_spec"] = master_node_spec
        __props__["password"] = password
        __props__["period"] = period
        __props__["port"] = port
        __props__["private_whitelists"] = private_whitelists
        __props__["public_whitelists"] = public_whitelists
        __props__["status"] = status
        __props__["version"] = version
        __props__["vswitch_id"] = vswitch_id
        __props__["zone_count"] = zone_count
        return Instance(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
