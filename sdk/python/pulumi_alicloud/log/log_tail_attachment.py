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

__all__ = ['LogTailAttachmentArgs', 'LogTailAttachment']

@pulumi.input_type
class LogTailAttachmentArgs:
    def __init__(__self__, *,
                 logtail_config_name: pulumi.Input[_builtins.str],
                 machine_group_name: pulumi.Input[_builtins.str],
                 project: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a LogTailAttachment resource.
        :param pulumi.Input[_builtins.str] logtail_config_name: The Logtail configuration name, which is unique in the same project.
        :param pulumi.Input[_builtins.str] machine_group_name: The machine group name, which is unique in the same project.
        :param pulumi.Input[_builtins.str] project: The project name to the log store belongs.
        """
        pulumi.set(__self__, "logtail_config_name", logtail_config_name)
        pulumi.set(__self__, "machine_group_name", machine_group_name)
        pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="logtailConfigName")
    def logtail_config_name(self) -> pulumi.Input[_builtins.str]:
        """
        The Logtail configuration name, which is unique in the same project.
        """
        return pulumi.get(self, "logtail_config_name")

    @logtail_config_name.setter
    def logtail_config_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "logtail_config_name", value)

    @_builtins.property
    @pulumi.getter(name="machineGroupName")
    def machine_group_name(self) -> pulumi.Input[_builtins.str]:
        """
        The machine group name, which is unique in the same project.
        """
        return pulumi.get(self, "machine_group_name")

    @machine_group_name.setter
    def machine_group_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "machine_group_name", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Input[_builtins.str]:
        """
        The project name to the log store belongs.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "project", value)


@pulumi.input_type
class _LogTailAttachmentState:
    def __init__(__self__, *,
                 logtail_config_name: Optional[pulumi.Input[_builtins.str]] = None,
                 machine_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering LogTailAttachment resources.
        :param pulumi.Input[_builtins.str] logtail_config_name: The Logtail configuration name, which is unique in the same project.
        :param pulumi.Input[_builtins.str] machine_group_name: The machine group name, which is unique in the same project.
        :param pulumi.Input[_builtins.str] project: The project name to the log store belongs.
        """
        if logtail_config_name is not None:
            pulumi.set(__self__, "logtail_config_name", logtail_config_name)
        if machine_group_name is not None:
            pulumi.set(__self__, "machine_group_name", machine_group_name)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @_builtins.property
    @pulumi.getter(name="logtailConfigName")
    def logtail_config_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Logtail configuration name, which is unique in the same project.
        """
        return pulumi.get(self, "logtail_config_name")

    @logtail_config_name.setter
    def logtail_config_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "logtail_config_name", value)

    @_builtins.property
    @pulumi.getter(name="machineGroupName")
    def machine_group_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The machine group name, which is unique in the same project.
        """
        return pulumi.get(self, "machine_group_name")

    @machine_group_name.setter
    def machine_group_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "machine_group_name", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The project name to the log store belongs.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)


@pulumi.type_token("alicloud:log/logTailAttachment:LogTailAttachment")
class LogTailAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 logtail_config_name: Optional[pulumi.Input[_builtins.str]] = None,
                 machine_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        The Logtail access service is a log collection agent provided by Log Service.
        You can use Logtail to collect logs from servers such as Alibaba Cloud Elastic
        Compute Service (ECS) instances in real time in the Log Service console. [Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm)

        This resource amis to attach one logtail configure to a machine group.

        > **NOTE:** One logtail configure can be attached to multiple machine groups and one machine group can attach several logtail configures.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        default = random.index.Integer("default",
            max=99999,
            min=10000)
        example = alicloud.log.Project("example",
            project_name=f"terraform-example-{default['result']}",
            description="terraform-example")
        example_store = alicloud.log.Store("example",
            project_name=example.project_name,
            logstore_name="example-store",
            retention_period=3650,
            shard_count=3,
            auto_split=True,
            max_split_shard_count=60,
            append_meta=True)
        example_log_tail_config = alicloud.log.LogTailConfig("example",
            project=example.project_name,
            logstore=example_store.logstore_name,
            input_type="file",
            name="terraform-example",
            output_type="LogService",
            input_detail=\"\"\"  \\x09{
        \\x09\\x09"logPath": "/logPath",
        \\x09\\x09"filePattern": "access.log",
        \\x09\\x09"logType": "json_log",
        \\x09\\x09"topicFormat": "default",
        \\x09\\x09"discardUnmatch": false,
        \\x09\\x09"enableRawLog": true,
        \\x09\\x09"fileEncoding": "gbk",
        \\x09\\x09"maxDepth": 10
        \\x09}
        \"\"\")
        example_machine_group = alicloud.log.MachineGroup("example",
            project=example.project_name,
            name="terraform-example",
            identify_type="ip",
            topic="terraform",
            identify_lists=[
                "10.0.0.1",
                "10.0.0.2",
            ])
        example_log_tail_attachment = alicloud.log.LogTailAttachment("example",
            project=example.project_name,
            logtail_config_name=example_log_tail_config.name,
            machine_group_name=example_machine_group.name)
        ```

        ## Import

        Logtial to machine group can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:log/logTailAttachment:LogTailAttachment example tf-log:tf-log-config:tf-log-machine-group
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] logtail_config_name: The Logtail configuration name, which is unique in the same project.
        :param pulumi.Input[_builtins.str] machine_group_name: The machine group name, which is unique in the same project.
        :param pulumi.Input[_builtins.str] project: The project name to the log store belongs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LogTailAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The Logtail access service is a log collection agent provided by Log Service.
        You can use Logtail to collect logs from servers such as Alibaba Cloud Elastic
        Compute Service (ECS) instances in real time in the Log Service console. [Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm)

        This resource amis to attach one logtail configure to a machine group.

        > **NOTE:** One logtail configure can be attached to multiple machine groups and one machine group can attach several logtail configures.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        default = random.index.Integer("default",
            max=99999,
            min=10000)
        example = alicloud.log.Project("example",
            project_name=f"terraform-example-{default['result']}",
            description="terraform-example")
        example_store = alicloud.log.Store("example",
            project_name=example.project_name,
            logstore_name="example-store",
            retention_period=3650,
            shard_count=3,
            auto_split=True,
            max_split_shard_count=60,
            append_meta=True)
        example_log_tail_config = alicloud.log.LogTailConfig("example",
            project=example.project_name,
            logstore=example_store.logstore_name,
            input_type="file",
            name="terraform-example",
            output_type="LogService",
            input_detail=\"\"\"  \\x09{
        \\x09\\x09"logPath": "/logPath",
        \\x09\\x09"filePattern": "access.log",
        \\x09\\x09"logType": "json_log",
        \\x09\\x09"topicFormat": "default",
        \\x09\\x09"discardUnmatch": false,
        \\x09\\x09"enableRawLog": true,
        \\x09\\x09"fileEncoding": "gbk",
        \\x09\\x09"maxDepth": 10
        \\x09}
        \"\"\")
        example_machine_group = alicloud.log.MachineGroup("example",
            project=example.project_name,
            name="terraform-example",
            identify_type="ip",
            topic="terraform",
            identify_lists=[
                "10.0.0.1",
                "10.0.0.2",
            ])
        example_log_tail_attachment = alicloud.log.LogTailAttachment("example",
            project=example.project_name,
            logtail_config_name=example_log_tail_config.name,
            machine_group_name=example_machine_group.name)
        ```

        ## Import

        Logtial to machine group can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:log/logTailAttachment:LogTailAttachment example tf-log:tf-log-config:tf-log-machine-group
        ```

        :param str resource_name: The name of the resource.
        :param LogTailAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LogTailAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 logtail_config_name: Optional[pulumi.Input[_builtins.str]] = None,
                 machine_group_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LogTailAttachmentArgs.__new__(LogTailAttachmentArgs)

            if logtail_config_name is None and not opts.urn:
                raise TypeError("Missing required property 'logtail_config_name'")
            __props__.__dict__["logtail_config_name"] = logtail_config_name
            if machine_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'machine_group_name'")
            __props__.__dict__["machine_group_name"] = machine_group_name
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
        super(LogTailAttachment, __self__).__init__(
            'alicloud:log/logTailAttachment:LogTailAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            logtail_config_name: Optional[pulumi.Input[_builtins.str]] = None,
            machine_group_name: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None) -> 'LogTailAttachment':
        """
        Get an existing LogTailAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] logtail_config_name: The Logtail configuration name, which is unique in the same project.
        :param pulumi.Input[_builtins.str] machine_group_name: The machine group name, which is unique in the same project.
        :param pulumi.Input[_builtins.str] project: The project name to the log store belongs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LogTailAttachmentState.__new__(_LogTailAttachmentState)

        __props__.__dict__["logtail_config_name"] = logtail_config_name
        __props__.__dict__["machine_group_name"] = machine_group_name
        __props__.__dict__["project"] = project
        return LogTailAttachment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="logtailConfigName")
    def logtail_config_name(self) -> pulumi.Output[_builtins.str]:
        """
        The Logtail configuration name, which is unique in the same project.
        """
        return pulumi.get(self, "logtail_config_name")

    @_builtins.property
    @pulumi.getter(name="machineGroupName")
    def machine_group_name(self) -> pulumi.Output[_builtins.str]:
        """
        The machine group name, which is unique in the same project.
        """
        return pulumi.get(self, "machine_group_name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The project name to the log store belongs.
        """
        return pulumi.get(self, "project")

