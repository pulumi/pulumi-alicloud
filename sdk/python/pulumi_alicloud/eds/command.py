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

__all__ = ['CommandArgs', 'Command']

@pulumi.input_type
class CommandArgs:
    def __init__(__self__, *,
                 command_content: pulumi.Input[_builtins.str],
                 command_type: pulumi.Input[_builtins.str],
                 desktop_id: pulumi.Input[_builtins.str],
                 content_encoding: Optional[pulumi.Input[_builtins.str]] = None,
                 timeout: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Command resource.
        :param pulumi.Input[_builtins.str] command_content: The Contents of the Script to Base64 Encoded Transmission.
        :param pulumi.Input[_builtins.str] command_type: The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
        :param pulumi.Input[_builtins.str] desktop_id: The desktop id of the Desktop.
        :param pulumi.Input[_builtins.str] content_encoding: That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
        :param pulumi.Input[_builtins.str] timeout: The timeout period for script execution the unit is seconds. Default to: `60`.
        """
        pulumi.set(__self__, "command_content", command_content)
        pulumi.set(__self__, "command_type", command_type)
        pulumi.set(__self__, "desktop_id", desktop_id)
        if content_encoding is not None:
            pulumi.set(__self__, "content_encoding", content_encoding)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)

    @_builtins.property
    @pulumi.getter(name="commandContent")
    def command_content(self) -> pulumi.Input[_builtins.str]:
        """
        The Contents of the Script to Base64 Encoded Transmission.
        """
        return pulumi.get(self, "command_content")

    @command_content.setter
    def command_content(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "command_content", value)

    @_builtins.property
    @pulumi.getter(name="commandType")
    def command_type(self) -> pulumi.Input[_builtins.str]:
        """
        The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
        """
        return pulumi.get(self, "command_type")

    @command_type.setter
    def command_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "command_type", value)

    @_builtins.property
    @pulumi.getter(name="desktopId")
    def desktop_id(self) -> pulumi.Input[_builtins.str]:
        """
        The desktop id of the Desktop.
        """
        return pulumi.get(self, "desktop_id")

    @desktop_id.setter
    def desktop_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "desktop_id", value)

    @_builtins.property
    @pulumi.getter(name="contentEncoding")
    def content_encoding(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
        """
        return pulumi.get(self, "content_encoding")

    @content_encoding.setter
    def content_encoding(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "content_encoding", value)

    @_builtins.property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The timeout period for script execution the unit is seconds. Default to: `60`.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "timeout", value)


@pulumi.input_type
class _CommandState:
    def __init__(__self__, *,
                 command_content: Optional[pulumi.Input[_builtins.str]] = None,
                 command_type: Optional[pulumi.Input[_builtins.str]] = None,
                 content_encoding: Optional[pulumi.Input[_builtins.str]] = None,
                 desktop_id: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None,
                 timeout: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Command resources.
        :param pulumi.Input[_builtins.str] command_content: The Contents of the Script to Base64 Encoded Transmission.
        :param pulumi.Input[_builtins.str] command_type: The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
        :param pulumi.Input[_builtins.str] content_encoding: That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
        :param pulumi.Input[_builtins.str] desktop_id: The desktop id of the Desktop.
        :param pulumi.Input[_builtins.str] status: Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
        :param pulumi.Input[_builtins.str] timeout: The timeout period for script execution the unit is seconds. Default to: `60`.
        """
        if command_content is not None:
            pulumi.set(__self__, "command_content", command_content)
        if command_type is not None:
            pulumi.set(__self__, "command_type", command_type)
        if content_encoding is not None:
            pulumi.set(__self__, "content_encoding", content_encoding)
        if desktop_id is not None:
            pulumi.set(__self__, "desktop_id", desktop_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)

    @_builtins.property
    @pulumi.getter(name="commandContent")
    def command_content(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Contents of the Script to Base64 Encoded Transmission.
        """
        return pulumi.get(self, "command_content")

    @command_content.setter
    def command_content(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "command_content", value)

    @_builtins.property
    @pulumi.getter(name="commandType")
    def command_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
        """
        return pulumi.get(self, "command_type")

    @command_type.setter
    def command_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "command_type", value)

    @_builtins.property
    @pulumi.getter(name="contentEncoding")
    def content_encoding(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
        """
        return pulumi.get(self, "content_encoding")

    @content_encoding.setter
    def content_encoding(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "content_encoding", value)

    @_builtins.property
    @pulumi.getter(name="desktopId")
    def desktop_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The desktop id of the Desktop.
        """
        return pulumi.get(self, "desktop_id")

    @desktop_id.setter
    def desktop_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "desktop_id", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)

    @_builtins.property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The timeout period for script execution the unit is seconds. Default to: `60`.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "timeout", value)


@pulumi.type_token("alicloud:eds/command:Command")
class Command(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 command_content: Optional[pulumi.Input[_builtins.str]] = None,
                 command_type: Optional[pulumi.Input[_builtins.str]] = None,
                 content_encoding: Optional[pulumi.Input[_builtins.str]] = None,
                 desktop_id: Optional[pulumi.Input[_builtins.str]] = None,
                 timeout: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a ECD Command resource.

        For information about ECD Command and how to use it, see [What is Command](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-ecd-2020-09-30-runcommand).

        > **NOTE:** Available since v1.146.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_integer = random.index.Integer("default",
            min=10000,
            max=99999)
        default_simple_office_site = alicloud.eds.SimpleOfficeSite("default",
            cidr_block="172.16.0.0/12",
            enable_admin_access=True,
            desktop_access_type="Internet",
            office_site_name=f"{name}-{default_integer['result']}")
        default_ecd_policy_group = alicloud.eds.EcdPolicyGroup("default",
            policy_group_name=name,
            clipboard="read",
            local_drive="read",
            usb_redirect="off",
            watermark="off",
            authorize_access_policy_rules=[{
                "description": name,
                "cidr_ip": "1.2.3.45/24",
            }],
            authorize_security_policy_rules=[{
                "type": "inflow",
                "policy": "accept",
                "description": name,
                "port_range": "80/80",
                "ip_protocol": "TCP",
                "priority": "1",
                "cidr_ip": "1.2.3.4/24",
            }])
        default = alicloud.eds.get_bundles(bundle_type="SYSTEM",
            bundle_ids=[
                "bundle_eds_enterprise_office_4c8g_s8d2_win2019_edu",
                "bundle_eds_enterprise_office_8c16g_s8d2_win2019_edu",
            ])
        default_desktop = alicloud.eds.Desktop("default",
            office_site_id=default_simple_office_site.id,
            policy_group_id=default_ecd_policy_group.id,
            bundle_id=default.bundles[0].id,
            desktop_name=name)
        default_command = alicloud.eds.Command("default",
            command_content="ipconfig",
            command_type="RunPowerShellScript",
            desktop_id=default_desktop.id)
        ```

        ## Import

        ECD Command can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:eds/command:Command example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] command_content: The Contents of the Script to Base64 Encoded Transmission.
        :param pulumi.Input[_builtins.str] command_type: The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
        :param pulumi.Input[_builtins.str] content_encoding: That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
        :param pulumi.Input[_builtins.str] desktop_id: The desktop id of the Desktop.
        :param pulumi.Input[_builtins.str] timeout: The timeout period for script execution the unit is seconds. Default to: `60`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CommandArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ECD Command resource.

        For information about ECD Command and how to use it, see [What is Command](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-ecd-2020-09-30-runcommand).

        > **NOTE:** Available since v1.146.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_integer = random.index.Integer("default",
            min=10000,
            max=99999)
        default_simple_office_site = alicloud.eds.SimpleOfficeSite("default",
            cidr_block="172.16.0.0/12",
            enable_admin_access=True,
            desktop_access_type="Internet",
            office_site_name=f"{name}-{default_integer['result']}")
        default_ecd_policy_group = alicloud.eds.EcdPolicyGroup("default",
            policy_group_name=name,
            clipboard="read",
            local_drive="read",
            usb_redirect="off",
            watermark="off",
            authorize_access_policy_rules=[{
                "description": name,
                "cidr_ip": "1.2.3.45/24",
            }],
            authorize_security_policy_rules=[{
                "type": "inflow",
                "policy": "accept",
                "description": name,
                "port_range": "80/80",
                "ip_protocol": "TCP",
                "priority": "1",
                "cidr_ip": "1.2.3.4/24",
            }])
        default = alicloud.eds.get_bundles(bundle_type="SYSTEM",
            bundle_ids=[
                "bundle_eds_enterprise_office_4c8g_s8d2_win2019_edu",
                "bundle_eds_enterprise_office_8c16g_s8d2_win2019_edu",
            ])
        default_desktop = alicloud.eds.Desktop("default",
            office_site_id=default_simple_office_site.id,
            policy_group_id=default_ecd_policy_group.id,
            bundle_id=default.bundles[0].id,
            desktop_name=name)
        default_command = alicloud.eds.Command("default",
            command_content="ipconfig",
            command_type="RunPowerShellScript",
            desktop_id=default_desktop.id)
        ```

        ## Import

        ECD Command can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:eds/command:Command example <id>
        ```

        :param str resource_name: The name of the resource.
        :param CommandArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CommandArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 command_content: Optional[pulumi.Input[_builtins.str]] = None,
                 command_type: Optional[pulumi.Input[_builtins.str]] = None,
                 content_encoding: Optional[pulumi.Input[_builtins.str]] = None,
                 desktop_id: Optional[pulumi.Input[_builtins.str]] = None,
                 timeout: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CommandArgs.__new__(CommandArgs)

            if command_content is None and not opts.urn:
                raise TypeError("Missing required property 'command_content'")
            __props__.__dict__["command_content"] = command_content
            if command_type is None and not opts.urn:
                raise TypeError("Missing required property 'command_type'")
            __props__.__dict__["command_type"] = command_type
            __props__.__dict__["content_encoding"] = content_encoding
            if desktop_id is None and not opts.urn:
                raise TypeError("Missing required property 'desktop_id'")
            __props__.__dict__["desktop_id"] = desktop_id
            __props__.__dict__["timeout"] = timeout
            __props__.__dict__["status"] = None
        super(Command, __self__).__init__(
            'alicloud:eds/command:Command',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            command_content: Optional[pulumi.Input[_builtins.str]] = None,
            command_type: Optional[pulumi.Input[_builtins.str]] = None,
            content_encoding: Optional[pulumi.Input[_builtins.str]] = None,
            desktop_id: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None,
            timeout: Optional[pulumi.Input[_builtins.str]] = None) -> 'Command':
        """
        Get an existing Command resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] command_content: The Contents of the Script to Base64 Encoded Transmission.
        :param pulumi.Input[_builtins.str] command_type: The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
        :param pulumi.Input[_builtins.str] content_encoding: That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
        :param pulumi.Input[_builtins.str] desktop_id: The desktop id of the Desktop.
        :param pulumi.Input[_builtins.str] status: Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
        :param pulumi.Input[_builtins.str] timeout: The timeout period for script execution the unit is seconds. Default to: `60`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CommandState.__new__(_CommandState)

        __props__.__dict__["command_content"] = command_content
        __props__.__dict__["command_type"] = command_type
        __props__.__dict__["content_encoding"] = content_encoding
        __props__.__dict__["desktop_id"] = desktop_id
        __props__.__dict__["status"] = status
        __props__.__dict__["timeout"] = timeout
        return Command(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="commandContent")
    def command_content(self) -> pulumi.Output[_builtins.str]:
        """
        The Contents of the Script to Base64 Encoded Transmission.
        """
        return pulumi.get(self, "command_content")

    @_builtins.property
    @pulumi.getter(name="commandType")
    def command_type(self) -> pulumi.Output[_builtins.str]:
        """
        The Script Type. Valid values: `RunBatScript`, `RunPowerShellScript`.
        """
        return pulumi.get(self, "command_type")

    @_builtins.property
    @pulumi.getter(name="contentEncoding")
    def content_encoding(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        That Returns the Data Encoding Method. Valid values: `Base64`, `PlainText`.
        """
        return pulumi.get(self, "content_encoding")

    @_builtins.property
    @pulumi.getter(name="desktopId")
    def desktop_id(self) -> pulumi.Output[_builtins.str]:
        """
        The desktop id of the Desktop.
        """
        return pulumi.get(self, "desktop_id")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        Script Is Executed in the Overall Implementation of the State. Valid values: `Pending`, `Failed`, `PartialFailed`, `Running`, `Stopped`, `Stopping`, `Finished`, `Success`.
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def timeout(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The timeout period for script execution the unit is seconds. Default to: `60`.
        """
        return pulumi.get(self, "timeout")

