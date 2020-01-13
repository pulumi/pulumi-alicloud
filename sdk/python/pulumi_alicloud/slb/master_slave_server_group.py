# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class MasterSlaveServerGroup(pulumi.CustomResource):
    delete_protection_validation: pulumi.Output[bool]
    """
    Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
    """
    load_balancer_id: pulumi.Output[str]
    """
    The Load Balancer ID which is used to launch a new master slave server group.
    """
    name: pulumi.Output[str]
    """
    Name of the master slave server group. 
    """
    servers: pulumi.Output[list]
    """
    A list of ECS instances to be added. Only two ECS instances can be supported in one resource. It contains six sub-fields as `Block server` follows.
    
      * `port` (`float`)
      * `serverId` (`str`)
      * `server_type` (`str`)
      * `type` (`str`)
      * `weight` (`float`)
    """
    def __init__(__self__, resource_name, opts=None, delete_protection_validation=None, load_balancer_id=None, name=None, servers=None, __props__=None, __name__=None, __opts__=None):
        """
        A master slave server group contains two ECS instances. The master slave server group can help you to define multiple listening dimension.
        
        > **NOTE:** One ECS instance can be added into multiple master slave server groups.
        
        > **NOTE:** One master slave server group can only add two ECS instances, which are master server and slave server.
        
        > **NOTE:** One master slave server group can be attached with tcp/udp listeners in one load balancer.
        
        > **NOTE:** One Classic and Internet load balancer, its master slave server group can add Classic and VPC ECS instances.
        
        > **NOTE:** One Classic and Intranet load balancer, its master slave server group can only add Classic ECS instances.
        
        > **NOTE:** One VPC load balancer, its master slave server group can only add the same VPC ECS instances.
        
        > **NOTE:** Available in 1.54.0+
        
        ## Block servers
        
        The servers mapping supports the following:
        
        * `server_ids` - (Required) A list backend server ID (ECS instance ID).
        * `port` - (Required) The port used by the backend server. Valid value range: [1-65535].
        * `weight` - (Optional) Weight of the backend server. Valid value range: [0-100]. Default to 100.
        * `type` - (Optional, Available in 1.51.0+) Type of the backend server. Valid value ecs, eni. Default to eni.
        * `server_type` - (Optional) The server type of the backend server. Valid value Master, Slave.
        * `is_backup` - (Removed from v1.63.0) Determine if the server is executing. Valid value 0, 1. 
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] delete_protection_validation: Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        :param pulumi.Input[str] load_balancer_id: The Load Balancer ID which is used to launch a new master slave server group.
        :param pulumi.Input[str] name: Name of the master slave server group. 
        :param pulumi.Input[list] servers: A list of ECS instances to be added. Only two ECS instances can be supported in one resource. It contains six sub-fields as `Block server` follows.
        
        The **servers** object supports the following:
        
          * `port` (`pulumi.Input[float]`)
          * `serverId` (`pulumi.Input[str]`)
          * `server_type` (`pulumi.Input[str]`)
          * `type` (`pulumi.Input[str]`)
          * `weight` (`pulumi.Input[float]`)

        > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/slb_master_slave_server_group.html.markdown.
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

            __props__['delete_protection_validation'] = delete_protection_validation
            if load_balancer_id is None:
                raise TypeError("Missing required property 'load_balancer_id'")
            __props__['load_balancer_id'] = load_balancer_id
            __props__['name'] = name
            __props__['servers'] = servers
        super(MasterSlaveServerGroup, __self__).__init__(
            'alicloud:slb/masterSlaveServerGroup:MasterSlaveServerGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, delete_protection_validation=None, load_balancer_id=None, name=None, servers=None):
        """
        Get an existing MasterSlaveServerGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] delete_protection_validation: Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        :param pulumi.Input[str] load_balancer_id: The Load Balancer ID which is used to launch a new master slave server group.
        :param pulumi.Input[str] name: Name of the master slave server group. 
        :param pulumi.Input[list] servers: A list of ECS instances to be added. Only two ECS instances can be supported in one resource. It contains six sub-fields as `Block server` follows.
        
        The **servers** object supports the following:
        
          * `port` (`pulumi.Input[float]`)
          * `serverId` (`pulumi.Input[str]`)
          * `server_type` (`pulumi.Input[str]`)
          * `type` (`pulumi.Input[str]`)
          * `weight` (`pulumi.Input[float]`)

        > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/slb_master_slave_server_group.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["delete_protection_validation"] = delete_protection_validation
        __props__["load_balancer_id"] = load_balancer_id
        __props__["name"] = name
        __props__["servers"] = servers
        return MasterSlaveServerGroup(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
