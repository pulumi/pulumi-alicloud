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

__all__ = ['ResourceRecordArgs', 'ResourceRecord']

@pulumi.input_type
class ResourceRecordArgs:
    def __init__(__self__, *,
                 record_id: pulumi.Input[_builtins.str],
                 resource_name: pulumi.Input[_builtins.str],
                 tag: pulumi.Input[_builtins.str],
                 value: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a ResourceRecord resource.
        :param pulumi.Input[_builtins.str] record_id: The record's id, should be unique.
        :param pulumi.Input[_builtins.str] resource_name: The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        :param pulumi.Input[_builtins.str] tag: The record's tag, can be used for search.
        :param pulumi.Input[_builtins.str] value: The json value of record. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        """
        pulumi.set(__self__, "record_id", record_id)
        pulumi.set(__self__, "resource_name", resource_name)
        pulumi.set(__self__, "tag", tag)
        pulumi.set(__self__, "value", value)

    @_builtins.property
    @pulumi.getter(name="recordId")
    def record_id(self) -> pulumi.Input[_builtins.str]:
        """
        The record's id, should be unique.
        """
        return pulumi.get(self, "record_id")

    @record_id.setter
    def record_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "record_id", value)

    @_builtins.property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "resource_name", value)

    @_builtins.property
    @pulumi.getter
    def tag(self) -> pulumi.Input[_builtins.str]:
        """
        The record's tag, can be used for search.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "tag", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Input[_builtins.str]:
        """
        The json value of record. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class _ResourceRecordState:
    def __init__(__self__, *,
                 record_id: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_name: Optional[pulumi.Input[_builtins.str]] = None,
                 tag: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ResourceRecord resources.
        :param pulumi.Input[_builtins.str] record_id: The record's id, should be unique.
        :param pulumi.Input[_builtins.str] resource_name: The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        :param pulumi.Input[_builtins.str] tag: The record's tag, can be used for search.
        :param pulumi.Input[_builtins.str] value: The json value of record. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        """
        if record_id is not None:
            pulumi.set(__self__, "record_id", record_id)
        if resource_name is not None:
            pulumi.set(__self__, "resource_name", resource_name)
        if tag is not None:
            pulumi.set(__self__, "tag", tag)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @_builtins.property
    @pulumi.getter(name="recordId")
    def record_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The record's id, should be unique.
        """
        return pulumi.get(self, "record_id")

    @record_id.setter
    def record_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "record_id", value)

    @_builtins.property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "resource_name", value)

    @_builtins.property
    @pulumi.getter
    def tag(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The record's tag, can be used for search.
        """
        return pulumi.get(self, "tag")

    @tag.setter
    def tag(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tag", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The json value of record. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "value", value)


@pulumi.type_token("alicloud:log/resourceRecord:ResourceRecord")
class ResourceRecord(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 record_id: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_name_: Optional[pulumi.Input[_builtins.str]] = None,
                 tag: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Log resource is a meta store service provided by log service, resource can be used to define meta store's table structure, record can be used for table's row data.

        For information about SLS Resource and how to use it, see [Resource management](https://www.alibabacloud.com/help/en/doc-detail/207732.html)

        > **NOTE:** Available since v1.162.0. log resource region should be set a main region: cn-heyuan.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.log.Resource("example",
            type="userdefine",
            name="user.tf.resource",
            description="user tf resource desc",
            ext_info="{}",
            schema=\"\"\"    {
              "schema": [
                {
                  "column": "col1",
                  "desc": "col1   desc",
                  "ext_info": {
                  },
                  "required": true,
                  "type": "string"
                },
                {
                  "column": "col2",
                  "desc": "col2   desc",
                  "ext_info": "optional",
                  "required": true,
                  "type": "string"
                }
              ]
            }
        \"\"\")
        example_resource_record = alicloud.log.ResourceRecord("example",
            resource_name_=example.id,
            record_id="tf_user_example",
            tag="tf example",
            value=\"\"\"{
          "user_name": "tf example",
          "sms_enabled": true,
          "phone": "18888888889",
          "voice_enabled": false,
          "email": [
            "test@qq.com"
          ],
          "enabled": true,
          "user_id": "tf_user",
          "country_code": "86"
        }
        \"\"\")
        ```

        ## Import

        Log resource record can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:log/resourceRecord:ResourceRecord example <resource_name>:<record_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] record_id: The record's id, should be unique.
        :param pulumi.Input[_builtins.str] resource_name_: The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        :param pulumi.Input[_builtins.str] tag: The record's tag, can be used for search.
        :param pulumi.Input[_builtins.str] value: The json value of record. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResourceRecordArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Log resource is a meta store service provided by log service, resource can be used to define meta store's table structure, record can be used for table's row data.

        For information about SLS Resource and how to use it, see [Resource management](https://www.alibabacloud.com/help/en/doc-detail/207732.html)

        > **NOTE:** Available since v1.162.0. log resource region should be set a main region: cn-heyuan.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.log.Resource("example",
            type="userdefine",
            name="user.tf.resource",
            description="user tf resource desc",
            ext_info="{}",
            schema=\"\"\"    {
              "schema": [
                {
                  "column": "col1",
                  "desc": "col1   desc",
                  "ext_info": {
                  },
                  "required": true,
                  "type": "string"
                },
                {
                  "column": "col2",
                  "desc": "col2   desc",
                  "ext_info": "optional",
                  "required": true,
                  "type": "string"
                }
              ]
            }
        \"\"\")
        example_resource_record = alicloud.log.ResourceRecord("example",
            resource_name_=example.id,
            record_id="tf_user_example",
            tag="tf example",
            value=\"\"\"{
          "user_name": "tf example",
          "sms_enabled": true,
          "phone": "18888888889",
          "voice_enabled": false,
          "email": [
            "test@qq.com"
          ],
          "enabled": true,
          "user_id": "tf_user",
          "country_code": "86"
        }
        \"\"\")
        ```

        ## Import

        Log resource record can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:log/resourceRecord:ResourceRecord example <resource_name>:<record_id>
        ```

        :param str resource_name: The name of the resource.
        :param ResourceRecordArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResourceRecordArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 record_id: Optional[pulumi.Input[_builtins.str]] = None,
                 resource_name_: Optional[pulumi.Input[_builtins.str]] = None,
                 tag: Optional[pulumi.Input[_builtins.str]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResourceRecordArgs.__new__(ResourceRecordArgs)

            if record_id is None and not opts.urn:
                raise TypeError("Missing required property 'record_id'")
            __props__.__dict__["record_id"] = record_id
            if resource_name_ is None and not opts.urn:
                raise TypeError("Missing required property 'resource_name_'")
            __props__.__dict__["resource_name"] = resource_name_
            if tag is None and not opts.urn:
                raise TypeError("Missing required property 'tag'")
            __props__.__dict__["tag"] = tag
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = value
        super(ResourceRecord, __self__).__init__(
            'alicloud:log/resourceRecord:ResourceRecord',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            record_id: Optional[pulumi.Input[_builtins.str]] = None,
            resource_name_: Optional[pulumi.Input[_builtins.str]] = None,
            tag: Optional[pulumi.Input[_builtins.str]] = None,
            value: Optional[pulumi.Input[_builtins.str]] = None) -> 'ResourceRecord':
        """
        Get an existing ResourceRecord resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] record_id: The record's id, should be unique.
        :param pulumi.Input[_builtins.str] resource_name_: The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        :param pulumi.Input[_builtins.str] tag: The record's tag, can be used for search.
        :param pulumi.Input[_builtins.str] value: The json value of record. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResourceRecordState.__new__(_ResourceRecordState)

        __props__.__dict__["record_id"] = record_id
        __props__.__dict__["resource_name"] = resource_name_
        __props__.__dict__["tag"] = tag
        __props__.__dict__["value"] = value
        return ResourceRecord(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="recordId")
    def record_id(self) -> pulumi.Output[_builtins.str]:
        """
        The record's id, should be unique.
        """
        return pulumi.get(self, "record_id")

    @_builtins.property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        """
        return pulumi.get(self, "resource_name")

    @_builtins.property
    @pulumi.getter
    def tag(self) -> pulumi.Output[_builtins.str]:
        """
        The record's tag, can be used for search.
        """
        return pulumi.get(self, "tag")

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Output[_builtins.str]:
        """
        The json value of record. More detail see [Resource Data Structure](https://www.alibabacloud.com/help/en/sls/developer-reference/data-structure-of-alert-resource-data).
        """
        return pulumi.get(self, "value")

