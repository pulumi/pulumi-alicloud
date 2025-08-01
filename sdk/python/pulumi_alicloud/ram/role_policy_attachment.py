# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['RolePolicyAttachmentArgs', 'RolePolicyAttachment']

@pulumi.input_type
class RolePolicyAttachmentArgs:
    def __init__(__self__, *,
                 policy_name: pulumi.Input[_builtins.str],
                 policy_type: pulumi.Input[_builtins.str],
                 role_name: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a RolePolicyAttachment resource.
        :param pulumi.Input[_builtins.str] policy_name: The name of the policy.
        :param pulumi.Input[_builtins.str] policy_type: Policy type.
               - Custom: Custom policy.
               - System: System policy.
        :param pulumi.Input[_builtins.str] role_name: The RAM role name.
        """
        pulumi.set(__self__, "policy_name", policy_name)
        pulumi.set(__self__, "policy_type", policy_type)
        pulumi.set(__self__, "role_name", role_name)

    @_builtins.property
    @pulumi.getter(name="policyName")
    def policy_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the policy.
        """
        return pulumi.get(self, "policy_name")

    @policy_name.setter
    def policy_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "policy_name", value)

    @_builtins.property
    @pulumi.getter(name="policyType")
    def policy_type(self) -> pulumi.Input[_builtins.str]:
        """
        Policy type.
        - Custom: Custom policy.
        - System: System policy.
        """
        return pulumi.get(self, "policy_type")

    @policy_type.setter
    def policy_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "policy_type", value)

    @_builtins.property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Input[_builtins.str]:
        """
        The RAM role name.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "role_name", value)


@pulumi.input_type
class _RolePolicyAttachmentState:
    def __init__(__self__, *,
                 policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_type: Optional[pulumi.Input[_builtins.str]] = None,
                 role_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering RolePolicyAttachment resources.
        :param pulumi.Input[_builtins.str] policy_name: The name of the policy.
        :param pulumi.Input[_builtins.str] policy_type: Policy type.
               - Custom: Custom policy.
               - System: System policy.
        :param pulumi.Input[_builtins.str] role_name: The RAM role name.
        """
        if policy_name is not None:
            pulumi.set(__self__, "policy_name", policy_name)
        if policy_type is not None:
            pulumi.set(__self__, "policy_type", policy_type)
        if role_name is not None:
            pulumi.set(__self__, "role_name", role_name)

    @_builtins.property
    @pulumi.getter(name="policyName")
    def policy_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the policy.
        """
        return pulumi.get(self, "policy_name")

    @policy_name.setter
    def policy_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy_name", value)

    @_builtins.property
    @pulumi.getter(name="policyType")
    def policy_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Policy type.
        - Custom: Custom policy.
        - System: System policy.
        """
        return pulumi.get(self, "policy_type")

    @policy_type.setter
    def policy_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy_type", value)

    @_builtins.property
    @pulumi.getter(name="roleName")
    def role_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The RAM role name.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "role_name", value)


@pulumi.type_token("alicloud:ram/rolePolicyAttachment:RolePolicyAttachment")
class RolePolicyAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_type: Optional[pulumi.Input[_builtins.str]] = None,
                 role_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a RAM Role Policy Attachment resource.

        For information about RAM Role Policy Attachment and how to use it, see [What is Role Policy Attachment](https://next.api.alibabacloud.com/document/Ram/2015-05-01/AttachPolicyToRole).

        > **NOTE:** Available since v1.0.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        # Create a RAM Role Policy attachment.
        role = alicloud.ram.Role("role",
            name="roleName",
            document=\"\"\"    {
              "Statement": [
                {
                  "Action": "sts:AssumeRole",
                  "Effect": "Allow",
                  "Principal": {
                    "Service": [
                      "apigateway.aliyuncs.com", 
                      "ecs.aliyuncs.com"
                    ]
                  }
                }
              ],
              "Version": "1"
            }
        \"\"\",
            description="this is a role test.")
        default = random.index.Integer("default",
            min=10000,
            max=99999)
        policy = alicloud.ram.Policy("policy",
            policy_name=f"tf-example-{default['result']}",
            policy_document=\"\"\"  {
            "Statement": [
              {
                "Action": [
                  "oss:ListObjects",
                  "oss:GetObject"
                ],
                "Effect": "Allow",
                "Resource": [
                  "acs:oss:*:*:mybucket",
                  "acs:oss:*:*:mybucket/*"
                ]
              }
            ],
              "Version": "1"
          }
        \"\"\",
            description="this is a policy test")
        attach = alicloud.ram.RolePolicyAttachment("attach",
            policy_name=policy.policy_name,
            policy_type=policy.type,
            role_name=role.name)
        ```

        ## Import

        RAM Role Policy Attachment can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ram/rolePolicyAttachment:RolePolicyAttachment example role:<policy_name>:<policy_type>:<role_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] policy_name: The name of the policy.
        :param pulumi.Input[_builtins.str] policy_type: Policy type.
               - Custom: Custom policy.
               - System: System policy.
        :param pulumi.Input[_builtins.str] role_name: The RAM role name.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RolePolicyAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a RAM Role Policy Attachment resource.

        For information about RAM Role Policy Attachment and how to use it, see [What is Role Policy Attachment](https://next.api.alibabacloud.com/document/Ram/2015-05-01/AttachPolicyToRole).

        > **NOTE:** Available since v1.0.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        # Create a RAM Role Policy attachment.
        role = alicloud.ram.Role("role",
            name="roleName",
            document=\"\"\"    {
              "Statement": [
                {
                  "Action": "sts:AssumeRole",
                  "Effect": "Allow",
                  "Principal": {
                    "Service": [
                      "apigateway.aliyuncs.com", 
                      "ecs.aliyuncs.com"
                    ]
                  }
                }
              ],
              "Version": "1"
            }
        \"\"\",
            description="this is a role test.")
        default = random.index.Integer("default",
            min=10000,
            max=99999)
        policy = alicloud.ram.Policy("policy",
            policy_name=f"tf-example-{default['result']}",
            policy_document=\"\"\"  {
            "Statement": [
              {
                "Action": [
                  "oss:ListObjects",
                  "oss:GetObject"
                ],
                "Effect": "Allow",
                "Resource": [
                  "acs:oss:*:*:mybucket",
                  "acs:oss:*:*:mybucket/*"
                ]
              }
            ],
              "Version": "1"
          }
        \"\"\",
            description="this is a policy test")
        attach = alicloud.ram.RolePolicyAttachment("attach",
            policy_name=policy.policy_name,
            policy_type=policy.type,
            role_name=role.name)
        ```

        ## Import

        RAM Role Policy Attachment can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ram/rolePolicyAttachment:RolePolicyAttachment example role:<policy_name>:<policy_type>:<role_name>
        ```

        :param str resource_name: The name of the resource.
        :param RolePolicyAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RolePolicyAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_type: Optional[pulumi.Input[_builtins.str]] = None,
                 role_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RolePolicyAttachmentArgs.__new__(RolePolicyAttachmentArgs)

            if policy_name is None and not opts.urn:
                raise TypeError("Missing required property 'policy_name'")
            __props__.__dict__["policy_name"] = policy_name
            if policy_type is None and not opts.urn:
                raise TypeError("Missing required property 'policy_type'")
            __props__.__dict__["policy_type"] = policy_type
            if role_name is None and not opts.urn:
                raise TypeError("Missing required property 'role_name'")
            __props__.__dict__["role_name"] = role_name
        super(RolePolicyAttachment, __self__).__init__(
            'alicloud:ram/rolePolicyAttachment:RolePolicyAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            policy_name: Optional[pulumi.Input[_builtins.str]] = None,
            policy_type: Optional[pulumi.Input[_builtins.str]] = None,
            role_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'RolePolicyAttachment':
        """
        Get an existing RolePolicyAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] policy_name: The name of the policy.
        :param pulumi.Input[_builtins.str] policy_type: Policy type.
               - Custom: Custom policy.
               - System: System policy.
        :param pulumi.Input[_builtins.str] role_name: The RAM role name.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RolePolicyAttachmentState.__new__(_RolePolicyAttachmentState)

        __props__.__dict__["policy_name"] = policy_name
        __props__.__dict__["policy_type"] = policy_type
        __props__.__dict__["role_name"] = role_name
        return RolePolicyAttachment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="policyName")
    def policy_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the policy.
        """
        return pulumi.get(self, "policy_name")

    @_builtins.property
    @pulumi.getter(name="policyType")
    def policy_type(self) -> pulumi.Output[_builtins.str]:
        """
        Policy type.
        - Custom: Custom policy.
        - System: System policy.
        """
        return pulumi.get(self, "policy_type")

    @_builtins.property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Output[_builtins.str]:
        """
        The RAM role name.
        """
        return pulumi.get(self, "role_name")

