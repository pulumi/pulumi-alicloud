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
    'GetEnterpriseLogicDatabasesResult',
    'AwaitableGetEnterpriseLogicDatabasesResult',
    'get_enterprise_logic_databases',
    'get_enterprise_logic_databases_output',
]

@pulumi.output_type
class GetEnterpriseLogicDatabasesResult:
    """
    A collection of values returned by getEnterpriseLogicDatabases.
    """
    def __init__(__self__, databases=None, id=None, ids=None, output_file=None):
        if databases and not isinstance(databases, list):
            raise TypeError("Expected argument 'databases' to be a list")
        pulumi.set(__self__, "databases", databases)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @_builtins.property
    @pulumi.getter
    def databases(self) -> Sequence['outputs.GetEnterpriseLogicDatabasesDatabaseResult']:
        """
        A list of Logic Database Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "databases")

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
        A list of Logic Database IDs.
        """
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")


class AwaitableGetEnterpriseLogicDatabasesResult(GetEnterpriseLogicDatabasesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEnterpriseLogicDatabasesResult(
            databases=self.databases,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file)


def get_enterprise_logic_databases(ids: Optional[Sequence[_builtins.str]] = None,
                                   output_file: Optional[_builtins.str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEnterpriseLogicDatabasesResult:
    """
    This data source provides DMS Enterprise Logic Database available to the user. [What is Logic Database](https://www.alibabacloud.com/help/en/dms/developer-reference/api-dms-enterprise-2018-11-01-createlogicdatabase).

    > **NOTE:** Available since v1.195.0.


    :param Sequence[_builtins.str] ids: A list of Logic Database IDs.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:dms/getEnterpriseLogicDatabases:getEnterpriseLogicDatabases', __args__, opts=opts, typ=GetEnterpriseLogicDatabasesResult).value

    return AwaitableGetEnterpriseLogicDatabasesResult(
        databases=pulumi.get(__ret__, 'databases'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'))
def get_enterprise_logic_databases_output(ids: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                                          output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetEnterpriseLogicDatabasesResult]:
    """
    This data source provides DMS Enterprise Logic Database available to the user. [What is Logic Database](https://www.alibabacloud.com/help/en/dms/developer-reference/api-dms-enterprise-2018-11-01-createlogicdatabase).

    > **NOTE:** Available since v1.195.0.


    :param Sequence[_builtins.str] ids: A list of Logic Database IDs.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:dms/getEnterpriseLogicDatabases:getEnterpriseLogicDatabases', __args__, opts=opts, typ=GetEnterpriseLogicDatabasesResult)
    return __ret__.apply(lambda __response__: GetEnterpriseLogicDatabasesResult(
        databases=pulumi.get(__response__, 'databases'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        output_file=pulumi.get(__response__, 'output_file')))
