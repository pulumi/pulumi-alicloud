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

__all__ = ['ChartRepositoryArgs', 'ChartRepository']

@pulumi.input_type
class ChartRepositoryArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[_builtins.str],
                 repo_name: pulumi.Input[_builtins.str],
                 repo_namespace_name: pulumi.Input[_builtins.str],
                 repo_type: Optional[pulumi.Input[_builtins.str]] = None,
                 summary: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ChartRepository resource.
        :param pulumi.Input[_builtins.str] instance_id: The ID of the Container Registry instance.
        :param pulumi.Input[_builtins.str] repo_name: The name of the repository that you want to create.
        :param pulumi.Input[_builtins.str] repo_namespace_name: The namespace to which the repository belongs.
        :param pulumi.Input[_builtins.str] repo_type: The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        :param pulumi.Input[_builtins.str] summary: The summary about the repository.
        """
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "repo_name", repo_name)
        pulumi.set(__self__, "repo_namespace_name", repo_namespace_name)
        if repo_type is not None:
            pulumi.set(__self__, "repo_type", repo_type)
        if summary is not None:
            pulumi.set(__self__, "summary", summary)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[_builtins.str]:
        """
        The ID of the Container Registry instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "instance_id", value)

    @_builtins.property
    @pulumi.getter(name="repoName")
    def repo_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the repository that you want to create.
        """
        return pulumi.get(self, "repo_name")

    @repo_name.setter
    def repo_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "repo_name", value)

    @_builtins.property
    @pulumi.getter(name="repoNamespaceName")
    def repo_namespace_name(self) -> pulumi.Input[_builtins.str]:
        """
        The namespace to which the repository belongs.
        """
        return pulumi.get(self, "repo_namespace_name")

    @repo_namespace_name.setter
    def repo_namespace_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "repo_namespace_name", value)

    @_builtins.property
    @pulumi.getter(name="repoType")
    def repo_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        """
        return pulumi.get(self, "repo_type")

    @repo_type.setter
    def repo_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "repo_type", value)

    @_builtins.property
    @pulumi.getter
    def summary(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The summary about the repository.
        """
        return pulumi.get(self, "summary")

    @summary.setter
    def summary(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "summary", value)


@pulumi.input_type
class _ChartRepositoryState:
    def __init__(__self__, *,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 repo_name: Optional[pulumi.Input[_builtins.str]] = None,
                 repo_namespace_name: Optional[pulumi.Input[_builtins.str]] = None,
                 repo_type: Optional[pulumi.Input[_builtins.str]] = None,
                 summary: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ChartRepository resources.
        :param pulumi.Input[_builtins.str] instance_id: The ID of the Container Registry instance.
        :param pulumi.Input[_builtins.str] repo_name: The name of the repository that you want to create.
        :param pulumi.Input[_builtins.str] repo_namespace_name: The namespace to which the repository belongs.
        :param pulumi.Input[_builtins.str] repo_type: The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        :param pulumi.Input[_builtins.str] summary: The summary about the repository.
        """
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if repo_name is not None:
            pulumi.set(__self__, "repo_name", repo_name)
        if repo_namespace_name is not None:
            pulumi.set(__self__, "repo_namespace_name", repo_namespace_name)
        if repo_type is not None:
            pulumi.set(__self__, "repo_type", repo_type)
        if summary is not None:
            pulumi.set(__self__, "summary", summary)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ID of the Container Registry instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "instance_id", value)

    @_builtins.property
    @pulumi.getter(name="repoName")
    def repo_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the repository that you want to create.
        """
        return pulumi.get(self, "repo_name")

    @repo_name.setter
    def repo_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "repo_name", value)

    @_builtins.property
    @pulumi.getter(name="repoNamespaceName")
    def repo_namespace_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The namespace to which the repository belongs.
        """
        return pulumi.get(self, "repo_namespace_name")

    @repo_namespace_name.setter
    def repo_namespace_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "repo_namespace_name", value)

    @_builtins.property
    @pulumi.getter(name="repoType")
    def repo_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        """
        return pulumi.get(self, "repo_type")

    @repo_type.setter
    def repo_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "repo_type", value)

    @_builtins.property
    @pulumi.getter
    def summary(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The summary about the repository.
        """
        return pulumi.get(self, "summary")

    @summary.setter
    def summary(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "summary", value)


@pulumi.type_token("alicloud:cr/chartRepository:ChartRepository")
class ChartRepository(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 repo_name: Optional[pulumi.Input[_builtins.str]] = None,
                 repo_namespace_name: Optional[pulumi.Input[_builtins.str]] = None,
                 repo_type: Optional[pulumi.Input[_builtins.str]] = None,
                 summary: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a CR Chart Repository resource.

        For information about CR Chart Repository and how to use it, see [What is Chart Repository](https://www.alibabacloud.com/help/en/acr/developer-reference/api-cr-2018-12-01-createchartrepository).

        > **NOTE:** Available since v1.149.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = random.index.Integer("default",
            min=100000,
            max=999999)
        example = alicloud.cr.RegistryEnterpriseInstance("example",
            payment_type="Subscription",
            period=1,
            renew_period=0,
            renewal_status="ManualRenewal",
            instance_type="Advanced",
            instance_name=f"{name}-{default['result']}")
        example_chart_namespace = alicloud.cr.ChartNamespace("example",
            instance_id=example.id,
            namespace_name=f"{name}-{default['result']}")
        example_chart_repository = alicloud.cr.ChartRepository("example",
            repo_namespace_name=example_chart_namespace.namespace_name,
            instance_id=example_chart_namespace.instance_id,
            repo_name=f"{name}-{default['result']}")
        ```

        ## Import

        CR Chart Repository can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cr/chartRepository:ChartRepository example <instance_id>:<repo_namespace_name>:<repo_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] instance_id: The ID of the Container Registry instance.
        :param pulumi.Input[_builtins.str] repo_name: The name of the repository that you want to create.
        :param pulumi.Input[_builtins.str] repo_namespace_name: The namespace to which the repository belongs.
        :param pulumi.Input[_builtins.str] repo_type: The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        :param pulumi.Input[_builtins.str] summary: The summary about the repository.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ChartRepositoryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CR Chart Repository resource.

        For information about CR Chart Repository and how to use it, see [What is Chart Repository](https://www.alibabacloud.com/help/en/acr/developer-reference/api-cr-2018-12-01-createchartrepository).

        > **NOTE:** Available since v1.149.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = random.index.Integer("default",
            min=100000,
            max=999999)
        example = alicloud.cr.RegistryEnterpriseInstance("example",
            payment_type="Subscription",
            period=1,
            renew_period=0,
            renewal_status="ManualRenewal",
            instance_type="Advanced",
            instance_name=f"{name}-{default['result']}")
        example_chart_namespace = alicloud.cr.ChartNamespace("example",
            instance_id=example.id,
            namespace_name=f"{name}-{default['result']}")
        example_chart_repository = alicloud.cr.ChartRepository("example",
            repo_namespace_name=example_chart_namespace.namespace_name,
            instance_id=example_chart_namespace.instance_id,
            repo_name=f"{name}-{default['result']}")
        ```

        ## Import

        CR Chart Repository can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:cr/chartRepository:ChartRepository example <instance_id>:<repo_namespace_name>:<repo_name>
        ```

        :param str resource_name: The name of the resource.
        :param ChartRepositoryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ChartRepositoryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[_builtins.str]] = None,
                 repo_name: Optional[pulumi.Input[_builtins.str]] = None,
                 repo_namespace_name: Optional[pulumi.Input[_builtins.str]] = None,
                 repo_type: Optional[pulumi.Input[_builtins.str]] = None,
                 summary: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ChartRepositoryArgs.__new__(ChartRepositoryArgs)

            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if repo_name is None and not opts.urn:
                raise TypeError("Missing required property 'repo_name'")
            __props__.__dict__["repo_name"] = repo_name
            if repo_namespace_name is None and not opts.urn:
                raise TypeError("Missing required property 'repo_namespace_name'")
            __props__.__dict__["repo_namespace_name"] = repo_namespace_name
            __props__.__dict__["repo_type"] = repo_type
            __props__.__dict__["summary"] = summary
        super(ChartRepository, __self__).__init__(
            'alicloud:cr/chartRepository:ChartRepository',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_id: Optional[pulumi.Input[_builtins.str]] = None,
            repo_name: Optional[pulumi.Input[_builtins.str]] = None,
            repo_namespace_name: Optional[pulumi.Input[_builtins.str]] = None,
            repo_type: Optional[pulumi.Input[_builtins.str]] = None,
            summary: Optional[pulumi.Input[_builtins.str]] = None) -> 'ChartRepository':
        """
        Get an existing ChartRepository resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] instance_id: The ID of the Container Registry instance.
        :param pulumi.Input[_builtins.str] repo_name: The name of the repository that you want to create.
        :param pulumi.Input[_builtins.str] repo_namespace_name: The namespace to which the repository belongs.
        :param pulumi.Input[_builtins.str] repo_type: The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        :param pulumi.Input[_builtins.str] summary: The summary about the repository.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ChartRepositoryState.__new__(_ChartRepositoryState)

        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["repo_name"] = repo_name
        __props__.__dict__["repo_namespace_name"] = repo_namespace_name
        __props__.__dict__["repo_type"] = repo_type
        __props__.__dict__["summary"] = summary
        return ChartRepository(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[_builtins.str]:
        """
        The ID of the Container Registry instance.
        """
        return pulumi.get(self, "instance_id")

    @_builtins.property
    @pulumi.getter(name="repoName")
    def repo_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the repository that you want to create.
        """
        return pulumi.get(self, "repo_name")

    @_builtins.property
    @pulumi.getter(name="repoNamespaceName")
    def repo_namespace_name(self) -> pulumi.Output[_builtins.str]:
        """
        The namespace to which the repository belongs.
        """
        return pulumi.get(self, "repo_namespace_name")

    @_builtins.property
    @pulumi.getter(name="repoType")
    def repo_type(self) -> pulumi.Output[_builtins.str]:
        """
        The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
        """
        return pulumi.get(self, "repo_type")

    @_builtins.property
    @pulumi.getter
    def summary(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The summary about the repository.
        """
        return pulumi.get(self, "summary")

