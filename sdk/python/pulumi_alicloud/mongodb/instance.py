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
    account_password: pulumi.Output[str]
    """
    Password of the root account. It is a string of 6 to 32 characters and is composed of letters, numbers, and underlines.
    """
    backup_periods: pulumi.Output[list]
    """
    MongoDB Instance backup period. It is required when `backup_time` was existed. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
    """
    backup_time: pulumi.Output[str]
    """
    MongoDB instance backup time. It is required when `backup_period` was existed. In the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to a random time, like "23:00Z-24:00Z".
    """
    db_instance_class: pulumi.Output[str]
    """
    Instance specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
    """
    db_instance_storage: pulumi.Output[float]
    """
    User-defined DB instance storage space.Unit: GB. Value range:
    - Custom storage space; value range: [10,2000]
    - 10-GB increments.
    """
    engine_version: pulumi.Output[str]
    """
    Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/61763.htm) `EngineVersion`.
    """
    instance_charge_type: pulumi.Output[str]
    """
    Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`. It can be modified from `PostPaid` to `PrePaid` after version 1.63.0.
    """
    kms_encrypted_password: pulumi.Output[str]
    """
    An KMS encrypts password used to a instance. If the `account_password` is filled in, this field will be ignored.
    """
    kms_encryption_context: pulumi.Output[dict]
    """
    An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
    """
    maintain_end_time: pulumi.Output[str]
    """
    The end time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
    """
    maintain_start_time: pulumi.Output[str]
    """
    The start time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
    """
    name: pulumi.Output[str]
    """
    The name of DB instance. It a string of 2 to 256 characters.
    """
    period: pulumi.Output[float]
    """
    The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. System default to 1.
    """
    replica_set_name: pulumi.Output[str]
    """
    The name of the mongo replica set
    """
    replication_factor: pulumi.Output[float]
    """
    Number of replica set nodes. Valid values: [3,5,7]
    * `storage_engine` (Optional, ForceNew) Storage engine: WiredTiger or RocksDB. System Default value: WiredTiger.
    """
    retention_period: pulumi.Output[float]
    """
    Instance log backup retention days. Available in 1.42.0+.
    """
    security_ip_lists: pulumi.Output[list]
    """
    List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
    """
    storage_engine: pulumi.Output[str]
    tags: pulumi.Output[dict]
    """
    A mapping of tags to assign to the resource.
    """
    vswitch_id: pulumi.Output[str]
    """
    The virtual switch ID to launch DB instances in one VPC.
    """
    zone_id: pulumi.Output[str]
    """
    The Zone to launch the DB instance. it supports multiple zone.
    If it is a multi-zone and `vswitch_id` is specified, the vswitch must in one of them.
    The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `.getZones`.
    """
    def __init__(__self__, resource_name, opts=None, account_password=None, backup_periods=None, backup_time=None, db_instance_class=None, db_instance_storage=None, engine_version=None, instance_charge_type=None, kms_encrypted_password=None, kms_encryption_context=None, maintain_end_time=None, maintain_start_time=None, name=None, period=None, replication_factor=None, security_ip_lists=None, storage_engine=None, tags=None, vswitch_id=None, zone_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a MongoDB instance resource supports replica set instances only. the MongoDB provides stable, reliable, and automatic scalable database services. 
        It offers a full range of database solutions, such as disaster recovery, backup, recovery, monitoring, and alarms.
        You can see detail product introduction [here](https://www.alibabacloud.com/help/doc-detail/26558.htm)
        
        > **NOTE:**  Available in 1.37.0+
        
        > **NOTE:**  The following regions don't support create Classic network MongoDB instance.
        [`cn-zhangjiakou`,`cn-huhehaote`,`ap-southeast-2`,`ap-southeast-3`,`ap-southeast-5`,`ap-south-1`,`me-east-1`,`ap-northeast-1`,`eu-west-1`] 
        
        > **NOTE:**  Create MongoDB instance or change instance type and storage would cost 5~10 minutes. Please make full preparation
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_password: Password of the root account. It is a string of 6 to 32 characters and is composed of letters, numbers, and underlines.
        :param pulumi.Input[list] backup_periods: MongoDB Instance backup period. It is required when `backup_time` was existed. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
        :param pulumi.Input[str] backup_time: MongoDB instance backup time. It is required when `backup_period` was existed. In the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to a random time, like "23:00Z-24:00Z".
        :param pulumi.Input[str] db_instance_class: Instance specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
        :param pulumi.Input[float] db_instance_storage: User-defined DB instance storage space.Unit: GB. Value range:
               - Custom storage space; value range: [10,2000]
               - 10-GB increments.
        :param pulumi.Input[str] engine_version: Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/61763.htm) `EngineVersion`.
        :param pulumi.Input[str] instance_charge_type: Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`. It can be modified from `PostPaid` to `PrePaid` after version 1.63.0.
        :param pulumi.Input[str] kms_encrypted_password: An KMS encrypts password used to a instance. If the `account_password` is filled in, this field will be ignored.
        :param pulumi.Input[dict] kms_encryption_context: An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        :param pulumi.Input[str] maintain_end_time: The end time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        :param pulumi.Input[str] maintain_start_time: The start time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        :param pulumi.Input[str] name: The name of DB instance. It a string of 2 to 256 characters.
        :param pulumi.Input[float] period: The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. System default to 1.
        :param pulumi.Input[float] replication_factor: Number of replica set nodes. Valid values: [3,5,7]
               * `storage_engine` (Optional, ForceNew) Storage engine: WiredTiger or RocksDB. System Default value: WiredTiger.
        :param pulumi.Input[list] security_ip_lists: List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        :param pulumi.Input[dict] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vswitch_id: The virtual switch ID to launch DB instances in one VPC.
        :param pulumi.Input[str] zone_id: The Zone to launch the DB instance. it supports multiple zone.
               If it is a multi-zone and `vswitch_id` is specified, the vswitch must in one of them.
               The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `.getZones`.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/mongodb_instance.html.markdown.
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

            __props__['account_password'] = account_password
            __props__['backup_periods'] = backup_periods
            __props__['backup_time'] = backup_time
            if db_instance_class is None:
                raise TypeError("Missing required property 'db_instance_class'")
            __props__['db_instance_class'] = db_instance_class
            if db_instance_storage is None:
                raise TypeError("Missing required property 'db_instance_storage'")
            __props__['db_instance_storage'] = db_instance_storage
            if engine_version is None:
                raise TypeError("Missing required property 'engine_version'")
            __props__['engine_version'] = engine_version
            __props__['instance_charge_type'] = instance_charge_type
            __props__['kms_encrypted_password'] = kms_encrypted_password
            __props__['kms_encryption_context'] = kms_encryption_context
            __props__['maintain_end_time'] = maintain_end_time
            __props__['maintain_start_time'] = maintain_start_time
            __props__['name'] = name
            __props__['period'] = period
            __props__['replication_factor'] = replication_factor
            __props__['security_ip_lists'] = security_ip_lists
            __props__['storage_engine'] = storage_engine
            __props__['tags'] = tags
            __props__['vswitch_id'] = vswitch_id
            __props__['zone_id'] = zone_id
            __props__['replica_set_name'] = None
            __props__['retention_period'] = None
        super(Instance, __self__).__init__(
            'alicloud:mongodb/instance:Instance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, account_password=None, backup_periods=None, backup_time=None, db_instance_class=None, db_instance_storage=None, engine_version=None, instance_charge_type=None, kms_encrypted_password=None, kms_encryption_context=None, maintain_end_time=None, maintain_start_time=None, name=None, period=None, replica_set_name=None, replication_factor=None, retention_period=None, security_ip_lists=None, storage_engine=None, tags=None, vswitch_id=None, zone_id=None):
        """
        Get an existing Instance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_password: Password of the root account. It is a string of 6 to 32 characters and is composed of letters, numbers, and underlines.
        :param pulumi.Input[list] backup_periods: MongoDB Instance backup period. It is required when `backup_time` was existed. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
        :param pulumi.Input[str] backup_time: MongoDB instance backup time. It is required when `backup_period` was existed. In the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to a random time, like "23:00Z-24:00Z".
        :param pulumi.Input[str] db_instance_class: Instance specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
        :param pulumi.Input[float] db_instance_storage: User-defined DB instance storage space.Unit: GB. Value range:
               - Custom storage space; value range: [10,2000]
               - 10-GB increments.
        :param pulumi.Input[str] engine_version: Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/61763.htm) `EngineVersion`.
        :param pulumi.Input[str] instance_charge_type: Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`. It can be modified from `PostPaid` to `PrePaid` after version 1.63.0.
        :param pulumi.Input[str] kms_encrypted_password: An KMS encrypts password used to a instance. If the `account_password` is filled in, this field will be ignored.
        :param pulumi.Input[dict] kms_encryption_context: An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
        :param pulumi.Input[str] maintain_end_time: The end time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        :param pulumi.Input[str] maintain_start_time: The start time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        :param pulumi.Input[str] name: The name of DB instance. It a string of 2 to 256 characters.
        :param pulumi.Input[float] period: The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. System default to 1.
        :param pulumi.Input[str] replica_set_name: The name of the mongo replica set
        :param pulumi.Input[float] replication_factor: Number of replica set nodes. Valid values: [3,5,7]
               * `storage_engine` (Optional, ForceNew) Storage engine: WiredTiger or RocksDB. System Default value: WiredTiger.
        :param pulumi.Input[float] retention_period: Instance log backup retention days. Available in 1.42.0+.
        :param pulumi.Input[list] security_ip_lists: List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        :param pulumi.Input[dict] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vswitch_id: The virtual switch ID to launch DB instances in one VPC.
        :param pulumi.Input[str] zone_id: The Zone to launch the DB instance. it supports multiple zone.
               If it is a multi-zone and `vswitch_id` is specified, the vswitch must in one of them.
               The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `.getZones`.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/mongodb_instance.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["account_password"] = account_password
        __props__["backup_periods"] = backup_periods
        __props__["backup_time"] = backup_time
        __props__["db_instance_class"] = db_instance_class
        __props__["db_instance_storage"] = db_instance_storage
        __props__["engine_version"] = engine_version
        __props__["instance_charge_type"] = instance_charge_type
        __props__["kms_encrypted_password"] = kms_encrypted_password
        __props__["kms_encryption_context"] = kms_encryption_context
        __props__["maintain_end_time"] = maintain_end_time
        __props__["maintain_start_time"] = maintain_start_time
        __props__["name"] = name
        __props__["period"] = period
        __props__["replica_set_name"] = replica_set_name
        __props__["replication_factor"] = replication_factor
        __props__["retention_period"] = retention_period
        __props__["security_ip_lists"] = security_ip_lists
        __props__["storage_engine"] = storage_engine
        __props__["tags"] = tags
        __props__["vswitch_id"] = vswitch_id
        __props__["zone_id"] = zone_id
        return Instance(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
