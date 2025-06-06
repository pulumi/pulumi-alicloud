# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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
from . import outputs

__all__ = [
    'GetMongoInstancesResult',
    'AwaitableGetMongoInstancesResult',
    'get_mongo_instances',
    'get_mongo_instances_output',
]

@pulumi.output_type
class GetMongoInstancesResult:
    """
    A collection of values returned by getMongoInstances.
    """
    def __init__(__self__, availability_zone=None, id=None, ids=None, instance_class=None, instance_type=None, instances=None, name_regex=None, names=None, output_file=None, tags=None):
        if availability_zone and not isinstance(availability_zone, str):
            raise TypeError("Expected argument 'availability_zone' to be a str")
        pulumi.set(__self__, "availability_zone", availability_zone)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_class and not isinstance(instance_class, str):
            raise TypeError("Expected argument 'instance_class' to be a str")
        pulumi.set(__self__, "instance_class", instance_class)
        if instance_type and not isinstance(instance_type, str):
            raise TypeError("Expected argument 'instance_type' to be a str")
        pulumi.set(__self__, "instance_type", instance_type)
        if instances and not isinstance(instances, list):
            raise TypeError("Expected argument 'instances' to be a list")
        pulumi.set(__self__, "instances", instances)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="availabilityZone")
    def availability_zone(self) -> Optional[builtins.str]:
        return pulumi.get(self, "availability_zone")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[builtins.str]:
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="instanceClass")
    def instance_class(self) -> Optional[builtins.str]:
        return pulumi.get(self, "instance_class")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> Optional[builtins.str]:
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter
    def instances(self) -> Sequence['outputs.GetMongoInstancesInstanceResult']:
        return pulumi.get(self, "instances")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[builtins.str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[builtins.str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[builtins.str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, builtins.str]]:
        return pulumi.get(self, "tags")


class AwaitableGetMongoInstancesResult(GetMongoInstancesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMongoInstancesResult(
            availability_zone=self.availability_zone,
            id=self.id,
            ids=self.ids,
            instance_class=self.instance_class,
            instance_type=self.instance_type,
            instances=self.instances,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            tags=self.tags)


def get_mongo_instances(availability_zone: Optional[builtins.str] = None,
                        ids: Optional[Sequence[builtins.str]] = None,
                        instance_class: Optional[builtins.str] = None,
                        instance_type: Optional[builtins.str] = None,
                        name_regex: Optional[builtins.str] = None,
                        output_file: Optional[builtins.str] = None,
                        tags: Optional[Mapping[str, builtins.str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMongoInstancesResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['availabilityZone'] = availability_zone
    __args__['ids'] = ids
    __args__['instanceClass'] = instance_class
    __args__['instanceType'] = instance_type
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:dds/getMongoInstances:getMongoInstances', __args__, opts=opts, typ=GetMongoInstancesResult).value

    return AwaitableGetMongoInstancesResult(
        availability_zone=pulumi.get(__ret__, 'availability_zone'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_class=pulumi.get(__ret__, 'instance_class'),
        instance_type=pulumi.get(__ret__, 'instance_type'),
        instances=pulumi.get(__ret__, 'instances'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        tags=pulumi.get(__ret__, 'tags'))
def get_mongo_instances_output(availability_zone: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                               ids: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                               instance_class: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                               instance_type: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                               name_regex: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                               output_file: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                               tags: Optional[pulumi.Input[Optional[Mapping[str, builtins.str]]]] = None,
                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetMongoInstancesResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['availabilityZone'] = availability_zone
    __args__['ids'] = ids
    __args__['instanceClass'] = instance_class
    __args__['instanceType'] = instance_type
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['tags'] = tags
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:dds/getMongoInstances:getMongoInstances', __args__, opts=opts, typ=GetMongoInstancesResult)
    return __ret__.apply(lambda __response__: GetMongoInstancesResult(
        availability_zone=pulumi.get(__response__, 'availability_zone'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        instance_class=pulumi.get(__response__, 'instance_class'),
        instance_type=pulumi.get(__response__, 'instance_type'),
        instances=pulumi.get(__response__, 'instances'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        tags=pulumi.get(__response__, 'tags')))
