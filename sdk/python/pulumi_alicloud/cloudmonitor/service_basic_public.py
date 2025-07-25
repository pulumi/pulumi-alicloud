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

__all__ = ['ServiceBasicPublicArgs', 'ServiceBasicPublic']

@pulumi.input_type
class ServiceBasicPublicArgs:
    def __init__(__self__):
        """
        The set of arguments for constructing a ServiceBasicPublic resource.
        """
        pass


@pulumi.input_type
class _ServiceBasicPublicState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ServiceBasicPublic resources.
        :param pulumi.Input[_builtins.str] create_time: The creation time of the resource.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)


@pulumi.type_token("alicloud:cloudmonitor/serviceBasicPublic:ServiceBasicPublic")
class ServiceBasicPublic(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 __props__=None):
        """
        Provides a Cloud Monitor Service Basic Public resource.

        For information about Cloud Monitor Service Basic Public and how to use it, see [What is Basic Public](https://www.alibabacloud.com/help/en/cms/product-overview/what-is-cloudmonitor).

        > **NOTE:** Available since v1.215.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.cloudmonitor.ServiceBasicPublic("default")
        ```

        ## Import

        Cloud Monitor Service Basic Public can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cloudmonitor/serviceBasicPublic:ServiceBasicPublic example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ServiceBasicPublicArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Monitor Service Basic Public resource.

        For information about Cloud Monitor Service Basic Public and how to use it, see [What is Basic Public](https://www.alibabacloud.com/help/en/cms/product-overview/what-is-cloudmonitor).

        > **NOTE:** Available since v1.215.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.cloudmonitor.ServiceBasicPublic("default")
        ```

        ## Import

        Cloud Monitor Service Basic Public can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cloudmonitor/serviceBasicPublic:ServiceBasicPublic example <id>
        ```

        :param str resource_name: The name of the resource.
        :param ServiceBasicPublicArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceBasicPublicArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceBasicPublicArgs.__new__(ServiceBasicPublicArgs)

            __props__.__dict__["create_time"] = None
        super(ServiceBasicPublic, __self__).__init__(
            'alicloud:cloudmonitor/serviceBasicPublic:ServiceBasicPublic',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None) -> 'ServiceBasicPublic':
        """
        Get an existing ServiceBasicPublic resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] create_time: The creation time of the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceBasicPublicState.__new__(_ServiceBasicPublicState)

        __props__.__dict__["create_time"] = create_time
        return ServiceBasicPublic(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

