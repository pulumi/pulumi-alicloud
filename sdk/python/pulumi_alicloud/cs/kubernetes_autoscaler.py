# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class KubernetesAutoscaler(pulumi.CustomResource):
    cluster_id: pulumi.Output[str]
    """
    The id of kubernetes cluster.
    """
    cool_down_duration: pulumi.Output[str]
    """
    The cool_down_duration option of cluster-autoscaler.  
    """
    defer_scale_in_duration: pulumi.Output[str]
    """
    The defer_scale_in_duration option of cluster-autoscaler.
    """
    nodepools: pulumi.Output[list]
    """
    
    * `nodepools.id` - (Required) The scaling group id of the groups configured for cluster-autoscaler.
    * `nodepools.taints` - (Required) The taints for the nodes in scaling group.
    * `nodepools.labels` - (Required) The labels for the nodes in scaling group.
    
      * `id` (`str`)
      * `labels` (`str`)
      * `taints` (`str`)
    """
    utilization: pulumi.Output[str]
    """
    The utilization option of cluster-autoscaler.
    """
    def __init__(__self__, resource_name, opts=None, cluster_id=None, cool_down_duration=None, defer_scale_in_duration=None, nodepools=None, utilization=None, __props__=None, __name__=None, __opts__=None):
        """
        This resource will help you to manager cluster-autoscaler in Kubernetes Cluster. 
        
        > **NOTE:** The scaling group must use CentOS7 or AliyunLinux2 as base image.
        
        > **NOTE:** The cluster-autoscaler can only use the same size of instanceTypes in one scaling group. 
        
        > **NOTE:** Add Policy to RAM role of the node to deploy cluster-autoscaler if you need.
        
        > **NOTE:** Available in 1.65.0+.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The id of kubernetes cluster.
        :param pulumi.Input[str] cool_down_duration: The cool_down_duration option of cluster-autoscaler.  
        :param pulumi.Input[str] defer_scale_in_duration: The defer_scale_in_duration option of cluster-autoscaler.
        :param pulumi.Input[list] nodepools: 
               * `nodepools.id` - (Required) The scaling group id of the groups configured for cluster-autoscaler.
               * `nodepools.taints` - (Required) The taints for the nodes in scaling group.
               * `nodepools.labels` - (Required) The labels for the nodes in scaling group.
        :param pulumi.Input[str] utilization: The utilization option of cluster-autoscaler.
        
        The **nodepools** object supports the following:
        
          * `id` (`pulumi.Input[str]`)
          * `labels` (`pulumi.Input[str]`)
          * `taints` (`pulumi.Input[str]`)

        > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/cs_kubernetes_autoscaler.html.markdown.
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

            if cluster_id is None:
                raise TypeError("Missing required property 'cluster_id'")
            __props__['cluster_id'] = cluster_id
            if cool_down_duration is None:
                raise TypeError("Missing required property 'cool_down_duration'")
            __props__['cool_down_duration'] = cool_down_duration
            if defer_scale_in_duration is None:
                raise TypeError("Missing required property 'defer_scale_in_duration'")
            __props__['defer_scale_in_duration'] = defer_scale_in_duration
            __props__['nodepools'] = nodepools
            if utilization is None:
                raise TypeError("Missing required property 'utilization'")
            __props__['utilization'] = utilization
        super(KubernetesAutoscaler, __self__).__init__(
            'alicloud:cs/kubernetesAutoscaler:KubernetesAutoscaler',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, cluster_id=None, cool_down_duration=None, defer_scale_in_duration=None, nodepools=None, utilization=None):
        """
        Get an existing KubernetesAutoscaler resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The id of kubernetes cluster.
        :param pulumi.Input[str] cool_down_duration: The cool_down_duration option of cluster-autoscaler.  
        :param pulumi.Input[str] defer_scale_in_duration: The defer_scale_in_duration option of cluster-autoscaler.
        :param pulumi.Input[list] nodepools: 
               * `nodepools.id` - (Required) The scaling group id of the groups configured for cluster-autoscaler.
               * `nodepools.taints` - (Required) The taints for the nodes in scaling group.
               * `nodepools.labels` - (Required) The labels for the nodes in scaling group.
        :param pulumi.Input[str] utilization: The utilization option of cluster-autoscaler.
        
        The **nodepools** object supports the following:
        
          * `id` (`pulumi.Input[str]`)
          * `labels` (`pulumi.Input[str]`)
          * `taints` (`pulumi.Input[str]`)

        > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/cs_kubernetes_autoscaler.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["cluster_id"] = cluster_id
        __props__["cool_down_duration"] = cool_down_duration
        __props__["defer_scale_in_duration"] = defer_scale_in_duration
        __props__["nodepools"] = nodepools
        __props__["utilization"] = utilization
        return KubernetesAutoscaler(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
