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

__all__ = ['ZoneRecordArgs', 'ZoneRecord']

@pulumi.input_type
class ZoneRecordArgs:
    def __init__(__self__, *,
                 type: pulumi.Input[_builtins.str],
                 value: pulumi.Input[_builtins.str],
                 zone_id: pulumi.Input[_builtins.str],
                 lang: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.int]] = None,
                 remark: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_record: Optional[pulumi.Input[_builtins.str]] = None,
                 rr: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 ttl: Optional[pulumi.Input[_builtins.int]] = None,
                 user_client_ip: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ZoneRecord resource.
        :param pulumi.Input[_builtins.str] type: The type of the Private Zone Record. Valid values: A, CNAME, TXT, MX, PTR, SRV.
        :param pulumi.Input[_builtins.str] value: The value of the Private Zone Record.
        :param pulumi.Input[_builtins.str] zone_id: The name of the Private Zone Record.
        :param pulumi.Input[_builtins.str] lang: User language.
        :param pulumi.Input[_builtins.int] priority: The priority of the Private Zone Record. At present, only can "MX" record support it. Valid values: [1-99]. Default to 1.
        :param pulumi.Input[_builtins.str] remark: The remark of the Private Zone Record.
        :param pulumi.Input[_builtins.str] resource_record: The resource record of the Private Zone Record.
        :param pulumi.Input[_builtins.str] rr: The rr of the Private Zone Record.
        :param pulumi.Input[_builtins.str] status: Resolve record status. Value:
               - ENABLE: enable resolution.
               - DISABLE: pause parsing.
        :param pulumi.Input[_builtins.int] ttl: The ttl of the Private Zone Record. Default to `60`.
        """
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "value", value)
        pulumi.set(__self__, "zone_id", zone_id)
        if lang is not None:
            pulumi.set(__self__, "lang", lang)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if remark is not None:
            pulumi.set(__self__, "remark", remark)
        if resource_record is not None:
            warnings.warn("""Field 'resource_record' has been deprecated from version 1.109.0. Use 'rr' instead.""", DeprecationWarning)
            pulumi.log.warn("""resource_record is deprecated: Field 'resource_record' has been deprecated from version 1.109.0. Use 'rr' instead.""")
        if resource_record is not None:
            pulumi.set(__self__, "resource_record", resource_record)
        if rr is not None:
            pulumi.set(__self__, "rr", rr)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)
        if user_client_ip is not None:
            pulumi.set(__self__, "user_client_ip", user_client_ip)

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Input[_builtins.str]:
        """
        The type of the Private Zone Record. Valid values: A, CNAME, TXT, MX, PTR, SRV.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "type", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Input[_builtins.str]:
        """
        The value of the Private Zone Record.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "value", value)

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the Private Zone Record.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "zone_id", value)

    @_builtins.property
    @pulumi.getter
    def lang(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User language.
        """
        return pulumi.get(self, "lang")

    @lang.setter
    def lang(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "lang", value)

    @_builtins.property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The priority of the Private Zone Record. At present, only can "MX" record support it. Valid values: [1-99]. Default to 1.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "priority", value)

    @_builtins.property
    @pulumi.getter
    def remark(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The remark of the Private Zone Record.
        """
        return pulumi.get(self, "remark")

    @remark.setter
    def remark(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "remark", value)

    @_builtins.property
    @pulumi.getter(name="resourceRecord")
    @_utilities.deprecated("""Field 'resource_record' has been deprecated from version 1.109.0. Use 'rr' instead.""")
    def resource_record(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The resource record of the Private Zone Record.
        """
        return pulumi.get(self, "resource_record")

    @resource_record.setter
    def resource_record(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_record", value)

    @_builtins.property
    @pulumi.getter
    def rr(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The rr of the Private Zone Record.
        """
        return pulumi.get(self, "rr")

    @rr.setter
    def rr(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rr", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Resolve record status. Value:
        - ENABLE: enable resolution.
        - DISABLE: pause parsing.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)

    @_builtins.property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The ttl of the Private Zone Record. Default to `60`.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "ttl", value)

    @_builtins.property
    @pulumi.getter(name="userClientIp")
    def user_client_ip(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "user_client_ip")

    @user_client_ip.setter
    def user_client_ip(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_client_ip", value)


@pulumi.input_type
class _ZoneRecordState:
    def __init__(__self__, *,
                 lang: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.int]] = None,
                 record_id: Optional[pulumi.Input[_builtins.str]] = None,
                 remark: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_record: Optional[pulumi.Input[_builtins.str]] = None,
                 rr: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 ttl: Optional[pulumi.Input[_builtins.int]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 user_client_ip: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ZoneRecord resources.
        :param pulumi.Input[_builtins.str] lang: User language.
        :param pulumi.Input[_builtins.int] priority: The priority of the Private Zone Record. At present, only can "MX" record support it. Valid values: [1-99]. Default to 1.
        :param pulumi.Input[_builtins.str] record_id: The Private Zone Record ID.
        :param pulumi.Input[_builtins.str] remark: The remark of the Private Zone Record.
        :param pulumi.Input[_builtins.str] resource_record: The resource record of the Private Zone Record.
        :param pulumi.Input[_builtins.str] rr: The rr of the Private Zone Record.
        :param pulumi.Input[_builtins.str] status: Resolve record status. Value:
               - ENABLE: enable resolution.
               - DISABLE: pause parsing.
        :param pulumi.Input[_builtins.int] ttl: The ttl of the Private Zone Record. Default to `60`.
        :param pulumi.Input[_builtins.str] type: The type of the Private Zone Record. Valid values: A, CNAME, TXT, MX, PTR, SRV.
        :param pulumi.Input[_builtins.str] value: The value of the Private Zone Record.
        :param pulumi.Input[_builtins.str] zone_id: The name of the Private Zone Record.
        """
        if lang is not None:
            pulumi.set(__self__, "lang", lang)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if record_id is not None:
            pulumi.set(__self__, "record_id", record_id)
        if remark is not None:
            pulumi.set(__self__, "remark", remark)
        if resource_record is not None:
            warnings.warn("""Field 'resource_record' has been deprecated from version 1.109.0. Use 'rr' instead.""", DeprecationWarning)
            pulumi.log.warn("""resource_record is deprecated: Field 'resource_record' has been deprecated from version 1.109.0. Use 'rr' instead.""")
        if resource_record is not None:
            pulumi.set(__self__, "resource_record", resource_record)
        if rr is not None:
            pulumi.set(__self__, "rr", rr)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if user_client_ip is not None:
            pulumi.set(__self__, "user_client_ip", user_client_ip)
        if value is not None:
            pulumi.set(__self__, "value", value)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def lang(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User language.
        """
        return pulumi.get(self, "lang")

    @lang.setter
    def lang(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "lang", value)

    @_builtins.property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The priority of the Private Zone Record. At present, only can "MX" record support it. Valid values: [1-99]. Default to 1.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "priority", value)

    @_builtins.property
    @pulumi.getter(name="recordId")
    def record_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Private Zone Record ID.
        """
        return pulumi.get(self, "record_id")

    @record_id.setter
    def record_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "record_id", value)

    @_builtins.property
    @pulumi.getter
    def remark(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The remark of the Private Zone Record.
        """
        return pulumi.get(self, "remark")

    @remark.setter
    def remark(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "remark", value)

    @_builtins.property
    @pulumi.getter(name="resourceRecord")
    @_utilities.deprecated("""Field 'resource_record' has been deprecated from version 1.109.0. Use 'rr' instead.""")
    def resource_record(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The resource record of the Private Zone Record.
        """
        return pulumi.get(self, "resource_record")

    @resource_record.setter
    def resource_record(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_record", value)

    @_builtins.property
    @pulumi.getter
    def rr(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The rr of the Private Zone Record.
        """
        return pulumi.get(self, "rr")

    @rr.setter
    def rr(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rr", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Resolve record status. Value:
        - ENABLE: enable resolution.
        - DISABLE: pause parsing.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)

    @_builtins.property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The ttl of the Private Zone Record. Default to `60`.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "ttl", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the Private Zone Record. Valid values: A, CNAME, TXT, MX, PTR, SRV.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)

    @_builtins.property
    @pulumi.getter(name="userClientIp")
    def user_client_ip(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "user_client_ip")

    @user_client_ip.setter
    def user_client_ip(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_client_ip", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The value of the Private Zone Record.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "value", value)

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the Private Zone Record.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.type_token("alicloud:pvtz/zoneRecord:ZoneRecord")
class ZoneRecord(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 lang: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.int]] = None,
                 remark: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_record: Optional[pulumi.Input[_builtins.str]] = None,
                 rr: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 ttl: Optional[pulumi.Input[_builtins.int]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 user_client_ip: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        zone = alicloud.pvtz.Zone("zone", zone_name="foo.test.com")
        foo = alicloud.pvtz.ZoneRecord("foo",
            zone_id=zone.id,
            rr="www",
            type="CNAME",
            value="bbb.test.com",
            ttl=60)
        ```

        ## Import

        Private Zone Record can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:pvtz/zoneRecord:ZoneRecord example abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] lang: User language.
        :param pulumi.Input[_builtins.int] priority: The priority of the Private Zone Record. At present, only can "MX" record support it. Valid values: [1-99]. Default to 1.
        :param pulumi.Input[_builtins.str] remark: The remark of the Private Zone Record.
        :param pulumi.Input[_builtins.str] resource_record: The resource record of the Private Zone Record.
        :param pulumi.Input[_builtins.str] rr: The rr of the Private Zone Record.
        :param pulumi.Input[_builtins.str] status: Resolve record status. Value:
               - ENABLE: enable resolution.
               - DISABLE: pause parsing.
        :param pulumi.Input[_builtins.int] ttl: The ttl of the Private Zone Record. Default to `60`.
        :param pulumi.Input[_builtins.str] type: The type of the Private Zone Record. Valid values: A, CNAME, TXT, MX, PTR, SRV.
        :param pulumi.Input[_builtins.str] value: The value of the Private Zone Record.
        :param pulumi.Input[_builtins.str] zone_id: The name of the Private Zone Record.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZoneRecordArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        zone = alicloud.pvtz.Zone("zone", zone_name="foo.test.com")
        foo = alicloud.pvtz.ZoneRecord("foo",
            zone_id=zone.id,
            rr="www",
            type="CNAME",
            value="bbb.test.com",
            ttl=60)
        ```

        ## Import

        Private Zone Record can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:pvtz/zoneRecord:ZoneRecord example abc123456
        ```

        :param str resource_name: The name of the resource.
        :param ZoneRecordArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZoneRecordArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 lang: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.int]] = None,
                 remark: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_record: Optional[pulumi.Input[_builtins.str]] = None,
                 rr: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 ttl: Optional[pulumi.Input[_builtins.int]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 user_client_ip: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 zone_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ZoneRecordArgs.__new__(ZoneRecordArgs)

            __props__.__dict__["lang"] = lang
            __props__.__dict__["priority"] = priority
            __props__.__dict__["remark"] = remark
            __props__.__dict__["resource_record"] = resource_record
            __props__.__dict__["rr"] = rr
            __props__.__dict__["status"] = status
            __props__.__dict__["ttl"] = ttl
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["user_client_ip"] = user_client_ip
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = value
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["record_id"] = None
        super(ZoneRecord, __self__).__init__(
            'alicloud:pvtz/zoneRecord:ZoneRecord',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            lang: Optional[pulumi.Input[_builtins.str]] = None,
            priority: Optional[pulumi.Input[_builtins.int]] = None,
            record_id: Optional[pulumi.Input[_builtins.str]] = None,
            remark: Optional[pulumi.Input[_builtins.str]] = None,
            resource_record: Optional[pulumi.Input[_builtins.str]] = None,
            rr: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None,
            ttl: Optional[pulumi.Input[_builtins.int]] = None,
            type: Optional[pulumi.Input[_builtins.str]] = None,
            user_client_ip: Optional[pulumi.Input[_builtins.str]] = None,
            value: Optional[pulumi.Input[_builtins.str]] = None,
            zone_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'ZoneRecord':
        """
        Get an existing ZoneRecord resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] lang: User language.
        :param pulumi.Input[_builtins.int] priority: The priority of the Private Zone Record. At present, only can "MX" record support it. Valid values: [1-99]. Default to 1.
        :param pulumi.Input[_builtins.str] record_id: The Private Zone Record ID.
        :param pulumi.Input[_builtins.str] remark: The remark of the Private Zone Record.
        :param pulumi.Input[_builtins.str] resource_record: The resource record of the Private Zone Record.
        :param pulumi.Input[_builtins.str] rr: The rr of the Private Zone Record.
        :param pulumi.Input[_builtins.str] status: Resolve record status. Value:
               - ENABLE: enable resolution.
               - DISABLE: pause parsing.
        :param pulumi.Input[_builtins.int] ttl: The ttl of the Private Zone Record. Default to `60`.
        :param pulumi.Input[_builtins.str] type: The type of the Private Zone Record. Valid values: A, CNAME, TXT, MX, PTR, SRV.
        :param pulumi.Input[_builtins.str] value: The value of the Private Zone Record.
        :param pulumi.Input[_builtins.str] zone_id: The name of the Private Zone Record.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZoneRecordState.__new__(_ZoneRecordState)

        __props__.__dict__["lang"] = lang
        __props__.__dict__["priority"] = priority
        __props__.__dict__["record_id"] = record_id
        __props__.__dict__["remark"] = remark
        __props__.__dict__["resource_record"] = resource_record
        __props__.__dict__["rr"] = rr
        __props__.__dict__["status"] = status
        __props__.__dict__["ttl"] = ttl
        __props__.__dict__["type"] = type
        __props__.__dict__["user_client_ip"] = user_client_ip
        __props__.__dict__["value"] = value
        __props__.__dict__["zone_id"] = zone_id
        return ZoneRecord(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def lang(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        User language.
        """
        return pulumi.get(self, "lang")

    @_builtins.property
    @pulumi.getter
    def priority(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        The priority of the Private Zone Record. At present, only can "MX" record support it. Valid values: [1-99]. Default to 1.
        """
        return pulumi.get(self, "priority")

    @_builtins.property
    @pulumi.getter(name="recordId")
    def record_id(self) -> pulumi.Output[_builtins.str]:
        """
        The Private Zone Record ID.
        """
        return pulumi.get(self, "record_id")

    @_builtins.property
    @pulumi.getter
    def remark(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The remark of the Private Zone Record.
        """
        return pulumi.get(self, "remark")

    @_builtins.property
    @pulumi.getter(name="resourceRecord")
    @_utilities.deprecated("""Field 'resource_record' has been deprecated from version 1.109.0. Use 'rr' instead.""")
    def resource_record(self) -> pulumi.Output[_builtins.str]:
        """
        The resource record of the Private Zone Record.
        """
        return pulumi.get(self, "resource_record")

    @_builtins.property
    @pulumi.getter
    def rr(self) -> pulumi.Output[_builtins.str]:
        """
        The rr of the Private Zone Record.
        """
        return pulumi.get(self, "rr")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Resolve record status. Value:
        - ENABLE: enable resolution.
        - DISABLE: pause parsing.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def ttl(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        The ttl of the Private Zone Record. Default to `60`.
        """
        return pulumi.get(self, "ttl")

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Output[_builtins.str]:
        """
        The type of the Private Zone Record. Valid values: A, CNAME, TXT, MX, PTR, SRV.
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter(name="userClientIp")
    def user_client_ip(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "user_client_ip")

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Output[_builtins.str]:
        """
        The value of the Private Zone Record.
        """
        return pulumi.get(self, "value")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the Private Zone Record.
        """
        return pulumi.get(self, "zone_id")

