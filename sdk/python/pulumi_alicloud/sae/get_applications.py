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
    'GetApplicationsResult',
    'AwaitableGetApplicationsResult',
    'get_applications',
    'get_applications_output',
]

@pulumi.output_type
class GetApplicationsResult:
    """
    A collection of values returned by getApplications.
    """
    def __init__(__self__, app_name=None, applications=None, enable_details=None, field_type=None, field_value=None, id=None, ids=None, namespace_id=None, order_by=None, output_file=None, reverse=None, status=None):
        if app_name and not isinstance(app_name, str):
            raise TypeError("Expected argument 'app_name' to be a str")
        pulumi.set(__self__, "app_name", app_name)
        if applications and not isinstance(applications, list):
            raise TypeError("Expected argument 'applications' to be a list")
        pulumi.set(__self__, "applications", applications)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if field_type and not isinstance(field_type, str):
            raise TypeError("Expected argument 'field_type' to be a str")
        pulumi.set(__self__, "field_type", field_type)
        if field_value and not isinstance(field_value, str):
            raise TypeError("Expected argument 'field_value' to be a str")
        pulumi.set(__self__, "field_value", field_value)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if namespace_id and not isinstance(namespace_id, str):
            raise TypeError("Expected argument 'namespace_id' to be a str")
        pulumi.set(__self__, "namespace_id", namespace_id)
        if order_by and not isinstance(order_by, str):
            raise TypeError("Expected argument 'order_by' to be a str")
        pulumi.set(__self__, "order_by", order_by)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if reverse and not isinstance(reverse, bool):
            raise TypeError("Expected argument 'reverse' to be a bool")
        pulumi.set(__self__, "reverse", reverse)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter(name="appName")
    def app_name(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "app_name")

    @_builtins.property
    @pulumi.getter
    def applications(self) -> Sequence['outputs.GetApplicationsApplicationResult']:
        return pulumi.get(self, "applications")

    @_builtins.property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "enable_details")

    @_builtins.property
    @pulumi.getter(name="fieldType")
    def field_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "field_type")

    @_builtins.property
    @pulumi.getter(name="fieldValue")
    def field_value(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "field_value")

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
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "namespace_id")

    @_builtins.property
    @pulumi.getter(name="orderBy")
    def order_by(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "order_by")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter
    def reverse(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "reverse")

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "status")


class AwaitableGetApplicationsResult(GetApplicationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetApplicationsResult(
            app_name=self.app_name,
            applications=self.applications,
            enable_details=self.enable_details,
            field_type=self.field_type,
            field_value=self.field_value,
            id=self.id,
            ids=self.ids,
            namespace_id=self.namespace_id,
            order_by=self.order_by,
            output_file=self.output_file,
            reverse=self.reverse,
            status=self.status)


def get_applications(app_name: Optional[_builtins.str] = None,
                     enable_details: Optional[_builtins.bool] = None,
                     field_type: Optional[_builtins.str] = None,
                     field_value: Optional[_builtins.str] = None,
                     ids: Optional[Sequence[_builtins.str]] = None,
                     namespace_id: Optional[_builtins.str] = None,
                     order_by: Optional[_builtins.str] = None,
                     output_file: Optional[_builtins.str] = None,
                     reverse: Optional[_builtins.bool] = None,
                     status: Optional[_builtins.str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetApplicationsResult:
    """
    This data source provides the Sae Applications of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.161.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "tf-testacc"
    default = alicloud.get_zones(available_resource_creation="VSwitch")
    vpc = alicloud.vpc.Network("vpc",
        vpc_name="tf_testacc",
        cidr_block="172.16.0.0/12")
    vsw = alicloud.vpc.Switch("vsw",
        vpc_id=vpc.id,
        cidr_block="172.16.0.0/24",
        zone_id=default.zones[0].id,
        vswitch_name=name)
    default_namespace = alicloud.sae.Namespace("default",
        namespace_description=name,
        namespace_id="cn-hangzhou:tfacctest",
        namespace_name=name)
    default_application = alicloud.sae.Application("default",
        app_description="tf-testaccDescription",
        app_name="tf-testaccAppName131",
        namespace_id=default_namespace.id,
        image_url="registry-vpc.cn-hangzhou.aliyuncs.com/lxepoo/apache-php5",
        package_type="Image",
        vswitch_id=vsw.id,
        timezone="Asia/Beijing",
        replicas=5,
        cpu=500,
        memory=2048)
    default_get_applications = alicloud.sae.get_applications_output(ids=[default_application.id])
    pulumi.export("saeApplicationId", default_get_applications.applications[0].id)
    ```


    :param _builtins.str app_name: Application Name. Combinations of numbers, letters, and dashes (-) are allowed. It must start with a letter and the maximum length is 36 characters.
    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param _builtins.str field_type: The field type. Valid values:`appName`, `appIds`, `slbIps`, `instanceIps`
    :param _builtins.str field_value: The field value.
    :param Sequence[_builtins.str] ids: A list of Application IDs.
    :param _builtins.str namespace_id: SAE namespace ID. Only namespaces whose names are lowercase letters and dashes (-) are supported, and must start with a letter. The namespace can be obtained by calling the DescribeNamespaceList interface.
    :param _builtins.str order_by: The order by.Valid values:`running`,`instances`.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.bool reverse: The reverse.
    :param _builtins.str status: The status of the resource. Valid values: `RUNNING`, `STOPPED`,`UNKNOWN`.
    """
    __args__ = dict()
    __args__['appName'] = app_name
    __args__['enableDetails'] = enable_details
    __args__['fieldType'] = field_type
    __args__['fieldValue'] = field_value
    __args__['ids'] = ids
    __args__['namespaceId'] = namespace_id
    __args__['orderBy'] = order_by
    __args__['outputFile'] = output_file
    __args__['reverse'] = reverse
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:sae/getApplications:getApplications', __args__, opts=opts, typ=GetApplicationsResult).value

    return AwaitableGetApplicationsResult(
        app_name=pulumi.get(__ret__, 'app_name'),
        applications=pulumi.get(__ret__, 'applications'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        field_type=pulumi.get(__ret__, 'field_type'),
        field_value=pulumi.get(__ret__, 'field_value'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        namespace_id=pulumi.get(__ret__, 'namespace_id'),
        order_by=pulumi.get(__ret__, 'order_by'),
        output_file=pulumi.get(__ret__, 'output_file'),
        reverse=pulumi.get(__ret__, 'reverse'),
        status=pulumi.get(__ret__, 'status'))
def get_applications_output(app_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            enable_details: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                            field_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            field_value: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                            namespace_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            order_by: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            reverse: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                            status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                            opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetApplicationsResult]:
    """
    This data source provides the Sae Applications of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.161.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "tf-testacc"
    default = alicloud.get_zones(available_resource_creation="VSwitch")
    vpc = alicloud.vpc.Network("vpc",
        vpc_name="tf_testacc",
        cidr_block="172.16.0.0/12")
    vsw = alicloud.vpc.Switch("vsw",
        vpc_id=vpc.id,
        cidr_block="172.16.0.0/24",
        zone_id=default.zones[0].id,
        vswitch_name=name)
    default_namespace = alicloud.sae.Namespace("default",
        namespace_description=name,
        namespace_id="cn-hangzhou:tfacctest",
        namespace_name=name)
    default_application = alicloud.sae.Application("default",
        app_description="tf-testaccDescription",
        app_name="tf-testaccAppName131",
        namespace_id=default_namespace.id,
        image_url="registry-vpc.cn-hangzhou.aliyuncs.com/lxepoo/apache-php5",
        package_type="Image",
        vswitch_id=vsw.id,
        timezone="Asia/Beijing",
        replicas=5,
        cpu=500,
        memory=2048)
    default_get_applications = alicloud.sae.get_applications_output(ids=[default_application.id])
    pulumi.export("saeApplicationId", default_get_applications.applications[0].id)
    ```


    :param _builtins.str app_name: Application Name. Combinations of numbers, letters, and dashes (-) are allowed. It must start with a letter and the maximum length is 36 characters.
    :param _builtins.bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param _builtins.str field_type: The field type. Valid values:`appName`, `appIds`, `slbIps`, `instanceIps`
    :param _builtins.str field_value: The field value.
    :param Sequence[_builtins.str] ids: A list of Application IDs.
    :param _builtins.str namespace_id: SAE namespace ID. Only namespaces whose names are lowercase letters and dashes (-) are supported, and must start with a letter. The namespace can be obtained by calling the DescribeNamespaceList interface.
    :param _builtins.str order_by: The order by.Valid values:`running`,`instances`.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    :param _builtins.bool reverse: The reverse.
    :param _builtins.str status: The status of the resource. Valid values: `RUNNING`, `STOPPED`,`UNKNOWN`.
    """
    __args__ = dict()
    __args__['appName'] = app_name
    __args__['enableDetails'] = enable_details
    __args__['fieldType'] = field_type
    __args__['fieldValue'] = field_value
    __args__['ids'] = ids
    __args__['namespaceId'] = namespace_id
    __args__['orderBy'] = order_by
    __args__['outputFile'] = output_file
    __args__['reverse'] = reverse
    __args__['status'] = status
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:sae/getApplications:getApplications', __args__, opts=opts, typ=GetApplicationsResult)
    return __ret__.apply(lambda __response__: GetApplicationsResult(
        app_name=pulumi.get(__response__, 'app_name'),
        applications=pulumi.get(__response__, 'applications'),
        enable_details=pulumi.get(__response__, 'enable_details'),
        field_type=pulumi.get(__response__, 'field_type'),
        field_value=pulumi.get(__response__, 'field_value'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        namespace_id=pulumi.get(__response__, 'namespace_id'),
        order_by=pulumi.get(__response__, 'order_by'),
        output_file=pulumi.get(__response__, 'output_file'),
        reverse=pulumi.get(__response__, 'reverse'),
        status=pulumi.get(__response__, 'status')))
