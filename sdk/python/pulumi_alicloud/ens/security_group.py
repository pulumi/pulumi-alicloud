# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SecurityGroupArgs', 'SecurityGroup']

@pulumi.input_type
class SecurityGroupArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 security_group_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SecurityGroup resource.
        :param pulumi.Input[str] description: Security group description informationIt must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
        :param pulumi.Input[str] security_group_name: Security group nameThe security group name. The length is 2~128 English or Chinese characters. It must start with an uppercase or lowcase letter or a Chinese character and cannot start with `http://` or `https`. Can contain digits, colons (:), underscores (_), or hyphens (-).
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if security_group_name is not None:
            pulumi.set(__self__, "security_group_name", security_group_name)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Security group description informationIt must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="securityGroupName")
    def security_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        Security group nameThe security group name. The length is 2~128 English or Chinese characters. It must start with an uppercase or lowcase letter or a Chinese character and cannot start with `http://` or `https`. Can contain digits, colons (:), underscores (_), or hyphens (-).
        """
        return pulumi.get(self, "security_group_name")

    @security_group_name.setter
    def security_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_group_name", value)


@pulumi.input_type
class _SecurityGroupState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 security_group_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SecurityGroup resources.
        :param pulumi.Input[str] description: Security group description informationIt must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
        :param pulumi.Input[str] security_group_name: Security group nameThe security group name. The length is 2~128 English or Chinese characters. It must start with an uppercase or lowcase letter or a Chinese character and cannot start with `http://` or `https`. Can contain digits, colons (:), underscores (_), or hyphens (-).
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if security_group_name is not None:
            pulumi.set(__self__, "security_group_name", security_group_name)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Security group description informationIt must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="securityGroupName")
    def security_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        Security group nameThe security group name. The length is 2~128 English or Chinese characters. It must start with an uppercase or lowcase letter or a Chinese character and cannot start with `http://` or `https`. Can contain digits, colons (:), underscores (_), or hyphens (-).
        """
        return pulumi.get(self, "security_group_name")

    @security_group_name.setter
    def security_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_group_name", value)


class SecurityGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 security_group_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a ENS Security Group resource.

        For information about ENS Security Group and how to use it, see [What is Security Group](https://www.alibabacloud.com/help/en/ens/developer-reference/api-createsnapshot).

        > **NOTE:** Available since v1.213.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.ens.SecurityGroup("default",
            description=name,
            security_group_name=name)
        ```

        ## Import

        ENS Security Group can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ens/securityGroup:SecurityGroup example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Security group description informationIt must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
        :param pulumi.Input[str] security_group_name: Security group nameThe security group name. The length is 2~128 English or Chinese characters. It must start with an uppercase or lowcase letter or a Chinese character and cannot start with `http://` or `https`. Can contain digits, colons (:), underscores (_), or hyphens (-).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[SecurityGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ENS Security Group resource.

        For information about ENS Security Group and how to use it, see [What is Security Group](https://www.alibabacloud.com/help/en/ens/developer-reference/api-createsnapshot).

        > **NOTE:** Available since v1.213.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.ens.SecurityGroup("default",
            description=name,
            security_group_name=name)
        ```

        ## Import

        ENS Security Group can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ens/securityGroup:SecurityGroup example <id>
        ```

        :param str resource_name: The name of the resource.
        :param SecurityGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecurityGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 security_group_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecurityGroupArgs.__new__(SecurityGroupArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["security_group_name"] = security_group_name
        super(SecurityGroup, __self__).__init__(
            'alicloud:ens/securityGroup:SecurityGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            security_group_name: Optional[pulumi.Input[str]] = None) -> 'SecurityGroup':
        """
        Get an existing SecurityGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Security group description informationIt must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
        :param pulumi.Input[str] security_group_name: Security group nameThe security group name. The length is 2~128 English or Chinese characters. It must start with an uppercase or lowcase letter or a Chinese character and cannot start with `http://` or `https`. Can contain digits, colons (:), underscores (_), or hyphens (-).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecurityGroupState.__new__(_SecurityGroupState)

        __props__.__dict__["description"] = description
        __props__.__dict__["security_group_name"] = security_group_name
        return SecurityGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Security group description informationIt must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="securityGroupName")
    def security_group_name(self) -> pulumi.Output[Optional[str]]:
        """
        Security group nameThe security group name. The length is 2~128 English or Chinese characters. It must start with an uppercase or lowcase letter or a Chinese character and cannot start with `http://` or `https`. Can contain digits, colons (:), underscores (_), or hyphens (-).
        """
        return pulumi.get(self, "security_group_name")
