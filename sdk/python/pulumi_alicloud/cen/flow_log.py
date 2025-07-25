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

__all__ = ['FlowLogArgs', 'FlowLog']

@pulumi.input_type
class FlowLogArgs:
    def __init__(__self__, *,
                 cen_id: pulumi.Input[_builtins.str],
                 log_store_name: pulumi.Input[_builtins.str],
                 project_name: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 flow_log_name: Optional[pulumi.Input[_builtins.str]] = None,
                 interval: Optional[pulumi.Input[_builtins.int]] = None,
                 log_format_string: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 transit_router_attachment_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transit_router_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a FlowLog resource.
        :param pulumi.Input[_builtins.str] cen_id: cen id
        :param pulumi.Input[_builtins.str] log_store_name: The LogStore that stores the flowlog.
        :param pulumi.Input[_builtins.str] project_name: The Project that stores the flowlog.
        :param pulumi.Input[_builtins.str] description: The description of the flowlog.
        :param pulumi.Input[_builtins.str] flow_log_name: The name of the flowlog.
        :param pulumi.Input[_builtins.int] interval: The duration of the capture window for the flow log to capture traffic. Unit: seconds. Valid values: `60` or **600 * *. Default value: **600 * *.
        :param pulumi.Input[_builtins.str] log_format_string: Log Format
        :param pulumi.Input[_builtins.str] status: The status of the flow log. Valid values:
               - `Active`: started.
               - `InActive`: not started.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tag of the resource
        :param pulumi.Input[_builtins.str] transit_router_attachment_id: Cross-region Connection ID or VBR connection ID.
               
               > **NOTE:**  This parameter is required.
        :param pulumi.Input[_builtins.str] transit_router_id: Transit Router ID
        """
        pulumi.set(__self__, "cen_id", cen_id)
        pulumi.set(__self__, "log_store_name", log_store_name)
        pulumi.set(__self__, "project_name", project_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if flow_log_name is not None:
            pulumi.set(__self__, "flow_log_name", flow_log_name)
        if interval is not None:
            pulumi.set(__self__, "interval", interval)
        if log_format_string is not None:
            pulumi.set(__self__, "log_format_string", log_format_string)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if transit_router_attachment_id is not None:
            pulumi.set(__self__, "transit_router_attachment_id", transit_router_attachment_id)
        if transit_router_id is not None:
            pulumi.set(__self__, "transit_router_id", transit_router_id)

    @_builtins.property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> pulumi.Input[_builtins.str]:
        """
        cen id
        """
        return pulumi.get(self, "cen_id")

    @cen_id.setter
    def cen_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "cen_id", value)

    @_builtins.property
    @pulumi.getter(name="logStoreName")
    def log_store_name(self) -> pulumi.Input[_builtins.str]:
        """
        The LogStore that stores the flowlog.
        """
        return pulumi.get(self, "log_store_name")

    @log_store_name.setter
    def log_store_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "log_store_name", value)

    @_builtins.property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Input[_builtins.str]:
        """
        The Project that stores the flowlog.
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "project_name", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the flowlog.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="flowLogName")
    def flow_log_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the flowlog.
        """
        return pulumi.get(self, "flow_log_name")

    @flow_log_name.setter
    def flow_log_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "flow_log_name", value)

    @_builtins.property
    @pulumi.getter
    def interval(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The duration of the capture window for the flow log to capture traffic. Unit: seconds. Valid values: `60` or **600 * *. Default value: **600 * *.
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "interval", value)

    @_builtins.property
    @pulumi.getter(name="logFormatString")
    def log_format_string(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Log Format
        """
        return pulumi.get(self, "log_format_string")

    @log_format_string.setter
    def log_format_string(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "log_format_string", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the flow log. Valid values:
        - `Active`: started.
        - `InActive`: not started.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The tag of the resource
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="transitRouterAttachmentId")
    def transit_router_attachment_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Cross-region Connection ID or VBR connection ID.

        > **NOTE:**  This parameter is required.
        """
        return pulumi.get(self, "transit_router_attachment_id")

    @transit_router_attachment_id.setter
    def transit_router_attachment_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transit_router_attachment_id", value)

    @_builtins.property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Transit Router ID
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transit_router_id", value)


@pulumi.input_type
class _FlowLogState:
    def __init__(__self__, *,
                 cen_id: Optional[pulumi.Input[_builtins.str]] = None,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 flow_log_name: Optional[pulumi.Input[_builtins.str]] = None,
                 interval: Optional[pulumi.Input[_builtins.int]] = None,
                 log_format_string: Optional[pulumi.Input[_builtins.str]] = None,
                 log_store_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project_name: Optional[pulumi.Input[_builtins.str]] = None,
                 region_id: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 transit_router_attachment_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transit_router_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering FlowLog resources.
        :param pulumi.Input[_builtins.str] cen_id: cen id
        :param pulumi.Input[_builtins.str] create_time: CreateTime
        :param pulumi.Input[_builtins.str] description: The description of the flowlog.
        :param pulumi.Input[_builtins.str] flow_log_name: The name of the flowlog.
        :param pulumi.Input[_builtins.int] interval: The duration of the capture window for the flow log to capture traffic. Unit: seconds. Valid values: `60` or **600 * *. Default value: **600 * *.
        :param pulumi.Input[_builtins.str] log_format_string: Log Format
        :param pulumi.Input[_builtins.str] log_store_name: The LogStore that stores the flowlog.
        :param pulumi.Input[_builtins.str] project_name: The Project that stores the flowlog.
        :param pulumi.Input[_builtins.str] region_id: region id
        :param pulumi.Input[_builtins.str] status: The status of the flow log. Valid values:
               - `Active`: started.
               - `InActive`: not started.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tag of the resource
        :param pulumi.Input[_builtins.str] transit_router_attachment_id: Cross-region Connection ID or VBR connection ID.
               
               > **NOTE:**  This parameter is required.
        :param pulumi.Input[_builtins.str] transit_router_id: Transit Router ID
        """
        if cen_id is not None:
            pulumi.set(__self__, "cen_id", cen_id)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if flow_log_name is not None:
            pulumi.set(__self__, "flow_log_name", flow_log_name)
        if interval is not None:
            pulumi.set(__self__, "interval", interval)
        if log_format_string is not None:
            pulumi.set(__self__, "log_format_string", log_format_string)
        if log_store_name is not None:
            pulumi.set(__self__, "log_store_name", log_store_name)
        if project_name is not None:
            pulumi.set(__self__, "project_name", project_name)
        if region_id is not None:
            pulumi.set(__self__, "region_id", region_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if transit_router_attachment_id is not None:
            pulumi.set(__self__, "transit_router_attachment_id", transit_router_attachment_id)
        if transit_router_id is not None:
            pulumi.set(__self__, "transit_router_id", transit_router_id)

    @_builtins.property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        cen id
        """
        return pulumi.get(self, "cen_id")

    @cen_id.setter
    def cen_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "cen_id", value)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        CreateTime
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the flowlog.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="flowLogName")
    def flow_log_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the flowlog.
        """
        return pulumi.get(self, "flow_log_name")

    @flow_log_name.setter
    def flow_log_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "flow_log_name", value)

    @_builtins.property
    @pulumi.getter
    def interval(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The duration of the capture window for the flow log to capture traffic. Unit: seconds. Valid values: `60` or **600 * *. Default value: **600 * *.
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "interval", value)

    @_builtins.property
    @pulumi.getter(name="logFormatString")
    def log_format_string(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Log Format
        """
        return pulumi.get(self, "log_format_string")

    @log_format_string.setter
    def log_format_string(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "log_format_string", value)

    @_builtins.property
    @pulumi.getter(name="logStoreName")
    def log_store_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The LogStore that stores the flowlog.
        """
        return pulumi.get(self, "log_store_name")

    @log_store_name.setter
    def log_store_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "log_store_name", value)

    @_builtins.property
    @pulumi.getter(name="projectName")
    def project_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Project that stores the flowlog.
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project_name", value)

    @_builtins.property
    @pulumi.getter(name="regionId")
    def region_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        region id
        """
        return pulumi.get(self, "region_id")

    @region_id.setter
    def region_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region_id", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the flow log. Valid values:
        - `Active`: started.
        - `InActive`: not started.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        The tag of the resource
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @_builtins.property
    @pulumi.getter(name="transitRouterAttachmentId")
    def transit_router_attachment_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Cross-region Connection ID or VBR connection ID.

        > **NOTE:**  This parameter is required.
        """
        return pulumi.get(self, "transit_router_attachment_id")

    @transit_router_attachment_id.setter
    def transit_router_attachment_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transit_router_attachment_id", value)

    @_builtins.property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Transit Router ID
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "transit_router_id", value)


@pulumi.type_token("alicloud:cen/flowLog:FlowLog")
class FlowLog(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cen_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 flow_log_name: Optional[pulumi.Input[_builtins.str]] = None,
                 interval: Optional[pulumi.Input[_builtins.int]] = None,
                 log_format_string: Optional[pulumi.Input[_builtins.str]] = None,
                 log_store_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project_name: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 transit_router_attachment_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transit_router_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a CEN Flow Log resource.

        For information about CEN Flow Log and how to use it, see [What is Flow Log](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createflowlog).

        > **NOTE:** Available since v1.73.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # Create a cen flowlog resource and use it to publish a route entry pointing to an ECS.
        default = alicloud.cen.Instance("default", name="my-cen")
        default_project = alicloud.log.Project("default",
            name="sls-for-flowlog",
            description="create by terraform")
        default_store = alicloud.log.Store("default",
            project=default_project.name,
            name="sls-for-flowlog",
            retention_period=3650,
            shard_count=3,
            auto_split=True,
            max_split_shard_count=60,
            append_meta=True)
        default_flow_log = alicloud.cen.FlowLog("default",
            flow_log_name="my-flowlog",
            cen_id=default.id,
            project_name=default_project.name,
            log_store_name=default_store.name)
        ```

        ## Import

        CEN Flow Log can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cen/flowLog:FlowLog example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cen_id: cen id
        :param pulumi.Input[_builtins.str] description: The description of the flowlog.
        :param pulumi.Input[_builtins.str] flow_log_name: The name of the flowlog.
        :param pulumi.Input[_builtins.int] interval: The duration of the capture window for the flow log to capture traffic. Unit: seconds. Valid values: `60` or **600 * *. Default value: **600 * *.
        :param pulumi.Input[_builtins.str] log_format_string: Log Format
        :param pulumi.Input[_builtins.str] log_store_name: The LogStore that stores the flowlog.
        :param pulumi.Input[_builtins.str] project_name: The Project that stores the flowlog.
        :param pulumi.Input[_builtins.str] status: The status of the flow log. Valid values:
               - `Active`: started.
               - `InActive`: not started.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tag of the resource
        :param pulumi.Input[_builtins.str] transit_router_attachment_id: Cross-region Connection ID or VBR connection ID.
               
               > **NOTE:**  This parameter is required.
        :param pulumi.Input[_builtins.str] transit_router_id: Transit Router ID
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FlowLogArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CEN Flow Log resource.

        For information about CEN Flow Log and how to use it, see [What is Flow Log](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createflowlog).

        > **NOTE:** Available since v1.73.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # Create a cen flowlog resource and use it to publish a route entry pointing to an ECS.
        default = alicloud.cen.Instance("default", name="my-cen")
        default_project = alicloud.log.Project("default",
            name="sls-for-flowlog",
            description="create by terraform")
        default_store = alicloud.log.Store("default",
            project=default_project.name,
            name="sls-for-flowlog",
            retention_period=3650,
            shard_count=3,
            auto_split=True,
            max_split_shard_count=60,
            append_meta=True)
        default_flow_log = alicloud.cen.FlowLog("default",
            flow_log_name="my-flowlog",
            cen_id=default.id,
            project_name=default_project.name,
            log_store_name=default_store.name)
        ```

        ## Import

        CEN Flow Log can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cen/flowLog:FlowLog example <id>
        ```

        :param str resource_name: The name of the resource.
        :param FlowLogArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FlowLogArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cen_id: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 flow_log_name: Optional[pulumi.Input[_builtins.str]] = None,
                 interval: Optional[pulumi.Input[_builtins.int]] = None,
                 log_format_string: Optional[pulumi.Input[_builtins.str]] = None,
                 log_store_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project_name: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 transit_router_attachment_id: Optional[pulumi.Input[_builtins.str]] = None,
                 transit_router_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FlowLogArgs.__new__(FlowLogArgs)

            if cen_id is None and not opts.urn:
                raise TypeError("Missing required property 'cen_id'")
            __props__.__dict__["cen_id"] = cen_id
            __props__.__dict__["description"] = description
            __props__.__dict__["flow_log_name"] = flow_log_name
            __props__.__dict__["interval"] = interval
            __props__.__dict__["log_format_string"] = log_format_string
            if log_store_name is None and not opts.urn:
                raise TypeError("Missing required property 'log_store_name'")
            __props__.__dict__["log_store_name"] = log_store_name
            if project_name is None and not opts.urn:
                raise TypeError("Missing required property 'project_name'")
            __props__.__dict__["project_name"] = project_name
            __props__.__dict__["status"] = status
            __props__.__dict__["tags"] = tags
            __props__.__dict__["transit_router_attachment_id"] = transit_router_attachment_id
            __props__.__dict__["transit_router_id"] = transit_router_id
            __props__.__dict__["create_time"] = None
            __props__.__dict__["region_id"] = None
        super(FlowLog, __self__).__init__(
            'alicloud:cen/flowLog:FlowLog',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cen_id: Optional[pulumi.Input[_builtins.str]] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            flow_log_name: Optional[pulumi.Input[_builtins.str]] = None,
            interval: Optional[pulumi.Input[_builtins.int]] = None,
            log_format_string: Optional[pulumi.Input[_builtins.str]] = None,
            log_store_name: Optional[pulumi.Input[_builtins.str]] = None,
            project_name: Optional[pulumi.Input[_builtins.str]] = None,
            region_id: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            transit_router_attachment_id: Optional[pulumi.Input[_builtins.str]] = None,
            transit_router_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'FlowLog':
        """
        Get an existing FlowLog resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] cen_id: cen id
        :param pulumi.Input[_builtins.str] create_time: CreateTime
        :param pulumi.Input[_builtins.str] description: The description of the flowlog.
        :param pulumi.Input[_builtins.str] flow_log_name: The name of the flowlog.
        :param pulumi.Input[_builtins.int] interval: The duration of the capture window for the flow log to capture traffic. Unit: seconds. Valid values: `60` or **600 * *. Default value: **600 * *.
        :param pulumi.Input[_builtins.str] log_format_string: Log Format
        :param pulumi.Input[_builtins.str] log_store_name: The LogStore that stores the flowlog.
        :param pulumi.Input[_builtins.str] project_name: The Project that stores the flowlog.
        :param pulumi.Input[_builtins.str] region_id: region id
        :param pulumi.Input[_builtins.str] status: The status of the flow log. Valid values:
               - `Active`: started.
               - `InActive`: not started.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] tags: The tag of the resource
        :param pulumi.Input[_builtins.str] transit_router_attachment_id: Cross-region Connection ID or VBR connection ID.
               
               > **NOTE:**  This parameter is required.
        :param pulumi.Input[_builtins.str] transit_router_id: Transit Router ID
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FlowLogState.__new__(_FlowLogState)

        __props__.__dict__["cen_id"] = cen_id
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["flow_log_name"] = flow_log_name
        __props__.__dict__["interval"] = interval
        __props__.__dict__["log_format_string"] = log_format_string
        __props__.__dict__["log_store_name"] = log_store_name
        __props__.__dict__["project_name"] = project_name
        __props__.__dict__["region_id"] = region_id
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["transit_router_attachment_id"] = transit_router_attachment_id
        __props__.__dict__["transit_router_id"] = transit_router_id
        return FlowLog(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> pulumi.Output[_builtins.str]:
        """
        cen id
        """
        return pulumi.get(self, "cen_id")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        CreateTime
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the flowlog.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="flowLogName")
    def flow_log_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The name of the flowlog.
        """
        return pulumi.get(self, "flow_log_name")

    @_builtins.property
    @pulumi.getter
    def interval(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        The duration of the capture window for the flow log to capture traffic. Unit: seconds. Valid values: `60` or **600 * *. Default value: **600 * *.
        """
        return pulumi.get(self, "interval")

    @_builtins.property
    @pulumi.getter(name="logFormatString")
    def log_format_string(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Log Format
        """
        return pulumi.get(self, "log_format_string")

    @_builtins.property
    @pulumi.getter(name="logStoreName")
    def log_store_name(self) -> pulumi.Output[_builtins.str]:
        """
        The LogStore that stores the flowlog.
        """
        return pulumi.get(self, "log_store_name")

    @_builtins.property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Output[_builtins.str]:
        """
        The Project that stores the flowlog.
        """
        return pulumi.get(self, "project_name")

    @_builtins.property
    @pulumi.getter(name="regionId")
    def region_id(self) -> pulumi.Output[_builtins.str]:
        """
        region id
        """
        return pulumi.get(self, "region_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The status of the flow log. Valid values:
        - `Active`: started.
        - `InActive`: not started.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        The tag of the resource
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter(name="transitRouterAttachmentId")
    def transit_router_attachment_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Cross-region Connection ID or VBR connection ID.

        > **NOTE:**  This parameter is required.
        """
        return pulumi.get(self, "transit_router_attachment_id")

    @_builtins.property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Transit Router ID
        """
        return pulumi.get(self, "transit_router_id")

