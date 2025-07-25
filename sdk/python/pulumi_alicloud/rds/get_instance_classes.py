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
    'GetInstanceClassesResult',
    'AwaitableGetInstanceClassesResult',
    'get_instance_classes',
    'get_instance_classes_output',
]

@pulumi.output_type
class GetInstanceClassesResult:
    """
    A collection of values returned by getInstanceClasses.
    """
    def __init__(__self__, category=None, commodity_code=None, db_instance_class=None, db_instance_id=None, db_instance_storage_type=None, engine=None, engine_version=None, id=None, ids=None, instance_charge_type=None, instance_classes=None, multi_zone=None, output_file=None, sorted_by=None, storage_type=None, zone_id=None):
        if category and not isinstance(category, str):
            raise TypeError("Expected argument 'category' to be a str")
        pulumi.set(__self__, "category", category)
        if commodity_code and not isinstance(commodity_code, str):
            raise TypeError("Expected argument 'commodity_code' to be a str")
        pulumi.set(__self__, "commodity_code", commodity_code)
        if db_instance_class and not isinstance(db_instance_class, str):
            raise TypeError("Expected argument 'db_instance_class' to be a str")
        pulumi.set(__self__, "db_instance_class", db_instance_class)
        if db_instance_id and not isinstance(db_instance_id, str):
            raise TypeError("Expected argument 'db_instance_id' to be a str")
        pulumi.set(__self__, "db_instance_id", db_instance_id)
        if db_instance_storage_type and not isinstance(db_instance_storage_type, str):
            raise TypeError("Expected argument 'db_instance_storage_type' to be a str")
        pulumi.set(__self__, "db_instance_storage_type", db_instance_storage_type)
        if engine and not isinstance(engine, str):
            raise TypeError("Expected argument 'engine' to be a str")
        pulumi.set(__self__, "engine", engine)
        if engine_version and not isinstance(engine_version, str):
            raise TypeError("Expected argument 'engine_version' to be a str")
        pulumi.set(__self__, "engine_version", engine_version)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_charge_type and not isinstance(instance_charge_type, str):
            raise TypeError("Expected argument 'instance_charge_type' to be a str")
        pulumi.set(__self__, "instance_charge_type", instance_charge_type)
        if instance_classes and not isinstance(instance_classes, list):
            raise TypeError("Expected argument 'instance_classes' to be a list")
        pulumi.set(__self__, "instance_classes", instance_classes)
        if multi_zone and not isinstance(multi_zone, bool):
            raise TypeError("Expected argument 'multi_zone' to be a bool")
        pulumi.set(__self__, "multi_zone", multi_zone)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if sorted_by and not isinstance(sorted_by, str):
            raise TypeError("Expected argument 'sorted_by' to be a str")
        pulumi.set(__self__, "sorted_by", sorted_by)
        if storage_type and not isinstance(storage_type, str):
            raise TypeError("Expected argument 'storage_type' to be a str")
        pulumi.set(__self__, "storage_type", storage_type)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @_builtins.property
    @pulumi.getter
    def category(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "category")

    @_builtins.property
    @pulumi.getter(name="commodityCode")
    def commodity_code(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "commodity_code")

    @_builtins.property
    @pulumi.getter(name="dbInstanceClass")
    def db_instance_class(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "db_instance_class")

    @_builtins.property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "db_instance_id")

    @_builtins.property
    @pulumi.getter(name="dbInstanceStorageType")
    def db_instance_storage_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "db_instance_storage_type")

    @_builtins.property
    @pulumi.getter
    def engine(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "engine")

    @_builtins.property
    @pulumi.getter(name="engineVersion")
    def engine_version(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "engine_version")

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
        (Available in 1.60.0+) A list of Rds instance class codes.
        """
        return pulumi.get(self, "ids")

    @_builtins.property
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "instance_charge_type")

    @_builtins.property
    @pulumi.getter(name="instanceClasses")
    def instance_classes(self) -> Sequence['outputs.GetInstanceClassesInstanceClassResult']:
        """
        A list of Rds available resource. Each element contains the following attributes:
        """
        return pulumi.get(self, "instance_classes")

    @_builtins.property
    @pulumi.getter(name="multiZone")
    def multi_zone(self) -> Optional[_builtins.bool]:
        return pulumi.get(self, "multi_zone")

    @_builtins.property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "output_file")

    @_builtins.property
    @pulumi.getter(name="sortedBy")
    def sorted_by(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "sorted_by")

    @_builtins.property
    @pulumi.getter(name="storageType")
    def storage_type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "storage_type")

    @_builtins.property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "zone_id")


class AwaitableGetInstanceClassesResult(GetInstanceClassesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceClassesResult(
            category=self.category,
            commodity_code=self.commodity_code,
            db_instance_class=self.db_instance_class,
            db_instance_id=self.db_instance_id,
            db_instance_storage_type=self.db_instance_storage_type,
            engine=self.engine,
            engine_version=self.engine_version,
            id=self.id,
            ids=self.ids,
            instance_charge_type=self.instance_charge_type,
            instance_classes=self.instance_classes,
            multi_zone=self.multi_zone,
            output_file=self.output_file,
            sorted_by=self.sorted_by,
            storage_type=self.storage_type,
            zone_id=self.zone_id)


def get_instance_classes(category: Optional[_builtins.str] = None,
                         commodity_code: Optional[_builtins.str] = None,
                         db_instance_class: Optional[_builtins.str] = None,
                         db_instance_id: Optional[_builtins.str] = None,
                         db_instance_storage_type: Optional[_builtins.str] = None,
                         engine: Optional[_builtins.str] = None,
                         engine_version: Optional[_builtins.str] = None,
                         instance_charge_type: Optional[_builtins.str] = None,
                         multi_zone: Optional[_builtins.bool] = None,
                         output_file: Optional[_builtins.str] = None,
                         sorted_by: Optional[_builtins.str] = None,
                         storage_type: Optional[_builtins.str] = None,
                         zone_id: Optional[_builtins.str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceClassesResult:
    """
    This data source provides the RDS instance classes resource available info of Alibaba Cloud.

    > **NOTE:** Available in v1.46.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    resources = alicloud.rds.get_instance_classes(instance_charge_type="PostPaid",
        engine="MySQL",
        engine_version="5.6",
        output_file="./classes.txt")
    pulumi.export("firstDbInstanceClass", resources.instance_classes[0].instance_class)
    ```


    :param _builtins.str category: DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`, `serverless_basic`, `serverless_standard`, `serverless_ha`, `cluster`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
    :param _builtins.str commodity_code: The commodity code of the instance. Valid values:
           * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
           * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
           * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
           * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
           * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
           * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
           * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
           * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
           * **rds_serverless_public_cn**: The instance is a subscription serverless instance. This value is available on the China site (aliyun.com).
           * **rds_serverless_public_intl**: The instance is a subscription serverless instance. This value is available on the International site (alibabacloud.com).
           
           > **NOTE**: The field `db_instance_id` will be ignored when `commodity_code` is not a read-only type.
    :param _builtins.str db_instance_class: The DB instance class type by the user.
    :param _builtins.str db_instance_id: The ID of the instance.
           
           > **NOTE**: The field `db_instance_id` will be ignored when `commodity_code` is not a read-only type.
    :param _builtins.str db_instance_storage_type: The DB instance storage space required by the user. Valid values: "cloud_ssd", "local_ssd", "cloud_essd", "cloud_essd2", "cloud_essd3".
    :param _builtins.str engine: Database type. Valid values:"MySQL", "SQLServer", "PostgreSQL", "MariaDB". If not set, it will match all of engines.
    :param _builtins.str engine_version: Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
    :param _builtins.str instance_charge_type: Filter the results by charge type. Valid values: `PrePaid` and `PostPaid` and `Serverless`. Default to `PostPaid`.
    :param _builtins.bool multi_zone: Whether to show multi available zone. Default false to not show multi availability zone.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi up`).
    :param _builtins.str storage_type: It has been deprecated from version 1.134.0+ and using `db_instance_storage_type` instead.
    :param _builtins.str zone_id: The Zone to launch the DB instance.
    """
    __args__ = dict()
    __args__['category'] = category
    __args__['commodityCode'] = commodity_code
    __args__['dbInstanceClass'] = db_instance_class
    __args__['dbInstanceId'] = db_instance_id
    __args__['dbInstanceStorageType'] = db_instance_storage_type
    __args__['engine'] = engine
    __args__['engineVersion'] = engine_version
    __args__['instanceChargeType'] = instance_charge_type
    __args__['multiZone'] = multi_zone
    __args__['outputFile'] = output_file
    __args__['sortedBy'] = sorted_by
    __args__['storageType'] = storage_type
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:rds/getInstanceClasses:getInstanceClasses', __args__, opts=opts, typ=GetInstanceClassesResult).value

    return AwaitableGetInstanceClassesResult(
        category=pulumi.get(__ret__, 'category'),
        commodity_code=pulumi.get(__ret__, 'commodity_code'),
        db_instance_class=pulumi.get(__ret__, 'db_instance_class'),
        db_instance_id=pulumi.get(__ret__, 'db_instance_id'),
        db_instance_storage_type=pulumi.get(__ret__, 'db_instance_storage_type'),
        engine=pulumi.get(__ret__, 'engine'),
        engine_version=pulumi.get(__ret__, 'engine_version'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_charge_type=pulumi.get(__ret__, 'instance_charge_type'),
        instance_classes=pulumi.get(__ret__, 'instance_classes'),
        multi_zone=pulumi.get(__ret__, 'multi_zone'),
        output_file=pulumi.get(__ret__, 'output_file'),
        sorted_by=pulumi.get(__ret__, 'sorted_by'),
        storage_type=pulumi.get(__ret__, 'storage_type'),
        zone_id=pulumi.get(__ret__, 'zone_id'))
def get_instance_classes_output(category: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                commodity_code: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                db_instance_class: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                db_instance_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                db_instance_storage_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                engine: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                engine_version: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                instance_charge_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                multi_zone: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                output_file: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                sorted_by: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                storage_type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                zone_id: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetInstanceClassesResult]:
    """
    This data source provides the RDS instance classes resource available info of Alibaba Cloud.

    > **NOTE:** Available in v1.46.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    resources = alicloud.rds.get_instance_classes(instance_charge_type="PostPaid",
        engine="MySQL",
        engine_version="5.6",
        output_file="./classes.txt")
    pulumi.export("firstDbInstanceClass", resources.instance_classes[0].instance_class)
    ```


    :param _builtins.str category: DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`, `serverless_basic`, `serverless_standard`, `serverless_ha`, `cluster`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
    :param _builtins.str commodity_code: The commodity code of the instance. Valid values:
           * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
           * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
           * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
           * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
           * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
           * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
           * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
           * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
           * **rds_serverless_public_cn**: The instance is a subscription serverless instance. This value is available on the China site (aliyun.com).
           * **rds_serverless_public_intl**: The instance is a subscription serverless instance. This value is available on the International site (alibabacloud.com).
           
           > **NOTE**: The field `db_instance_id` will be ignored when `commodity_code` is not a read-only type.
    :param _builtins.str db_instance_class: The DB instance class type by the user.
    :param _builtins.str db_instance_id: The ID of the instance.
           
           > **NOTE**: The field `db_instance_id` will be ignored when `commodity_code` is not a read-only type.
    :param _builtins.str db_instance_storage_type: The DB instance storage space required by the user. Valid values: "cloud_ssd", "local_ssd", "cloud_essd", "cloud_essd2", "cloud_essd3".
    :param _builtins.str engine: Database type. Valid values:"MySQL", "SQLServer", "PostgreSQL", "MariaDB". If not set, it will match all of engines.
    :param _builtins.str engine_version: Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
    :param _builtins.str instance_charge_type: Filter the results by charge type. Valid values: `PrePaid` and `PostPaid` and `Serverless`. Default to `PostPaid`.
    :param _builtins.bool multi_zone: Whether to show multi available zone. Default false to not show multi availability zone.
    :param _builtins.str output_file: File name where to save data source results (after running `pulumi up`).
    :param _builtins.str storage_type: It has been deprecated from version 1.134.0+ and using `db_instance_storage_type` instead.
    :param _builtins.str zone_id: The Zone to launch the DB instance.
    """
    __args__ = dict()
    __args__['category'] = category
    __args__['commodityCode'] = commodity_code
    __args__['dbInstanceClass'] = db_instance_class
    __args__['dbInstanceId'] = db_instance_id
    __args__['dbInstanceStorageType'] = db_instance_storage_type
    __args__['engine'] = engine
    __args__['engineVersion'] = engine_version
    __args__['instanceChargeType'] = instance_charge_type
    __args__['multiZone'] = multi_zone
    __args__['outputFile'] = output_file
    __args__['sortedBy'] = sorted_by
    __args__['storageType'] = storage_type
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('alicloud:rds/getInstanceClasses:getInstanceClasses', __args__, opts=opts, typ=GetInstanceClassesResult)
    return __ret__.apply(lambda __response__: GetInstanceClassesResult(
        category=pulumi.get(__response__, 'category'),
        commodity_code=pulumi.get(__response__, 'commodity_code'),
        db_instance_class=pulumi.get(__response__, 'db_instance_class'),
        db_instance_id=pulumi.get(__response__, 'db_instance_id'),
        db_instance_storage_type=pulumi.get(__response__, 'db_instance_storage_type'),
        engine=pulumi.get(__response__, 'engine'),
        engine_version=pulumi.get(__response__, 'engine_version'),
        id=pulumi.get(__response__, 'id'),
        ids=pulumi.get(__response__, 'ids'),
        instance_charge_type=pulumi.get(__response__, 'instance_charge_type'),
        instance_classes=pulumi.get(__response__, 'instance_classes'),
        multi_zone=pulumi.get(__response__, 'multi_zone'),
        output_file=pulumi.get(__response__, 'output_file'),
        sorted_by=pulumi.get(__response__, 'sorted_by'),
        storage_type=pulumi.get(__response__, 'storage_type'),
        zone_id=pulumi.get(__response__, 'zone_id')))
