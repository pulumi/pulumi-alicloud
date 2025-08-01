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

__all__ = ['ImageEventOperationArgs', 'ImageEventOperation']

@pulumi.input_type
class ImageEventOperationArgs:
    def __init__(__self__, *,
                 conditions: Optional[pulumi.Input[_builtins.str]] = None,
                 event_key: Optional[pulumi.Input[_builtins.str]] = None,
                 event_name: Optional[pulumi.Input[_builtins.str]] = None,
                 event_type: Optional[pulumi.Input[_builtins.str]] = None,
                 operation_code: Optional[pulumi.Input[_builtins.str]] = None,
                 scenarios: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ImageEventOperation resource.
        :param pulumi.Input[_builtins.str] conditions: Event Conditions.
        :param pulumi.Input[_builtins.str] event_key: Image Event Key.
        :param pulumi.Input[_builtins.str] event_name: Image Event Name.
        :param pulumi.Input[_builtins.str] event_type: Image Event Type.
        :param pulumi.Input[_builtins.str] operation_code: Event Operation Code.
        :param pulumi.Input[_builtins.str] scenarios: Event Scenarios.
        """
        if conditions is not None:
            pulumi.set(__self__, "conditions", conditions)
        if event_key is not None:
            pulumi.set(__self__, "event_key", event_key)
        if event_name is not None:
            pulumi.set(__self__, "event_name", event_name)
        if event_type is not None:
            pulumi.set(__self__, "event_type", event_type)
        if operation_code is not None:
            pulumi.set(__self__, "operation_code", operation_code)
        if scenarios is not None:
            pulumi.set(__self__, "scenarios", scenarios)

    @_builtins.property
    @pulumi.getter
    def conditions(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Event Conditions.
        """
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "conditions", value)

    @_builtins.property
    @pulumi.getter(name="eventKey")
    def event_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Image Event Key.
        """
        return pulumi.get(self, "event_key")

    @event_key.setter
    def event_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "event_key", value)

    @_builtins.property
    @pulumi.getter(name="eventName")
    def event_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Image Event Name.
        """
        return pulumi.get(self, "event_name")

    @event_name.setter
    def event_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "event_name", value)

    @_builtins.property
    @pulumi.getter(name="eventType")
    def event_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Image Event Type.
        """
        return pulumi.get(self, "event_type")

    @event_type.setter
    def event_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "event_type", value)

    @_builtins.property
    @pulumi.getter(name="operationCode")
    def operation_code(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Event Operation Code.
        """
        return pulumi.get(self, "operation_code")

    @operation_code.setter
    def operation_code(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "operation_code", value)

    @_builtins.property
    @pulumi.getter
    def scenarios(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Event Scenarios.
        """
        return pulumi.get(self, "scenarios")

    @scenarios.setter
    def scenarios(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scenarios", value)


@pulumi.input_type
class _ImageEventOperationState:
    def __init__(__self__, *,
                 conditions: Optional[pulumi.Input[_builtins.str]] = None,
                 event_key: Optional[pulumi.Input[_builtins.str]] = None,
                 event_name: Optional[pulumi.Input[_builtins.str]] = None,
                 event_type: Optional[pulumi.Input[_builtins.str]] = None,
                 operation_code: Optional[pulumi.Input[_builtins.str]] = None,
                 scenarios: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ImageEventOperation resources.
        :param pulumi.Input[_builtins.str] conditions: Event Conditions.
        :param pulumi.Input[_builtins.str] event_key: Image Event Key.
        :param pulumi.Input[_builtins.str] event_name: Image Event Name.
        :param pulumi.Input[_builtins.str] event_type: Image Event Type.
        :param pulumi.Input[_builtins.str] operation_code: Event Operation Code.
        :param pulumi.Input[_builtins.str] scenarios: Event Scenarios.
        """
        if conditions is not None:
            pulumi.set(__self__, "conditions", conditions)
        if event_key is not None:
            pulumi.set(__self__, "event_key", event_key)
        if event_name is not None:
            pulumi.set(__self__, "event_name", event_name)
        if event_type is not None:
            pulumi.set(__self__, "event_type", event_type)
        if operation_code is not None:
            pulumi.set(__self__, "operation_code", operation_code)
        if scenarios is not None:
            pulumi.set(__self__, "scenarios", scenarios)

    @_builtins.property
    @pulumi.getter
    def conditions(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Event Conditions.
        """
        return pulumi.get(self, "conditions")

    @conditions.setter
    def conditions(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "conditions", value)

    @_builtins.property
    @pulumi.getter(name="eventKey")
    def event_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Image Event Key.
        """
        return pulumi.get(self, "event_key")

    @event_key.setter
    def event_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "event_key", value)

    @_builtins.property
    @pulumi.getter(name="eventName")
    def event_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Image Event Name.
        """
        return pulumi.get(self, "event_name")

    @event_name.setter
    def event_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "event_name", value)

    @_builtins.property
    @pulumi.getter(name="eventType")
    def event_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Image Event Type.
        """
        return pulumi.get(self, "event_type")

    @event_type.setter
    def event_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "event_type", value)

    @_builtins.property
    @pulumi.getter(name="operationCode")
    def operation_code(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Event Operation Code.
        """
        return pulumi.get(self, "operation_code")

    @operation_code.setter
    def operation_code(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "operation_code", value)

    @_builtins.property
    @pulumi.getter
    def scenarios(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Event Scenarios.
        """
        return pulumi.get(self, "scenarios")

    @scenarios.setter
    def scenarios(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "scenarios", value)


@pulumi.type_token("alicloud:threatdetection/imageEventOperation:ImageEventOperation")
class ImageEventOperation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 conditions: Optional[pulumi.Input[_builtins.str]] = None,
                 event_key: Optional[pulumi.Input[_builtins.str]] = None,
                 event_name: Optional[pulumi.Input[_builtins.str]] = None,
                 event_type: Optional[pulumi.Input[_builtins.str]] = None,
                 operation_code: Optional[pulumi.Input[_builtins.str]] = None,
                 scenarios: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Threat Detection Image Event Operation resource. Image Event Operation.

        For information about Threat Detection Image Event Operation and how to use it, see [What is Image Event Operation](https://www.alibabacloud.com/help/zh/security-center/developer-reference/api-sas-2018-12-03-addimageeventoperation).

        > **NOTE:** Available since v1.212.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.threatdetection.ImageEventOperation("default",
            event_type="maliciousFile",
            operation_code="whitelist",
            event_key="alibabacloud_ak",
            scenarios=\"\"\"{
          "type":"default",
          "value":""
        }
        \"\"\",
            event_name="阿里云AK",
            conditions=\"\"\"[
          {
              "condition":"MD5",
              "type":"equals",
              "value":"0083a31cc0083a31ccf7c10367a6e783e"
          }
        ]
        \"\"\")
        ```

        ## Import

        Threat Detection Image Event Operation can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:threatdetection/imageEventOperation:ImageEventOperation example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] conditions: Event Conditions.
        :param pulumi.Input[_builtins.str] event_key: Image Event Key.
        :param pulumi.Input[_builtins.str] event_name: Image Event Name.
        :param pulumi.Input[_builtins.str] event_type: Image Event Type.
        :param pulumi.Input[_builtins.str] operation_code: Event Operation Code.
        :param pulumi.Input[_builtins.str] scenarios: Event Scenarios.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ImageEventOperationArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Threat Detection Image Event Operation resource. Image Event Operation.

        For information about Threat Detection Image Event Operation and how to use it, see [What is Image Event Operation](https://www.alibabacloud.com/help/zh/security-center/developer-reference/api-sas-2018-12-03-addimageeventoperation).

        > **NOTE:** Available since v1.212.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default = alicloud.threatdetection.ImageEventOperation("default",
            event_type="maliciousFile",
            operation_code="whitelist",
            event_key="alibabacloud_ak",
            scenarios=\"\"\"{
          "type":"default",
          "value":""
        }
        \"\"\",
            event_name="阿里云AK",
            conditions=\"\"\"[
          {
              "condition":"MD5",
              "type":"equals",
              "value":"0083a31cc0083a31ccf7c10367a6e783e"
          }
        ]
        \"\"\")
        ```

        ## Import

        Threat Detection Image Event Operation can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:threatdetection/imageEventOperation:ImageEventOperation example <id>
        ```

        :param str resource_name: The name of the resource.
        :param ImageEventOperationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ImageEventOperationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 conditions: Optional[pulumi.Input[_builtins.str]] = None,
                 event_key: Optional[pulumi.Input[_builtins.str]] = None,
                 event_name: Optional[pulumi.Input[_builtins.str]] = None,
                 event_type: Optional[pulumi.Input[_builtins.str]] = None,
                 operation_code: Optional[pulumi.Input[_builtins.str]] = None,
                 scenarios: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ImageEventOperationArgs.__new__(ImageEventOperationArgs)

            __props__.__dict__["conditions"] = conditions
            __props__.__dict__["event_key"] = event_key
            __props__.__dict__["event_name"] = event_name
            __props__.__dict__["event_type"] = event_type
            __props__.__dict__["operation_code"] = operation_code
            __props__.__dict__["scenarios"] = scenarios
        super(ImageEventOperation, __self__).__init__(
            'alicloud:threatdetection/imageEventOperation:ImageEventOperation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            conditions: Optional[pulumi.Input[_builtins.str]] = None,
            event_key: Optional[pulumi.Input[_builtins.str]] = None,
            event_name: Optional[pulumi.Input[_builtins.str]] = None,
            event_type: Optional[pulumi.Input[_builtins.str]] = None,
            operation_code: Optional[pulumi.Input[_builtins.str]] = None,
            scenarios: Optional[pulumi.Input[_builtins.str]] = None) -> 'ImageEventOperation':
        """
        Get an existing ImageEventOperation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] conditions: Event Conditions.
        :param pulumi.Input[_builtins.str] event_key: Image Event Key.
        :param pulumi.Input[_builtins.str] event_name: Image Event Name.
        :param pulumi.Input[_builtins.str] event_type: Image Event Type.
        :param pulumi.Input[_builtins.str] operation_code: Event Operation Code.
        :param pulumi.Input[_builtins.str] scenarios: Event Scenarios.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ImageEventOperationState.__new__(_ImageEventOperationState)

        __props__.__dict__["conditions"] = conditions
        __props__.__dict__["event_key"] = event_key
        __props__.__dict__["event_name"] = event_name
        __props__.__dict__["event_type"] = event_type
        __props__.__dict__["operation_code"] = operation_code
        __props__.__dict__["scenarios"] = scenarios
        return ImageEventOperation(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def conditions(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Event Conditions.
        """
        return pulumi.get(self, "conditions")

    @_builtins.property
    @pulumi.getter(name="eventKey")
    def event_key(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Image Event Key.
        """
        return pulumi.get(self, "event_key")

    @_builtins.property
    @pulumi.getter(name="eventName")
    def event_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Image Event Name.
        """
        return pulumi.get(self, "event_name")

    @_builtins.property
    @pulumi.getter(name="eventType")
    def event_type(self) -> pulumi.Output[_builtins.str]:
        """
        Image Event Type.
        """
        return pulumi.get(self, "event_type")

    @_builtins.property
    @pulumi.getter(name="operationCode")
    def operation_code(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Event Operation Code.
        """
        return pulumi.get(self, "operation_code")

    @_builtins.property
    @pulumi.getter
    def scenarios(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Event Scenarios.
        """
        return pulumi.get(self, "scenarios")

