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
from . import outputs

__all__ = [
    'GetInstancesResult',
    'AwaitableGetInstancesResult',
    'get_instances',
    'get_instances_output',
]

@pulumi.output_type
class GetInstancesResult:
    """
    A collection of values returned by getInstances.
    """
    def __init__(__self__, description_regex=None, descriptions=None, id=None, ids=None, instances=None, name_regex=None, output_file=None):
        if description_regex and not isinstance(description_regex, str):
            raise TypeError("Expected argument 'description_regex' to be a str")
        pulumi.set(__self__, "description_regex", description_regex)
        if descriptions and not isinstance(descriptions, list):
            raise TypeError("Expected argument 'descriptions' to be a list")
        pulumi.set(__self__, "descriptions", descriptions)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instances and not isinstance(instances, list):
            raise TypeError("Expected argument 'instances' to be a list")
        pulumi.set(__self__, "instances", instances)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @_builtins.property
    @pulumi.getter(name="descriptionRegex")
    def description_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "description_regex")

    @_builtins.property
    @pulumi.getter
    def descriptions(self) -> Sequence[_builtins.str]:
        """
        A list of DRDS descriptions.
        """
        return pulumi.get(self, "descriptions")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def ids(self) -> Sequence[_builtins.str]:
        """
        A list of DRDS instance IDs.
        """
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter
    def instances(self) -> Sequence['outputs.GetInstancesInstanceResult']:
        """
        A list of DRDS instances.
        """
        return pulumi.get(self, "instances")

    @_builtins.property
    @pulumi.getter(name="nameRegex")
    @_utilities.deprecated("""Field 'name_regex' is deprecated and will be removed in a future release. Please use 'description_regex' instead.""")
    def name_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_regex")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")


class AwaitableGetInstancesResult(GetInstancesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstancesResult(
            description_regex=self.description_regex,
            descriptions=self.descriptions,
            id=self.id,
            ids=self.ids,
            instances=self.instances,
            name_regex=self.name_regex,
            output_file=self.output_file)


def get_instances(description_regex: Optional[_builtins.str] = None,
                  ids: Optional[Sequence[_builtins.str]] = None,
                  name_regex: Optional[_builtins.str] = None,
                  output_file: Optional[_builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstancesResult:
    """
    The `drds.Instance` data source provides a collection of DRDS instances available in Alibaba Cloud account.
    Filters support regular expression for the instance name, searches by tags, and other filters which are listed below.

    > **NOTE:** Available in 1.35.0+.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    drds_instances_ds = alicloud.drds.get_instances(name_regex="drds-\\\\d+",
       ids=["drdsabc123456"])
    pulumi.export("firstDbInstanceId", drds_instances_ds.instances[0].id)
    ```


    :param _builtins.str description_regex: A regex string to filter results by instance description.
    :param Sequence[_builtins.str] ids: A list of DRDS instance IDs.
    :param _builtins.str name_regex: A regex string to filter results by instance description. It is deprecated since v1.91.0 and will be removed in a future release, please use 'description_regex' instead.
    """
    __args__ = dict()
    __args__['descriptionRegex'] = description_regex
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:drds/getInstances:getInstances', __args__, opts=opts, typ=GetInstancesResult).value

    return AwaitableGetInstancesResult(
        description_regex=pulumi.get(__ret__, 'description_regex'),
        descriptions=pulumi.get(__ret__, 'descriptions'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instances=pulumi.get(__ret__, 'instances'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        output_file=pulumi.get(__ret__, 'output_file'))
def get_instances_output(description_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                         name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetInstancesResult]:
    """
    The `drds.Instance` data source provides a collection of DRDS instances available in Alibaba Cloud account.
    Filters support regular expression for the instance name, searches by tags, and other filters which are listed below.

    > **NOTE:** Available in 1.35.0+.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    drds_instances_ds = alicloud.drds.get_instances(name_regex="drds-\\\\d+",
       ids=["drdsabc123456"])
    pulumi.export("firstDbInstanceId", drds_instances_ds.instances[0].id)
    ```


    :param _builtins.str description_regex: A regex string to filter results by instance description.
    :param Sequence[_builtins.str] ids: A list of DRDS instance IDs.
    :param _builtins.str name_regex: A regex string to filter results by instance description. It is deprecated since v1.91.0 and will be removed in a future release, please use 'description_regex' instead.
    """
    __args__ = dict()
    __args__['descriptionRegex'] = description_regex
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:drds/getInstances:getInstances', __args__, opts=opts, typ=GetInstancesResult)
    return __ret__.apply(lambda __response__: GetInstancesResult(
        description_regex=pulumi.get(__response__, 'description_regex'),
        descriptions=pulumi.get(__response__, 'descriptions'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        instances=pulumi.get(__response__, 'instances'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        output_file=pulumi.get(__response__, 'output_file')))
