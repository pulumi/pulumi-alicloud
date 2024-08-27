# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['V3AliasArgs', 'V3Alias']

@pulumi.input_type
class V3AliasArgs:
    def __init__(__self__, *,
                 function_name: pulumi.Input[str],
                 additional_version_weight: Optional[pulumi.Input[Mapping[str, pulumi.Input[float]]]] = None,
                 alias_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 version_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a V3Alias resource.
        :param pulumi.Input[str] function_name: Function Name
        :param pulumi.Input[Mapping[str, pulumi.Input[float]]] additional_version_weight: Grayscale version
        :param pulumi.Input[str] alias_name: Function Alias
        :param pulumi.Input[str] description: Description
        :param pulumi.Input[str] version_id: The version that the alias points
        """
        pulumi.set(__self__, "function_name", function_name)
        if additional_version_weight is not None:
            pulumi.set(__self__, "additional_version_weight", additional_version_weight)
        if alias_name is not None:
            pulumi.set(__self__, "alias_name", alias_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if version_id is not None:
            pulumi.set(__self__, "version_id", version_id)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> pulumi.Input[str]:
        """
        Function Name
        """
        return pulumi.get(self, "function_name")

    @function_name.setter
    def function_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "function_name", value)

    @property
    @pulumi.getter(name="additionalVersionWeight")
    def additional_version_weight(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[float]]]]:
        """
        Grayscale version
        """
        return pulumi.get(self, "additional_version_weight")

    @additional_version_weight.setter
    def additional_version_weight(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[float]]]]):
        pulumi.set(self, "additional_version_weight", value)

    @property
    @pulumi.getter(name="aliasName")
    def alias_name(self) -> Optional[pulumi.Input[str]]:
        """
        Function Alias
        """
        return pulumi.get(self, "alias_name")

    @alias_name.setter
    def alias_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alias_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="versionId")
    def version_id(self) -> Optional[pulumi.Input[str]]:
        """
        The version that the alias points
        """
        return pulumi.get(self, "version_id")

    @version_id.setter
    def version_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version_id", value)


@pulumi.input_type
class _V3AliasState:
    def __init__(__self__, *,
                 additional_version_weight: Optional[pulumi.Input[Mapping[str, pulumi.Input[float]]]] = None,
                 alias_name: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 version_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering V3Alias resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[float]]] additional_version_weight: Grayscale version
        :param pulumi.Input[str] alias_name: Function Alias
        :param pulumi.Input[str] create_time: The creation time of the resource
        :param pulumi.Input[str] description: Description
        :param pulumi.Input[str] function_name: Function Name
        :param pulumi.Input[str] version_id: The version that the alias points
        """
        if additional_version_weight is not None:
            pulumi.set(__self__, "additional_version_weight", additional_version_weight)
        if alias_name is not None:
            pulumi.set(__self__, "alias_name", alias_name)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if function_name is not None:
            pulumi.set(__self__, "function_name", function_name)
        if version_id is not None:
            pulumi.set(__self__, "version_id", version_id)

    @property
    @pulumi.getter(name="additionalVersionWeight")
    def additional_version_weight(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[float]]]]:
        """
        Grayscale version
        """
        return pulumi.get(self, "additional_version_weight")

    @additional_version_weight.setter
    def additional_version_weight(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[float]]]]):
        pulumi.set(self, "additional_version_weight", value)

    @property
    @pulumi.getter(name="aliasName")
    def alias_name(self) -> Optional[pulumi.Input[str]]:
        """
        Function Alias
        """
        return pulumi.get(self, "alias_name")

    @alias_name.setter
    def alias_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alias_name", value)

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
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> Optional[pulumi.Input[str]]:
        """
        Function Name
        """
        return pulumi.get(self, "function_name")

    @function_name.setter
    def function_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "function_name", value)

    @property
    @pulumi.getter(name="versionId")
    def version_id(self) -> Optional[pulumi.Input[str]]:
        """
        The version that the alias points
        """
        return pulumi.get(self, "version_id")

    @version_id.setter
    def version_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version_id", value)


class V3Alias(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 additional_version_weight: Optional[pulumi.Input[Mapping[str, pulumi.Input[float]]]] = None,
                 alias_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 version_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a FCV3 Alias resource.

        Alias for functions.

        For information about FCV3 Alias and how to use it, see [What is Alias](https://www.alibabacloud.com/help/en/functioncompute/developer-reference/api-fc-2023-03-30-createalias).

        > **NOTE:** Available since v1.228.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        function_name = config.get("functionName")
        if function_name is None:
            function_name = "flask-3xdg"
        default = alicloud.fc.V3Alias("default",
            version_id="1",
            function_name=function_name,
            description="create alias",
            alias_name=name,
            additional_version_weight={
                "2": 0.5,
            })
        ```

        ## Import

        FCV3 Alias can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:fc/v3Alias:V3Alias example <function_name>:<alias_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[float]]] additional_version_weight: Grayscale version
        :param pulumi.Input[str] alias_name: Function Alias
        :param pulumi.Input[str] description: Description
        :param pulumi.Input[str] function_name: Function Name
        :param pulumi.Input[str] version_id: The version that the alias points
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: V3AliasArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a FCV3 Alias resource.

        Alias for functions.

        For information about FCV3 Alias and how to use it, see [What is Alias](https://www.alibabacloud.com/help/en/functioncompute/developer-reference/api-fc-2023-03-30-createalias).

        > **NOTE:** Available since v1.228.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        function_name = config.get("functionName")
        if function_name is None:
            function_name = "flask-3xdg"
        default = alicloud.fc.V3Alias("default",
            version_id="1",
            function_name=function_name,
            description="create alias",
            alias_name=name,
            additional_version_weight={
                "2": 0.5,
            })
        ```

        ## Import

        FCV3 Alias can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:fc/v3Alias:V3Alias example <function_name>:<alias_name>
        ```

        :param str resource_name: The name of the resource.
        :param V3AliasArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(V3AliasArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 additional_version_weight: Optional[pulumi.Input[Mapping[str, pulumi.Input[float]]]] = None,
                 alias_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 version_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = V3AliasArgs.__new__(V3AliasArgs)

            __props__.__dict__["additional_version_weight"] = additional_version_weight
            __props__.__dict__["alias_name"] = alias_name
            __props__.__dict__["description"] = description
            if function_name is None and not opts.urn:
                raise TypeError("Missing required property 'function_name'")
            __props__.__dict__["function_name"] = function_name
            __props__.__dict__["version_id"] = version_id
            __props__.__dict__["create_time"] = None
        super(V3Alias, __self__).__init__(
            'alicloud:fc/v3Alias:V3Alias',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            additional_version_weight: Optional[pulumi.Input[Mapping[str, pulumi.Input[float]]]] = None,
            alias_name: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            function_name: Optional[pulumi.Input[str]] = None,
            version_id: Optional[pulumi.Input[str]] = None) -> 'V3Alias':
        """
        Get an existing V3Alias resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[float]]] additional_version_weight: Grayscale version
        :param pulumi.Input[str] alias_name: Function Alias
        :param pulumi.Input[str] create_time: The creation time of the resource
        :param pulumi.Input[str] description: Description
        :param pulumi.Input[str] function_name: Function Name
        :param pulumi.Input[str] version_id: The version that the alias points
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _V3AliasState.__new__(_V3AliasState)

        __props__.__dict__["additional_version_weight"] = additional_version_weight
        __props__.__dict__["alias_name"] = alias_name
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["function_name"] = function_name
        __props__.__dict__["version_id"] = version_id
        return V3Alias(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="additionalVersionWeight")
    def additional_version_weight(self) -> pulumi.Output[Optional[Mapping[str, float]]]:
        """
        Grayscale version
        """
        return pulumi.get(self, "additional_version_weight")

    @property
    @pulumi.getter(name="aliasName")
    def alias_name(self) -> pulumi.Output[str]:
        """
        Function Alias
        """
        return pulumi.get(self, "alias_name")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The creation time of the resource
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> pulumi.Output[str]:
        """
        Function Name
        """
        return pulumi.get(self, "function_name")

    @property
    @pulumi.getter(name="versionId")
    def version_id(self) -> pulumi.Output[Optional[str]]:
        """
        The version that the alias points
        """
        return pulumi.get(self, "version_id")
