# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'InstanceDataDiskArgs',
    'InstanceSystemDiskArgs',
]

@pulumi.input_type
class InstanceDataDiskArgs:
    def __init__(__self__, *,
                 category: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[str] category: Type of dataDisk
               - cloud_efficiency：High-efficiency cloud disk
               - cloud_ssd：Full flash cloud disk
               - local_hdd：Local hdd disk
               - local_ssd：Local disk ssd.
        :param pulumi.Input[int] size: Data disk size, cloud_efficiency is 20-32000,cloud_ssd/local_hdd/local_ssd is 20-25000, unit: GB.
        """
        if category is not None:
            pulumi.set(__self__, "category", category)
        if size is not None:
            pulumi.set(__self__, "size", size)

    @property
    @pulumi.getter
    def category(self) -> Optional[pulumi.Input[str]]:
        """
        Type of dataDisk
        - cloud_efficiency：High-efficiency cloud disk
        - cloud_ssd：Full flash cloud disk
        - local_hdd：Local hdd disk
        - local_ssd：Local disk ssd.
        """
        return pulumi.get(self, "category")

    @category.setter
    def category(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "category", value)

    @property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[int]]:
        """
        Data disk size, cloud_efficiency is 20-32000,cloud_ssd/local_hdd/local_ssd is 20-25000, unit: GB.
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "size", value)


@pulumi.input_type
class InstanceSystemDiskArgs:
    def __init__(__self__, *,
                 size: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] size: System disk size, cloud_efficiency is 20-32000,cloud_ssd/local_hdd/local_ssd is 20-25000, unit: GB.
        """
        if size is not None:
            pulumi.set(__self__, "size", size)

    @property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[int]]:
        """
        System disk size, cloud_efficiency is 20-32000,cloud_ssd/local_hdd/local_ssd is 20-25000, unit: GB.
        """
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "size", value)

