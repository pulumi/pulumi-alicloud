# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TrafficMirrorSessionArgs', 'TrafficMirrorSession']

@pulumi.input_type
class TrafficMirrorSessionArgs:
    def __init__(__self__, *,
                 priority: pulumi.Input[int],
                 traffic_mirror_filter_id: pulumi.Input[str],
                 traffic_mirror_source_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 traffic_mirror_target_id: pulumi.Input[str],
                 traffic_mirror_target_type: pulumi.Input[str],
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 traffic_mirror_session_description: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_session_name: Optional[pulumi.Input[str]] = None,
                 virtual_network_id: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a TrafficMirrorSession resource.
        :param pulumi.Input[int] priority: The priority of the traffic mirror session. Valid values: `1` to `32766`. A smaller value indicates a higher priority. You cannot specify the same priority for traffic mirror sessions that are created in the same region with the same Alibaba Cloud account.
        :param pulumi.Input[str] traffic_mirror_filter_id: The ID of the filter.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] traffic_mirror_source_ids: The ID of the mirror source. You can specify only an elastic network interface (ENI) as the mirror source. **NOTE:** Only one mirror source can be added to a traffic mirror session.
        :param pulumi.Input[str] traffic_mirror_target_id: The ID of the mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a mirror destination.
        :param pulumi.Input[str] traffic_mirror_target_type: The type of the mirror destination. Valid values: `NetworkInterface` or `SLB`. `NetworkInterface`: an ENI. `SLB`: an internal-facing SLB instance
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[bool] enabled: Specifies whether to enable traffic mirror sessions. default to `false`.
        :param pulumi.Input[str] traffic_mirror_session_description: The description of the traffic mirror session. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[str] traffic_mirror_session_name: The name of the traffic mirror session. The name must be `2` to `128` characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        :param pulumi.Input[int] virtual_network_id: The VXLAN network identifier (VNI) that is used to distinguish different mirrored traffic. Valid values: `0` to `16777215`. You can specify VNIs for the traffic mirror destination to identify mirrored traffic from different sessions. If you do not specify a VNI, the system randomly allocates a VNI. If you want the system to randomly allocate a VNI, ignore this parameter.
        """
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "traffic_mirror_filter_id", traffic_mirror_filter_id)
        pulumi.set(__self__, "traffic_mirror_source_ids", traffic_mirror_source_ids)
        pulumi.set(__self__, "traffic_mirror_target_id", traffic_mirror_target_id)
        pulumi.set(__self__, "traffic_mirror_target_type", traffic_mirror_target_type)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if traffic_mirror_session_description is not None:
            pulumi.set(__self__, "traffic_mirror_session_description", traffic_mirror_session_description)
        if traffic_mirror_session_name is not None:
            pulumi.set(__self__, "traffic_mirror_session_name", traffic_mirror_session_name)
        if virtual_network_id is not None:
            pulumi.set(__self__, "virtual_network_id", virtual_network_id)

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Input[int]:
        """
        The priority of the traffic mirror session. Valid values: `1` to `32766`. A smaller value indicates a higher priority. You cannot specify the same priority for traffic mirror sessions that are created in the same region with the same Alibaba Cloud account.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: pulumi.Input[int]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter(name="trafficMirrorFilterId")
    def traffic_mirror_filter_id(self) -> pulumi.Input[str]:
        """
        The ID of the filter.
        """
        return pulumi.get(self, "traffic_mirror_filter_id")

    @traffic_mirror_filter_id.setter
    def traffic_mirror_filter_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "traffic_mirror_filter_id", value)

    @property
    @pulumi.getter(name="trafficMirrorSourceIds")
    def traffic_mirror_source_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The ID of the mirror source. You can specify only an elastic network interface (ENI) as the mirror source. **NOTE:** Only one mirror source can be added to a traffic mirror session.
        """
        return pulumi.get(self, "traffic_mirror_source_ids")

    @traffic_mirror_source_ids.setter
    def traffic_mirror_source_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "traffic_mirror_source_ids", value)

    @property
    @pulumi.getter(name="trafficMirrorTargetId")
    def traffic_mirror_target_id(self) -> pulumi.Input[str]:
        """
        The ID of the mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a mirror destination.
        """
        return pulumi.get(self, "traffic_mirror_target_id")

    @traffic_mirror_target_id.setter
    def traffic_mirror_target_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "traffic_mirror_target_id", value)

    @property
    @pulumi.getter(name="trafficMirrorTargetType")
    def traffic_mirror_target_type(self) -> pulumi.Input[str]:
        """
        The type of the mirror destination. Valid values: `NetworkInterface` or `SLB`. `NetworkInterface`: an ENI. `SLB`: an internal-facing SLB instance
        """
        return pulumi.get(self, "traffic_mirror_target_type")

    @traffic_mirror_target_type.setter
    def traffic_mirror_target_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "traffic_mirror_target_type", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable traffic mirror sessions. default to `false`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="trafficMirrorSessionDescription")
    def traffic_mirror_session_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the traffic mirror session. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "traffic_mirror_session_description")

    @traffic_mirror_session_description.setter
    def traffic_mirror_session_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_mirror_session_description", value)

    @property
    @pulumi.getter(name="trafficMirrorSessionName")
    def traffic_mirror_session_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the traffic mirror session. The name must be `2` to `128` characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        """
        return pulumi.get(self, "traffic_mirror_session_name")

    @traffic_mirror_session_name.setter
    def traffic_mirror_session_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_mirror_session_name", value)

    @property
    @pulumi.getter(name="virtualNetworkId")
    def virtual_network_id(self) -> Optional[pulumi.Input[int]]:
        """
        The VXLAN network identifier (VNI) that is used to distinguish different mirrored traffic. Valid values: `0` to `16777215`. You can specify VNIs for the traffic mirror destination to identify mirrored traffic from different sessions. If you do not specify a VNI, the system randomly allocates a VNI. If you want the system to randomly allocate a VNI, ignore this parameter.
        """
        return pulumi.get(self, "virtual_network_id")

    @virtual_network_id.setter
    def virtual_network_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "virtual_network_id", value)


@pulumi.input_type
class _TrafficMirrorSessionState:
    def __init__(__self__, *,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_filter_id: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_session_description: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_session_name: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_source_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 traffic_mirror_target_id: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_target_type: Optional[pulumi.Input[str]] = None,
                 virtual_network_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering TrafficMirrorSession resources.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[bool] enabled: Specifies whether to enable traffic mirror sessions. default to `false`.
        :param pulumi.Input[int] priority: The priority of the traffic mirror session. Valid values: `1` to `32766`. A smaller value indicates a higher priority. You cannot specify the same priority for traffic mirror sessions that are created in the same region with the same Alibaba Cloud account.
        :param pulumi.Input[str] status: The state of the traffic mirror session. Valid values: `Creating`, `Created`, `Modifying` and `Deleting`.
        :param pulumi.Input[str] traffic_mirror_filter_id: The ID of the filter.
        :param pulumi.Input[str] traffic_mirror_session_description: The description of the traffic mirror session. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[str] traffic_mirror_session_name: The name of the traffic mirror session. The name must be `2` to `128` characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] traffic_mirror_source_ids: The ID of the mirror source. You can specify only an elastic network interface (ENI) as the mirror source. **NOTE:** Only one mirror source can be added to a traffic mirror session.
        :param pulumi.Input[str] traffic_mirror_target_id: The ID of the mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a mirror destination.
        :param pulumi.Input[str] traffic_mirror_target_type: The type of the mirror destination. Valid values: `NetworkInterface` or `SLB`. `NetworkInterface`: an ENI. `SLB`: an internal-facing SLB instance
        :param pulumi.Input[int] virtual_network_id: The VXLAN network identifier (VNI) that is used to distinguish different mirrored traffic. Valid values: `0` to `16777215`. You can specify VNIs for the traffic mirror destination to identify mirrored traffic from different sessions. If you do not specify a VNI, the system randomly allocates a VNI. If you want the system to randomly allocate a VNI, ignore this parameter.
        """
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if traffic_mirror_filter_id is not None:
            pulumi.set(__self__, "traffic_mirror_filter_id", traffic_mirror_filter_id)
        if traffic_mirror_session_description is not None:
            pulumi.set(__self__, "traffic_mirror_session_description", traffic_mirror_session_description)
        if traffic_mirror_session_name is not None:
            pulumi.set(__self__, "traffic_mirror_session_name", traffic_mirror_session_name)
        if traffic_mirror_source_ids is not None:
            pulumi.set(__self__, "traffic_mirror_source_ids", traffic_mirror_source_ids)
        if traffic_mirror_target_id is not None:
            pulumi.set(__self__, "traffic_mirror_target_id", traffic_mirror_target_id)
        if traffic_mirror_target_type is not None:
            pulumi.set(__self__, "traffic_mirror_target_type", traffic_mirror_target_type)
        if virtual_network_id is not None:
            pulumi.set(__self__, "virtual_network_id", virtual_network_id)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable traffic mirror sessions. default to `false`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of the traffic mirror session. Valid values: `1` to `32766`. A smaller value indicates a higher priority. You cannot specify the same priority for traffic mirror sessions that are created in the same region with the same Alibaba Cloud account.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the traffic mirror session. Valid values: `Creating`, `Created`, `Modifying` and `Deleting`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="trafficMirrorFilterId")
    def traffic_mirror_filter_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the filter.
        """
        return pulumi.get(self, "traffic_mirror_filter_id")

    @traffic_mirror_filter_id.setter
    def traffic_mirror_filter_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_mirror_filter_id", value)

    @property
    @pulumi.getter(name="trafficMirrorSessionDescription")
    def traffic_mirror_session_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the traffic mirror session. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "traffic_mirror_session_description")

    @traffic_mirror_session_description.setter
    def traffic_mirror_session_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_mirror_session_description", value)

    @property
    @pulumi.getter(name="trafficMirrorSessionName")
    def traffic_mirror_session_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the traffic mirror session. The name must be `2` to `128` characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        """
        return pulumi.get(self, "traffic_mirror_session_name")

    @traffic_mirror_session_name.setter
    def traffic_mirror_session_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_mirror_session_name", value)

    @property
    @pulumi.getter(name="trafficMirrorSourceIds")
    def traffic_mirror_source_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The ID of the mirror source. You can specify only an elastic network interface (ENI) as the mirror source. **NOTE:** Only one mirror source can be added to a traffic mirror session.
        """
        return pulumi.get(self, "traffic_mirror_source_ids")

    @traffic_mirror_source_ids.setter
    def traffic_mirror_source_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "traffic_mirror_source_ids", value)

    @property
    @pulumi.getter(name="trafficMirrorTargetId")
    def traffic_mirror_target_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a mirror destination.
        """
        return pulumi.get(self, "traffic_mirror_target_id")

    @traffic_mirror_target_id.setter
    def traffic_mirror_target_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_mirror_target_id", value)

    @property
    @pulumi.getter(name="trafficMirrorTargetType")
    def traffic_mirror_target_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the mirror destination. Valid values: `NetworkInterface` or `SLB`. `NetworkInterface`: an ENI. `SLB`: an internal-facing SLB instance
        """
        return pulumi.get(self, "traffic_mirror_target_type")

    @traffic_mirror_target_type.setter
    def traffic_mirror_target_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic_mirror_target_type", value)

    @property
    @pulumi.getter(name="virtualNetworkId")
    def virtual_network_id(self) -> Optional[pulumi.Input[int]]:
        """
        The VXLAN network identifier (VNI) that is used to distinguish different mirrored traffic. Valid values: `0` to `16777215`. You can specify VNIs for the traffic mirror destination to identify mirrored traffic from different sessions. If you do not specify a VNI, the system randomly allocates a VNI. If you want the system to randomly allocate a VNI, ignore this parameter.
        """
        return pulumi.get(self, "virtual_network_id")

    @virtual_network_id.setter
    def virtual_network_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "virtual_network_id", value)


class TrafficMirrorSession(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 traffic_mirror_filter_id: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_session_description: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_session_name: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_source_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 traffic_mirror_target_id: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_target_type: Optional[pulumi.Input[str]] = None,
                 virtual_network_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a VPC Traffic Mirror Session resource.

        For information about VPC Traffic Mirror Session and how to use it, see [What is Traffic Mirror Session](https://www.alibabacloud.com/help/en/doc-detail/261364.htm).

        > **NOTE:** Available in v1.142.0+.

        ## Import

        VPC Traffic Mirror Session can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/trafficMirrorSession:TrafficMirrorSession example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[bool] enabled: Specifies whether to enable traffic mirror sessions. default to `false`.
        :param pulumi.Input[int] priority: The priority of the traffic mirror session. Valid values: `1` to `32766`. A smaller value indicates a higher priority. You cannot specify the same priority for traffic mirror sessions that are created in the same region with the same Alibaba Cloud account.
        :param pulumi.Input[str] traffic_mirror_filter_id: The ID of the filter.
        :param pulumi.Input[str] traffic_mirror_session_description: The description of the traffic mirror session. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[str] traffic_mirror_session_name: The name of the traffic mirror session. The name must be `2` to `128` characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] traffic_mirror_source_ids: The ID of the mirror source. You can specify only an elastic network interface (ENI) as the mirror source. **NOTE:** Only one mirror source can be added to a traffic mirror session.
        :param pulumi.Input[str] traffic_mirror_target_id: The ID of the mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a mirror destination.
        :param pulumi.Input[str] traffic_mirror_target_type: The type of the mirror destination. Valid values: `NetworkInterface` or `SLB`. `NetworkInterface`: an ENI. `SLB`: an internal-facing SLB instance
        :param pulumi.Input[int] virtual_network_id: The VXLAN network identifier (VNI) that is used to distinguish different mirrored traffic. Valid values: `0` to `16777215`. You can specify VNIs for the traffic mirror destination to identify mirrored traffic from different sessions. If you do not specify a VNI, the system randomly allocates a VNI. If you want the system to randomly allocate a VNI, ignore this parameter.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TrafficMirrorSessionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a VPC Traffic Mirror Session resource.

        For information about VPC Traffic Mirror Session and how to use it, see [What is Traffic Mirror Session](https://www.alibabacloud.com/help/en/doc-detail/261364.htm).

        > **NOTE:** Available in v1.142.0+.

        ## Import

        VPC Traffic Mirror Session can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/trafficMirrorSession:TrafficMirrorSession example <id>
        ```

        :param str resource_name: The name of the resource.
        :param TrafficMirrorSessionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TrafficMirrorSessionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 traffic_mirror_filter_id: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_session_description: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_session_name: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_source_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 traffic_mirror_target_id: Optional[pulumi.Input[str]] = None,
                 traffic_mirror_target_type: Optional[pulumi.Input[str]] = None,
                 virtual_network_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TrafficMirrorSessionArgs.__new__(TrafficMirrorSessionArgs)

            __props__.__dict__["dry_run"] = dry_run
            __props__.__dict__["enabled"] = enabled
            if priority is None and not opts.urn:
                raise TypeError("Missing required property 'priority'")
            __props__.__dict__["priority"] = priority
            if traffic_mirror_filter_id is None and not opts.urn:
                raise TypeError("Missing required property 'traffic_mirror_filter_id'")
            __props__.__dict__["traffic_mirror_filter_id"] = traffic_mirror_filter_id
            __props__.__dict__["traffic_mirror_session_description"] = traffic_mirror_session_description
            __props__.__dict__["traffic_mirror_session_name"] = traffic_mirror_session_name
            if traffic_mirror_source_ids is None and not opts.urn:
                raise TypeError("Missing required property 'traffic_mirror_source_ids'")
            __props__.__dict__["traffic_mirror_source_ids"] = traffic_mirror_source_ids
            if traffic_mirror_target_id is None and not opts.urn:
                raise TypeError("Missing required property 'traffic_mirror_target_id'")
            __props__.__dict__["traffic_mirror_target_id"] = traffic_mirror_target_id
            if traffic_mirror_target_type is None and not opts.urn:
                raise TypeError("Missing required property 'traffic_mirror_target_type'")
            __props__.__dict__["traffic_mirror_target_type"] = traffic_mirror_target_type
            __props__.__dict__["virtual_network_id"] = virtual_network_id
            __props__.__dict__["status"] = None
        super(TrafficMirrorSession, __self__).__init__(
            'alicloud:vpc/trafficMirrorSession:TrafficMirrorSession',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None,
            traffic_mirror_filter_id: Optional[pulumi.Input[str]] = None,
            traffic_mirror_session_description: Optional[pulumi.Input[str]] = None,
            traffic_mirror_session_name: Optional[pulumi.Input[str]] = None,
            traffic_mirror_source_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            traffic_mirror_target_id: Optional[pulumi.Input[str]] = None,
            traffic_mirror_target_type: Optional[pulumi.Input[str]] = None,
            virtual_network_id: Optional[pulumi.Input[int]] = None) -> 'TrafficMirrorSession':
        """
        Get an existing TrafficMirrorSession resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[bool] enabled: Specifies whether to enable traffic mirror sessions. default to `false`.
        :param pulumi.Input[int] priority: The priority of the traffic mirror session. Valid values: `1` to `32766`. A smaller value indicates a higher priority. You cannot specify the same priority for traffic mirror sessions that are created in the same region with the same Alibaba Cloud account.
        :param pulumi.Input[str] status: The state of the traffic mirror session. Valid values: `Creating`, `Created`, `Modifying` and `Deleting`.
        :param pulumi.Input[str] traffic_mirror_filter_id: The ID of the filter.
        :param pulumi.Input[str] traffic_mirror_session_description: The description of the traffic mirror session. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[str] traffic_mirror_session_name: The name of the traffic mirror session. The name must be `2` to `128` characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] traffic_mirror_source_ids: The ID of the mirror source. You can specify only an elastic network interface (ENI) as the mirror source. **NOTE:** Only one mirror source can be added to a traffic mirror session.
        :param pulumi.Input[str] traffic_mirror_target_id: The ID of the mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a mirror destination.
        :param pulumi.Input[str] traffic_mirror_target_type: The type of the mirror destination. Valid values: `NetworkInterface` or `SLB`. `NetworkInterface`: an ENI. `SLB`: an internal-facing SLB instance
        :param pulumi.Input[int] virtual_network_id: The VXLAN network identifier (VNI) that is used to distinguish different mirrored traffic. Valid values: `0` to `16777215`. You can specify VNIs for the traffic mirror destination to identify mirrored traffic from different sessions. If you do not specify a VNI, the system randomly allocates a VNI. If you want the system to randomly allocate a VNI, ignore this parameter.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TrafficMirrorSessionState.__new__(_TrafficMirrorSessionState)

        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["priority"] = priority
        __props__.__dict__["status"] = status
        __props__.__dict__["traffic_mirror_filter_id"] = traffic_mirror_filter_id
        __props__.__dict__["traffic_mirror_session_description"] = traffic_mirror_session_description
        __props__.__dict__["traffic_mirror_session_name"] = traffic_mirror_session_name
        __props__.__dict__["traffic_mirror_source_ids"] = traffic_mirror_source_ids
        __props__.__dict__["traffic_mirror_target_id"] = traffic_mirror_target_id
        __props__.__dict__["traffic_mirror_target_type"] = traffic_mirror_target_type
        __props__.__dict__["virtual_network_id"] = virtual_network_id
        return TrafficMirrorSession(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to enable traffic mirror sessions. default to `false`.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[int]:
        """
        The priority of the traffic mirror session. Valid values: `1` to `32766`. A smaller value indicates a higher priority. You cannot specify the same priority for traffic mirror sessions that are created in the same region with the same Alibaba Cloud account.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The state of the traffic mirror session. Valid values: `Creating`, `Created`, `Modifying` and `Deleting`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="trafficMirrorFilterId")
    def traffic_mirror_filter_id(self) -> pulumi.Output[str]:
        """
        The ID of the filter.
        """
        return pulumi.get(self, "traffic_mirror_filter_id")

    @property
    @pulumi.getter(name="trafficMirrorSessionDescription")
    def traffic_mirror_session_description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the traffic mirror session. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "traffic_mirror_session_description")

    @property
    @pulumi.getter(name="trafficMirrorSessionName")
    def traffic_mirror_session_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the traffic mirror session. The name must be `2` to `128` characters in length and can contain digits, underscores (_), and hyphens (-). It must start with a letter.
        """
        return pulumi.get(self, "traffic_mirror_session_name")

    @property
    @pulumi.getter(name="trafficMirrorSourceIds")
    def traffic_mirror_source_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        The ID of the mirror source. You can specify only an elastic network interface (ENI) as the mirror source. **NOTE:** Only one mirror source can be added to a traffic mirror session.
        """
        return pulumi.get(self, "traffic_mirror_source_ids")

    @property
    @pulumi.getter(name="trafficMirrorTargetId")
    def traffic_mirror_target_id(self) -> pulumi.Output[str]:
        """
        The ID of the mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a mirror destination.
        """
        return pulumi.get(self, "traffic_mirror_target_id")

    @property
    @pulumi.getter(name="trafficMirrorTargetType")
    def traffic_mirror_target_type(self) -> pulumi.Output[str]:
        """
        The type of the mirror destination. Valid values: `NetworkInterface` or `SLB`. `NetworkInterface`: an ENI. `SLB`: an internal-facing SLB instance
        """
        return pulumi.get(self, "traffic_mirror_target_type")

    @property
    @pulumi.getter(name="virtualNetworkId")
    def virtual_network_id(self) -> pulumi.Output[int]:
        """
        The VXLAN network identifier (VNI) that is used to distinguish different mirrored traffic. Valid values: `0` to `16777215`. You can specify VNIs for the traffic mirror destination to identify mirrored traffic from different sessions. If you do not specify a VNI, the system randomly allocates a VNI. If you want the system to randomly allocate a VNI, ignore this parameter.
        """
        return pulumi.get(self, "virtual_network_id")
