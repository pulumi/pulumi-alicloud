# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ExternalDataServiceArgs', 'ExternalDataService']

@pulumi.input_type
class ExternalDataServiceArgs:
    def __init__(__self__, *,
                 db_instance_id: pulumi.Input[str],
                 service_name: pulumi.Input[str],
                 service_spec: pulumi.Input[str],
                 service_description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ExternalDataService resource.
        :param pulumi.Input[str] db_instance_id: Instance ID
        :param pulumi.Input[str] service_name: Service Name
        :param pulumi.Input[str] service_spec: Service Specifications
        :param pulumi.Input[str] service_description: Service Description
        """
        pulumi.set(__self__, "db_instance_id", db_instance_id)
        pulumi.set(__self__, "service_name", service_name)
        pulumi.set(__self__, "service_spec", service_spec)
        if service_description is not None:
            pulumi.set(__self__, "service_description", service_description)

    @property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> pulumi.Input[str]:
        """
        Instance ID
        """
        return pulumi.get(self, "db_instance_id")

    @db_instance_id.setter
    def db_instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "db_instance_id", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[str]:
        """
        Service Name
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter(name="serviceSpec")
    def service_spec(self) -> pulumi.Input[str]:
        """
        Service Specifications
        """
        return pulumi.get(self, "service_spec")

    @service_spec.setter
    def service_spec(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_spec", value)

    @property
    @pulumi.getter(name="serviceDescription")
    def service_description(self) -> Optional[pulumi.Input[str]]:
        """
        Service Description
        """
        return pulumi.get(self, "service_description")

    @service_description.setter
    def service_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_description", value)


@pulumi.input_type
class _ExternalDataServiceState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[str]] = None,
                 db_instance_id: Optional[pulumi.Input[str]] = None,
                 service_description: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[int]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 service_spec: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ExternalDataService resources.
        :param pulumi.Input[str] create_time: The creation time of the resource
        :param pulumi.Input[str] db_instance_id: Instance ID
        :param pulumi.Input[str] service_description: Service Description
        :param pulumi.Input[int] service_id: Service ID
        :param pulumi.Input[str] service_name: Service Name
        :param pulumi.Input[str] service_spec: Service Specifications
        :param pulumi.Input[str] status: The status of the resource
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if db_instance_id is not None:
            pulumi.set(__self__, "db_instance_id", db_instance_id)
        if service_description is not None:
            pulumi.set(__self__, "service_description", service_description)
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)
        if service_name is not None:
            pulumi.set(__self__, "service_name", service_name)
        if service_spec is not None:
            pulumi.set(__self__, "service_spec", service_spec)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The creation time of the resource
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        Instance ID
        """
        return pulumi.get(self, "db_instance_id")

    @db_instance_id.setter
    def db_instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_instance_id", value)

    @property
    @pulumi.getter(name="serviceDescription")
    def service_description(self) -> Optional[pulumi.Input[str]]:
        """
        Service Description
        """
        return pulumi.get(self, "service_description")

    @service_description.setter
    def service_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_description", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[int]]:
        """
        Service ID
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[str]]:
        """
        Service Name
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter(name="serviceSpec")
    def service_spec(self) -> Optional[pulumi.Input[str]]:
        """
        Service Specifications
        """
        return pulumi.get(self, "service_spec")

    @service_spec.setter
    def service_spec(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_spec", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class ExternalDataService(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 db_instance_id: Optional[pulumi.Input[str]] = None,
                 service_description: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 service_spec: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a GPDB External Data Service resource.

        External Data Services.

        For information about GPDB External Data Service and how to use it, see [What is External Data Service](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.227.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.get_zones(available_resource_creation="VSwitch")
        defaultrple4a = alicloud.vpc.Network("defaultrple4a", cidr_block="192.168.0.0/16")
        defaultn_yw_skl = alicloud.vpc.Switch("defaultnYWSkl",
            vpc_id=defaultrple4a.id,
            zone_id="cn-beijing-h",
            cidr_block="192.168.1.0/24")
        default_z7_d_pg_b = alicloud.gpdb.Instance("defaultZ7DPgB",
            instance_spec="2C8G",
            description=name,
            seg_node_num=2,
            seg_storage_type="cloud_essd",
            instance_network_type="VPC",
            db_instance_category="Basic",
            payment_type="PayAsYouGo",
            ssl_enabled=0,
            engine_version="6.0",
            zone_id="cn-beijing-h",
            vswitch_id=defaultn_yw_skl.id,
            storage_size=50,
            master_cu=4,
            vpc_id=defaultrple4a.id,
            db_instance_mode="StorageElastic",
            engine="gpdb")
        default_external_data_service = alicloud.gpdb.ExternalDataService("default",
            service_name="example6",
            db_instance_id=default_z7_d_pg_b.id,
            service_description="example",
            service_spec="8")
        ```

        ## Import

        GPDB External Data Service can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:gpdb/externalDataService:ExternalDataService example <db_instance_id>:<service_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] db_instance_id: Instance ID
        :param pulumi.Input[str] service_description: Service Description
        :param pulumi.Input[str] service_name: Service Name
        :param pulumi.Input[str] service_spec: Service Specifications
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ExternalDataServiceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a GPDB External Data Service resource.

        External Data Services.

        For information about GPDB External Data Service and how to use it, see [What is External Data Service](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.227.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.get_zones(available_resource_creation="VSwitch")
        defaultrple4a = alicloud.vpc.Network("defaultrple4a", cidr_block="192.168.0.0/16")
        defaultn_yw_skl = alicloud.vpc.Switch("defaultnYWSkl",
            vpc_id=defaultrple4a.id,
            zone_id="cn-beijing-h",
            cidr_block="192.168.1.0/24")
        default_z7_d_pg_b = alicloud.gpdb.Instance("defaultZ7DPgB",
            instance_spec="2C8G",
            description=name,
            seg_node_num=2,
            seg_storage_type="cloud_essd",
            instance_network_type="VPC",
            db_instance_category="Basic",
            payment_type="PayAsYouGo",
            ssl_enabled=0,
            engine_version="6.0",
            zone_id="cn-beijing-h",
            vswitch_id=defaultn_yw_skl.id,
            storage_size=50,
            master_cu=4,
            vpc_id=defaultrple4a.id,
            db_instance_mode="StorageElastic",
            engine="gpdb")
        default_external_data_service = alicloud.gpdb.ExternalDataService("default",
            service_name="example6",
            db_instance_id=default_z7_d_pg_b.id,
            service_description="example",
            service_spec="8")
        ```

        ## Import

        GPDB External Data Service can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:gpdb/externalDataService:ExternalDataService example <db_instance_id>:<service_id>
        ```

        :param str resource_name: The name of the resource.
        :param ExternalDataServiceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ExternalDataServiceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 db_instance_id: Optional[pulumi.Input[str]] = None,
                 service_description: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 service_spec: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ExternalDataServiceArgs.__new__(ExternalDataServiceArgs)

            if db_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'db_instance_id'")
            __props__.__dict__["db_instance_id"] = db_instance_id
            __props__.__dict__["service_description"] = service_description
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
            if service_spec is None and not opts.urn:
                raise TypeError("Missing required property 'service_spec'")
            __props__.__dict__["service_spec"] = service_spec
            __props__.__dict__["create_time"] = None
            __props__.__dict__["service_id"] = None
            __props__.__dict__["status"] = None
        super(ExternalDataService, __self__).__init__(
            'alicloud:gpdb/externalDataService:ExternalDataService',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            db_instance_id: Optional[pulumi.Input[str]] = None,
            service_description: Optional[pulumi.Input[str]] = None,
            service_id: Optional[pulumi.Input[int]] = None,
            service_name: Optional[pulumi.Input[str]] = None,
            service_spec: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'ExternalDataService':
        """
        Get an existing ExternalDataService resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] create_time: The creation time of the resource
        :param pulumi.Input[str] db_instance_id: Instance ID
        :param pulumi.Input[str] service_description: Service Description
        :param pulumi.Input[int] service_id: Service ID
        :param pulumi.Input[str] service_name: Service Name
        :param pulumi.Input[str] service_spec: Service Specifications
        :param pulumi.Input[str] status: The status of the resource
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ExternalDataServiceState.__new__(_ExternalDataServiceState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["db_instance_id"] = db_instance_id
        __props__.__dict__["service_description"] = service_description
        __props__.__dict__["service_id"] = service_id
        __props__.__dict__["service_name"] = service_name
        __props__.__dict__["service_spec"] = service_spec
        __props__.__dict__["status"] = status
        return ExternalDataService(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The creation time of the resource
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> pulumi.Output[str]:
        """
        Instance ID
        """
        return pulumi.get(self, "db_instance_id")

    @property
    @pulumi.getter(name="serviceDescription")
    def service_description(self) -> pulumi.Output[Optional[str]]:
        """
        Service Description
        """
        return pulumi.get(self, "service_description")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[int]:
        """
        Service ID
        """
        return pulumi.get(self, "service_id")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[str]:
        """
        Service Name
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter(name="serviceSpec")
    def service_spec(self) -> pulumi.Output[str]:
        """
        Service Specifications
        """
        return pulumi.get(self, "service_spec")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource
        """
        return pulumi.get(self, "status")
