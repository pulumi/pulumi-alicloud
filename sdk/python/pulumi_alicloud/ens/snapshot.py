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

__all__ = ['SnapshotArgs', 'Snapshot']

@pulumi.input_type
class SnapshotArgs:
    def __init__(__self__, *,
                 disk_id: pulumi.Input[_builtins.str],
                 ens_region_id: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 snapshot_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Snapshot resource.
        :param pulumi.Input[_builtins.str] disk_id: Cloud Disk ID.
        :param pulumi.Input[_builtins.str] ens_region_id: The node ID of ENS.
        :param pulumi.Input[_builtins.str] description: Snapshot Description Information.
        :param pulumi.Input[_builtins.str] snapshot_name: Name of the snapshot instance.
        """
        pulumi.set(__self__, "disk_id", disk_id)
        pulumi.set(__self__, "ens_region_id", ens_region_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if snapshot_name is not None:
            pulumi.set(__self__, "snapshot_name", snapshot_name)

    @_builtins.property
    @pulumi.getter(name="diskId")
    def disk_id(self) -> pulumi.Input[_builtins.str]:
        """
        Cloud Disk ID.
        """
        return pulumi.get(self, "disk_id")

    @disk_id.setter
    def disk_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "disk_id", value)

    @_builtins.property
    @pulumi.getter(name="ensRegionId")
    def ens_region_id(self) -> pulumi.Input[_builtins.str]:
        """
        The node ID of ENS.
        """
        return pulumi.get(self, "ens_region_id")

    @ens_region_id.setter
    def ens_region_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "ens_region_id", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Snapshot Description Information.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="snapshotName")
    def snapshot_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the snapshot instance.
        """
        return pulumi.get(self, "snapshot_name")

    @snapshot_name.setter
    def snapshot_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "snapshot_name", value)


@pulumi.input_type
class _SnapshotState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_id: Optional[pulumi.Input[_builtins.str]] = None,
                 ens_region_id: Optional[pulumi.Input[_builtins.str]] = None,
                 snapshot_name: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Snapshot resources.
        :param pulumi.Input[_builtins.str] create_time: Instance creation timeIt is expressed in accordance with the ISO8601 standard and uses UTC +0 time in the format of yyyy-MM-ddTHH:mm:ssZ.Example value: 2020-08-20 T14:52:28Z.
        :param pulumi.Input[_builtins.str] description: Snapshot Description Information.
        :param pulumi.Input[_builtins.str] disk_id: Cloud Disk ID.
        :param pulumi.Input[_builtins.str] ens_region_id: The node ID of ENS.
        :param pulumi.Input[_builtins.str] snapshot_name: Name of the snapshot instance.
        :param pulumi.Input[_builtins.str] status: Snapshot Status. Valid values: creating, available, deleting, error.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disk_id is not None:
            pulumi.set(__self__, "disk_id", disk_id)
        if ens_region_id is not None:
            pulumi.set(__self__, "ens_region_id", ens_region_id)
        if snapshot_name is not None:
            pulumi.set(__self__, "snapshot_name", snapshot_name)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Instance creation timeIt is expressed in accordance with the ISO8601 standard and uses UTC +0 time in the format of yyyy-MM-ddTHH:mm:ssZ.Example value: 2020-08-20 T14:52:28Z.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Snapshot Description Information.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="diskId")
    def disk_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Cloud Disk ID.
        """
        return pulumi.get(self, "disk_id")

    @disk_id.setter
    def disk_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "disk_id", value)

    @_builtins.property
    @pulumi.getter(name="ensRegionId")
    def ens_region_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The node ID of ENS.
        """
        return pulumi.get(self, "ens_region_id")

    @ens_region_id.setter
    def ens_region_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "ens_region_id", value)

    @_builtins.property
    @pulumi.getter(name="snapshotName")
    def snapshot_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the snapshot instance.
        """
        return pulumi.get(self, "snapshot_name")

    @snapshot_name.setter
    def snapshot_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "snapshot_name", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Snapshot Status. Valid values: creating, available, deleting, error.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.type_token("alicloud:ens/snapshot:Snapshot")
class Snapshot(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_id: Optional[pulumi.Input[_builtins.str]] = None,
                 ens_region_id: Optional[pulumi.Input[_builtins.str]] = None,
                 snapshot_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a ENS Snapshot resource. Snapshot. When you use it for the first time, please contact the product classmates to add a resource whitelist.

        For information about ENS Snapshot and how to use it, see [What is Snapshot](https://www.alibabacloud.com/help/en/ens/developer-reference/api-createsnapshot).

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
        disk = alicloud.ens.Disk("disk",
            category="cloud_efficiency",
            size=20,
            payment_type="PayAsYouGo",
            ens_region_id="ch-zurich-1")
        default = alicloud.ens.Snapshot("default",
            description=name,
            ens_region_id="ch-zurich-1",
            snapshot_name=name,
            disk_id=disk.id)
        ```

        ## Import

        ENS Snapshot can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ens/snapshot:Snapshot example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] description: Snapshot Description Information.
        :param pulumi.Input[_builtins.str] disk_id: Cloud Disk ID.
        :param pulumi.Input[_builtins.str] ens_region_id: The node ID of ENS.
        :param pulumi.Input[_builtins.str] snapshot_name: Name of the snapshot instance.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SnapshotArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ENS Snapshot resource. Snapshot. When you use it for the first time, please contact the product classmates to add a resource whitelist.

        For information about ENS Snapshot and how to use it, see [What is Snapshot](https://www.alibabacloud.com/help/en/ens/developer-reference/api-createsnapshot).

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
        disk = alicloud.ens.Disk("disk",
            category="cloud_efficiency",
            size=20,
            payment_type="PayAsYouGo",
            ens_region_id="ch-zurich-1")
        default = alicloud.ens.Snapshot("default",
            description=name,
            ens_region_id="ch-zurich-1",
            snapshot_name=name,
            disk_id=disk.id)
        ```

        ## Import

        ENS Snapshot can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:ens/snapshot:Snapshot example <id>
        ```

        :param str resource_name: The name of the resource.
        :param SnapshotArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SnapshotArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 disk_id: Optional[pulumi.Input[_builtins.str]] = None,
                 ens_region_id: Optional[pulumi.Input[_builtins.str]] = None,
                 snapshot_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SnapshotArgs.__new__(SnapshotArgs)

            __props__.__dict__["description"] = description
            if disk_id is None and not opts.urn:
                raise TypeError("Missing required property 'disk_id'")
            __props__.__dict__["disk_id"] = disk_id
            if ens_region_id is None and not opts.urn:
                raise TypeError("Missing required property 'ens_region_id'")
            __props__.__dict__["ens_region_id"] = ens_region_id
            __props__.__dict__["snapshot_name"] = snapshot_name
            __props__.__dict__["create_time"] = None
            __props__.__dict__["status"] = None
        super(Snapshot, __self__).__init__(
            'alicloud:ens/snapshot:Snapshot',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            disk_id: Optional[pulumi.Input[_builtins.str]] = None,
            ens_region_id: Optional[pulumi.Input[_builtins.str]] = None,
            snapshot_name: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None) -> 'Snapshot':
        """
        Get an existing Snapshot resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] create_time: Instance creation timeIt is expressed in accordance with the ISO8601 standard and uses UTC +0 time in the format of yyyy-MM-ddTHH:mm:ssZ.Example value: 2020-08-20 T14:52:28Z.
        :param pulumi.Input[_builtins.str] description: Snapshot Description Information.
        :param pulumi.Input[_builtins.str] disk_id: Cloud Disk ID.
        :param pulumi.Input[_builtins.str] ens_region_id: The node ID of ENS.
        :param pulumi.Input[_builtins.str] snapshot_name: Name of the snapshot instance.
        :param pulumi.Input[_builtins.str] status: Snapshot Status. Valid values: creating, available, deleting, error.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SnapshotState.__new__(_SnapshotState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["disk_id"] = disk_id
        __props__.__dict__["ens_region_id"] = ens_region_id
        __props__.__dict__["snapshot_name"] = snapshot_name
        __props__.__dict__["status"] = status
        return Snapshot(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        Instance creation timeIt is expressed in accordance with the ISO8601 standard and uses UTC +0 time in the format of yyyy-MM-ddTHH:mm:ssZ.Example value: 2020-08-20 T14:52:28Z.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Snapshot Description Information.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="diskId")
    def disk_id(self) -> pulumi.Output[_builtins.str]:
        """
        Cloud Disk ID.
        """
        return pulumi.get(self, "disk_id")

    @_builtins.property
    @pulumi.getter(name="ensRegionId")
    def ens_region_id(self) -> pulumi.Output[_builtins.str]:
        """
        The node ID of ENS.
        """
        return pulumi.get(self, "ens_region_id")

    @_builtins.property
    @pulumi.getter(name="snapshotName")
    def snapshot_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Name of the snapshot instance.
        """
        return pulumi.get(self, "snapshot_name")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        Snapshot Status. Valid values: creating, available, deleting, error.
        """
        return pulumi.get(self, "status")

