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
    auto_renew: pulumi.Output[bool]
    """
    `true`, `false`, System default to `false`, valid when pay_type = PrePaid.
    """
    cold_storage_size: pulumi.Output[float]
    """
    0 or 0+. 0 means is_cold_storage = false. 0+ means is_cold_storage = true
    """
    core_disk_size: pulumi.Output[float]
    """
    User-defined HBase instance one core node's storage space.Unit: GB. Value range:
    - Custom storage space; value range: [400, 8000]
    - 40-GB increments.
    """
    core_disk_type: pulumi.Output[str]
    """
    Valid values are `cloud_ssd`, `cloud_efficiency`, `local_hdd_pro`, `local_ssd_pro`. local_disk size is fixed.
    """
    core_instance_quantity: pulumi.Output[float]
    """
    default=2. if core_instance_quantity > 1,this is cluster's instance.  if core_instance_quantity = 1,this is a single instance. 
    """
    core_instance_type: pulumi.Output[str]
    deletion_protection: pulumi.Output[bool]
    """
    the switch of delete protection. true: delete protect, false: no delete protect. you must set false when you want to delete cluster.
    """
    duration: pulumi.Output[float]
    """
    1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60, valid when pay_type = PrePaid. unit: month.
    """
    engine: pulumi.Output[str]
    engine_version: pulumi.Output[str]
    """
    hbase major version. hbase:1.1/2.0, hbaseue:2.0, bds:1.0, unsupport other engine temporarily. Value options can refer to the latest docs [CreateInstance](https://help.aliyun.com/document_detail/144607.html).
    * `master_instance_type`、`core_instance_type` - (Required, ForceNew) Instance specification. see [Instance specifications](https://help.aliyun.com/document_detail/53532.html). or you can call describeInstanceType api.
    """
    maintain_end_time: pulumi.Output[str]
    """
    The end time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
    """
    maintain_start_time: pulumi.Output[str]
    """
    The start time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
    """
    master_instance_type: pulumi.Output[str]
    name: pulumi.Output[str]
    """
    HBase instance name. Length must be 2-128 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted. 
    """
    pay_type: pulumi.Output[str]
    """
    Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
    """
    tags: pulumi.Output[dict]
    """
    A mapping of tags to assign to the resource.
    """
    vswitch_id: pulumi.Output[str]
    """
    if vswitch_id is not empty, that mean net_type = vpc and has a same region. if vswitch_id is empty, net_type_classic
    """
    zone_id: pulumi.Output[str]
    """
    The Zone to launch the HBase instance. if vswitch_id is not empty, this zone_id can be "" or consistent.
    """
    def __init__(__self__, resource_name, opts=None, auto_renew=None, cold_storage_size=None, core_disk_size=None, core_disk_type=None, core_instance_quantity=None, core_instance_type=None, deletion_protection=None, duration=None, engine=None, engine_version=None, maintain_end_time=None, maintain_start_time=None, master_instance_type=None, name=None, pay_type=None, tags=None, vswitch_id=None, zone_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a HBase instance resource supports replica set instances only. the HBase provides stable, reliable, and automatic scalable database services. 
        It offers a full range of database solutions, such as disaster recovery, backup, recovery, monitoring, and alarms.
        You can see detail product introduction [here](https://help.aliyun.com/product/49055.html)

        > **NOTE:**  Available in 1.67.0+

        > **NOTE:**  The following regions don't support create Classic network HBase instance.
        [`cn-hangzhou`,`cn-shanghai`,`cn-qingdao`,`cn-beijing`,`cn-shenzhen`,`ap-southeast-1a`,.....]
        the official website mark  more regions. or you can call [DescribeRegions](https://help.aliyun.com/document_detail/144489.html)

        > **NOTE:**  Create HBase instance or change instance type and storage would cost 15 minutes. Please make full preparation

        ## Example Usage

        ### Create a hbase instance

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.hbase.Instance("default",
            cold_storage_size=0,
            core_disk_size=400,
            core_disk_type="cloud_efficiency",
            core_instance_quantity=2,
            core_instance_type="hbase.sn1.large",
            engine_version="2.0",
            master_instance_type="hbase.sn1.large",
            pay_type="PostPaid",
            zone_id="cn-shenzhen-b")
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_renew: `true`, `false`, System default to `false`, valid when pay_type = PrePaid.
        :param pulumi.Input[float] cold_storage_size: 0 or 0+. 0 means is_cold_storage = false. 0+ means is_cold_storage = true
        :param pulumi.Input[float] core_disk_size: User-defined HBase instance one core node's storage space.Unit: GB. Value range:
               - Custom storage space; value range: [400, 8000]
               - 40-GB increments.
        :param pulumi.Input[str] core_disk_type: Valid values are `cloud_ssd`, `cloud_efficiency`, `local_hdd_pro`, `local_ssd_pro`. local_disk size is fixed.
        :param pulumi.Input[float] core_instance_quantity: default=2. if core_instance_quantity > 1,this is cluster's instance.  if core_instance_quantity = 1,this is a single instance. 
        :param pulumi.Input[bool] deletion_protection: the switch of delete protection. true: delete protect, false: no delete protect. you must set false when you want to delete cluster.
        :param pulumi.Input[float] duration: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60, valid when pay_type = PrePaid. unit: month.
        :param pulumi.Input[str] engine_version: hbase major version. hbase:1.1/2.0, hbaseue:2.0, bds:1.0, unsupport other engine temporarily. Value options can refer to the latest docs [CreateInstance](https://help.aliyun.com/document_detail/144607.html).
               * `master_instance_type`、`core_instance_type` - (Required, ForceNew) Instance specification. see [Instance specifications](https://help.aliyun.com/document_detail/53532.html). or you can call describeInstanceType api.
        :param pulumi.Input[str] maintain_end_time: The end time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        :param pulumi.Input[str] maintain_start_time: The start time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        :param pulumi.Input[str] name: HBase instance name. Length must be 2-128 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted. 
        :param pulumi.Input[str] pay_type: Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
        :param pulumi.Input[dict] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vswitch_id: if vswitch_id is not empty, that mean net_type = vpc and has a same region. if vswitch_id is empty, net_type_classic
        :param pulumi.Input[str] zone_id: The Zone to launch the HBase instance. if vswitch_id is not empty, this zone_id can be "" or consistent.
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

            __props__['auto_renew'] = auto_renew
            __props__['cold_storage_size'] = cold_storage_size
            __props__['core_disk_size'] = core_disk_size
            if core_disk_type is None:
                raise TypeError("Missing required property 'core_disk_type'")
            __props__['core_disk_type'] = core_disk_type
            __props__['core_instance_quantity'] = core_instance_quantity
            if core_instance_type is None:
                raise TypeError("Missing required property 'core_instance_type'")
            __props__['core_instance_type'] = core_instance_type
            __props__['deletion_protection'] = deletion_protection
            __props__['duration'] = duration
            __props__['engine'] = engine
            if engine_version is None:
                raise TypeError("Missing required property 'engine_version'")
            __props__['engine_version'] = engine_version
            __props__['maintain_end_time'] = maintain_end_time
            __props__['maintain_start_time'] = maintain_start_time
            if master_instance_type is None:
                raise TypeError("Missing required property 'master_instance_type'")
            __props__['master_instance_type'] = master_instance_type
            __props__['name'] = name
            __props__['pay_type'] = pay_type
            __props__['tags'] = tags
            __props__['vswitch_id'] = vswitch_id
            __props__['zone_id'] = zone_id
        super(Instance, __self__).__init__(
            'alicloud:hbase/instance:Instance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, auto_renew=None, cold_storage_size=None, core_disk_size=None, core_disk_type=None, core_instance_quantity=None, core_instance_type=None, deletion_protection=None, duration=None, engine=None, engine_version=None, maintain_end_time=None, maintain_start_time=None, master_instance_type=None, name=None, pay_type=None, tags=None, vswitch_id=None, zone_id=None):
        """
        Get an existing Instance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_renew: `true`, `false`, System default to `false`, valid when pay_type = PrePaid.
        :param pulumi.Input[float] cold_storage_size: 0 or 0+. 0 means is_cold_storage = false. 0+ means is_cold_storage = true
        :param pulumi.Input[float] core_disk_size: User-defined HBase instance one core node's storage space.Unit: GB. Value range:
               - Custom storage space; value range: [400, 8000]
               - 40-GB increments.
        :param pulumi.Input[str] core_disk_type: Valid values are `cloud_ssd`, `cloud_efficiency`, `local_hdd_pro`, `local_ssd_pro`. local_disk size is fixed.
        :param pulumi.Input[float] core_instance_quantity: default=2. if core_instance_quantity > 1,this is cluster's instance.  if core_instance_quantity = 1,this is a single instance. 
        :param pulumi.Input[bool] deletion_protection: the switch of delete protection. true: delete protect, false: no delete protect. you must set false when you want to delete cluster.
        :param pulumi.Input[float] duration: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60, valid when pay_type = PrePaid. unit: month.
        :param pulumi.Input[str] engine_version: hbase major version. hbase:1.1/2.0, hbaseue:2.0, bds:1.0, unsupport other engine temporarily. Value options can refer to the latest docs [CreateInstance](https://help.aliyun.com/document_detail/144607.html).
               * `master_instance_type`、`core_instance_type` - (Required, ForceNew) Instance specification. see [Instance specifications](https://help.aliyun.com/document_detail/53532.html). or you can call describeInstanceType api.
        :param pulumi.Input[str] maintain_end_time: The end time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        :param pulumi.Input[str] maintain_start_time: The start time of the operation and maintenance time period of the instance, in the format of HH:mmZ (UTC time).
        :param pulumi.Input[str] name: HBase instance name. Length must be 2-128 characters long. Only Chinese characters, English letters, numbers, period (.), underline (_), or dash (-) are permitted. 
        :param pulumi.Input[str] pay_type: Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
        :param pulumi.Input[dict] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vswitch_id: if vswitch_id is not empty, that mean net_type = vpc and has a same region. if vswitch_id is empty, net_type_classic
        :param pulumi.Input[str] zone_id: The Zone to launch the HBase instance. if vswitch_id is not empty, this zone_id can be "" or consistent.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["auto_renew"] = auto_renew
        __props__["cold_storage_size"] = cold_storage_size
        __props__["core_disk_size"] = core_disk_size
        __props__["core_disk_type"] = core_disk_type
        __props__["core_instance_quantity"] = core_instance_quantity
        __props__["core_instance_type"] = core_instance_type
        __props__["deletion_protection"] = deletion_protection
        __props__["duration"] = duration
        __props__["engine"] = engine
        __props__["engine_version"] = engine_version
        __props__["maintain_end_time"] = maintain_end_time
        __props__["maintain_start_time"] = maintain_start_time
        __props__["master_instance_type"] = master_instance_type
        __props__["name"] = name
        __props__["pay_type"] = pay_type
        __props__["tags"] = tags
        __props__["vswitch_id"] = vswitch_id
        __props__["zone_id"] = zone_id
        return Instance(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
