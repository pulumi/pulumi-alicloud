# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['GrafanaWorkspaceArgs', 'GrafanaWorkspace']

@pulumi.input_type
class GrafanaWorkspaceArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 grafana_version: Optional[pulumi.Input[str]] = None,
                 grafana_workspace_edition: Optional[pulumi.Input[str]] = None,
                 grafana_workspace_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a GrafanaWorkspace resource.
        :param pulumi.Input[str] description: Description.
        :param pulumi.Input[str] grafana_version: The version of the grafana.
        :param pulumi.Input[str] grafana_workspace_edition: The edition of the grafana.
        :param pulumi.Input[str] grafana_workspace_name: The name of the resource.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[Mapping[str, Any]] tags: The tag of the resource.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if grafana_version is not None:
            pulumi.set(__self__, "grafana_version", grafana_version)
        if grafana_workspace_edition is not None:
            pulumi.set(__self__, "grafana_workspace_edition", grafana_workspace_edition)
        if grafana_workspace_name is not None:
            pulumi.set(__self__, "grafana_workspace_name", grafana_workspace_name)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="grafanaVersion")
    def grafana_version(self) -> Optional[pulumi.Input[str]]:
        """
        The version of the grafana.
        """
        return pulumi.get(self, "grafana_version")

    @grafana_version.setter
    def grafana_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "grafana_version", value)

    @property
    @pulumi.getter(name="grafanaWorkspaceEdition")
    def grafana_workspace_edition(self) -> Optional[pulumi.Input[str]]:
        """
        The edition of the grafana.
        """
        return pulumi.get(self, "grafana_workspace_edition")

    @grafana_workspace_edition.setter
    def grafana_workspace_edition(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "grafana_workspace_edition", value)

    @property
    @pulumi.getter(name="grafanaWorkspaceName")
    def grafana_workspace_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "grafana_workspace_name")

    @grafana_workspace_name.setter
    def grafana_workspace_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "grafana_workspace_name", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The tag of the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _GrafanaWorkspaceState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 grafana_version: Optional[pulumi.Input[str]] = None,
                 grafana_workspace_edition: Optional[pulumi.Input[str]] = None,
                 grafana_workspace_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        Input properties used for looking up and filtering GrafanaWorkspace resources.
        :param pulumi.Input[str] create_time: The creation time of the resource.
        :param pulumi.Input[str] description: Description.
        :param pulumi.Input[str] grafana_version: The version of the grafana.
        :param pulumi.Input[str] grafana_workspace_edition: The edition of the grafana.
        :param pulumi.Input[str] grafana_workspace_name: The name of the resource.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[Mapping[str, Any]] tags: The tag of the resource.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if grafana_version is not None:
            pulumi.set(__self__, "grafana_version", grafana_version)
        if grafana_workspace_edition is not None:
            pulumi.set(__self__, "grafana_workspace_edition", grafana_workspace_edition)
        if grafana_workspace_name is not None:
            pulumi.set(__self__, "grafana_workspace_name", grafana_workspace_name)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="grafanaVersion")
    def grafana_version(self) -> Optional[pulumi.Input[str]]:
        """
        The version of the grafana.
        """
        return pulumi.get(self, "grafana_version")

    @grafana_version.setter
    def grafana_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "grafana_version", value)

    @property
    @pulumi.getter(name="grafanaWorkspaceEdition")
    def grafana_workspace_edition(self) -> Optional[pulumi.Input[str]]:
        """
        The edition of the grafana.
        """
        return pulumi.get(self, "grafana_workspace_edition")

    @grafana_workspace_edition.setter
    def grafana_workspace_edition(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "grafana_workspace_edition", value)

    @property
    @pulumi.getter(name="grafanaWorkspaceName")
    def grafana_workspace_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "grafana_workspace_name")

    @grafana_workspace_name.setter
    def grafana_workspace_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "grafana_workspace_name", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The tag of the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)


class GrafanaWorkspace(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 grafana_version: Optional[pulumi.Input[str]] = None,
                 grafana_workspace_edition: Optional[pulumi.Input[str]] = None,
                 grafana_workspace_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        """
        Provides a ARMS Grafana Workspace resource.

        For information about ARMS Grafana Workspace and how to use it, see [What is Grafana Workspace](https://next.api.alibabacloud.com/document/ARMS/2019-08-08/ListGrafanaWorkspace).

        > **NOTE:** Available since v1.215.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default_grafana_workspace = alicloud.arms.GrafanaWorkspace("defaultGrafanaWorkspace",
            grafana_version="9.0.x",
            description=name,
            resource_group_id=default_resource_groups.ids[0],
            grafana_workspace_edition="standard",
            grafana_workspace_name=name,
            tags={
                "Created": "tf",
                "For": "example",
            })
        ```

        ## Import

        ARMS Grafana Workspace can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:arms/grafanaWorkspace:GrafanaWorkspace example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description.
        :param pulumi.Input[str] grafana_version: The version of the grafana.
        :param pulumi.Input[str] grafana_workspace_edition: The edition of the grafana.
        :param pulumi.Input[str] grafana_workspace_name: The name of the resource.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[Mapping[str, Any]] tags: The tag of the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[GrafanaWorkspaceArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ARMS Grafana Workspace resource.

        For information about ARMS Grafana Workspace and how to use it, see [What is Grafana Workspace](https://next.api.alibabacloud.com/document/ARMS/2019-08-08/ListGrafanaWorkspace).

        > **NOTE:** Available since v1.215.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default_grafana_workspace = alicloud.arms.GrafanaWorkspace("defaultGrafanaWorkspace",
            grafana_version="9.0.x",
            description=name,
            resource_group_id=default_resource_groups.ids[0],
            grafana_workspace_edition="standard",
            grafana_workspace_name=name,
            tags={
                "Created": "tf",
                "For": "example",
            })
        ```

        ## Import

        ARMS Grafana Workspace can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:arms/grafanaWorkspace:GrafanaWorkspace example <id>
        ```

        :param str resource_name: The name of the resource.
        :param GrafanaWorkspaceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GrafanaWorkspaceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 grafana_version: Optional[pulumi.Input[str]] = None,
                 grafana_workspace_edition: Optional[pulumi.Input[str]] = None,
                 grafana_workspace_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GrafanaWorkspaceArgs.__new__(GrafanaWorkspaceArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["grafana_version"] = grafana_version
            __props__.__dict__["grafana_workspace_edition"] = grafana_workspace_edition
            __props__.__dict__["grafana_workspace_name"] = grafana_workspace_name
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["create_time"] = None
            __props__.__dict__["status"] = None
        super(GrafanaWorkspace, __self__).__init__(
            'alicloud:arms/grafanaWorkspace:GrafanaWorkspace',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            grafana_version: Optional[pulumi.Input[str]] = None,
            grafana_workspace_edition: Optional[pulumi.Input[str]] = None,
            grafana_workspace_name: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None) -> 'GrafanaWorkspace':
        """
        Get an existing GrafanaWorkspace resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] create_time: The creation time of the resource.
        :param pulumi.Input[str] description: Description.
        :param pulumi.Input[str] grafana_version: The version of the grafana.
        :param pulumi.Input[str] grafana_workspace_edition: The edition of the grafana.
        :param pulumi.Input[str] grafana_workspace_name: The name of the resource.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[Mapping[str, Any]] tags: The tag of the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GrafanaWorkspaceState.__new__(_GrafanaWorkspaceState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["grafana_version"] = grafana_version
        __props__.__dict__["grafana_workspace_edition"] = grafana_workspace_edition
        __props__.__dict__["grafana_workspace_name"] = grafana_workspace_name
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        return GrafanaWorkspace(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="grafanaVersion")
    def grafana_version(self) -> pulumi.Output[Optional[str]]:
        """
        The version of the grafana.
        """
        return pulumi.get(self, "grafana_version")

    @property
    @pulumi.getter(name="grafanaWorkspaceEdition")
    def grafana_workspace_edition(self) -> pulumi.Output[Optional[str]]:
        """
        The edition of the grafana.
        """
        return pulumi.get(self, "grafana_workspace_edition")

    @property
    @pulumi.getter(name="grafanaWorkspaceName")
    def grafana_workspace_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "grafana_workspace_name")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        The tag of the resource.
        """
        return pulumi.get(self, "tags")
