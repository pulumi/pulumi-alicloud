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
    'GetPrometheisResult',
    'AwaitableGetPrometheisResult',
    'get_prometheis',
    'get_prometheis_output',
]

@pulumi.output_type
class GetPrometheisResult:
    """
    A collection of values returned by getPrometheis.
    """
    def __init__(__self__, enable_details=None, id=None, ids=None, name_regex=None, names=None, output_file=None, prometheis=None, resource_group_id=None, tags=None):
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if prometheis and not isinstance(prometheis, list):
            raise TypeError("Expected argument 'prometheis' to be a list")
        pulumi.set(__self__, "prometheis", prometheis)
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @_builtins.property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "enable_details")

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
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_regex")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        """
        A list of Prometheus names.
        """
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter
    def prometheis(self) -> Sequence['outputs.GetPrometheisPrometheiResult']:
        """
        A list of Prometheus. Each element contains the following attributes:
        """
        return pulumi.get(self, "prometheis")

    @_builtins.property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[_builtins.str]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, _builtins.str]]:
        """
        The tag of the Prometheus.
        """
        return pulumi.get(self, "tags")


class AwaitableGetPrometheisResult(GetPrometheisResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrometheisResult(
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            prometheis=self.prometheis,
            resource_group_id=self.resource_group_id,
            tags=self.tags)


def get_prometheis(enable_details: Optional[_builtins.bool] = None,
                   ids: Optional[Sequence[_builtins.str]] = None,
                   name_regex: Optional[_builtins.str] = None,
                   output_file: Optional[_builtins.str] = None,
                   resource_group_id: Optional[_builtins.str] = None,
                   tags: Optional[Mapping[str, _builtins.str]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrometheisResult:
    """
    This data source provides the Arms Prometheis of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.203.0.

    > **DEPRECATED:** This data source has been renamed to arms.Prometheus from version 1.214.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "tf-example"
    default = alicloud.vpc.get_networks(name_regex="default-NODELETING")
    default_get_switches = alicloud.vpc.get_switches(vpc_id=default.ids[0])
    default_get_resource_groups = alicloud.resourcemanager.get_resource_groups()
    default_security_group = alicloud.ecs.SecurityGroup("default", vpc_id=default.ids[0])
    default_prometheus = alicloud.arms.Prometheus("default",
        cluster_type="ecs",
        grafana_instance_id="free",
        vpc_id=default.ids[0],
        vswitch_id=default_get_switches.ids[0],
        security_group_id=default_security_group.id,
        cluster_name=f"{name}-{default.ids[0]}",
        resource_group_id=default_get_resource_groups.groups[1].id,
        tags={
            "Created": "TF",
            "For": "Prometheus",
        })
    name_regex = alicloud.arms.get_prometheis_output(name_regex=default_prometheus.cluster_name)
    pulumi.export("armsPrometheisId", name_regex.prometheis[0].id)
    ```


    :param _builtins.bool enable_details: Whether to query details about the instance.
    :param Sequence[_builtins.str] ids: A list of Prometheus IDs.
    :param _builtins.str name_regex: A regex string to filter results by Prometheus name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str resource_group_id: The ID of the resource group.
    :param Mapping[str, _builtins.str] tags: A mapping of tags to assign to the resource.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['resourceGroupId'] = resource_group_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:arms/getPrometheis:getPrometheis', __args__, opts=opts, typ=GetPrometheisResult).value

    return AwaitableGetPrometheisResult(
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        prometheis=pulumi.get(__ret__, 'prometheis'),
        resource_group_id=pulumi.get(__ret__, 'resource_group_id'),
        tags=pulumi.get(__ret__, 'tags'))
def get_prometheis_output(enable_details: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                          ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                          name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                          output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                          resource_group_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                          tags: Optional[pulumi.Input[Optional[Mapping[str, _builtins.str]]]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPrometheisResult]:
    """
    This data source provides the Arms Prometheis of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.203.0.

    > **DEPRECATED:** This data source has been renamed to arms.Prometheus from version 1.214.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "tf-example"
    default = alicloud.vpc.get_networks(name_regex="default-NODELETING")
    default_get_switches = alicloud.vpc.get_switches(vpc_id=default.ids[0])
    default_get_resource_groups = alicloud.resourcemanager.get_resource_groups()
    default_security_group = alicloud.ecs.SecurityGroup("default", vpc_id=default.ids[0])
    default_prometheus = alicloud.arms.Prometheus("default",
        cluster_type="ecs",
        grafana_instance_id="free",
        vpc_id=default.ids[0],
        vswitch_id=default_get_switches.ids[0],
        security_group_id=default_security_group.id,
        cluster_name=f"{name}-{default.ids[0]}",
        resource_group_id=default_get_resource_groups.groups[1].id,
        tags={
            "Created": "TF",
            "For": "Prometheus",
        })
    name_regex = alicloud.arms.get_prometheis_output(name_regex=default_prometheus.cluster_name)
    pulumi.export("armsPrometheisId", name_regex.prometheis[0].id)
    ```


    :param _builtins.bool enable_details: Whether to query details about the instance.
    :param Sequence[_builtins.str] ids: A list of Prometheus IDs.
    :param _builtins.str name_regex: A regex string to filter results by Prometheus name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.str resource_group_id: The ID of the resource group.
    :param Mapping[str, _builtins.str] tags: A mapping of tags to assign to the resource.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['resourceGroupId'] = resource_group_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:arms/getPrometheis:getPrometheis', __args__, opts=opts, typ=GetPrometheisResult)
    return __ret__.apply(lambda __response__: GetPrometheisResult(
        enable_details=pulumi.get(__response__, 'enable_details'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file'),
        prometheis=pulumi.get(__response__, 'prometheis'),
        resource_group_id=pulumi.get(__response__, 'resource_group_id'),
        tags=pulumi.get(__response__, 'tags')))
