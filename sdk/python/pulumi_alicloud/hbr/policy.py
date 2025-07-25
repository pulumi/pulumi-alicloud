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

__all__ = ['PolicyArgs', 'Policy']

@pulumi.input_type
class PolicyArgs:
    def __init__(__self__, *,
                 policy_description: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_type: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyRuleArgs']]]] = None):
        """
        The set of arguments for constructing a Policy resource.
        :param pulumi.Input[_builtins.str] policy_description: The policy description.
        :param pulumi.Input[_builtins.str] policy_name: Policy Name
        :param pulumi.Input[_builtins.str] policy_type: The policy type. Valid values:
               - `STANDARD`: The general backup policy. This type of policy applies to backups other than Elastic Compute Service (ECS) instance backup.
               - `UDM_ECS_ONLY`: The ECS instance backup policy. This type of policy applies only to ECS instance backup.
        :param pulumi.Input[Sequence[pulumi.Input['PolicyRuleArgs']]] rules: A list of policy rules See `rules` below.
        """
        if policy_description is not None:
            pulumi.set(__self__, "policy_description", policy_description)
        if policy_name is not None:
            pulumi.set(__self__, "policy_name", policy_name)
        if policy_type is not None:
            pulumi.set(__self__, "policy_type", policy_type)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @_builtins.property
    @pulumi.getter(name="policyDescription")
    def policy_description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The policy description.
        """
        return pulumi.get(self, "policy_description")

    @policy_description.setter
    def policy_description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy_description", value)

    @_builtins.property
    @pulumi.getter(name="policyName")
    def policy_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Policy Name
        """
        return pulumi.get(self, "policy_name")

    @policy_name.setter
    def policy_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy_name", value)

    @_builtins.property
    @pulumi.getter(name="policyType")
    def policy_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The policy type. Valid values:
        - `STANDARD`: The general backup policy. This type of policy applies to backups other than Elastic Compute Service (ECS) instance backup.
        - `UDM_ECS_ONLY`: The ECS instance backup policy. This type of policy applies only to ECS instance backup.
        """
        return pulumi.get(self, "policy_type")

    @policy_type.setter
    def policy_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy_type", value)

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PolicyRuleArgs']]]]:
        """
        A list of policy rules See `rules` below.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyRuleArgs']]]]):
        pulumi.set(self, "rules", value)


@pulumi.input_type
class _PolicyState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_description: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_type: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyRuleArgs']]]] = None):
        """
        Input properties used for looking up and filtering Policy resources.
        :param pulumi.Input[_builtins.str] create_time: Policy creation time
        :param pulumi.Input[_builtins.str] policy_description: The policy description.
        :param pulumi.Input[_builtins.str] policy_name: Policy Name
        :param pulumi.Input[_builtins.str] policy_type: The policy type. Valid values:
               - `STANDARD`: The general backup policy. This type of policy applies to backups other than Elastic Compute Service (ECS) instance backup.
               - `UDM_ECS_ONLY`: The ECS instance backup policy. This type of policy applies only to ECS instance backup.
        :param pulumi.Input[Sequence[pulumi.Input['PolicyRuleArgs']]] rules: A list of policy rules See `rules` below.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if policy_description is not None:
            pulumi.set(__self__, "policy_description", policy_description)
        if policy_name is not None:
            pulumi.set(__self__, "policy_name", policy_name)
        if policy_type is not None:
            pulumi.set(__self__, "policy_type", policy_type)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Policy creation time
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "create_time", value)

    @_builtins.property
    @pulumi.getter(name="policyDescription")
    def policy_description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The policy description.
        """
        return pulumi.get(self, "policy_description")

    @policy_description.setter
    def policy_description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy_description", value)

    @_builtins.property
    @pulumi.getter(name="policyName")
    def policy_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Policy Name
        """
        return pulumi.get(self, "policy_name")

    @policy_name.setter
    def policy_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy_name", value)

    @_builtins.property
    @pulumi.getter(name="policyType")
    def policy_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The policy type. Valid values:
        - `STANDARD`: The general backup policy. This type of policy applies to backups other than Elastic Compute Service (ECS) instance backup.
        - `UDM_ECS_ONLY`: The ECS instance backup policy. This type of policy applies only to ECS instance backup.
        """
        return pulumi.get(self, "policy_type")

    @policy_type.setter
    def policy_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy_type", value)

    @_builtins.property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PolicyRuleArgs']]]]:
        """
        A list of policy rules See `rules` below.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyRuleArgs']]]]):
        pulumi.set(self, "rules", value)


@pulumi.type_token("alicloud:hbr/policy:Policy")
class Policy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy_description: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_type: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PolicyRuleArgs', 'PolicyRuleArgsDict']]]]] = None,
                 __props__=None):
        """
        Provides a Hybrid Backup Recovery (HBR) Policy resource.

        For information about Hybrid Backup Recovery (HBR) Policy and how to use it, see [What is Policy](https://www.alibabacloud.com/help/en/cloud-backup/developer-reference/api-hbr-2017-09-08-createpolicyv2).

        > **NOTE:** Available since v1.221.0.

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
        default = random.index.Integer("default",
            max=99999,
            min=10000)
        defaultyk84_hc = alicloud.hbr.Vault("defaultyk84Hc",
            vault_type="STANDARD",
            vault_name=f"example-value-{default['result']}")
        defaultoq_wv_hq = alicloud.hbr.Policy("defaultoqWvHQ",
            policy_name=f"example-value-{default['result']}",
            rules=[{
                "rule_type": "BACKUP",
                "backup_type": "COMPLETE",
                "schedule": "I|1631685600|P1D",
                "retention": 7,
                "archive_days": 0,
                "vault_id": defaultyk84_hc.id,
            }],
            policy_description="policy example")
        ```

        ## Import

        Hybrid Backup Recovery (HBR) Policy can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:hbr/policy:Policy example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] policy_description: The policy description.
        :param pulumi.Input[_builtins.str] policy_name: Policy Name
        :param pulumi.Input[_builtins.str] policy_type: The policy type. Valid values:
               - `STANDARD`: The general backup policy. This type of policy applies to backups other than Elastic Compute Service (ECS) instance backup.
               - `UDM_ECS_ONLY`: The ECS instance backup policy. This type of policy applies only to ECS instance backup.
        :param pulumi.Input[Sequence[pulumi.Input[Union['PolicyRuleArgs', 'PolicyRuleArgsDict']]]] rules: A list of policy rules See `rules` below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[PolicyArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Hybrid Backup Recovery (HBR) Policy resource.

        For information about Hybrid Backup Recovery (HBR) Policy and how to use it, see [What is Policy](https://www.alibabacloud.com/help/en/cloud-backup/developer-reference/api-hbr-2017-09-08-createpolicyv2).

        > **NOTE:** Available since v1.221.0.

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
        default = random.index.Integer("default",
            max=99999,
            min=10000)
        defaultyk84_hc = alicloud.hbr.Vault("defaultyk84Hc",
            vault_type="STANDARD",
            vault_name=f"example-value-{default['result']}")
        defaultoq_wv_hq = alicloud.hbr.Policy("defaultoqWvHQ",
            policy_name=f"example-value-{default['result']}",
            rules=[{
                "rule_type": "BACKUP",
                "backup_type": "COMPLETE",
                "schedule": "I|1631685600|P1D",
                "retention": 7,
                "archive_days": 0,
                "vault_id": defaultyk84_hc.id,
            }],
            policy_description="policy example")
        ```

        ## Import

        Hybrid Backup Recovery (HBR) Policy can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:hbr/policy:Policy example <id>
        ```

        :param str resource_name: The name of the resource.
        :param PolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy_description: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 policy_type: Optional[pulumi.Input[_builtins.str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PolicyRuleArgs', 'PolicyRuleArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PolicyArgs.__new__(PolicyArgs)

            __props__.__dict__["policy_description"] = policy_description
            __props__.__dict__["policy_name"] = policy_name
            __props__.__dict__["policy_type"] = policy_type
            __props__.__dict__["rules"] = rules
            __props__.__dict__["create_time"] = None
        super(Policy, __self__).__init__(
            'alicloud:hbr/policy:Policy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[_builtins.str]] = None,
            policy_description: Optional[pulumi.Input[_builtins.str]] = None,
            policy_name: Optional[pulumi.Input[_builtins.str]] = None,
            policy_type: Optional[pulumi.Input[_builtins.str]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PolicyRuleArgs', 'PolicyRuleArgsDict']]]]] = None) -> 'Policy':
        """
        Get an existing Policy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] create_time: Policy creation time
        :param pulumi.Input[_builtins.str] policy_description: The policy description.
        :param pulumi.Input[_builtins.str] policy_name: Policy Name
        :param pulumi.Input[_builtins.str] policy_type: The policy type. Valid values:
               - `STANDARD`: The general backup policy. This type of policy applies to backups other than Elastic Compute Service (ECS) instance backup.
               - `UDM_ECS_ONLY`: The ECS instance backup policy. This type of policy applies only to ECS instance backup.
        :param pulumi.Input[Sequence[pulumi.Input[Union['PolicyRuleArgs', 'PolicyRuleArgsDict']]]] rules: A list of policy rules See `rules` below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PolicyState.__new__(_PolicyState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["policy_description"] = policy_description
        __props__.__dict__["policy_name"] = policy_name
        __props__.__dict__["policy_type"] = policy_type
        __props__.__dict__["rules"] = rules
        return Policy(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[_builtins.str]:
        """
        Policy creation time
        """
        return pulumi.get(self, "create_time")

    @_builtins.property
    @pulumi.getter(name="policyDescription")
    def policy_description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The policy description.
        """
        return pulumi.get(self, "policy_description")

    @_builtins.property
    @pulumi.getter(name="policyName")
    def policy_name(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Policy Name
        """
        return pulumi.get(self, "policy_name")

    @_builtins.property
    @pulumi.getter(name="policyType")
    def policy_type(self) -> pulumi.Output[_builtins.str]:
        """
        The policy type. Valid values:
        - `STANDARD`: The general backup policy. This type of policy applies to backups other than Elastic Compute Service (ECS) instance backup.
        - `UDM_ECS_ONLY`: The ECS instance backup policy. This type of policy applies only to ECS instance backup.
        """
        return pulumi.get(self, "policy_type")

    @_builtins.property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Optional[Sequence['outputs.PolicyRule']]]:
        """
        A list of policy rules See `rules` below.
        """
        return pulumi.get(self, "rules")

