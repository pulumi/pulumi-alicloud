# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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

__all__ = ['WorkspaceWorkspaceArgs', 'WorkspaceWorkspace']

@pulumi.input_type
class WorkspaceWorkspaceArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[str],
                 env_types: pulumi.Input[Sequence[pulumi.Input[str]]],
                 workspace_name: pulumi.Input[str],
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a WorkspaceWorkspace resource.
        :param pulumi.Input[str] description: Workspace description, no more than 80 characters.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] env_types: Environments contained in the workspace:
               - Simple mode only production environment (prod).
               - Standard mode includes development environment (dev) and production environment (prod).
        :param pulumi.Input[str] workspace_name: The workspace name. The format is as follows:
               - 3 to 23 characters in length and can contain letters, underscores, or numbers.
               - Must start with a large or small letter.
               - Unique in the current region.
        :param pulumi.Input[str] display_name: It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "env_types", env_types)
        pulumi.set(__self__, "workspace_name", workspace_name)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        Workspace description, no more than 80 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="envTypes")
    def env_types(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Environments contained in the workspace:
        - Simple mode only production environment (prod).
        - Standard mode includes development environment (dev) and production environment (prod).
        """
        return pulumi.get(self, "env_types")

    @env_types.setter
    def env_types(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "env_types", value)

    @property
    @pulumi.getter(name="workspaceName")
    def workspace_name(self) -> pulumi.Input[str]:
        """
        The workspace name. The format is as follows:
        - 3 to 23 characters in length and can contain letters, underscores, or numbers.
        - Must start with a large or small letter.
        - Unique in the current region.
        """
        return pulumi.get(self, "workspace_name")

    @workspace_name.setter
    def workspace_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "workspace_name", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class _WorkspaceWorkspaceState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 env_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 workspace_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WorkspaceWorkspace resources.
        :param pulumi.Input[str] create_time: The UTC time when the workspace is created. The time format is ISO8601.
        :param pulumi.Input[str] description: Workspace description, no more than 80 characters.
        :param pulumi.Input[str] display_name: It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] env_types: Environments contained in the workspace:
               - Simple mode only production environment (prod).
               - Standard mode includes development environment (dev) and production environment (prod).
        :param pulumi.Input[str] status: Workspace state, possible values:
        :param pulumi.Input[str] workspace_name: The workspace name. The format is as follows:
               - 3 to 23 characters in length and can contain letters, underscores, or numbers.
               - Must start with a large or small letter.
               - Unique in the current region.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if env_types is not None:
            pulumi.set(__self__, "env_types", env_types)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if workspace_name is not None:
            pulumi.set(__self__, "workspace_name", workspace_name)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The UTC time when the workspace is created. The time format is ISO8601.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Workspace description, no more than 80 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="envTypes")
    def env_types(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Environments contained in the workspace:
        - Simple mode only production environment (prod).
        - Standard mode includes development environment (dev) and production environment (prod).
        """
        return pulumi.get(self, "env_types")

    @env_types.setter
    def env_types(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "env_types", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Workspace state, possible values:
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="workspaceName")
    def workspace_name(self) -> Optional[pulumi.Input[str]]:
        """
        The workspace name. The format is as follows:
        - 3 to 23 characters in length and can contain letters, underscores, or numbers.
        - Must start with a large or small letter.
        - Unique in the current region.
        """
        return pulumi.get(self, "workspace_name")

    @workspace_name.setter
    def workspace_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workspace_name", value)


class WorkspaceWorkspace(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 env_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 workspace_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a P A I Workspace Workspace resource.

        For information about P A I Workspace Workspace and how to use it, see [What is Workspace](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.233.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform_example"
        default = alicloud.pai.WorkspaceWorkspace("default",
            description=name,
            workspace_name=name,
            display_name=name,
            env_types=["prod"])
        ```

        ## Import

        P A I Workspace Workspace can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:pai/workspaceWorkspace:WorkspaceWorkspace example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Workspace description, no more than 80 characters.
        :param pulumi.Input[str] display_name: It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] env_types: Environments contained in the workspace:
               - Simple mode only production environment (prod).
               - Standard mode includes development environment (dev) and production environment (prod).
        :param pulumi.Input[str] workspace_name: The workspace name. The format is as follows:
               - 3 to 23 characters in length and can contain letters, underscores, or numbers.
               - Must start with a large or small letter.
               - Unique in the current region.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkspaceWorkspaceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a P A I Workspace Workspace resource.

        For information about P A I Workspace Workspace and how to use it, see [What is Workspace](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.233.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform_example"
        default = alicloud.pai.WorkspaceWorkspace("default",
            description=name,
            workspace_name=name,
            display_name=name,
            env_types=["prod"])
        ```

        ## Import

        P A I Workspace Workspace can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:pai/workspaceWorkspace:WorkspaceWorkspace example <id>
        ```

        :param str resource_name: The name of the resource.
        :param WorkspaceWorkspaceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkspaceWorkspaceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 env_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 workspace_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkspaceWorkspaceArgs.__new__(WorkspaceWorkspaceArgs)

            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["display_name"] = display_name
            if env_types is None and not opts.urn:
                raise TypeError("Missing required property 'env_types'")
            __props__.__dict__["env_types"] = env_types
            if workspace_name is None and not opts.urn:
                raise TypeError("Missing required property 'workspace_name'")
            __props__.__dict__["workspace_name"] = workspace_name
            __props__.__dict__["create_time"] = None
            __props__.__dict__["status"] = None
        super(WorkspaceWorkspace, __self__).__init__(
            'alicloud:pai/workspaceWorkspace:WorkspaceWorkspace',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            env_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            status: Optional[pulumi.Input[str]] = None,
            workspace_name: Optional[pulumi.Input[str]] = None) -> 'WorkspaceWorkspace':
        """
        Get an existing WorkspaceWorkspace resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] create_time: The UTC time when the workspace is created. The time format is ISO8601.
        :param pulumi.Input[str] description: Workspace description, no more than 80 characters.
        :param pulumi.Input[str] display_name: It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] env_types: Environments contained in the workspace:
               - Simple mode only production environment (prod).
               - Standard mode includes development environment (dev) and production environment (prod).
        :param pulumi.Input[str] status: Workspace state, possible values:
        :param pulumi.Input[str] workspace_name: The workspace name. The format is as follows:
               - 3 to 23 characters in length and can contain letters, underscores, or numbers.
               - Must start with a large or small letter.
               - Unique in the current region.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkspaceWorkspaceState.__new__(_WorkspaceWorkspaceState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["env_types"] = env_types
        __props__.__dict__["status"] = status
        __props__.__dict__["workspace_name"] = workspace_name
        return WorkspaceWorkspace(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The UTC time when the workspace is created. The time format is ISO8601.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Workspace description, no more than 80 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[str]]:
        """
        It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="envTypes")
    def env_types(self) -> pulumi.Output[Sequence[str]]:
        """
        Environments contained in the workspace:
        - Simple mode only production environment (prod).
        - Standard mode includes development environment (dev) and production environment (prod).
        """
        return pulumi.get(self, "env_types")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Workspace state, possible values:
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="workspaceName")
    def workspace_name(self) -> pulumi.Output[str]:
        """
        The workspace name. The format is as follows:
        - 3 to 23 characters in length and can contain letters, underscores, or numbers.
        - Must start with a large or small letter.
        - Unique in the current region.
        """
        return pulumi.get(self, "workspace_name")
