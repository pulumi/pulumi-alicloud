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
from ._inputs import *

__all__ = ['OssExportSinkArgs', 'OssExportSink']

@pulumi.input_type
class OssExportSinkArgs:
    def __init__(__self__, *,
                 configuration: pulumi.Input['OssExportSinkConfigurationArgs'],
                 display_name: pulumi.Input[_builtins.str],
                 job_name: pulumi.Input[_builtins.str],
                 project: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a OssExportSink resource.
        :param pulumi.Input['OssExportSinkConfigurationArgs'] configuration: OSSExportConfiguration See `configuration` below.
        :param pulumi.Input[_builtins.str] display_name: The display name of the job.
        :param pulumi.Input[_builtins.str] job_name: The unique identifier of the OSS data shipping job.
        :param pulumi.Input[_builtins.str] project: The name of the project.
        :param pulumi.Input[_builtins.str] description: The description of the job.
        """
        pulumi.set(__self__, "configuration", configuration)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "job_name", job_name)
        pulumi.set(__self__, "project", project)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @_builtins.property
    @pulumi.getter
    def configuration(self) -> pulumi.Input['OssExportSinkConfigurationArgs']:
        """
        OSSExportConfiguration See `configuration` below.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: pulumi.Input['OssExportSinkConfigurationArgs']):
        pulumi.set(self, "configuration", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[_builtins.str]:
        """
        The display name of the job.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter(name="jobName")
    def job_name(self) -> pulumi.Input[_builtins.str]:
        """
        The unique identifier of the OSS data shipping job.
        """
        return pulumi.get(self, "job_name")

    @job_name.setter
    def job_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "job_name", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the project.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the job.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _OssExportSinkState:
    def __init__(__self__, *,
                 configuration: Optional[pulumi.Input['OssExportSinkConfigurationArgs']] = None,
                 create_time: Optional[pulumi.Input[_builtins.int]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 job_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 status: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering OssExportSink resources.
        :param pulumi.Input['OssExportSinkConfigurationArgs'] configuration: OSSExportConfiguration See `configuration` below.
        :param pulumi.Input[_builtins.int] create_time: Creation time. Example value: 1718787534
        :param pulumi.Input[_builtins.str] description: The description of the job.
        :param pulumi.Input[_builtins.str] display_name: The display name of the job.
        :param pulumi.Input[_builtins.str] job_name: The unique identifier of the OSS data shipping job.
        :param pulumi.Input[_builtins.str] project: The name of the project.
        :param pulumi.Input[_builtins.str] status: The status of the post task. Example value: RUNNING
        """
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if job_name is not None:
            pulumi.set(__self__, "job_name", job_name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @_builtins.property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input['OssExportSinkConfigurationArgs']]:
        """
        OSSExportConfiguration See `configuration` below.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input['OssExportSinkConfigurationArgs']]):
        pulumi.set(self, "configuration", value)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Creation time. Example value: 1718787534
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the job.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The display name of the job.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "display_name", value)

    @_builtins.property
    @pulumi.getter(name="jobName")
    def job_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The unique identifier of the OSS data shipping job.
        """
        return pulumi.get(self, "job_name")

    @job_name.setter
    def job_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "job_name", value)

    @_builtins.property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the project.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "project", value)

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The status of the post task. Example value: RUNNING
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.type_token("alicloud:sls/ossExportSink:OssExportSink")
class OssExportSink(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration: Optional[pulumi.Input[Union['OssExportSinkConfigurationArgs', 'OssExportSinkConfigurationArgsDict']]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 job_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Log Service (SLS) Oss Export Sink resource.

        OSS export task.

        For information about Log Service (SLS) Oss Export Sink and how to use it, see [What is Oss Export Sink](https://www.alibabacloud.com/help/en/sls/developer-reference/api-sls-2020-12-30-createossexport).

        > **NOTE:** Available since v1.237.0.

        ## Import

        Log Service (SLS) Oss Export Sink can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:sls/ossExportSink:OssExportSink example <project>:<job_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['OssExportSinkConfigurationArgs', 'OssExportSinkConfigurationArgsDict']] configuration: OSSExportConfiguration See `configuration` below.
        :param pulumi.Input[_builtins.str] description: The description of the job.
        :param pulumi.Input[_builtins.str] display_name: The display name of the job.
        :param pulumi.Input[_builtins.str] job_name: The unique identifier of the OSS data shipping job.
        :param pulumi.Input[_builtins.str] project: The name of the project.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OssExportSinkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Log Service (SLS) Oss Export Sink resource.

        OSS export task.

        For information about Log Service (SLS) Oss Export Sink and how to use it, see [What is Oss Export Sink](https://www.alibabacloud.com/help/en/sls/developer-reference/api-sls-2020-12-30-createossexport).

        > **NOTE:** Available since v1.237.0.

        ## Import

        Log Service (SLS) Oss Export Sink can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:sls/ossExportSink:OssExportSink example <project>:<job_name>
        ```

        :param str resource_name: The name of the resource.
        :param OssExportSinkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OssExportSinkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration: Optional[pulumi.Input[Union['OssExportSinkConfigurationArgs', 'OssExportSinkConfigurationArgsDict']]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 display_name: Optional[pulumi.Input[_builtins.str]] = None,
                 job_name: Optional[pulumi.Input[_builtins.str]] = None,
                 project: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OssExportSinkArgs.__new__(OssExportSinkArgs)

            if configuration is None and not opts.urn:
                raise TypeError("Missing required property 'configuration'")
            __props__.__dict__["configuration"] = configuration
            __props__.__dict__["description"] = description
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            if job_name is None and not opts.urn:
                raise TypeError("Missing required property 'job_name'")
            __props__.__dict__["job_name"] = job_name
            if project is None and not opts.urn:
                raise TypeError("Missing required property 'project'")
            __props__.__dict__["project"] = project
            __props__.__dict__["create_time"] = None
            __props__.__dict__["status"] = None
        super(OssExportSink, __self__).__init__(
            'alicloud:sls/ossExportSink:OssExportSink',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            configuration: Optional[pulumi.Input[Union['OssExportSinkConfigurationArgs', 'OssExportSinkConfigurationArgsDict']]] = None,
            create_time: Optional[pulumi.Input[_builtins.int]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            display_name: Optional[pulumi.Input[_builtins.str]] = None,
            job_name: Optional[pulumi.Input[_builtins.str]] = None,
            project: Optional[pulumi.Input[_builtins.str]] = None,
            status: Optional[pulumi.Input[_builtins.str]] = None) -> 'OssExportSink':
        """
        Get an existing OssExportSink resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['OssExportSinkConfigurationArgs', 'OssExportSinkConfigurationArgsDict']] configuration: OSSExportConfiguration See `configuration` below.
        :param pulumi.Input[_builtins.int] create_time: Creation time. Example value: 1718787534
        :param pulumi.Input[_builtins.str] description: The description of the job.
        :param pulumi.Input[_builtins.str] display_name: The display name of the job.
        :param pulumi.Input[_builtins.str] job_name: The unique identifier of the OSS data shipping job.
        :param pulumi.Input[_builtins.str] project: The name of the project.
        :param pulumi.Input[_builtins.str] status: The status of the post task. Example value: RUNNING
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OssExportSinkState.__new__(_OssExportSinkState)

        __props__.__dict__["configuration"] = configuration
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["job_name"] = job_name
        __props__.__dict__["project"] = project
        __props__.__dict__["status"] = status
        return OssExportSink(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def configuration(self) -> pulumi.Output['outputs.OssExportSinkConfiguration']:
        """
        OSSExportConfiguration See `configuration` below.
        """
        return pulumi.get(self, "configuration")

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.int]:
        """
        Creation time. Example value: 1718787534
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The description of the job.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[_builtins.str]:
        """
        The display name of the job.
        """
        return pulumi.get(self, "display_name")

    @_builtins.property
    @pulumi.getter(name="jobName")
    def job_name(self) -> pulumi.Output[_builtins.str]:
        """
        The unique identifier of the OSS data shipping job.
        """
        return pulumi.get(self, "job_name")

    @_builtins.property
    @pulumi.getter
    def project(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the project.
        """
        return pulumi.get(self, "project")

    @_builtins.property
    @pulumi.getter
    def status(self) -> pulumi.Output[_builtins.str]:
        """
        The status of the post task. Example value: RUNNING
        """
        return pulumi.get(self, "status")

