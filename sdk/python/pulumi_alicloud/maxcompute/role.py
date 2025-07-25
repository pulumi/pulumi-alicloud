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

__all__ = ['RoleArgs', 'Role']

@pulumi.input_type
class RoleArgs:
    def __init__(__self__, *,
                 project_name: pulumi.Input[_builtins.str],
                 role_name: pulumi.Input[_builtins.str],
                 type: pulumi.Input[_builtins.str],
                 policy: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Role resource.
        :param pulumi.Input[_builtins.str] project_name: Project name
        :param pulumi.Input[_builtins.str] role_name: Role Name
               
               > **NOTE:** At the beginning of a letter, it can contain letters and numbers and can be no more than 64 characters in length.
        :param pulumi.Input[_builtins.str] type: Role type Valid values: admin/resource
               
               > **NOTE:** -- management type (admin) role: You can grant management type permissions through Policy. You cannot grant resource permissions to management type roles. You cannot grant management type permissions to management type roles through ACL. -- resource role: you can authorize resource type permissions through Policy or ACL, but cannot authorize management type permissions. For details, see [role-planning](https://www.alibabacloud.com/help/en/maxcompute/user-guide/role-planning)
        :param pulumi.Input[_builtins.str] policy: Policy Authorization
               Refer to [Policy-based access control](https://www.alibabacloud.com/help/en/maxcompute/user-guide/policy-based-access-control-1) and [Authorization practices](https://www.alibabacloud.com/help/en/maxcompute/use-cases/authorization-practices)
        """
        pulumi.set(__self__, "project_name", project_name)
        pulumi.set(__self__, "role_name", role_name)
        pulumi.set(__self__, "type", type)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)

    @_builtins.property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Input[_builtins.str]:
        """
        Project name
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "project_name", value)

    @_builtins.property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Input[_builtins.str]:
        """
        Role Name

        > **NOTE:** At the beginning of a letter, it can contain letters and numbers and can be no more than 64 characters in length.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "role_name", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Input[_builtins.str]:
        """
        Role type Valid values: admin/resource

        > **NOTE:** -- management type (admin) role: You can grant management type permissions through Policy. You cannot grant resource permissions to management type roles. You cannot grant management type permissions to management type roles through ACL. -- resource role: you can authorize resource type permissions through Policy or ACL, but cannot authorize management type permissions. For details, see [role-planning](https://www.alibabacloud.com/help/en/maxcompute/user-guide/role-planning)
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "type", value)

    @_builtins.property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Policy Authorization
        Refer to [Policy-based access control](https://www.alibabacloud.com/help/en/maxcompute/user-guide/policy-based-access-control-1) and [Authorization practices](https://www.alibabacloud.com/help/en/maxcompute/use-cases/authorization-practices)
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy", value)


@pulumi.input_type
class _RoleState:
    def __init__(__self__, *,
                 policy: Optional[pulumi.Input[_builtins.str]] = None,
                 project_name: Optional[pulumi.Input[_builtins.str]] = None,
                 role_name: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Role resources.
        :param pulumi.Input[_builtins.str] policy: Policy Authorization
               Refer to [Policy-based access control](https://www.alibabacloud.com/help/en/maxcompute/user-guide/policy-based-access-control-1) and [Authorization practices](https://www.alibabacloud.com/help/en/maxcompute/use-cases/authorization-practices)
        :param pulumi.Input[_builtins.str] project_name: Project name
        :param pulumi.Input[_builtins.str] role_name: Role Name
               
               > **NOTE:** At the beginning of a letter, it can contain letters and numbers and can be no more than 64 characters in length.
        :param pulumi.Input[_builtins.str] type: Role type Valid values: admin/resource
               
               > **NOTE:** -- management type (admin) role: You can grant management type permissions through Policy. You cannot grant resource permissions to management type roles. You cannot grant management type permissions to management type roles through ACL. -- resource role: you can authorize resource type permissions through Policy or ACL, but cannot authorize management type permissions. For details, see [role-planning](https://www.alibabacloud.com/help/en/maxcompute/user-guide/role-planning)
        """
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if project_name is not None:
            pulumi.set(__self__, "project_name", project_name)
        if role_name is not None:
            pulumi.set(__self__, "role_name", role_name)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Policy Authorization
        Refer to [Policy-based access control](https://www.alibabacloud.com/help/en/maxcompute/user-guide/policy-based-access-control-1) and [Authorization practices](https://www.alibabacloud.com/help/en/maxcompute/use-cases/authorization-practices)
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy", value)

    @_builtins.property
    @pulumi.getter(name="projectName")
    def project_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Project name
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project_name", value)

    @_builtins.property
    @pulumi.getter(name="roleName")
    def role_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Role Name

        > **NOTE:** At the beginning of a letter, it can contain letters and numbers and can be no more than 64 characters in length.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "role_name", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Role type Valid values: admin/resource

        > **NOTE:** -- management type (admin) role: You can grant management type permissions through Policy. You cannot grant resource permissions to management type roles. You cannot grant management type permissions to management type roles through ACL. -- resource role: you can authorize resource type permissions through Policy or ACL, but cannot authorize management type permissions. For details, see [role-planning](https://www.alibabacloud.com/help/en/maxcompute/user-guide/role-planning)
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)


@pulumi.type_token("alicloud:maxcompute/role:Role")
class Role(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy: Optional[pulumi.Input[_builtins.str]] = None,
                 project_name: Optional[pulumi.Input[_builtins.str]] = None,
                 role_name: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Max Compute Role resource.

        For information about Max Compute Role and how to use it, see [What is Role](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.242.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import json
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.maxcompute.Project("default",
            default_quota="默认后付费Quota",
            project_name=name,
            comment=name,
            product_type="PayAsYouGo")
        default_role = alicloud.maxcompute.Role("default",
            type="admin",
            project_name=default.id,
            policy=json.dumps({
                "Statement": [{
                    "Action": ["odps:*"],
                    "Effect": "Allow",
                    "Resource": [
                        "acs:odps:*:projects/project_name/authorization/roles",
                        "acs:odps:*:projects/project_name/authorization/roles/*/*",
                    ],
                }],
                "Version": "1",
            }),
            role_name="tf_example112")
        ```

        ## Import

        Max Compute Role can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:maxcompute/role:Role example <project_name>:<role_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] policy: Policy Authorization
               Refer to [Policy-based access control](https://www.alibabacloud.com/help/en/maxcompute/user-guide/policy-based-access-control-1) and [Authorization practices](https://www.alibabacloud.com/help/en/maxcompute/use-cases/authorization-practices)
        :param pulumi.Input[_builtins.str] project_name: Project name
        :param pulumi.Input[_builtins.str] role_name: Role Name
               
               > **NOTE:** At the beginning of a letter, it can contain letters and numbers and can be no more than 64 characters in length.
        :param pulumi.Input[_builtins.str] type: Role type Valid values: admin/resource
               
               > **NOTE:** -- management type (admin) role: You can grant management type permissions through Policy. You cannot grant resource permissions to management type roles. You cannot grant management type permissions to management type roles through ACL. -- resource role: you can authorize resource type permissions through Policy or ACL, but cannot authorize management type permissions. For details, see [role-planning](https://www.alibabacloud.com/help/en/maxcompute/user-guide/role-planning)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Max Compute Role resource.

        For information about Max Compute Role and how to use it, see [What is Role](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.242.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import json
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.maxcompute.Project("default",
            default_quota="默认后付费Quota",
            project_name=name,
            comment=name,
            product_type="PayAsYouGo")
        default_role = alicloud.maxcompute.Role("default",
            type="admin",
            project_name=default.id,
            policy=json.dumps({
                "Statement": [{
                    "Action": ["odps:*"],
                    "Effect": "Allow",
                    "Resource": [
                        "acs:odps:*:projects/project_name/authorization/roles",
                        "acs:odps:*:projects/project_name/authorization/roles/*/*",
                    ],
                }],
                "Version": "1",
            }),
            role_name="tf_example112")
        ```

        ## Import

        Max Compute Role can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:maxcompute/role:Role example <project_name>:<role_name>
        ```

        :param str resource_name: The name of the resource.
        :param RoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy: Optional[pulumi.Input[_builtins.str]] = None,
                 project_name: Optional[pulumi.Input[_builtins.str]] = None,
                 role_name: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RoleArgs.__new__(RoleArgs)

            __props__.__dict__["policy"] = policy
            if project_name is None and not opts.urn:
                raise TypeError("Missing required property 'project_name'")
            __props__.__dict__["project_name"] = project_name
            if role_name is None and not opts.urn:
                raise TypeError("Missing required property 'role_name'")
            __props__.__dict__["role_name"] = role_name
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(Role, __self__).__init__(
            'alicloud:maxcompute/role:Role',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            policy: Optional[pulumi.Input[_builtins.str]] = None,
            project_name: Optional[pulumi.Input[_builtins.str]] = None,
            role_name: Optional[pulumi.Input[_builtins.str]] = None,
            type: Optional[pulumi.Input[_builtins.str]] = None) -> 'Role':
        """
        Get an existing Role resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] policy: Policy Authorization
               Refer to [Policy-based access control](https://www.alibabacloud.com/help/en/maxcompute/user-guide/policy-based-access-control-1) and [Authorization practices](https://www.alibabacloud.com/help/en/maxcompute/use-cases/authorization-practices)
        :param pulumi.Input[_builtins.str] project_name: Project name
        :param pulumi.Input[_builtins.str] role_name: Role Name
               
               > **NOTE:** At the beginning of a letter, it can contain letters and numbers and can be no more than 64 characters in length.
        :param pulumi.Input[_builtins.str] type: Role type Valid values: admin/resource
               
               > **NOTE:** -- management type (admin) role: You can grant management type permissions through Policy. You cannot grant resource permissions to management type roles. You cannot grant management type permissions to management type roles through ACL. -- resource role: you can authorize resource type permissions through Policy or ACL, but cannot authorize management type permissions. For details, see [role-planning](https://www.alibabacloud.com/help/en/maxcompute/user-guide/role-planning)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RoleState.__new__(_RoleState)

        __props__.__dict__["policy"] = policy
        __props__.__dict__["project_name"] = project_name
        __props__.__dict__["role_name"] = role_name
        __props__.__dict__["type"] = type
        return Role(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def policy(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Policy Authorization
        Refer to [Policy-based access control](https://www.alibabacloud.com/help/en/maxcompute/user-guide/policy-based-access-control-1) and [Authorization practices](https://www.alibabacloud.com/help/en/maxcompute/use-cases/authorization-practices)
        """
        return pulumi.get(self, "policy")

    @_builtins.property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Output[_builtins.str]:
        """
        Project name
        """
        return pulumi.get(self, "project_name")

    @_builtins.property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Output[_builtins.str]:
        """
        Role Name

        > **NOTE:** At the beginning of a letter, it can contain letters and numbers and can be no more than 64 characters in length.
        """
        return pulumi.get(self, "role_name")

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Output[_builtins.str]:
        """
        Role type Valid values: admin/resource

        > **NOTE:** -- management type (admin) role: You can grant management type permissions through Policy. You cannot grant resource permissions to management type roles. You cannot grant management type permissions to management type roles through ACL. -- resource role: you can authorize resource type permissions through Policy or ACL, but cannot authorize management type permissions. For details, see [role-planning](https://www.alibabacloud.com/help/en/maxcompute/user-guide/role-planning)
        """
        return pulumi.get(self, "type")

