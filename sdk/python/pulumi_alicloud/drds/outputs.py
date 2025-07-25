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

__all__ = [
    'GetInstancesInstanceResult',
]

@pulumi.output_type
class GetInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 connection_string: _builtins.str,
                 create_time: _builtins.int,
                 description: _builtins.str,
                 id: _builtins.str,
                 network_type: _builtins.str,
                 port: _builtins.str,
                 status: _builtins.str,
                 type: _builtins.str,
                 version: _builtins.int,
                 zone_id: _builtins.str):
        """
        :param _builtins.str connection_string: (Available in 1.196.0+) The connection string of the DRDS instance.
        :param _builtins.int create_time: Creation time of the instance.
        :param _builtins.str description: The DRDS instance description.
        :param _builtins.str id: The ID of the DRDS instance.
        :param _builtins.str network_type: `Classic` for public classic network or `VPC` for private network.
        :param _builtins.str port: (Available in 1.196.0+) The connection port of the DRDS instance.
        :param _builtins.str status: Status of the instance.
        :param _builtins.str type: The DRDS Instance type.
        :param _builtins.int version: The DRDS Instance version.
        :param _builtins.str zone_id: Zone ID the instance belongs to.
        """
        pulumi.set(__self__, "connection_string", connection_string)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "network_type", network_type)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "version", version)
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> _builtins.str:
        """
        (Available in 1.196.0+) The connection string of the DRDS instance.
        """
        return pulumi.get(self, "connection_string")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> _builtins.int:
        """
        Creation time of the instance.
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def description(self) -> _builtins.str:
        """
        The DRDS instance description.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of the DRDS instance.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="networkType")
    def network_type(self) -> _builtins.str:
        """
        `Classic` for public classic network or `VPC` for private network.
        """
        return pulumi.get(self, "network_type")

    @_builtins.property
    @pulumi.getter
    def port(self) -> _builtins.str:
        """
        (Available in 1.196.0+) The connection port of the DRDS instance.
        """
        return pulumi.get(self, "port")

    @_builtins.property
    @pulumi.getter
    def status(self) -> _builtins.str:
        """
        Status of the instance.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def type(self) -> _builtins.str:
        """
        The DRDS Instance type.
        """
        return pulumi.get(self, "type")

    @_builtins.property
    @pulumi.getter
    def version(self) -> _builtins.int:
        """
        The DRDS Instance version.
        """
        return pulumi.get(self, "version")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> _builtins.str:
        """
        Zone ID the instance belongs to.
        """
        return pulumi.get(self, "zone_id")


