# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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

__all__ = ['WorkspaceExperimentArgs', 'WorkspaceExperiment']

@pulumi.input_type
class WorkspaceExperimentArgs:
    def __init__(__self__, *,
                 artifact_uri: pulumi.Input[str],
                 experiment_name: pulumi.Input[str],
                 workspace_id: pulumi.Input[str],
                 accessibility: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a WorkspaceExperiment resource.
        :param pulumi.Input[str] artifact_uri: ArtifactUri is default OSS storage path of the output of trials in the experiment
        :param pulumi.Input[str] experiment_name: Name is the name of the experiment, unique in a namespace
        :param pulumi.Input[str] workspace_id: WorkspaceId is the workspace id which contains the experiment
        :param pulumi.Input[str] accessibility: Experimental Visibility
        """
        pulumi.set(__self__, "artifact_uri", artifact_uri)
        pulumi.set(__self__, "experiment_name", experiment_name)
        pulumi.set(__self__, "workspace_id", workspace_id)
        if accessibility is not None:
            pulumi.set(__self__, "accessibility", accessibility)

    @property
    @pulumi.getter(name="artifactUri")
    def artifact_uri(self) -> pulumi.Input[str]:
        """
        ArtifactUri is default OSS storage path of the output of trials in the experiment
        """
        return pulumi.get(self, "artifact_uri")

    @artifact_uri.setter
    def artifact_uri(self, value: pulumi.Input[str]):
        pulumi.set(self, "artifact_uri", value)

    @property
    @pulumi.getter(name="experimentName")
    def experiment_name(self) -> pulumi.Input[str]:
        """
        Name is the name of the experiment, unique in a namespace
        """
        return pulumi.get(self, "experiment_name")

    @experiment_name.setter
    def experiment_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "experiment_name", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Input[str]:
        """
        WorkspaceId is the workspace id which contains the experiment
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "workspace_id", value)

    @property
    @pulumi.getter
    def accessibility(self) -> Optional[pulumi.Input[str]]:
        """
        Experimental Visibility
        """
        return pulumi.get(self, "accessibility")

    @accessibility.setter
    def accessibility(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accessibility", value)


@pulumi.input_type
class _WorkspaceExperimentState:
    def __init__(__self__, *,
                 accessibility: Optional[pulumi.Input[str]] = None,
                 artifact_uri: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 experiment_name: Optional[pulumi.Input[str]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WorkspaceExperiment resources.
        :param pulumi.Input[str] accessibility: Experimental Visibility
        :param pulumi.Input[str] artifact_uri: ArtifactUri is default OSS storage path of the output of trials in the experiment
        :param pulumi.Input[str] create_time: GmtCreateTime is time when this entity is created.
        :param pulumi.Input[str] experiment_name: Name is the name of the experiment, unique in a namespace
        :param pulumi.Input[str] workspace_id: WorkspaceId is the workspace id which contains the experiment
        """
        if accessibility is not None:
            pulumi.set(__self__, "accessibility", accessibility)
        if artifact_uri is not None:
            pulumi.set(__self__, "artifact_uri", artifact_uri)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if experiment_name is not None:
            pulumi.set(__self__, "experiment_name", experiment_name)
        if workspace_id is not None:
            pulumi.set(__self__, "workspace_id", workspace_id)

    @property
    @pulumi.getter
    def accessibility(self) -> Optional[pulumi.Input[str]]:
        """
        Experimental Visibility
        """
        return pulumi.get(self, "accessibility")

    @accessibility.setter
    def accessibility(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accessibility", value)

    @property
    @pulumi.getter(name="artifactUri")
    def artifact_uri(self) -> Optional[pulumi.Input[str]]:
        """
        ArtifactUri is default OSS storage path of the output of trials in the experiment
        """
        return pulumi.get(self, "artifact_uri")

    @artifact_uri.setter
    def artifact_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "artifact_uri", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        GmtCreateTime is time when this entity is created.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="experimentName")
    def experiment_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name is the name of the experiment, unique in a namespace
        """
        return pulumi.get(self, "experiment_name")

    @experiment_name.setter
    def experiment_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "experiment_name", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> Optional[pulumi.Input[str]]:
        """
        WorkspaceId is the workspace id which contains the experiment
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workspace_id", value)


class WorkspaceExperiment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accessibility: Optional[pulumi.Input[str]] = None,
                 artifact_uri: Optional[pulumi.Input[str]] = None,
                 experiment_name: Optional[pulumi.Input[str]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a PAI Workspace Experiment resource.

        For information about PAI Workspace Experiment and how to use it, see [What is Experiment](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.236.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform_example"
        default_di9fs_l = alicloud.pai.WorkspaceWorkspace("defaultDI9fsL",
            description=name,
            display_name=name,
            workspace_name=name,
            env_types=["prod"])
        default = alicloud.pai.WorkspaceExperiment("default",
            accessibility="PRIVATE",
            artifact_uri="oss://yyt-409262.oss-cn-hangzhou.aliyuncs.com/example/",
            experiment_name=name,
            workspace_id=default_di9fs_l.id)
        ```

        ## Import

        PAI Workspace Experiment can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:pai/workspaceExperiment:WorkspaceExperiment example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accessibility: Experimental Visibility
        :param pulumi.Input[str] artifact_uri: ArtifactUri is default OSS storage path of the output of trials in the experiment
        :param pulumi.Input[str] experiment_name: Name is the name of the experiment, unique in a namespace
        :param pulumi.Input[str] workspace_id: WorkspaceId is the workspace id which contains the experiment
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkspaceExperimentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a PAI Workspace Experiment resource.

        For information about PAI Workspace Experiment and how to use it, see [What is Experiment](https://www.alibabacloud.com/help/en/).

        > **NOTE:** Available since v1.236.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform_example"
        default_di9fs_l = alicloud.pai.WorkspaceWorkspace("defaultDI9fsL",
            description=name,
            display_name=name,
            workspace_name=name,
            env_types=["prod"])
        default = alicloud.pai.WorkspaceExperiment("default",
            accessibility="PRIVATE",
            artifact_uri="oss://yyt-409262.oss-cn-hangzhou.aliyuncs.com/example/",
            experiment_name=name,
            workspace_id=default_di9fs_l.id)
        ```

        ## Import

        PAI Workspace Experiment can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:pai/workspaceExperiment:WorkspaceExperiment example <id>
        ```

        :param str resource_name: The name of the resource.
        :param WorkspaceExperimentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkspaceExperimentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accessibility: Optional[pulumi.Input[str]] = None,
                 artifact_uri: Optional[pulumi.Input[str]] = None,
                 experiment_name: Optional[pulumi.Input[str]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkspaceExperimentArgs.__new__(WorkspaceExperimentArgs)

            __props__.__dict__["accessibility"] = accessibility
            if artifact_uri is None and not opts.urn:
                raise TypeError("Missing required property 'artifact_uri'")
            __props__.__dict__["artifact_uri"] = artifact_uri
            if experiment_name is None and not opts.urn:
                raise TypeError("Missing required property 'experiment_name'")
            __props__.__dict__["experiment_name"] = experiment_name
            if workspace_id is None and not opts.urn:
                raise TypeError("Missing required property 'workspace_id'")
            __props__.__dict__["workspace_id"] = workspace_id
            __props__.__dict__["create_time"] = None
        super(WorkspaceExperiment, __self__).__init__(
            'alicloud:pai/workspaceExperiment:WorkspaceExperiment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accessibility: Optional[pulumi.Input[str]] = None,
            artifact_uri: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            experiment_name: Optional[pulumi.Input[str]] = None,
            workspace_id: Optional[pulumi.Input[str]] = None) -> 'WorkspaceExperiment':
        """
        Get an existing WorkspaceExperiment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accessibility: Experimental Visibility
        :param pulumi.Input[str] artifact_uri: ArtifactUri is default OSS storage path of the output of trials in the experiment
        :param pulumi.Input[str] create_time: GmtCreateTime is time when this entity is created.
        :param pulumi.Input[str] experiment_name: Name is the name of the experiment, unique in a namespace
        :param pulumi.Input[str] workspace_id: WorkspaceId is the workspace id which contains the experiment
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkspaceExperimentState.__new__(_WorkspaceExperimentState)

        __props__.__dict__["accessibility"] = accessibility
        __props__.__dict__["artifact_uri"] = artifact_uri
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["experiment_name"] = experiment_name
        __props__.__dict__["workspace_id"] = workspace_id
        return WorkspaceExperiment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def accessibility(self) -> pulumi.Output[str]:
        """
        Experimental Visibility
        """
        return pulumi.get(self, "accessibility")

    @property
    @pulumi.getter(name="artifactUri")
    def artifact_uri(self) -> pulumi.Output[str]:
        """
        ArtifactUri is default OSS storage path of the output of trials in the experiment
        """
        return pulumi.get(self, "artifact_uri")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        GmtCreateTime is time when this entity is created.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="experimentName")
    def experiment_name(self) -> pulumi.Output[str]:
        """
        Name is the name of the experiment, unique in a namespace
        """
        return pulumi.get(self, "experiment_name")

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Output[str]:
        """
        WorkspaceId is the workspace id which contains the experiment
        """
        return pulumi.get(self, "workspace_id")
