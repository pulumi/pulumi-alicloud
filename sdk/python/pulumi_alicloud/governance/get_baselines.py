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

__all__ = [
    'GetBaselinesResult',
    'AwaitableGetBaselinesResult',
    'get_baselines',
    'get_baselines_output',
]

@pulumi.output_type
class GetBaselinesResult:
    """
    A collection of values returned by getBaselines.
    """
    def __init__(__self__, baselines=None, id=None, ids=None, name_regex=None, names=None, output_file=None):
        if baselines and not isinstance(baselines, list):
            raise TypeError("Expected argument 'baselines' to be a list")
        pulumi.set(__self__, "baselines", baselines)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @_builtins.property
    @pulumi.getter
    def baselines(self) -> Sequence['outputs.GetBaselinesBaselineResult']:
        """
        A list of Baseline Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "baselines")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def ids(self) -> Sequence[_builtins.str]:
        """
        A list of Baseline IDs.
        """
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name_regex")

    @_builtins.property
    @pulumi.getter
    def names(self) -> Sequence[_builtins.str]:
        """
        A list of name of Baselines.
        """
        return pulumi.get(self, "names")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")


class AwaitableGetBaselinesResult(GetBaselinesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBaselinesResult(
            baselines=self.baselines,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file)


def get_baselines(ids: Optional[Sequence[_builtins.str]] = None,
                  name_regex: Optional[_builtins.str] = None,
                  output_file: Optional[_builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBaselinesResult:
    """
    This data source provides Governance Baseline available to the user.[What is Baseline](https://next.api.aliyun.com/document/governance/2021-01-20/CreateAccountFactoryBaseline)

    > **NOTE:** Available since v1.228.0.

    ## Example Usage

    ```python
    import pulumi
    import json
    import pulumi_alicloud as alicloud
    import pulumi_random as random

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "terraform_example"
    default_integer = random.index.Integer("default",
        min=10000,
        max=99999)
    item_password_policy = config.get("itemPasswordPolicy")
    if item_password_policy is None:
        item_password_policy = "ACS-BP_ACCOUNT_FACTORY_RAM_USER_PASSWORD_POLICY"
    item_services = config.get("itemServices")
    if item_services is None:
        item_services = "ACS-BP_ACCOUNT_FACTORY_SUBSCRIBE_SERVICES"
    item_ram_security = config.get("itemRamSecurity")
    if item_ram_security is None:
        item_ram_security = "ACS-BP_ACCOUNT_FACTORY_RAM_SECURITY_PREFERENCE"
    default_baseline = alicloud.governance.Baseline("default",
        baseline_items=[{
            "version": "1.0",
            "name": item_password_policy,
            "config": json.dumps({
                "MinimumPasswordLength": 8,
                "RequireLowercaseCharacters": True,
                "RequireUppercaseCharacters": True,
                "RequireNumbers": True,
                "RequireSymbols": True,
                "MaxPasswordAge": 0,
                "HardExpiry": False,
                "PasswordReusePrevention": 0,
                "MaxLoginAttempts": 0,
            }),
        }],
        description=name,
        baseline_name=f"{name}-{default_integer['result']}")
    default = pulumi.Output.all(
        id=default_baseline.id,
        baseline_name=default_baseline.baseline_name
    ).apply(lambda resolved_outputs: alicloud.governance.get_baselines_output(ids=[resolved_outputs['id']],
        name_regex=resolved_outputs['baseline_name']))

    pulumi.export("alicloudGovernanceBaselineExampleId", default.baselines[0].baseline_id)
    ```


    :param Sequence[_builtins.str] ids: A list of Baseline IDs.
    :param _builtins.str name_regex: A regex string to filter results by Group Metric Rule name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:governance/getBaselines:getBaselines', __args__, opts=opts, typ=GetBaselinesResult).value

    return AwaitableGetBaselinesResult(
        baselines=pulumi.get(__ret__, 'baselines'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'))
def get_baselines_output(ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                         name_regex: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetBaselinesResult]:
    """
    This data source provides Governance Baseline available to the user.[What is Baseline](https://next.api.aliyun.com/document/governance/2021-01-20/CreateAccountFactoryBaseline)

    > **NOTE:** Available since v1.228.0.

    ## Example Usage

    ```python
    import pulumi
    import json
    import pulumi_alicloud as alicloud
    import pulumi_random as random

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "terraform_example"
    default_integer = random.index.Integer("default",
        min=10000,
        max=99999)
    item_password_policy = config.get("itemPasswordPolicy")
    if item_password_policy is None:
        item_password_policy = "ACS-BP_ACCOUNT_FACTORY_RAM_USER_PASSWORD_POLICY"
    item_services = config.get("itemServices")
    if item_services is None:
        item_services = "ACS-BP_ACCOUNT_FACTORY_SUBSCRIBE_SERVICES"
    item_ram_security = config.get("itemRamSecurity")
    if item_ram_security is None:
        item_ram_security = "ACS-BP_ACCOUNT_FACTORY_RAM_SECURITY_PREFERENCE"
    default_baseline = alicloud.governance.Baseline("default",
        baseline_items=[{
            "version": "1.0",
            "name": item_password_policy,
            "config": json.dumps({
                "MinimumPasswordLength": 8,
                "RequireLowercaseCharacters": True,
                "RequireUppercaseCharacters": True,
                "RequireNumbers": True,
                "RequireSymbols": True,
                "MaxPasswordAge": 0,
                "HardExpiry": False,
                "PasswordReusePrevention": 0,
                "MaxLoginAttempts": 0,
            }),
        }],
        description=name,
        baseline_name=f"{name}-{default_integer['result']}")
    default = pulumi.Output.all(
        id=default_baseline.id,
        baseline_name=default_baseline.baseline_name
    ).apply(lambda resolved_outputs: alicloud.governance.get_baselines_output(ids=[resolved_outputs['id']],
        name_regex=resolved_outputs['baseline_name']))

    pulumi.export("alicloudGovernanceBaselineExampleId", default.baselines[0].baseline_id)
    ```


    :param Sequence[_builtins.str] ids: A list of Baseline IDs.
    :param _builtins.str name_regex: A regex string to filter results by Group Metric Rule name.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:governance/getBaselines:getBaselines', __args__, opts=opts, typ=GetBaselinesResult)
    return __ret__.apply(lambda __response__: GetBaselinesResult(
        baselines=pulumi.get(__response__, 'baselines'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        name_regex=pulumi.get(__response__, 'name_regex'),
        names=pulumi.get(__response__, 'names'),
        output_file=pulumi.get(__response__, 'output_file')))
